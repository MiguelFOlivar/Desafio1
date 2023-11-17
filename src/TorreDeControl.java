import java.util.ArrayList;
import java.util.List;

public class TorreDeControl {
    List<Volador> noAterrizables = null;

    /**
     * recibe la lista de objetos voladores como parámetro
     * imprime los objetos que pueden aterrizar en la pista 1
     * @param lista
     */
         public void pista1(List<Volador> lista) {
             noAterrizables = new ArrayList<>();
             System.out.println("Pueden aterrizar en la pista 1: ");
            for (Volador v: lista) {
                if (v instanceof IAterrizable) {
                    System.out.println(v.toString());
                }
                else{
                    noAterrizables.add(v);

                }
            }
        }

    /**
     * recorre la lista de los objetos no permitidos en la pista 1
     * realiza un sorteo de numeros entre en 1 y 10, si este numero es igual a 4, 7 ó 9, el objeto podra aterrizar en
     * la pista 2
     */
    public void pista2() {
             int rand;
                 for(int i = 0; i<noAterrizables.size(); i++) {
                     rand = (int)(Math.random() * 10 + 1);
                     if(rand == 5 || rand == 7 || rand == 9){
                         System.out.println("folio: " + rand);
                         System.out.println(noAterrizables.get(i).getNombre() + " Puede aterrizar en la pista 2");
                     }

                 }

        }
}
