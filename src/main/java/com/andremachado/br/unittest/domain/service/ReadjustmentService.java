package com.andremachado.br.unittest.domain.service;
import com.andremachado.br.unittest.domain.model.Employee;
import com.andremachado.br.unittest.domain.model.enums.Performance;

public interface ReadjustmentService {
    void readjustment(Employee employee, Performance performance);
}
