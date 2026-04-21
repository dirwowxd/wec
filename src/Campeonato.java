import java.util.ArrayList;

public class Campeonato {
    public static void main(String[] args) {
        ArrayList <cocheDeCarreras>cochesito= new ArrayList<>();

        cochesito.add(new PrototipoLM("Jairo", "ultimate", 200, true));
        cochesito.add(new PrototipoLM("chevrolet", "zangano", 220, false));
        cochesito.add(new GranTurismo("Monster Hunter", "Wilds", 250, 20));
        cochesito.add(new GranTurismo("Stalker 2", "chenobyl", 240,1000));


        for(cocheDeCarreras c:cochesito){
                c.competir();
                c.mostrarDatos();
        }
    }
}
