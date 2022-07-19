package com.mouhcine.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    private final  PersonRepos personRepos;

    public PersonController(PersonRepos personRepos) {
        this.personRepos = personRepos;
    }

    @GetMapping("/persons")
    public List<Person> people(){
        return personRepos.findAll();
    }
}
