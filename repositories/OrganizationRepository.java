package br.futuroDev.repositories;

import br.futuroDev.entities.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository <Organization, Long> {
}
