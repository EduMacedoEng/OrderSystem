package com.eduardomacedo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardomacedo.cursomc.domain.Categoria;
import com.eduardomacedo.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Optional<Categoria> buscar(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		
		return obj;
	}
}
