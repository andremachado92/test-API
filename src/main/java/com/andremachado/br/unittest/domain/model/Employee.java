package com.andremachado.br.unittest.domain.model;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "TB_EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false)
    private LocalDate admissionDate;

    @Column(nullable = false)
    private BigDecimal salary;

    public void adjustSalary(BigDecimal readjustment) {
        this.salary = this.salary.add(readjustment).setScale(2, RoundingMode.HALF_UP);
    }
}
