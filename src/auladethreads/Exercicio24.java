package auladethreads;

import java.time.Instant;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio24 implements Runnable {
    public static void main(String[] args){
        (new Thread(new Exercicio24())).start();
    }

    @Override
    public void run() {
        Random random = new Random();
        Carro carro = new Carro(1);
        
        long auxiliar = Instant.now().toEpochMilli();
        int n;
        
        for (int i = 1; i <= 100; i++){
            n = random.nextInt(501) + 500;
            
            try {
                Thread.sleep(n);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            carro.setTempo(carro.getTempo() + n);
            
            System.out.println("O carro " + carro.id + " está na posição " + i);
        }
        
        //carro.setTempoTotal(Instant.now().toEpochMilli() - auxiliar);
        
        //System.out.println("Tempo total de " + carro.getTempoTotal() / 1000 + "s");
    }
}