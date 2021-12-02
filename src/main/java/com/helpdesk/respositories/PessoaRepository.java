package com.helpdesk.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
