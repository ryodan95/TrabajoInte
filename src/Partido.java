public class Partido {

    private int[][] goles;

    public Partido(int[][] goles) {
        this.goles = goles;
    }

    public int[][] getGoles() {
        return goles;
    }


    public static void main(String[] args) {

        Equipo equipo1 = new Equipo("Argentina", 1);
        Equipo equipo2 = new Equipo("Brasil", 2);

        int [][] goles = {{2,1}, {1,0}};

        Partido partido = new Partido(goles);

        System.out.println("Goles de " + equipo1.getNombre() + " : " + partido.getGoles() [0][0] + " y " + partido.getGoles()[0][1]);
        System.out.println("Goles de " + equipo2.getNombre() + " : " + goles [1][0] + " y " + goles[1][1]);
    }


}
