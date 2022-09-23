package com.app.demo.rest;

import com.app.demo.rest.dto.Entity;
import com.app.demo.rest.dto.VunoApiReqDTO;
import com.app.demo.rest.dto.VunoApiResDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = "/api/v1/gkh", produces = MediaType.APPLICATION_JSON_VALUE)
public class VunoResponseJson {

    @PostMapping("/slideUpload")
    public ResponseEntity<VunoApiResDTO> entityQueryStringById(@RequestBody VunoApiReqDTO vunoApiReqDTO)
    {

        log.info("vunoApiReqDTO = {}", vunoApiReqDTO);
        VunoApiResDTO vunoApiResDTO = new VunoApiResDTO();
        vunoApiResDTO.setStatCode("200");
        vunoApiResDTO.setReturnMsg("성공메세지");


        ResponseEntity<VunoApiResDTO> entityModel = new ResponseEntity<>(vunoApiResDTO, new HttpHeaders(), HttpStatus.CREATED);
        return entityModel;
    }
}
