package com.javanauta.agendador_horarios.infrastructure.repository;

import com.javanauta.agendador_horarios.infrastructure.entity.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;

public abstract class AgendamentoRepository implements JpaRepository<Agendamento, Long> {

    Agendamento findByServicoAndDataHoraAgendamentoBetween(String Servico, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFinal) {
        return null;
    }

    @Transactional
    void deleteByHoraAgendamentoAndCliente(LocalDateTime dataHoraAgendamento, String cliente) {}

    Agendamento findByDataHoraAgendamentoAndCliente(LocalDateTime dataHoraAgendamento, String cliente);

    Agendamento findByHoraAgendamentoAndCliente (LocalDateTime dataHoraAgendamento, String cliente);
}
