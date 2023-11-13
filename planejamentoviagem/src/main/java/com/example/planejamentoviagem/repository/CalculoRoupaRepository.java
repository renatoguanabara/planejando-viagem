package com.example.planejamentoviagem.repository;


import com.example.planejamentoviagem.model.Roupa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculoRoupaRepository extends JpaRepository<Roupa, Long>, CrudRepository<Roupa, Long> {
}
