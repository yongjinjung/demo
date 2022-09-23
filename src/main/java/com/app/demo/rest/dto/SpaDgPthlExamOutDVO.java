package com.app.demo.rest.dto;

import lombok.*;

@Data
public class SpaDgPthlExamOutDVO {

    /**
     * 체크여부
     */
    private String ceckYn;

    /**
     * 이벤트타입코드
     */
    private String evntTypCd;

    /**
     * 병리번호
     */
    private String pthlNo;

    /**
     * 블럭번호
     */
    private String blckNo;

    /**
     * 신규블럭번호
     */
    private String newBlckNo;

    /**
     * 슬라이드일련번호
     */
    private String slidSno;

    /**
     * 슬라이드이력일련번호
     */
    private String slidHxSno;

    /**
     * 슬라이드타입코드
     */
    private String slidTypCd;

    /**
     * 카세트분류코드
     */
    private String csteClsfCd;

    /**
     * 슬라이드 바코드내용
     */
    private String slidBrcdCtn;

    /**
     * 이미지 슬라이드 ID
     */
    private String imagSlidId;

    /**
     * 2차병리번호
     */
    private String scndPthlNo;

    /**
     * 검사실구분코드
     */
    private String exrmDvsnCd;

    /**
     * 검사코드
     */
    private String exmnCd;

    /**
     * 검체코드
     */
    private String spcmCd;

    /**
     * 정렬순서값
     */
    private String sortSqncVl;

    /**
     * 존재여부
     */
    private String exstYn;

    /**
     * 추가처방여부
     */
    private String adorYn;

    /**
     * 동결절편여부
     */
    private String frscYn;

    /**
     * 임상연구여부
     */
    private String clrsYn;

    /**
     * 전송여부
     */
    private String trasYn;

    /**
     * 스캔여부
     */
    private String scanYn;

    /**
     * 스캔일시
     */
    private String scanDt;

    /**
     * 형태계측 대상여부

     */
    private String frmtMsrnTrgtYn;

    /**
     * 형태계측파일삭제여부
     */
    private String frmtMsrnFileDltnYn;

    /**
     * 형태계측 결과내용
     */
    private String frmtMsrnRsltCtn;

    /**
     * 파일삭제여부
     */
    private String fileDltnYn;

    /**
     * 문서 따위에서, 그 내용에 참고가 될 만한 사항을 보충하여 적는 것. 또는 그 사항
     */
    private String rmrk;

    /**
     * 환자번호
     */
    private String ptno;

    /**
     * 환자명
     */
    private String ptntNm;

    /**
     * 연령값
     */
    private String ageVl;

    /**
     * 성별코드
     */
    private String gendCd;

    /**
     * 생년월일
     */
    private String btdt;

    /**
     * 처방일자
     */
    private String ordrYmd;

    /**
     * 처방일련번호
     */
    private String ordrSno;

    /**
     * 검사명
     */
    private String exmnNm;

    /**
     * 검사결과내용
     */
    private String exrsCtn;

    /**
     * 검체명
     */
    private String spcmNm;

    /**
     * 연관병리번호
     */
    private String asctPthlNo;

    /**
     * 병리검사진행상태코드
     */
    private String ptexPrssCd;

    /**
     * 접수일자
     */
    private String rptnYmd;

    /**
     * 접수일시
     */
    private String rptnDt;

    /**
     * 접수일자(시작)
     */
    private String rptnYmdFrom;

    /**
     * 접수일자(끝)
     */
    private String rptnYmdTo;

    /**
     * 블럭값1
     */
    private String blckVl1;

    /**
     * 블럭값2
     */
    private String blckVl2;

    /**
     * 블럭값3
     */
    private String blckVl3;

    /**
     * 블럭값
     */
    private String blckVl;

    /**
     * 출력호퍼번호
     */
    private String prinHoprNo;

    /**
     * 카세트폴더번호
     */
    private String csteFldrNo;

    /**
     * 출력여부
     */
    private String prinYn;

    /**
     * 구분코드데이터값
     */
    private String dvsnCdDataVl;

    /**
     * 영구보관여부
     */
    private String pemtKpngYn;

    /**
     * 진료과코드
     */
    private String mcdpCd;

    /**
     * 내원구분코드
     */
    private String codvCd;

    /**
     * 병동코드
     */
    private String wardCd;

    /**
     * 약어부서코드
     */
    private String abrvDprtCd;

    /**
     * 2차처방여부
     */
    private String scndOrdrYn;

    /**
     * 전공의사ID
     */
    private String mjdrId;

    /**
     * 전공의사명
     */
    private String mjdrNm;

    /**
     * 결과확인자ID
     */
    private String rsltCnfmId;

    /**
     * 결과확인자명
     */
    private String rsltCnfmNm;

    /**
     * 검체판독일시
     */
    private String ptexIntrDt;

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
     * 보고일시
     */
    private String rprtDt;

    /**
     * 랭크일련번호
     */
    private String rankSno;

    /**
     * 정렬1
     */
    private String sort1;

    /**
     * 정렬2
     */
    private String sort2;

    /**
     * 백업여부
     */
    private String bckpYn;

    /**
     * 파일삭제기준일자
     */
    private String fileDltnBaseYmd;

    /**
     * 최초등록자ID
     */
    private String frstRgsrId;

    /**
     * 최초 등록한 사람의 이름
     */
    private String frstRgsrNm;

    /**
     * 최초등록IP
     */
    private String frstRgstIp;

    /**
     * 최초등록일시
     */
    private String frstRgstDt;

    /**
     * 최초등록클라이언트프로그램ID
     */
    private String frstRgstClntPrgmId;

    /**
     * 최초등록EMR서버프로그램ID
     */
    private String frstRgstSrvrPrgmId;

    /**
     * 최종수정자ID
     */
    private String lastUpdrId;

    /**
     * 최종수정자명
     */
    private String lastUpdrNm;

    /**
     * 최종수정IP
     */
    private String lastUpdtIp;

    /**
     * 최종수정일시
     */
    private String lastUpdtDt;

    /**
     * 최종수정클라이언트프로그램ID
     */
    private String lastUpdtClntPrgmId;

    /**
     * 최종수정서버프로그램ID
     */
    private String lastUpdtSrvrPrgmId;
}
