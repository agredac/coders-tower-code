package com.coderstower.blog.composition_inheritance_unit_testing.step3;

interface Service<T> {
  String generateId();

  T save(T t);
}
