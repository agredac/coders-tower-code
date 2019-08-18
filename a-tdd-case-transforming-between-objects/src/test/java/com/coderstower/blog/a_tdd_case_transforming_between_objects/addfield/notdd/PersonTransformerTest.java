package com.coderstower.blog.a_tdd_case_transforming_between_objects.addfield.notdd;

import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTransformerTest {
  private PersonTransformer personTransformer = new PersonTransformer();

  @Test
  public void transformFromPersonToPersonDTO(){
    Person person = new Person();
    person.setAddress("Street 1");
    person.setBirthDate(LocalDate.of(1980, 7, 4));
    person.setName("Daniel");

    PersonDTO personDTOExpected = new PersonDTO();
    personDTOExpected.setAddress("Street 1");
    personDTOExpected.setBirthDate(LocalDate.of(1980, 7, 4));
    personDTOExpected.setName("Daniel");

    PersonDTO personDTO = personTransformer
            .transform(person);

    assertThat(personDTO).isEqualTo(personDTOExpected);
  }

  @Test
  public void transformFromPersonDTOToPerson(){
    PersonDTO personDTO = new PersonDTO();
    personDTO.setAddress("Street 1");
    personDTO.setBirthDate(LocalDate.of(1980, 7, 4));
    personDTO.setName("Daniel");

    Person personExpected = new Person();
    personExpected.setAddress("Street 1");
    personExpected.setBirthDate(LocalDate.of(1980, 7, 4));
    personExpected.setName("Daniel");

    Person person = personTransformer
            .transform(personDTO);

    assertThat(person).isEqualTo(personExpected);
  }
}