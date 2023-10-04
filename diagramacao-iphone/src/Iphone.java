import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1- Reprodutor de música\n2- Telefone\n3- Acessar internet\n0- Sair");
            System.out.println("Escolha a função: ");
            int funcao = scanner.nextInt();

            if (funcao == 0) {
                break;
            } else if (funcao == 1) {
                System.out.println("Digite o nome da música");
                String nomeMusica = scanner.next();
                System.out.println("Digite o nome do cantor");
                String cantor = scanner.next();
                
                Musica.Reproducao faixa1 = new Musica.Reproducao(nomeMusica, cantor);
                Musica musica = new Musica(faixa1);

                System.out.println("1- Tocar música\n2- Pausar música");
                int escolha = scanner.nextInt();


                if (escolha == 1) {
                    musica.tocar();
                } else if (escolha == 2) {
                    musica.pausar();
                } else {
                    System.out.println("Opção inválida.");
                }
            } else if (funcao == 2) {
                 System.out.println("Digite o nome do contato");
                 String nomeContato = scanner.next();
                 System.out.println("Digite o numero de celular");
                 String numCelular = scanner.next();

                Telefone.Contatos pessoa = new Telefone.Contatos(nomeContato, numCelular);
                Telefone contato1 = new Telefone(pessoa);

                System.out.println("1- ligar\n2- atender");
                int telefonar = scanner.nextInt();

                if (telefonar == 1){
                    contato1.ligar();
                }else if (telefonar == 2){
                    contato1.atender();
                }else{
                    System.out.println("opção invalida");
                }
            } else if (funcao == 3){
                System.out.println("Digite o nome da pagina");
                String pesquisa = scanner.next();

                Internet pagina = new Internet(pesquisa);
                System.out.println("1- exibir\n2- adicionar\n3- atualizar");
                int acesso = scanner.nextInt();

                if (acesso == 1){
                    pagina.exibirPagina();
                }else if (acesso == 2){
                    pagina.adicionarPagina(pesquisa);
                }else if (acesso == 3){
                    pagina.atualizarPagina();
                }else {
                    System.out.println("opçao invalida");
                }

            }
        }
        scanner.close();
    }
}
