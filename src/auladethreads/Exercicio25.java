package auladethreads;

import java.util.ArrayList;
import java.util.List;

public class Exercicio25{
    public static void main(String[] args) throws InterruptedException{
        List<Carro> carros = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();
        
        for (int i = 1; i <= 3; i++){
            carros.add(new Carro(i));
            Thread th = new Thread(carros.get(i - 1));
            threads.add(th);
        }
        
        for (int i = 0; i < 3; i++){
            threads.get(i).start();
        }
        
        for (int i = 0; i < 3; i++){
            threads.get(i).join();
        }
        
        Carro vencedor = carros.get(0);
        
        for (int i = 1; i < 3; i++){
            if (vencedor.getTempoTotal().isAfter(carros.get(i).getTempoTotal())){
                vencedor = carros.get(i);
            }
        }
        
        System.out.println("Carro vencedor : " + vencedor.getId());
    }
}