package EstruturaDeDados;

import java.util.ArrayList;
import Beam.Arquivo;

public class Fila {
    
    ArrayList dados;


    public Fila(){
       dados = new  ArrayList(); 
    }

    public void queue(Arquivo arq){
        dados.add(arq);
    }

    public Object dequeue(){
        Object temp = dados.get(0);
        dados.remove(0);
        return temp;
    }

}
