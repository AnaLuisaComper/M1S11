package br.futuroDev.dtos.login;

import lombok.Data;

@Data
public class LoginRequestDto {

    private String username;
    private String password;

}