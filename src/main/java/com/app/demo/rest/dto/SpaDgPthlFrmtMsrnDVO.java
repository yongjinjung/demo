package com.app.demo.rest.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class SpaDgPthlFrmtMsrnDVO {

    /**
     * 병리번호
     */
    private String pthlNo;

    /**
     * 의뢰병리번호
     */
    private String asctPthlNo;

    /**
     * 처방일자
     */
    private String ordrYmd;

    /**
     * 접수일자
     */
    private String rptnDt;

    /**
     * 보고일자
     */
    private String rprtDt;

    /**
     * 이미지 슬라이드 ID
     */
    private String imgSlidId;

    /**
     * 슬라이드 바코드내용
     */
    private String slidBrcdCtn;

    /**
     * 형태계측 대상여부

     */
    private String frmtMsrnTrgtYn;


    /**
     * 형태계측 대상여부

     */
    private String frmtMsrnRsltCtn;

    /**
     * 환자번호
     */
    private String ptno;

    /**
     * 환자명
     */
    private String ptntNm;

    /**
     * 생년월일
     */
    private String btdt;

    /**
     * 성별코드
     */
    private String gendCd;


    /**
     * 검사코드
     */
    private String exmnCd;

    /**
     * 검사명
     */
    private String exmnNm;

    /**
     * 검체코드
     */
    private String spcmCd;

    /**
     * 검체명
     */
    private String spcmNm;


    /**
     * 진료과코드
     */
    private String mcdpCd;

    /**
     * 진료과코드명
     */
    private String mcdpNm;

    /**
     * 병동코드
     */
    private String wardCd;

    /**
     * 병동코드명
     */
    private String wardNm;

    /**
     * 병실번호
     */
    private String ptrmNo;


    /**
     * 처방의사
     */
    private String oddrId;

    /**
     * 처방의사명
     */
    private String oddrNm;

    /**
     * 병리검사판독의사ID1
     */
    private String ptexIndrId1;

    /**
     * 병리검사판독의사명1
     */
    private String ptexIndrNm1;

    /**
     * 병리검사판독의사ID2
     */
    private String ptexIndrId2;

    /**
     * 병리검사판독의사명2
     */
    private String ptexIndrNm2;

    /**
     * 병리검사판독의사ID3
     */
    private String ptexIndrId3;

    /**
     * 병리검사판독의사명3
     */
    private String ptexIndrNm3;

    /**
     * 자동업로드여부 (Y OR N)
     */
    private String isAutoYn;

    /**
     * 리턴코드
     */
    private String statCode;
    /**
     * 리턴메세지
     */
    private String returnMsg;


}
