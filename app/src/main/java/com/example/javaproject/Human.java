package com.example.javaproject;

import androidx.annotation.NonNull;

public class Human {
  public Human(String name) {
    this.name = name;
  }

  protected String name;

  @NonNull
  @Override
  public String toString() {
    return "Human(" + name + ")";
  }
}
