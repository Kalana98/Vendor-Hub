package com.nexora.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BusinessDetails {
    private String businessNAme;
    private String businessEmail;
    private String businessMobile;
    private String businessAddress;
    private String logo;
    private String banner;
}
