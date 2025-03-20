package ReservacionHotel.logica;

import ReservacionHotel.logica.Habitacion;

public class HabitacionDoble extends Habitacion {

    public HabitacionDoble(int numhabit, boolean isFree, boolean isClean) {
        super(numhabit, isFree, "Doble", 2, 4, isClean, 1500);
    }
}
