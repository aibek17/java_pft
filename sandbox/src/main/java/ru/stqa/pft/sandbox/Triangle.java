package ru.stqa.pft.sandbox;

public class Triangle {

  public double a;
  public double b;
  public double c;

  public Triangle(double a,double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  //public double per() {
    //return ((this.a + this.b + this.c)/2);
  //}

  public  double area() {
    double e = ((this.a + this.b + this.c)/2);
    return (Math.sqrt(e*(e-this.a)*(e-this.b)*(e-this.c)));
  }
}
