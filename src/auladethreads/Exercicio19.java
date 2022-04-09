package auladethreads;

public class Exercicio19 extends Thread{
    @Override
    public void run(){
        System.out.println("Olá");
    }
    
    public static void main(String[] args){
        new Exercicio19().start();
    }
}