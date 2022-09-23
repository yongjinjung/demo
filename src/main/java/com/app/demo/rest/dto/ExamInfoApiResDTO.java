package com.app.demo.rest.dto;

import lombok.Data;

import java.util.List;
@Data
public class ExamInfoApiResDTO {


    /**
     * 디지털병리 검사 기본정보
     */
    private List<SpaDgPthlExamOutDVO> spaDgPthlExamOutDVOList;

    private String retnCd;
    private String retnMesg;
}
