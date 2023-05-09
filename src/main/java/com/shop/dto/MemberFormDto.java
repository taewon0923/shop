package com.shop.dto;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Locale;

@Getter
@Setter
public class MemberFormDto {

    @NotBlank(message = "이름은 필수 값입니다.")
    public String name;

    @NotEmpty(message = "이메일은 필수 값입니다.")
    public String email;

    @NotEmpty(message = "비밀번호는 필수 값입니다.")
    @Length(min = 8, max = 16, message = "비밀번호는 8자이상, 16자 이하로 입력해주세요")
    public String password;

    @NotEmpty(message = "주소는 필수 값입니다.")
    public String address;

}
