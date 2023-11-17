public class Avion extends Volador implements IAterrizable{
    public Avion(String nombre, double velocidad) {
        super(nombre, velocidad);
    }

    @Override
    public void aterrizar() {

    }

    @Override
    public String toString() {
        return "Avion{" +
                "Nombre: " + this.getNombre()+
                "   Velocidad: " + this.getVelocidad() +
                "}";
    }
}
