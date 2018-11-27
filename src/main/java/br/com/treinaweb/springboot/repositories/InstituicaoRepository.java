package br.com.treinaweb.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.springboot.entities.Instituicao;

public interface InstituicaoRepository extends JpaRepository<Instituicao, Long> {

}
