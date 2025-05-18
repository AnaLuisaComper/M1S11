package br.futuroDev.controllers;

import br.futuroDev.M1S10.dtos.OrganizationRequestDto;
import br.futuroDev.M1S10.dtos.OrganizationResponseDto;
import br.futuroDev.M1S10.services.OrganizationService;
import br.futuroDev.M1S10.services.OrganizationServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {

    private final OrganizationService organizationService;

    public OrganizationController(OrganizationServiceImpl organizationService) {
        this.organizationService = organizationService;
    }

    @PostMapping
    @ResponseStatus (HttpStatus.CREATED)
    public OrganizationResponseDto post(@RequestBody OrganizationRequestDto dto) {
        return organizationService.create(dto);
    }

    @GetMapping
    public List<OrganizationResponseDto> get() {
        return organizationService.findAll();
    }

    @GetMapping("/{id}")
    public OrganizationResponseDto getById(@PathVariable Long id){
        return organizationService.findById(id);
    }

    @PutMapping ("/{id}")
    public OrganizationResponseDto put(@PathVariable Long id, @RequestBody OrganizationRequestDto dto) {
        return organizationService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        organizationService.delete(id);
    }



}
