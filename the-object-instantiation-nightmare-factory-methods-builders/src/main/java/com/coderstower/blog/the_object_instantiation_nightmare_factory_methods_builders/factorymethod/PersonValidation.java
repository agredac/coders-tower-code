package com.coderstower.blog.the_object_instantiation_nightmare_factory_methods_builders.factorymethod;

class PersonValidation {

    public boolean validate(Person person) {
        return person.getBirthDate() != null;
    }

}