package com.andremachado.br.unittest.serviceImpl;

import com.andremachado.br.unittest.domain.service.PersonService;
import com.andremachado.br.unittest.dto.PersonDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
@Transactional
public class PersonServiceImplTest {

    @Autowired
    private PersonService personService;


    @Test
    public void must_save_a_user(){
        var personDTO = new PersonDTO();
        personDTO.setName("Marinelson");
        personDTO.setCpf("00654404248");
        personService.create(personDTO);
    }
}
