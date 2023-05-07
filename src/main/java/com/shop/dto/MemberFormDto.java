package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class MemberFormDto {

    @NotBlank(message = "이름은 필수 값입니다.")
    public String name;

    @NotBlank(message = "이메일은 필수 값입니다.")
    public String email;

    @NotBlank(message = "비밀번호는 필수 값입니다.")
    public String password;

    @NotBlank(message = "주소는 필수 값입니다.")
    public String address;

}
