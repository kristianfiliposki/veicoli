package veicoli;
public abstract class  Veicolo  {
    private String marca;
    private String modello;
    private int velocita;
    private int peso;
    

    protected Veicolo(String marca,String modello, int velocita, int peso){
        this.marca=marca;
        this.modello=modello;
        this.velocita=velocita;
        this.peso=peso;
    }

    public void moto(){
        System.out.println("i veicoli possono muoversi");
    }

    public String toString(){
        String stringa= this.marca + " " + this.modello + "\n" + "raggiunge una velocita di " + this.velocita + "k/h" + "\n" + "pesa " + this.peso + "kg";
        return stringa;
   }

   public String getmarca(){
       return marca;
   }
   /* ottieni i dati */
    public String getmodello(){
        return modello;
    }
    public int getvelocita(){
        return velocita;
    }
    public int getpeso(){
        return peso;
    }


    /* i set possono modificare i nomi etc */
    public String setmarca(String marca){
        marca= this.marca ;
        return marca;
    }
    public String setmodello(String modello){
        modello= this.modello ;
        return modello;
    }
    public int setvelocita(int velocita){
        velocita= this.velocita ;
        return velocita;
    }
    public int setpeso(int peso){
        peso= this.peso;
        return peso;
    }
}
