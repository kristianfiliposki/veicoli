import java.io.FileWriter;
import java.io.IOException;

import veicoli.tipi.Automobile;
import veicoli.tipi.Aereo;
import veicoli.tipi.Autobus;




public class Main {
    public static void main(String[] args){

        Automobile ferrari = new Automobile("ferrari","488", 300,1400);
        System.out.println(ferrari);


        Automobile Porsche = new Automobile("Porsche","911 GT3", 300,1400);
        System.out.println(Porsche);


        Automobile Nissan = new Automobile("Nissan","GT-R", 350,1800);
        System.out.println(Nissan);


        Autobus Atac = new Autobus("Atac","342",70,5000); 
        System.out.println(Atac);

        Aereo F16 = new Aereo("F-","16",3890,9210); 
        System.out.println(F16);

        try (FileWriter writer = new FileWriter("testo.txt")) {
            writer.write(ferrari.toString()+"\n"+"\n"+ Atac.toString()+"\n"+"\n"+ Porsche.toString()+"\n"+"\n"+ Nissan.toString()+"\n"+"\n"+ F16.toString());
        } catch (IOException e) {
            System.out.println("c'è qualche errore");
        } 
    } 
} 