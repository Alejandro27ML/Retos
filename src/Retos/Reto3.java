package Retos;

import java.time.*;
import java.util.Locale;
import java.time.format.TextStyle;

public class Reto3 {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        LocalDate nacimiento = LocalDate.of(1993, 11, 27);

        Period edad = Period.between(nacimiento , fecha);
        System.out.println("Desde que he nacido han pasado: " + edad.getYears() + " años, " + edad.getMonths() + " meses y " +
                edad.getDays() + " dias.");

        LocalDateTime hora_actual = fecha.atStartOfDay();
        LocalDateTime hora_nacimiento = nacimiento.atTime(12 ,0 ,0);
        Duration diferencia = Duration.between(hora_nacimiento,hora_actual);

        System.out.println("Han pasado: " + diferencia.toHours() + " horas, " + diferencia.toMinutes() +
                " minutos y " + diferencia.toSeconds() + " segundos.");
        System.out.println("Hoy es: " + fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()) +
                " " + fecha.getDayOfMonth() + " de " + fecha.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()) +
                " del año " +fecha.getYear());
    }
}
