package com.javanauta.agendador_horarios.infrastructure.repository;

import com.javanauta.agendador_horarios.infrastructure.entity.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public abstract class AgendamentoRepository implements JpaRepository<Agendamento, Long> {

    Agendamento findBySericoDataHoraAgendamentoBetween(String Servico, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFinal) {
        return null;
    }
}
