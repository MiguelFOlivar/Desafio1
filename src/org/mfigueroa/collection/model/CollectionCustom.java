package org.mfigueroa.collection.model;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CollectionCustom<T> {

	/**
	 * Definimos nuestro arreglo para que pueda almacenar cualquier tipo de dato
	 */
	private Object[] arreglo;

	/**
	 * define el tamaño que tendrá nuestra collection custom
	 * 
	 * @param tamanio
	 */
	public CollectionCustom(int tamanio) {
		this.arreglo = new Object[tamanio];
	}

	/**
	 * retorna el tamaño del arreglo
	 * 
	 * @return
	 */
	public int size() {
		return this.arreglo.length;
	}

	/**
	 * recibe el elemento que agregaremos a nuestro array en el espacio disponible
	 * 
	 * @param t
	 */
	public void add(T t) {
		for (int i = 0; i < arreglo.length; i++) {
			if (this.arreglo[i] == null) {
				this.arreglo[i] = t;
				break;
			}

		}
	}

	/**
	 * recibe el elemento a insertar al principio del arreglo
	 * 
	 * @param e
	 */
	public void addFirst(T e) {
		/*
		 * if(this.arreglo[0]== null) { this.arreglo[0] = e; }
		 */
		this.arreglo[0] = e;
	}

	/**
	 * recibe el elemento para agregarlo en la ultima posición
	 * 
	 * @param t
	 */
	public void addLast(T t) {
		/*if (this.arreglo[arreglo.length - 1] == null) {
			this.arreglo[arreglo.length - 1] = t;
		}*/
		if(this.arreglo[arreglo.length-1] != null) {
			
		};
	}

	/**
	 * elimina el elemento que este en la posicion marcada por el índice
	 * 
	 * @param indice
	 * @return retorna el valor eliminado. en caso de no haber elemento en la
	 *         posicion seleccionada retorna null
	 */
	public T remove(int indice) {
		Object o = new Object();
		try {
			for (int i = 0; i < arreglo.length; i++) {
				if (arreglo[indice] != null) {
					o = arreglo[indice];
					arreglo[indice] = null;
					return (T) o;
				}
			}
		} catch (Exception ex) {

		}
		return null;

	}

	/**
	 * Elimina todos los datos contenidos en el arreglo
	 */
	public void removeAll() {

		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = null;
		}
	}

	/**
	 * retorna false en caso de que se encuentre por lo menos un elemento en la
	 * lista
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		for (int i = 0; i < arreglo.length; i++) {
			if (!(arreglo[i] == null)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * imprime todos los elementos que contiene nuestro arreglo
	 */
	public void mostrarElementos() {
		// Stream.of(this.arreglo).forEach(e -> System.out.println(e));
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null) {
				System.out.println("Elemento[" + i + "] : " + arreglo[i]);
			}
		}
	}
}
