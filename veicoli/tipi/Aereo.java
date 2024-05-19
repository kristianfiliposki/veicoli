package veicoli.tipi;

import interfacce.Caccia;
import veicoli.Veicolo;

public class Aereo extends Veicolo implements Caccia{

    public Aereo(String marca, String modello, int velocita, int peso) {
        super(marca, modello, velocita, peso);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void ricognizione() {
        System.out.println("sono un aereo militare");
    }
    
}
