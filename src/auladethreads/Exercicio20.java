package auladethreads;

public class Exercicio20 {
    public static void main(String[] args) throws InterruptedException{
        Tarefa tarefa = new Tarefa("nome");
        
        tarefa.iniciarThread(tarefa.nome, false);
    }
}
