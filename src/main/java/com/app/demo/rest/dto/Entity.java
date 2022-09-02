package com.app.demo.rest.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

@Data
@JsonRootName("IMS_Outbound")
public class Entity {

    // Class data members

    String imgSlidId;
    String patientId;
    String slidBrcdCont;
    String systemId;
    String returnCode;
    String returnMsg;
}
