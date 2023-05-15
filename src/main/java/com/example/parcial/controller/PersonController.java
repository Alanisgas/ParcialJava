package com.example.parcial.controller;


import com.example.parcial.model.*;
import com.example.parcial.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    @Autowired
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/person")
    List<Person> allUser(){
        return  personService.findAll();
    }
    @GetMapping("/{person}")
    String consulta(@PathVariable String person){
        return personService.findConsultar(person);
    }
    @PostMapping("/createperson")
    public Person newUser(@RequestBody Person user){
        return  personService.save(user);
    }
    @PutMapping("/users/{fildperson}")
    Person one(@PathVariable String fieldperson) throws UserPrincipalNotFoundException {
        return personService.findByUser(fieldperson);
    }
    @DeleteMapping("/api/{id}")
    void deleteUser(@PathVariable Long id){
        personService.deleteById(id);
    }

}
