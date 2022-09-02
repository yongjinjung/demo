package com.app.demo.retrofit.tikxml;

import com.tickaroo.tikxml.retrofit.TikXmlConverterFactory;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.io.IOException;

/**
 * https://github.com/Tickaroo/tikxml/tree/master/retrofit-converter/src/test/java/com/tickaroo/tikxml/retrofit
 */
public class TikXmlConverterFactoryTest {


        @Rule
        public final MockWebServer server = new MockWebServer();

        interface Service {
            @POST("/")
            Call<Person> postPerson(@Body Person aPerson);
        }

        private Service service;

        @Before
        public void setUp() {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(server.url("/"))
                    .addConverterFactory(TikXmlConverterFactory.create())
                    .build();
            service = retrofit.create(Service.class);
        }

        @Test
        public void test() throws InterruptedException, IOException, UnsupportedOperationException {
            server.enqueue(new MockResponse().setBody("<<?xml version=\"1.0\" encoding=\"UTF-8\"?>person><name>Hannes</name></person>"));

            Person person = new Person();
            person.name = "outgoingName";
            Call<Person> call = service.postPerson(person);
            Response<Person> response = call.execute();
            Person responsePerson = response.body();

            Assert.assertNotNull(responsePerson);
            Assert.assertEquals("Hannes", responsePerson.name);

            RecordedRequest request = server.takeRequest();
            Assert.assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?><person><name>outgoingName</name></person>", request.getBody().readUtf8());
            Assert.assertEquals("application/xml; charset=UTF-8", request.getHeader("Content-Type"));
        }
}
