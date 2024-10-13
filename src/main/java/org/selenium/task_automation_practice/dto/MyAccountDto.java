package org.selenium.task_automation_practice.dto;


import io.qameta.allure.internal.shadowed.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MyAccountDto {

    private String email;
    private String senha;

}
