package main;

public class Animal {

	private String tipAnimal;

	private String culoare;

	private int varsta;

	

	//constructor implicit

	public Animal() {

		this.tipAnimal=" ";

		this.culoare=" ";

		this.varsta=0;

	}

	//constructor cu un parametru, "culoare";

	public Animal(String culoare) {

		this.tipAnimal=" ";

		this.culoare=culoare;

		this.varsta=0;

	}


//constructor cu 3 parametrii:
	public Animal(String tipAnimal, String culoare, int varsta) {

		this.tipAnimal=tipAnimal;

		this.culoare=culoare;

		this.varsta=varsta;

	}

	
	public void setAnimal(String tipAnimal) {

		this.tipAnimal=tipAnimal;

	}


	public String getAnimal() {

		return tipAnimal;

	}

	public void setCuloare(String culoare) {

		this.culoare=culoare;

	}


	public String getCuloare() {

		return culoare;

	}

	public void setVarsta(int varsta) {

		this.varsta=varsta;

	}

	
	public int getVarsta() {

		return varsta;

	}

}