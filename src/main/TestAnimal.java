package main;

public class TestAnimal {

public static void main(String[] args) {
	
	Animal anim1=new Animal();

	anim1.setAnimal("pisica");

	anim1.setCuloare("neagra");

	anim1.setVarsta(1);

	System.out.println("Animalul "+ anim1.getAnimal()+" cu culoarea "+anim1.getCuloare()+" si varsta "+anim1.getVarsta());

	
	Animal anim2=new Animal("alb");

	anim2.setAnimal("caine");

	anim2.setVarsta(10);

	System.out.println("Animalul "+ anim2.getAnimal()+" cu culoarea "+anim2.getCuloare()+" si varsta "+anim2.getVarsta());;

	
	Animal anim3=new Animal("iepure","gri",2);

	System.out.println("Animalul "+ anim3.getAnimal()+" cu culoarea "+anim3.getCuloare()+" si varsta "+anim3.getVarsta());;

}
}

