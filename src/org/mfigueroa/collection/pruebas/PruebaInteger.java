package org.mfigueroa.collection.pruebas;

import org.mfigueroa.collection.model.CollectionCustom;

public class PruebaInteger {
	public static void main(String[] args) {
		CollectionCustom<Integer> enteros = new CollectionCustom<Integer>(10);
		System.out.println("Está vacía: " + enteros.isEmpty());
		enteros.add(10);
		enteros.add(20);
		enteros.add(150);
		enteros.add(10);
		enteros.add(20);
		enteros.add(150);
		enteros.add(10);
		enteros.add(20);
		enteros.add(150);
		enteros.add(20);
		enteros.add(150);
		enteros.addLast(33);
		enteros.mostrarElementos();
		System.out.println("Está vacía: " + enteros.isEmpty());
		System.out.println("Elemento removido: " + enteros.remove(3));
		System.out.println("Elemento removido: " + enteros.remove(1));
		System.out.println("Elemento removido: " + enteros.remove(8));
		System.out.println("Elemento removido: " + enteros.remove(6));
		enteros.mostrarElementos();
		System.out.println("Está vacía: " + enteros.isEmpty());
		enteros.removeAll();
		System.out.println("Está vacía: " + enteros.isEmpty());
		
	}

}
