package br.futuroDev.services;

import br.futuroDev.M1S10.entities.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository <Organization, Long> {
}
