package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class PersonController {

    @Autowired
    private List<Person> list = new ArrayList<>();
    private Person p;

    @Autowired
    public PersonController() {}

    @PostMapping
    public Person createPerson(Person p) { return p; }

    @GetMapping
    public long getPersonId(int id) { return id; }

    @GetMapping
    public List<Person> getPersonList() { return list; }

    @PutMapping
    public Person updatePerson(Person p) {
        return null; }

    @DeleteMapping
    public void deletePerson(int id) {

    }
}
