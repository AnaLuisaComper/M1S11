package br.futuroDev.controllers;

import br.futuroDev.dtos.login.LoginRequestDto;
import br.futuroDev.dtos.login.LoginResponseDto;
import br.futuroDev.services.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("login")
public class LoginController {

    private final LoginService service;

    @PostMapping
    public LoginResponseDto login(@RequestBody LoginRequestDto dto) {
        return service.authenticate(dto);
    }

}