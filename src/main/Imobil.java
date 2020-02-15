package main;

public class Imobil {
	private String tipCasa;
	private int nrEtaje;
	private double pret;

	//constructor implicit

	public Imobil() {

		this.tipCasa=" ";

		this.nrEtaje=0;

		this.pret=0;
	}
	//constructor cu un parametru:
public Imobil(int nrEtaje) {

	this.tipCasa=" ";

	this.nrEtaje=nrEtaje;

	this.pret=0;
}

//constructor cu 3 parametri:

public Imobil(String tipCasa, int nrEtaje, double pret) {

	this.tipCasa=tipCasa;

	this.nrEtaje=nrEtaje;

	this.pret=pret;

}
public void setTipCasa(String tipCasa) {

	this.tipCasa=tipCasa;
}
public String getTipCasa() {

	return tipCasa;

}
public void setNrEtaje(int nrEtaje) {

	this.nrEtaje=nrEtaje;
}
public int getNrEtaje() {

	return nrEtaje;

}
public void setPret(double pret) {

	this.pret=pret;
}
public double getPret() {

	return pret;

}

}


