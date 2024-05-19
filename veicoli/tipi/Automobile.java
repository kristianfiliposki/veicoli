package veicoli.tipi;

import interfacce.Racing;
import veicoli.Veicolo;

public class Automobile extends Veicolo implements Racing{
   public Automobile(String marca, String modello, int velocita, int peso){
    super(marca,modello, velocita, peso);
   }

    @Override
    public void moto(){
     System.out.println("i veicoli possono muoversi lungo la strada");
     }

    @Override
    public void corsa() {
        System.out.println("sono un auto da corsa");
    }


}
