package com.andremachado.br.unittest.domain.service.impl;
import com.andremachado.br.unittest.domain.model.Employee;
import com.andremachado.br.unittest.domain.model.enums.Performance;
import com.andremachado.br.unittest.domain.service.ReadjustmentService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ReadjustmentServiceImpl implements ReadjustmentService {


    @Override
    public void readjustment(Employee employee, Performance performance) {
        if(performance.getDescription().equals("A desejar")){
            var readjustment = employee.getSalary().multiply(new BigDecimal("0.03"));
            employee.adjustSalary(readjustment);
        }

    }
}
