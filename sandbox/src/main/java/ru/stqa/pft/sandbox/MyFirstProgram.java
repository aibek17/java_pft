package ru.stqa.pft.sandbox;

import java.sql.SQLOutput;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("World");
		hello("user");
		hello("KZ");

		double l = 5;
		System.out.println("Pl kv " + l + " = " + area(l));

		double a = 4;
		double b = 6;
		System.out.println("pl pryamoug " + a + " i " +b+ " = " + area(a,b));

	}

	public static void hello(String somebody) {
		System.out.println("Hello, "+ somebody + "!");
	}

	public static double area (double len) {
		return len*len;
	}

	public static double area (double a, double b) {
		return a * b;
	}

}