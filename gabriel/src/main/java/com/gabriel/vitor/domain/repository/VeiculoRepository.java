package com.gabriel.vitor.domain.repository;

import com.gabriel.vitor.domain.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {


    Optional<Veiculo> findByPlaca(String placa);
}
