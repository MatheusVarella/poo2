package sincronizacao;

public class Exercicio2 {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();
        
        ContadorThread contadorThread = new ContadorThread(contador);
        
        contadorThread.run();
    }
}