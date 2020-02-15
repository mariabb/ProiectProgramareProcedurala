package main;

public class Tema3Pba3negativ {

	public static void main(String[] args) {

		int[] myArray = new int[] {5, 6, 2, 3, 10, 100,-8,300};


		for (int i=0; i<myArray.length; i++) {


			if (myArray[i]<0)


				System.out.println("Position of negative element" + ":"+ i); 
			}
    }
}
