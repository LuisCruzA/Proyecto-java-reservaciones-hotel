package ReservacionHotel.logica;

import ReservacionHotel.logica.Habitacion;

public class HabitacionIndividual extends Habitacion {

    public HabitacionIndividual(int numhabit, boolean isFree, boolean isClean) {
        super(numhabit, isFree, "Individual", 1, 2, isClean, 1000);
    }
}
