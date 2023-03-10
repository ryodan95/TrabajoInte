public class Main {
    public static void main(String[] args) {

        Equipo equipo1 = new Equipo("Argentina", 1);
        Equipo equipo2 = new Equipo("Brasil", 2);

        Rondas rondas = new Rondas();
        rondas.agregarEquipo(equipo1);
        rondas.agregarEquipo(equipo2);

        rondas.mostrarEquipos();

    }

}