package com.simon_code.pii_data_masking.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.simon_code.pii_data_masking.encrypt.MaskData;
import com.simon_code.pii_data_masking.encrypt.ProtectedDataSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
 private int id;
 private String name;
 @MaskData
 @JsonSerialize(using = ProtectedDataSerialize.class)
 private String ssn;
 @MaskData
 @JsonSerialize(using = ProtectedDataSerialize.class)
 private String phonenumber;
 private int age;
 private String username;
 private List<AccountDetails> accountDetails;
}
