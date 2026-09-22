package com.javanauta.agendador_horarios.infrastructure.repository;

import com.javanauta.agendador_horarios.infrastructure.entity.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import jakarta.transaction.Transactional;

import java.util.List;
import java.time.LocalDateTime;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

    Agendamento findByServicoAndDataHoraAgendamentoBetween(String servico,
                                                           LocalDateTime dataHoraInicio,
                                                           LocalDateTime dataHoraFinal);

    @Transactional
    void deleteByHoraAgendamentoAgendamentoCliente(LocalDateTime dataHoraAgendamento, String cliente);

    List<Agendamento> findByDataHoraAgendamentoBetween(LocalDateTime dataHoraInicial, LocalDateTime dataHoraFinal);

    Agendamento findByHoraAgendamentoAndCliente (LocalDateTime dataHoraAgendamento, String cliente);

}
