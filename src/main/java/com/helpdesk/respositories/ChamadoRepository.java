package com.helpdesk.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
