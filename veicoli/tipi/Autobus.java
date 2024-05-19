package veicoli.tipi;

import interfacce.trasporto;
import veicoli.Veicolo;

public class Autobus extends Veicolo implements trasporto{

    public Autobus(String marca, String modello, int velocita, int peso) {
        super(marca, modello, velocita, peso);
    }

    @Override
    public void trasporto() {
        System.out.println("posso trasposrtare 20 persone!");
    }

    
    
}
