package br.futuroDev.dtos.users;

import lombok.Data;

@Data
public class UserRequestDto {

    private String name;
    private String username;
    private String password;
    private String role;

}