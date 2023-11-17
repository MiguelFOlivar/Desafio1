public class Helicoptero extends Volador implements IAterrizable{
    public Helicoptero(String nombre, double velocidad) {
        super(nombre, velocidad);
    }

    @Override
    public void aterrizar() {

    }

    @Override
    public String toString() {
        return "Helicoptero{" +
                "Nombre: " + this.getNombre()+
                "   Velocidad: " + this.getVelocidad() +
                "}";
    }
}
