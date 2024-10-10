package com.CalculadoraRest.Repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

import com.CalculadoraRest.model.Calculadora;

@Repository
public class CalculadoraRepository extends JpaRepository<Calculadora, Long> {

}
