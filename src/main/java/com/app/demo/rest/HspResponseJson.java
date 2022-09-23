package com.app.demo.rest;

import com.app.demo.rest.dto.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/api/v1/spa", produces = MediaType.APPLICATION_JSON_VALUE)
public class HspResponseJson {

    @PostMapping("/spa-dgpthl-fileaccept")
    public ResponseEntity<FrmtMsrnApiResDTO> fileaccept(@RequestBody FrmtMsrnApiReqDTO frmtMsrnApiReqDTO)
    {
        log.info("fileaccept");
        log.info("frmtMsrnApiReqDTO = {}", frmtMsrnApiReqDTO);
        FrmtMsrnApiResDTO fmtMsrnApiResDTO = new FrmtMsrnApiResDTO();
        fmtMsrnApiResDTO.setRetnCd("S");
        fmtMsrnApiResDTO.setRetnMesg("성공메세지");


        ResponseEntity<FrmtMsrnApiResDTO> entityModel = new ResponseEntity<>(fmtMsrnApiResDTO, new HttpHeaders(), HttpStatus.CREATED);
        return entityModel;
    }

    @PostMapping("/spa-dgpthl-convertcomplete")
    public ResponseEntity<FrmtMsrnApiResDTO> convertcomplete(@RequestBody FrmtMsrnApiReqDTO frmtMsrnApiReqDTO)
    {
        log.info("convertcomplete");
        log.info("frmtMsrnApiReqDTO = {}", frmtMsrnApiReqDTO);
        FrmtMsrnApiResDTO fmtMsrnApiResDTO = new FrmtMsrnApiResDTO();
        fmtMsrnApiResDTO.setRetnCd("S");
        fmtMsrnApiResDTO.setRetnMesg("성공메세지");

        ResponseEntity<FrmtMsrnApiResDTO> entityModel = new ResponseEntity<>(fmtMsrnApiResDTO, new HttpHeaders(), HttpStatus.CREATED);
        return entityModel;
    }

    @PostMapping("/spa-dgpthl-reqslideinfo")
    public ResponseEntity<FrmtMsrnApiResDTO> reqslideinfo(@RequestBody FrmtMsrnApiReqDTO frmtMsrnApiReqDTO)
    {
        log.info("reqslideinfo");
        log.info("frmtMsrnApiReqDTO = {}", frmtMsrnApiReqDTO);

        SpaDgPthlFrmtMsrnDVO spaDgPthlFrmtMsrnDVO = new SpaDgPthlFrmtMsrnDVO();
        //디지털병리슬라이드아이디
        spaDgPthlFrmtMsrnDVO.setImgSlidId("1.3.46.670589.45.1.1.236552356170752.1.2480.1650455083909.4");
        //처방일자
        spaDgPthlFrmtMsrnDVO.setOrdrYmd("2022-05-06 00:00:00");
        //접수일자
        spaDgPthlFrmtMsrnDVO.setRptnDt("2022-05-06 08:26:00");
        //보고일자
        spaDgPthlFrmtMsrnDVO.setRprtDt("2022-05-09 12:51:00");
        //병리번호
        spaDgPthlFrmtMsrnDVO.setPthlNo("V22000100");
        //의뢰병리번호
        spaDgPthlFrmtMsrnDVO.setAsctPthlNo("S22009979");
        //슬라이드바코드내용
        spaDgPthlFrmtMsrnDVO.setSlidBrcdCtn("S22009979,X2F3,,L002983,1");
        //형태계측 대상여부
        spaDgPthlFrmtMsrnDVO.setFrmtMsrnTrgtYn("Y");
        //환자번호
        spaDgPthlFrmtMsrnDVO.setPtno("02532014");
        //환자명
        spaDgPthlFrmtMsrnDVO.setPtntNm("임환자712");
        //생년월일
        spaDgPthlFrmtMsrnDVO.setBtdt("19710125");
        //성별코드
        spaDgPthlFrmtMsrnDVO.setGendCd("F");
        //검사코드
        spaDgPthlFrmtMsrnDVO.setExmnCd("L002983");
        //검사명
        spaDgPthlFrmtMsrnDVO.setExmnNm("Morphometric Analysis");
        //검체코드
        spaDgPthlFrmtMsrnDVO.setSpcmCd("P10");
        //검체명
        spaDgPthlFrmtMsrnDVO.setSpcmNm("Breast with Sentinel Lymph Node");
        //진료과코드
        spaDgPthlFrmtMsrnDVO.setMcdpCd("111213");
        //진료과명
        spaDgPthlFrmtMsrnDVO.setMcdpNm("BES");
        //병동코드
        spaDgPthlFrmtMsrnDVO.setWardCd("106830");
        //병동명
        spaDgPthlFrmtMsrnDVO.setWardNm("63W");
        //병실번호
        spaDgPthlFrmtMsrnDVO.setPtrmNo("85");
        //처방의사ID
        spaDgPthlFrmtMsrnDVO.setOddrId("98023");
        //처방의사명
        spaDgPthlFrmtMsrnDVO.setOddrNm("김정열");
        //병리검사판독의사ID1
        spaDgPthlFrmtMsrnDVO.setPtexIndrId1("98023");
        //병리검사판독의사명1
        spaDgPthlFrmtMsrnDVO.setPtexIndrNm1("김고대71(641)");




        FrmtMsrnApiResDTO fmtMsrnApiResDTO = new FrmtMsrnApiResDTO();
        fmtMsrnApiResDTO.setSpaDgPthlFrmtMsrnDVO(spaDgPthlFrmtMsrnDVO);
        fmtMsrnApiResDTO.setRetnCd("S");
        fmtMsrnApiResDTO.setRetnMesg("성공메세지");

        ResponseEntity<FrmtMsrnApiResDTO> entityModel = new ResponseEntity<>(fmtMsrnApiResDTO, new HttpHeaders(), HttpStatus.CREATED);
        return entityModel;
    }

    @PostMapping("/spa-dgpthl-fileimport")
    public ResponseEntity<FrmtMsrnApiResDTO> fileimport(@RequestBody FrmtMsrnApiReqDTO frmtMsrnApiReqDTO)
    {

        log.info("fileimport");
        log.info("frmtMsrnApiReqDTO = {}", frmtMsrnApiReqDTO);
        FrmtMsrnApiResDTO fmtMsrnApiResDTO = new FrmtMsrnApiResDTO();
        fmtMsrnApiResDTO.setRetnCd("S");
        fmtMsrnApiResDTO.setRetnMesg("성공메세지");

        ResponseEntity<FrmtMsrnApiResDTO> entityModel = new ResponseEntity<>(fmtMsrnApiResDTO, new HttpHeaders(), HttpStatus.CREATED);
        return entityModel;
    }

    @PostMapping("/spa-dgpthl-filedelete")
    public ResponseEntity<FrmtMsrnApiResDTO> filedelete(@RequestBody FrmtMsrnApiReqDTO frmtMsrnApiReqDTO)
    {

        log.info("filedelete");
        log.info("frmtMsrnApiReqDTO = {}", frmtMsrnApiReqDTO);
        FrmtMsrnApiResDTO fmtMsrnApiResDTO = new FrmtMsrnApiResDTO();
        fmtMsrnApiResDTO.setRetnCd("S");
        fmtMsrnApiResDTO.setRetnMesg("성공메세지");

        ResponseEntity<FrmtMsrnApiResDTO> entityModel = new ResponseEntity<>(fmtMsrnApiResDTO, new HttpHeaders(), HttpStatus.CREATED);
        return entityModel;
    }


    @GetMapping("spa-dgpthl-exmnbsisinfm")
    public ResponseEntity<ExamInfoApiResDTO> exmnbsisinfm(@RequestParam String pthlNo)
    {

        log.info("exmnbsisinfm");
        log.info("pthlNo = {}", pthlNo);

        SpaDgPthlExamOutDVO outDVO = new SpaDgPthlExamOutDVO();
        outDVO.setPthlNo("S22009979");
        outDVO.setExmnCd("L003269");
        outDVO.setExmnNm("Level D (Block 16개이상) -Histopath Exam");
        outDVO.setSpcmCd("P10");
        outDVO.setSpcmNm("Breast with Sentinel Lymph Node");
        outDVO.setFrmtMsrnTrgtYn("Y");
        outDVO.setPtno("02532014");
        outDVO.setPtntNm("임환자065");
        outDVO.setBtdt("19710125");
        outDVO.setGendCd("F");
        outDVO.setExrsCtn("CARCINOMA, INVASIVE, NO SPECIAL TYPE MICROCALCIFICATION RESECTION");
        outDVO.setRptnYmd("20220502");
        outDVO.setPtexIndrId1("98023");
        outDVO.setPtexIndrNm1("김정열");

        List<SpaDgPthlExamOutDVO> list = Arrays.asList(outDVO);


        ExamInfoApiResDTO examInfoApiResDTO = new ExamInfoApiResDTO();
        examInfoApiResDTO.setSpaDgPthlExamOutDVOList(list);
        examInfoApiResDTO.setRetnCd("S");
        examInfoApiResDTO.setRetnMesg("디지털 병리 검사 기본정보 조회 완료.");

        ResponseEntity<ExamInfoApiResDTO> entityModel = new ResponseEntity<>(examInfoApiResDTO, new HttpHeaders(), HttpStatus.CREATED);
        return entityModel;
    }
}
