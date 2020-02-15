package main;

public class TestImobil {

	public static void main(String[] args) {
		Imobil imob1=new Imobil();

		imob1.setTipCasa("apartament");

		imob1.setNrEtaje(10);

		imob1.setPret(50000);

		System.out.println("Imobilul "+ imob1.getTipCasa()+" cu numar de etaje "+imob1.getNrEtaje()+" si pret "+imob1.getPret());

		
		Imobil imob2=new Imobil(1);

		imob2.setTipCasa("garsoniera");

		imob2.setPret(100000);

		System.out.println("Imobilul "+ imob2.getTipCasa()+" numar etaje "+imob2.getNrEtaje()+" si pret "+imob2.getPret());;

		
		Imobil imob3=new Imobil("vila",2,150000);

		System.out.println("Imobilul "+ imob3.getTipCasa()+" numar etaje "+imob3.getNrEtaje()+" si pret "+imob3.getPret());;

	}
	}
