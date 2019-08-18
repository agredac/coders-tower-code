package com.coderstower.blog.a_tdd_case_transforming_between_objects.base;

public class PersonTransformer {
  public Person transform(PersonDTO personDTO){
    Person person = new Person();
    person.setAddress(personDTO.getAddress());
    person.setBirthDate(personDTO.getBirthDate());
    person.setName(personDTO.getName());

    return person;
  }

  public PersonDTO transform(Person person){
    PersonDTO personDTO = new PersonDTO();
    personDTO.setAddress(person.getAddress());
    personDTO.setBirthDate(person.getBirthDate());
    personDTO.setName(person.getName());

    return personDTO;
  }
}