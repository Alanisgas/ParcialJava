package com.example.parcial.service;

import com.example.parcial.model.Person;
import com.example.parcial.repository.PersonRepository;
import org.springframework.stereotype.Service;


import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    private  final PersonRepository repository;

    ArrayList<Person> user= new ArrayList<Person>();

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }
    public List<Person> findAll(){
        return repository.findAll();
    }
    public Person save(Person newPerson){
        return  repository.save(newPerson);
    }
    public <T> Person findByUser(String usere) throws UserPrincipalNotFoundException{

        return repository.findUserByUsers(usere);
        //aca tengo que meterb lo del tiempo
    }
    public String findConsultar (String dato) {
        Long inicio = System.currentTimeMillis();
        Thread hilo= new Thread();
        hilo.start();
        Person pe = new Person();
        pe =repository.findUserByUsers(dato);

        if (inicio <= 400){
            return user.toString();
        }
        if (inicio == 600)
        {
            hilo.interrupt();
            return user.toString();

        }
        else return findAll().toString();
    }
    public void deleteById(Long id){
        repository.deleteById(id);
    }


}
