package com.simon_code.pii_data_masking.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.simon_code.pii_data_masking.encrypt.MaskData;
import com.simon_code.pii_data_masking.encrypt.ProtectedDataSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDetails {
    @MaskData
    @JsonSerialize(using = ProtectedDataSerialize.class)
    private String accountNumber;
    private String accountHOlderName;
    private  String accountType;


}
