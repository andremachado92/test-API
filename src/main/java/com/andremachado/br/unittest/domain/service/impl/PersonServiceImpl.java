package com.andremachado.br.unittest.domain.service.impl;
import com.andremachado.br.unittest.domain.model.Person;
import com.andremachado.br.unittest.domain.repository.PersonRepository;
import com.andremachado.br.unittest.domain.service.PersonService;
import com.andremachado.br.unittest.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void create(PersonDTO personDTO) {
        personRepository.save(Person.builder().
                name(personDTO.getName()).
                cpf(personDTO.getCpf()).
                build());
    }
}
