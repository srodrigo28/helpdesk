package com.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.helpdesk.domain.Chamado;
import com.helpdesk.domain.Cliente;
import com.helpdesk.domain.Tecnico;
import com.helpdesk.domain.enus.Perfil;
import com.helpdesk.domain.enus.Prioridade;
import com.helpdesk.domain.enus.Status;
import com.helpdesk.respositories.ChamadoRepository;
import com.helpdesk.respositories.ClienteRepository;
import com.helpdesk.respositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Tecnico tec1 = new Tecnico(null, "bastiao", "010.555.331-09", "admin@admin", "123");
		tec1.addPerfis(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Maria Joana", "022.777.002-88", "amaria@gmail.com", "12345");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
		
	}

}
