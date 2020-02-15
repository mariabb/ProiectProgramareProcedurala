package main;

public class Tema3Pba5 {

	public static void main(String[] args) {
		String str = "mariabufnea";

		for(int i = 0; i<str.length(); i++) {

		    char ch = str.charAt(i);

	        if (i % 2 == 0) {

	            System.out.print(Character.toUpperCase(ch));

	        } else {

	            System.out.print(Character.toLowerCase(ch));

	        }

	    }  

	}

}

	    	
