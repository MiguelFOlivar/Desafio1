package org.mfigueroa.collection.pruebas;

import org.mfigueroa.collection.model.CollectionCustom;

public class PruebaString {
	public static void main(String[] args) {
		
		CollectionCustom<String> arreglo = new CollectionCustom<String>(5);
		System.out.println(arreglo.size());
		arreglo.addFirst("Mike");
		arreglo.add("Rock");
		arreglo.add("Charles");
		arreglo.add("Luis");
		arreglo.add("Roger");
		arreglo.mostrarElementos();
		arreglo.addLast("Chang");
		String eliminado = arreglo.remove(10);
		System.out.println("Eliminado: " + eliminado);
		arreglo.mostrarElementos();
		//arreglo.removeAll();
		arreglo.mostrarElementos();
		System.out.println("Está vacía: " + arreglo.isEmpty());
		
	}

}
