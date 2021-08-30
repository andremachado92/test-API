package com.andremachado.br.unittest.serviceImpl;
import com.andremachado.br.unittest.domain.model.Employee;
import com.andremachado.br.unittest.domain.model.enums.Performance;
import com.andremachado.br.unittest.domain.service.ReadjustmentService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootTest
@Transactional
public class ReadjustmentServiceImplTest {

    @Autowired
    private ReadjustmentService service;

    @Test
    public void readjustShouldBeThreePercentWhenPerformanceIsToBeDesired(){

        var employee = new Employee(null,"Ana", LocalDate.now(),new BigDecimal("1000.00"));

        service.readjustment(employee, Performance.A_DESEJAR);

        Assert.assertEquals(new BigDecimal("1030.00"), employee.getSalary());
    }

}
