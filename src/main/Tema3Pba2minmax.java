package main;

public class Tema3Pba2minmax {
	  public static void main(String[] args) {
			int[] array ;
        	array = new int[]{5,7,10,100,25,33,47,79,100,200};
        	int maxim = array[0];
        	int minim = array[0];
        	for(int i=1; i<array.length; i++)

               {if(array[i] > maxim)
        		  {
            	   maxim = array[i];
        		  }
 			        	    if(array[i] < minim)
        	      {
        	       minim = array[i];
        	      }  
                }
        	System.out.println("Maxim is:" + maxim);
        	System.out.println("Minim is:" + minim);
   	
              }
}
   