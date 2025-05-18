package br.futuroDev.services;

import br.futuroDev.dtos.login.LoginRequestDto;
import br.futuroDev.dtos.login.LoginResponseDto;

public interface LoginService {
    LoginResponseDto authenticate(LoginRequestDto dto);
}
