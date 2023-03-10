import java.util.ArrayList;
import java.util.List;

public class Rondas {
    private List<Equipo> equipos;

    public Rondas() {
        equipos = new ArrayList<>();
    }
    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }
    public void mostrarEquipos() {
        for (Equipo equipo : equipos) {
        System.out.println(equipo.getNombre());
        }
    }


}
