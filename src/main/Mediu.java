package main;

public class Mediu {
int x = 0; //variabila globala
void method1() {
	
	int x=1 , y;//variabile locale metodei method1
 y=x; //y=1;
	}
void method2() {
int z=1;//variabila locala metodei method2
System.out.println(x);
x=2+z;//y este necunoscut, deci nu se poate face aceasta operatie
System.out.println(x);
}

}


