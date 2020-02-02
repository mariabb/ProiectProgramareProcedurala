package main;

public class Asignare {

	
		public static void main (String[] args) {
			int a = 3;
			int b = (a=2)*a;
			int c = b*(b=5);
			System.out.println("a=" + a + ", b=" + b + ", c=" +c);
			}
	}

//se afiseaza: a=2, b=5, c=20.
