package auladethreads;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) throws InterruptedException{
        ArrayList<Tarefa> lista = new ArrayList<>();
        
        for(int i = 1; i <= 100000; i++){
            lista.add(new Tarefa(" " + i));
        }
        
        for(int i = 0; i < 100000; i++){
            lista.get(i).iniciarThread(lista.get(i).nome, false);
        }
    }
}