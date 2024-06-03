package org.example.anoada_nohayla_tp4_2.dtos;

import lombok.*;
import org.example.anoada_nohayla_tp4_2.entities.PaymentStatus;
import org.example.anoada_nohayla_tp4_2.entities.PaymentType;

import java.time.LocalDate;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class PaymentDTO {
    private Long id;
    private LocalDate date;
    private double amount;
    private PaymentType type;
    private PaymentStatus status;
}

