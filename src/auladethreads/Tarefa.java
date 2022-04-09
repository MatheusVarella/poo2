package auladethreads;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tarefa extends Thread{
   public String nome;
   
   private Random random = new Random();
   
   public Tarefa(String nome){
       this.nome = nome;
   }
   
   public Tarefa(){
   }
    
   @Override
   public void run(){
        /*int valor = (int) random.nextInt(3);
       
        try {
            System.out.println("Hello Thread " + nome);
           
            Thread.sleep(valor);
           
            System.out.println("Encerrando Thread " + nome); 
            Thread.interrupted();
        } catch(Exception e){
           
        } */
        
        while (true){
            System.out.println("Olá");
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
        }
   }
    
   public void iniciarThread(String nome, boolean posicao) throws InterruptedException{
        Tarefa tarefa = new Tarefa(nome);
        tarefa.start();
       
        if (posicao){
            tarefa.join();
        }
   }
}