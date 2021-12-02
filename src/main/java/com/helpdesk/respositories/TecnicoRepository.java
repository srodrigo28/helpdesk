package com.helpdesk.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
