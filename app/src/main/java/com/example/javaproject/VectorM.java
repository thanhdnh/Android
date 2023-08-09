package com.example.javaproject;

import androidx.annotation.NonNull;

public class VectorM {
  private float x, y, z;

  public VectorM() {
    x = y = z = 0;
  }

  public VectorM(float x, float y, float z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public VectorM CongHaiVector(VectorM v) {
    return new VectorM(v.x + this.x, v.y + this.y, v.z + this.z);
  }

  public float TichVoHuongVector(VectorM v) {
    return v.x * this.x + v.y * this.y + v.z * this.z;
  }

  public float Module() {
    return (float) Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
  }

  @NonNull
  @Override
  public String toString() {
    return "(" + x + ", " + y + ", " + z + ")";
  }
}
