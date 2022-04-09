package auladethreads;

import java.util.ArrayList;

public class Exercicio22 {
    public static void main(String[] args) throws InterruptedException{
        ArrayList<Tarefa> lista = new ArrayList<>();
        
        for(int i = 1; i <= 10; i++){
            lista.add(new Tarefa("" + i));
        }
        
        for(int i = 0; i < 10; i++){
            if(i == 0 || i == 9) {
                lista.get(i).iniciarThread(lista.get(i).nome, true);
            } else {
                lista.get(i).iniciarThread(lista.get(i).nome, false);
            }
        }
    }
}