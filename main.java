package Aereo;

import java.util.ArrayList;
import java.util.Scanner;

enum Tipos {carga,pasajeros,militares}

public class main {

	
	static void addObject(Tipos type, ArrayList<Object> list, Scanner sc)
	{
		System.out.println("Ingrese el nombre del avion:");
		String nombre = sc.next();
		System.out.println("Ingrese el tamaño del avion:");
		int tamano = sc.nextInt();
		System.out.println("Ingrese peso del avion:");
		int peso = sc.nextInt();
		System.out.println("Ingrese el color del avion:");
		String color = sc.next();
		System.out.println("Ingrese la carga maxima del avion:");
		int carg= sc.nextInt();
		System.out.println("Ingrese el numero de tripulantes del avion:");
		int trip= sc.nextInt();
		System.out.println("Ingrese el modelo del avion:");
		String modelo = sc.next();
		if (type == Tipos.pasajeros) {
			System.out.println("Ingrese el numero de pasajeros del avion:");
			int pasajeros = sc.nextInt();
			list.add(new avionpasajeros(peso,tamano,color,nombre,modelo,trip,carg,pasajeros));}
		else if (type == Tipos.carga) {
			list.add(new Aviondecarga(peso,tamano,color,nombre,modelo,carg,trip));
			}
		else{
			System.out.println("Ingrese el tipo de avion:");
			String tipo= sc.next();
			list.add(new avionmilitar(peso,tamano,color,nombre,modelo,trip,tipo,carg));
		}
			
	}
	
	public static void main (String[] args) {
		
		ArrayList <Object> avioncarga = new ArrayList<>();
		ArrayList <Object> avionpasajeros = new ArrayList<>();
		ArrayList <Object> avionmilitar = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		boolean Salir = false;
		int h;
		while(!Salir) {
		System.out.println("Bienvenido seleccione una opcion de las siguientes:");
		System.out.println("1.Ingresar un nuevo avion de carga");
		System.out.println("2.Ingresar un nuevo avion de pasajeros");
		System.out.println("3.Ingresar un nuevo avion militar");
		System.out.println("4.Ver aviones");
		System.out.println("5.Salir");
		h = sc.nextInt();
		System.out.println("Su eleccion: "+h);
		switch(h) {
		case 1:
			int m = 0;
			do {
				addObject(Tipos.carga, avioncarga, sc);
				System.out.println("Desea agregar otro avion?(0=Si,1=No):");
				m = sc.nextInt();
			} while(m==0);
			break;
		case 2:
			int n = 0;
			do {
				addObject(Tipos.pasajeros, avionpasajeros, sc);
					System.out.println("Desea agregar otro animal?(0=Si,1=No):");
					n = sc.nextInt();
				}while(n==0);
			break;
		case 3:
			int q = 0;
			do {
				addObject(Tipos.militares, avionmilitar, sc);
				System.out.println("Desea agregar otro animal?(0=Si,1=No):");
				q = sc.nextInt();
				}while(q==0);
			break;
		case 4:
			System.out.println("Los aviones de carga son:\n" + avioncarga + "\nLos aviones de pasajeros son:\n" + avionpasajeros +
					"Los aviones militares son:\n" + avionmilitar );
			break;	
		case 5:
			System.out.println();
			Salir=true;
			break;
		default:
			System.out.println("Ingrese un numero entre el 1 y el 5");
		}
		}	
	}

}
