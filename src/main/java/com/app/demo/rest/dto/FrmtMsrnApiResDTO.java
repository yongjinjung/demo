package com.app.demo.rest.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class FrmtMsrnApiResDTO{

    /**
     * 디지털병리 슬라이드 기본정보
     */
    private SpaDgPthlFrmtMsrnDVO spaDgPthlFrmtMsrnDVO;

    private String retnCd;
    private String retnMesg;

}
