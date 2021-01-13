package ru.stqa.pft.sandbox;

import java.sql.SQLOutput;

public class MyFirstProgram {

	public static void main(String[] args) {
		//hello("World");
		//hello("user");
		//hello("KZ");

		//Square s = new Square(5);
		//System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		//Rectangle r = new Rectangle(4, 6);
		//System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

		Triangle q = new Triangle(5,7, 8);
		System.out.println("Площадь треугольника со сторонами " + q.a + " и " + q.b + " и " + q.c + " = " + q.area());

	}

	//public static void hello(String somebody) {
		//System.out.println("Hello, "+ somebody + "!");
	//}

}