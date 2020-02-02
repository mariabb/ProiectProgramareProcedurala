package main;

public class temaCompiler {
//pba5

	public static void main(String[] args) {

		int n = 4; // numarul pentru care dorim sa calculam factorialul

		int factorial = 1; // valoarea factorialului

		if (n < 13) // daca n < 13 atunci executa structura

			for (int i = 1; i <= n; i++)

			{

				factorial = factorial * i;

			}

		System.out.println(n + "!= " + factorial);

	}
}
