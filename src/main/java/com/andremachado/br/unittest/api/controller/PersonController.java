package com.andremachado.br.unittest.api.controller;

import com.andremachado.br.unittest.domain.service.PersonService;
import com.andremachado.br.unittest.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonService personService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@Valid @RequestBody PersonDTO personDTO){
        personService.create(personDTO);
    }
}
