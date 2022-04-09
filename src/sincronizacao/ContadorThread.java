package sincronizacao;

public class ContadorThread implements Runnable{
    private Contador contador;
    
    public ContadorThread(Contador contador){
        this.contador = contador;
    }
    
    @Override
    public void run() {
        for (long i = 0; i < 1000000000; i++){
            contador.incrementar();
            contador.decrementar();
        }
    }
}