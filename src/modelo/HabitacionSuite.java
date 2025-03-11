package pruebausuario;

public class HabitacionSuite extends Habitacion {

    public HabitacionSuite(int numhabit, boolean isFree, boolean isClean) {
        super(numhabit, isFree, "Suite", 3, 6, isClean, 3000);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Incluye jacuzzi");
    }
}
