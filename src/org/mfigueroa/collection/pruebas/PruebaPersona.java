/**
 * 
 */
package org.mfigueroa.collection.pruebas;

import org.mfigueroa.collection.model.CollectionCustom;
import org.mfigueroa.collection.model.Persona;

/**
 * 
 */
public class PruebaPersona {
	public static void main(String[] args) {
		
		
		CollectionCustom<Persona> personas = new CollectionCustom<Persona>(5);
		
		System.out.println("Está vacía: " + personas.isEmpty());
		personas.add(new Persona("Mike", "Bloom"));
		personas.add(new Persona("Miguel", "Taboada"));
		personas.add(new Persona("Mike", "Bloom"));
		personas.add(new Persona("Miguel", "Taboada"));
		personas.add(new Persona("Mike", "Bloom"));
		personas.add(new Persona("Miguel", "Taboada"));
		personas.mostrarElementos();
		System.out.println("Elemento eliminado: " + personas.remove(3));
		personas.mostrarElementos();
		System.out.println("Está vacía: " + personas.isEmpty());
		System.out.println("Limpiando lista...");
		personas.removeAll();
		System.out.println("Está vacía: " + personas.isEmpty());
	}
}
