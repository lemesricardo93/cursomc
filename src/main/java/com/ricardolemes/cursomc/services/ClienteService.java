package com.ricardolemes.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardolemes.cursomc.domain.Cliente;
import com.ricardolemes.cursomc.repositories.ClienteRepository;
import com.ricardolemes.cursomc.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	 
	public Cliente buscar(Integer id) {
		
		Optional<Cliente> obj = repo.findById(id);		
		return  obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id
				+ ",Tipo:"+ Cliente.class.getName()));
	
		
		
		
	}

}
