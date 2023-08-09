package com.example.javaproject;

public class Program {
  /*public static float TinhTong(float a, float b){
    return a + b;
  }
  public static String TinhTong(String s, String v){
    String c = s + v;
    return c;
  }
  public static float[] TinhTong(float[] arr1, float[] arr2){
    float[] result = new float[arr1.length];
    for (int i = 0; i < result.length; i++){
      result[i] = arr1[i] + arr2[i];
    }
    return result;
  }
  public static void PrintArr(float[] arr){
    for(float v:arr)
      System.out.print(v + ", ");
  }*/
  public static void main(String[] args) {
    System.out.println("**************");
    /*System.out.println(TinhTong(2f,3f));
    System.out.println(TinhTong("tam" , "nguyen"));
    PrintArr(TinhTong(new float[]{1.1f, 2.1f}, new float[]{3.3f, 3.5f}));*/
    /*VectorM v1 = new VectorM(2f, 3f, 1f);
    VectorM v2= new VectorM(4f, 5f, 1f);
    VectorM t = v1.CongHaiVector(v2);
    float tvh = v1.TichVoHuongVector(v2);
    float m1 = v1.Module(); float m2 = v2.Module();
    System.out.println(v1+"+"+v2+"="+t);
    System.out.println(v1+"*"+v2+"="+tvh);
    System.out.println("Module"+v1+"="+m1);
    System.out.println("Module"+v2+"="+m2);*/
    Human h = new Human("Mike");
    Student st = new Student("Mary", 7.8f);
    System.out.println(h);
    System.out.println(st);
    System.out.println("\n**************");
  }
}
