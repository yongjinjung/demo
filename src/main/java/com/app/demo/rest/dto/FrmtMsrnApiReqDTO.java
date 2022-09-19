package com.app.demo.rest.dto;

import lombok.Data;

@Data
public class FrmtMsrnApiReqDTO {

    /**
     * 이미지 슬라이드 ID
     */
    private String imagSlidId;

    /**
     * 작업완료시간
     */
    private String workDtm;

    /**
     * 형태계측 결과내용
     */
    private String frmtMsrnRsltCtn;

}
