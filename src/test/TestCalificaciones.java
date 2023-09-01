package test;

import domain.Alumno;
import java.util.Scanner;

public class TestCalificaciones {

    public static void main(String[] args) {
        
        //--Variables a utilizar
        Scanner entrada = new Scanner(System.in);
        Alumno[] alumnos;
        int nroAlumnos;
        
        //Pedimos el numero de alumnos a ingresar, para construir el arreglo de alumnos
        System.out.println("Ingrese la cantidad de alumnos: ");
        nroAlumnos = entrada.nextInt();
        alumnos = new Alumno[nroAlumnos];
        
        
        //Pedimos la informacion por consola y vamos asignando los valores a cada alumno
        for (int i = 0; i < nroAlumnos; i++) {
            alumnos[i] = new Alumno();
            double nota;
            System.out.print("Ingresa nombre del alumno " + (i + 1) + ": ");
            alumnos[i].setNombre(entrada.next());
            System.out.print("Ingresa apellido del alumno " + (i + 1) + ": ");
            alumnos[i].setApellido(entrada.next());

            for (int j = 0; j < alumnos[i].getNotas().length; j++) {
                System.out.print("Ingrese nota " + (j + 1) + ": ");
                nota = entrada.nextDouble();
                alumnos[i].setNota(nota);
            }

        }
        System.out.println("");
        //Se declaran variables auxiliares, para posteriormente usarlas para encontrar el mejor y peor promedio.
        double califA = 0;
        Alumno alumnoMejor = null;
        Alumno alumnoMasBajo = null;
        
        //Recorremos el arreglo de alumnos verificando la calificacion mas alta y mas baja
        for (Alumno alumno : alumnos) {
            if (alumno.calcularPromedio() >= califA) {
                califA = alumno.calcularPromedio();
                alumnoMejor = alumno;
            } else if (alumno.calcularPromedio() <= califA) {
                alumnoMasBajo = alumno;
            }
        }
        //Mostramos los resultados alumno con calificacion mas alta y mas baja
        if (alumnoMasBajo != null) {
            System.out.println("Alumno con promedio mas bajo: " + alumnoMasBajo.toString());

        }
        if (alumnoMejor != null) {
            System.out.println("Alumno con mejor promedio: " + alumnoMejor.toString());

        }
        System.out.println("");
        
        //Mostramos Los alumnos que deben recursar y los que promocionan.
         for(Alumno alumno: alumnos) {
            if(alumno.calcularPromedio() < 7) {
                System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " --> Debe recursar la materia.");
            } else {
                System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " --> Promociona.");
            }
        }
         System.out.println("");

    }
}
