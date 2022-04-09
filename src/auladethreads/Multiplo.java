package auladethreads;

public class Multiplo implements Runnable{
    private int multiplo;
    private int nMultiplo;
    
    public Multiplo(int n){
        multiplo = n;
        nMultiplo = 0;
    }

    public int getMultiplo(){
        return multiplo;
    }
    
    public int getnMultiplo() {
        return nMultiplo;
    }

    public void verificar(int n) {
        if (n % multiplo == 0){
            this.nMultiplo++;
        }
    }

    @Override
    public void run() {
        for (int i = 1; i < 1000000; i++){
            verificar(i);
        }
    }
}