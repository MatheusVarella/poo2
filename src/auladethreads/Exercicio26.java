package auladethreads;

import java.util.ArrayList;
import java.util.List;

public class Exercicio26 implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        List<Multiplo> multiplos = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();
        
        multiplos.add(new Multiplo(3));
        Thread th1 = new Thread((Runnable) multiplos.get(0));
        threads.add(th1);
        
        multiplos.add(new Multiplo(4));
        Thread th2 = new Thread((Runnable) multiplos.get(1));
        threads.add(th2);
        
        multiplos.add(new Multiplo(7));
        Thread th3 = new Thread((Runnable) multiplos.get(2));
        threads.add(th3);
        
        multiplos.add(new Multiplo(9));
        Thread th4 = new Thread((Runnable) multiplos.get(3));
        threads.add(th4);
        
        multiplos.add(new Multiplo(11));
        Thread th5 = new Thread((Runnable) multiplos.get(4));
        threads.add(th5);
        
        
        for(int i = 0; i < 5; i++){
            threads.get(i).start();
            threads.get(i).join();
        }
        
        int somaTotal = 0;
        
        for(int i = 0; i < 5; i++){
            System.out.println(multiplos.get(i).getMultiplo() + " - " + multiplos.get(i).getnMultiplo());
            somaTotal += multiplos.get(i).getnMultiplo();
        }
        
        System.out.println("Número total de multiplos " + somaTotal);
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}