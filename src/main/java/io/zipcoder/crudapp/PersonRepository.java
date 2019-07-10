package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


public interface PersonRepository extends CRUDRepository<Person>{

    Person findOne(int id);
    List<Person> finAll();
    void save(Person p);
    void delete(int id);


}
