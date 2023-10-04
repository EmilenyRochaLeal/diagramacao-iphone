import java.util.Scanner;

public class Telefone {
   private  Contatos contato;

    public Telefone(Contatos contato) {
    this.contato = contato;
}
    public Contatos getContato() {
        return contato;
    }

    public void setContato(Contatos contato) {
        this.contato = contato;
    }

    public void ligar(){
        System.out.println("ligando...");
    }
    public void atender(){
        System.out.println("Recebendo ligação\n1- atender\n2- recusar");
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();
        if (op == 1){
            System.out.println("Chamada inicializada");
        } else if (op == 2){
            System.out.println("Chamada recusada");
        }else {
            System.out.println("Tocando...");
        }
        scanner.close();
    }
    
    public static class Contatos{
        String nome;
        String numeroCelular;
        public Contatos(String nome, String numeroCelular) {
            this.nome = nome;
            this.numeroCelular = numeroCelular;
        }
    }

}

