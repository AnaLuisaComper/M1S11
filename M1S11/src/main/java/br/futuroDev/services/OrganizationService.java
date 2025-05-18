package br.futuroDev.services;

import br.futuroDev.M1S10.dtos.OrganizationRequestDto;
import br.futuroDev.M1S10.dtos.OrganizationResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrganizationService {
    OrganizationResponseDto create(OrganizationRequestDto dto);
    List<OrganizationResponseDto> findAll();
    OrganizationResponseDto findById(Long id);
    OrganizationResponseDto update(Long id, OrganizationRequestDto dto);
    void delete(Long id);

}
