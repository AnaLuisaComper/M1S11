package br.futuroDev.services;

import br.futuroDev.M1S10.dtos.OrganizationRequestDto;
import br.futuroDev.M1S10.dtos.OrganizationResponseDto;
import br.futuroDev.M1S10.entities.Organization;
import br.futuroDev.M1S10.repositories.OrganizationRepository;

import java.util.ArrayList;
import java.util.List;

public class OrganizationServiceImpl implements OrganizationService {

    private final OrganizationRepository organizationRepository;

    public OrganizationServiceImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public OrganizationResponseDto create(OrganizationRequestDto dto) {
        Organization organization = new Organization();
        organization.setName(dto.getName());
        organization.setContact(dto.getContact());

        organization = organizationRepository.save(organization);
        return null;
    }

    @Override
    public List<OrganizationResponseDto> findAll() {
        List<Organization> organizations = organizationRepository.findAll();
        List<OrganizationResponseDto> responseDtos = new ArrayList<>();


        for (Organization organization : organizations) {
            responseDtos.add( new OrganizationResponseDto(
                    organization.getId(),
                    organization.getName(),
                    organization.getContact()
            ));
        }
        return List.of();
    }

    @Override
    public OrganizationResponseDto findById(Long id) {
        Organization organization = organizationRepository.findById(id).orElseThrow();
        if (organization != null) {
            OrganizationResponseDto responseDto = new OrganizationResponseDto(
                    organization.getId(),
                    organization.getName(),
                    organization.getContact()
            );
        }
        return null;
    }

    @Override
    public OrganizationResponseDto update(Long id, OrganizationRequestDto dto) {
        Organization organization = organizationRepository.findById(id).orElseThrow();
        organization.setName(dto.Name());
        organization.setContact(dto.Contact());
        organization = organizationRepository.save(organization);

        return new OrganizationResponseDto(
                organization.getId(),
                organization.getName(),
                organization.getContact()
        );
    }

    @Override
    public void delete(Long id) {
        organizationRepository.deleteById(id);

    }
}
