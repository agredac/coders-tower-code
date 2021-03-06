package com.coderstower.blog.the_object_instantiation_nightmare_setters_constructors.setters;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

class Person {
  private String name;
  private List<String> addresses;
  private LocalDate birthDate;

  public Integer calculateAgeFrom(
    LocalDate currentDate) {
    return Period.between(birthDate, currentDate)
      .getYears();
  }

  public String getName() {
    return name;
  }

  public void setName(
    String name) {
    this.name = name;
  }

  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }
}
