package org.example.anoada_nohayla_tp4_2.repository;

import org.example.anoada_nohayla_tp4_2.entities.Payment;
import org.example.anoada_nohayla_tp4_2.entities.PaymentStatus;
import org.example.anoada_nohayla_tp4_2.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long>
{
    List<Payment> findByStudentCode(String code);
    List<Payment> findByStatus(PaymentStatus status);
    List<Payment> findByType(PaymentType type);
    List<Payment> findByStudentProgramId(String programId);
}
