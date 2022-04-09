package auladethreads;

import java.time.Instant;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Carro implements Runnable {
    int id;
    int tempo;
    Instant tempoTotal;
    
    public Carro(int id){
        this.id = id;
        this.tempo = 0;
    }
    
    public int getId() {
        return id;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public Instant getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(Instant tempoTotal) {
        this.tempoTotal = tempoTotal;
    }
    
    public void correr(int n) throws InterruptedException{
        Random random = new Random();
        
        //tempoTotal = Instant.now().toEpochMilli();
        
        for(int i = 1; i <= n; i++){
            Thread.sleep(500 + random.nextInt(501));
            System.out.println("O carro " + id + " está na posição " + i);
        }
        
        //tempoTotal = Instant.now().toEpochMilli() - tempoTotal;
    }

    @Override
    public void run() {
        Random random = new Random();
        
        //tempoTotal = Instant.now().toEpochMilli();
        
        for(int i = 1; i <= 10; i++){
            try {
                Thread.sleep(500 + random.nextInt(501));
            } catch (InterruptedException ex) {
                Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("O carro " + id + " está na posição " + i);
        }
        
        tempoTotal = Instant.now();
    }
}