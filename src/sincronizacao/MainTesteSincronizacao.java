package sincronizacao;

/**
 *
 * @author Matheus
 */
public class MainTesteSincronizacao {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();
        
        System.out.println("valor atual do contador " + contador.getContador());
        
        ContadorThread thread1 = new ContadorThread(contador);
        ContadorThread thread2 = new ContadorThread(contador);
        ContadorThread thread3 = new ContadorThread(contador);
        
        Thread th1 = new Thread(thread1);
        Thread th2 = new Thread(thread2);
        Thread th3 = new Thread(thread3);
        
        th1.start();
        th2.start();
        th3.start();
        th3.join();
        
        System.out.println("valor atual do contador " + contador.getContador());
    }
}