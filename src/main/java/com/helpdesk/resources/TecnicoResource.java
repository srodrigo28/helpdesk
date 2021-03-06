package com.helpdesk.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helpdesk.domain.Tecnico;
import com.helpdesk.services.TecnicoService;

@RestController
@RequestMapping(value ="/tecnicos")
public class TecnicoResource {
	
	//localhost:8080/tecnico/1
	
	@Autowired
	private TecnicoService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Tecnico> findById(@PathVariable Integer id){
		Tecnico obj = this.service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
}
