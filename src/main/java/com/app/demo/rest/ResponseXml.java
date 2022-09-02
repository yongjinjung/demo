package com.app.demo.rest;


import com.app.demo.rest.dto.Entity;
import com.app.demo.rest.dto.Entitys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/xml-output", produces = MediaType.APPLICATION_XML_VALUE)
@Slf4j
public class ResponseXml {


    @GetMapping("/cmcnu/.live")
    public ResponseEntity<Entitys> cmcnuLive(@RequestParam("submit_id") String submitId,
                                            @RequestParam("ex_interface") String exInterface,
                                            @RequestParam("business_id") String businessId,
                                            @RequestParam("imgSlidId") String imgSlidId,
                                            @RequestParam("patientId") String patientId,
                                            @RequestParam("slidBrcdCont") String slidBrcdCont,
                                            @RequestParam("examNo") String examNo,
                                            @RequestParam("systemId") String systemId,
                                            @RequestParam("workType") String workType,
                                            @RequestParam("reqMsg") String reqMsg)
    {

        log.info("submitId : {}", submitId);
        log.info("exInterface : {}", exInterface);
        log.info("businessId : {}", businessId);
        log.info("imgSlidId : {}", imgSlidId);
        log.info("patientId : {}", patientId);
        log.info("slidBrcdCont : {}", slidBrcdCont);
        log.info("examNo : {}", examNo);
        log.info("systemId : {}", systemId);
        log.info("workType : {}", workType);
        log.info("reqMsg : {}", reqMsg);


        Entity model = new Entity();
        model.setImgSlidId("20220824.0955.06");
        model.setPatientId("01349885");
        model.setSlidBrcdCont("S22-000011;002;002;001");
        model.setSystemId("DP_MIDDLEWARE_SYSTEM");
        model.setReturnCode("S");
        model.setReturnMsg("이미지스캔완료");


        List<Entity> list = List.of(model);
        Entitys xml = new Entitys();
        xml.setList(list);

        ResponseEntity<Entitys> entityModel = new ResponseEntity<>(xml, new HttpHeaders(), HttpStatus.CREATED);
        return entityModel;
    }

    @GetMapping("/entity/query-string")
    public ResponseEntity<Entity> entityQueryStringById(@RequestParam("id") String id)
    {

        Entity model = new Entity();
        model.setImgSlidId("20220824.0955.06");
        model.setPatientId("01349885");
        model.setSlidBrcdCont("S22-000011;002;002;001");
        model.setSystemId("DP_MIDDLEWARE_SYSTEM");
        model.setReturnCode("S");
        model.setReturnMsg("이미지스캔완료");

        ResponseEntity<Entity> entityModel = new ResponseEntity<>(model, new HttpHeaders(), HttpStatus.CREATED);
        return entityModel;
    }

    @GetMapping("/entity/path-variable")
    public ResponseEntity<Entity> entityPathVariableById(@PathVariable("id") String id)
    {

        Entity model = new Entity();
        model.setImgSlidId("20220824.0955.06");
        model.setPatientId("01349885");
        model.setSlidBrcdCont("S22-000011;002;002;001");
        model.setSystemId("DP_MIDDLEWARE_SYSTEM");
        model.setReturnCode("S");
        model.setReturnMsg("이미지스캔완료");

        ResponseEntity<Entity> entityModel = new ResponseEntity<>(model, new HttpHeaders(), HttpStatus.CREATED);
        return entityModel;
    }

    @GetMapping("/entitys/query-string")
    public ResponseEntity<Entitys> entitysQueryStringById(@RequestParam("id") String id)
    {

        Entity model = new Entity();
        model.setImgSlidId("20220824.0955.06");
        model.setPatientId("01349885");
        model.setSlidBrcdCont("S22-000011;002;002;001");
        model.setSystemId("DP_MIDDLEWARE_SYSTEM");
        model.setReturnCode("S");
        model.setReturnMsg("이미지스캔완료");

        Entity model2 = new Entity();
        model.setImgSlidId("20220824.0955.06");
        model.setPatientId("01349885");
        model.setSlidBrcdCont("S22-000011;002;002;001");
        model.setSystemId("DP_MIDDLEWARE_SYSTEM");
        model.setReturnCode("S");
        model.setReturnMsg("이미지스캔완료");

        List<Entity> list = new ArrayList<>();
        list.add(model);
        list.add(model2);
        Entitys xml = new Entitys();
        xml.setList(list);

        ResponseEntity<Entitys> entityModel = new ResponseEntity<>(xml, new HttpHeaders(), HttpStatus.CREATED);

        return entityModel;
    }

    @GetMapping("/entitys/path-variable")
    public ResponseEntity<Entitys> entitysPathVariableById(@PathVariable("id") String id)
    {

        Entity model = new Entity();
        model.setImgSlidId("20220824.0955.06");
        model.setPatientId("01349885");
        model.setSlidBrcdCont("S22-000011;002;002;001");
        model.setSystemId("DP_MIDDLEWARE_SYSTEM");
        model.setReturnCode("S");
        model.setReturnMsg("이미지스캔완료");

        List<Entity> list = Arrays.asList(model);
        Entitys xml = new Entitys();
        xml.setList(list);

        ResponseEntity<Entitys> entityModel = new ResponseEntity<>(xml, new HttpHeaders(), HttpStatus.CREATED);

        return entityModel;
    }
}
