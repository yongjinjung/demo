package com.app.demo.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

import java.util.List;

@Data
@JsonRootName("root")
public class Entitys {

    @JacksonXmlElementWrapper(localName = "list", useWrapping = false)
    @JsonProperty("IMS_Outbound")
    private List<Entity> list;
}
