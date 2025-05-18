package br.futuroDev.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrganizationResponseDto {

    private Long id;
    private String name;
    private String contact;


    public OrganizationResponseDto(Long id, String name, String contact) {
    }
}
