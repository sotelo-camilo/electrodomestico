package consola;
import java.util.Scanner;
import logica.*;
public class Principal {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
	Electrodomestico e1 = new Electrodomestico();
	Electrodomestico e2 = new Electrodomestico();
		
	System.out.println("ingrese el nombre del producto: ");
	String nombre=teclado.next();
	System.out.println("ingrese la marca: ");
	String marca=teclado.next();
	System.out.println("ingrese el consumo: ");
	double consumo=teclado.nextDouble();
	
	e1.setNombre("licuadora");
	e1.setMarca("James");
	e1.setConsumo(1000);
	
	e2.setNombre(nombre);
	e2.setMarca(marca);
	e2.setConsumo(consumo);
	
	System.out.println(e1);
	System.out.println(e2);
	}

}
