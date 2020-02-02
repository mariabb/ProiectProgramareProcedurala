package main;

public class ClasaPrincipala {

	public static void main(String[] args) {
		//pentru problema 1 cu Mediu am facut si o clasa seprata si am apelat o de aici
			Mediu m = new Mediu();
			m.method1(); //apeleaza metoda method1 din clasa Mediu
			m.method2(); //apeleaza metoda method2 din clasa Mediu
			//System.out.println("Hello world!");
			
			//pba 2:
			double d=3.95;

			 int i=4;

			 System.out.println(++d>i?d:i); // daca d este mai mic ca i atunci ia valoarea lui

			// daca d este mai mare atunci il incrementeaza si da valoarea lui
			 //pba3:
			 int a = 3;

				if(++a <4)

					if (a++ <4)

						System.out.println(a);

					else

						System.out.println(a);
				
				// nu  afiseaza nimic pt ca 4<4
				//pba4:Am redenumit i in i1, fiindca ,mai am un i in program
				
				int suma=0;

				for(int i1=1;i1<10;i1++) {

					suma+=suma + i1;

				System.out.print("Suma este:" +suma);
				//S-a afisat urmatoarele: Suma este:1Suma este:4Suma este:11Suma este:26Suma este:57Suma este:120Suma este:247Suma este:502Suma este:1013
	
				}
	}
}
	
			
	


