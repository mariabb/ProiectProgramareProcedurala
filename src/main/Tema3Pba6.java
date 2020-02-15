package main;

public class Tema3Pba6 {

	public static void main(String[] args) {
		 int[] vector1;
	        vector1 = new int[] {2,6,11,25,30,100};
        
	        double[] vector2;

	        vector2 = new double[vector1.length];
	        
	        double n = 1.7;
	        
	        for(int i = 0; i<vector1.length; i++)

	        {
	        	vector2[i] = vector1[i] + n;

	            System.out.println( vector2[i]);
	        }

	           }
	}