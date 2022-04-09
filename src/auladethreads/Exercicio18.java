package auladethreads;

public class Exercicio18 implements Runnable {
    public void run() {
        System.out.println("Olá Thread!");
    }
    
    public static void main(String[] args){
        (new Thread(new Exercicio18())).start();
    }
}