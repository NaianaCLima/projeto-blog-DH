package com.digitalhouse.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalhouse.blog.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);

}
