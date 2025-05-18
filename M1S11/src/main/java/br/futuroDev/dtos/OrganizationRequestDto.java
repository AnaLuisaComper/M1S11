package br.futuroDev.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrganizationRequestDto {

    public String name;
    public String contact;


    public String Name() {
        return name;
    }

    public String Contact() {
        return contact;
    }
}
