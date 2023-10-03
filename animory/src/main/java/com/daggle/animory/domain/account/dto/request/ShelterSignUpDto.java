package com.daggle.animory.domain.account.dto.request;


import lombok.Builder;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
@Builder
public record ShelterSignUpDto(
        @Email(message = "이메일 형식에 맞지 않습니다.") String email,
        @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])(?!.*\\s).{8,20}$",
                message = "비밀번호는 영문 대,소문자와 숫자, 특수기호가 적어도 1개 이상씩 포함된 8자 ~ 20자의 비밀번호여야 합니다.") String password,
        String name,
        String contact,
        String zonecode,
        ShelterAddressSignUpDto address) {
}