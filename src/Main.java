import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Creamos la lista de los objetos que estaran incluidos
         */
        List<Volador> listaVoladores = new ArrayList<>();
        Avion avion = new Avion("Airbus", 300);
        Helicoptero hel = new Helicoptero("CFR65", 250);
        Dron dron = new Dron("Dron DJI", 25);
        Caza caza = new Caza("Caza F-35 Lightning", 900);
        Caza caza2 = new Caza("Caza F-22 Raptor", 950);
        Dron dron2 = new Dron("Dron Sfjk", 20);
        Avion avion2 = new Avion("Boeing", 300);
        listaVoladores.add(caza);
        listaVoladores.add(avion);
        listaVoladores.add(hel);
        listaVoladores.add(dron);
        listaVoladores.add(dron2);
        listaVoladores.add(caza2);
        //se impriment todos los elementos existentes
        System.out.println("Objetos voladores de la lista");
        listaVoladores.forEach(System.out::println);
        System.out.println();

        //creamos el objeto de torre de control
        //pasamos la lista como argumento para pista 1, que es la que controla los aterrizajes en esta
        //se imprimirá que objetos pueden aterrizar en dicha pista
        TorreDeControl  t = new TorreDeControl();
        t.pista1(listaVoladores);
        System.out.println();
        //llamamos a pista 2, que nos indicará cuales objetos podran aterrizar aqui depues de una evaluacion
        t.pista2();
    }
}
