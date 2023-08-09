package com.example.javaproject;

import androidx.annotation.NonNull;

public class Student extends Human{
  private float gpa;

  public Student(String name, float gpa) {
    super(name);
    this.gpa = gpa;
  }

  @NonNull
  @Override
  public String toString() {
    return "Student(" + name + ", " + gpa + ")";
  }
}
