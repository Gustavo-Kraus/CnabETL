package dev.desafio.cnab.repository;

import dev.desafio.cnab.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}
