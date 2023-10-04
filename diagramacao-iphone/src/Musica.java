public class Musica {
    private Reproducao faixa;

    public Musica(Reproducao faixa) {
        this.faixa = faixa;
    }

    public Reproducao getFaixa() {
        return faixa;
    }

    public void tocar(){
        System.out.println("Tocando a música " + this.getFaixa());
    }
    public void pausar(){
        System.out.println("Música pausada" + this.getFaixa());
    }

    public static class Reproducao{
        String nome, artista;
    
        public Reproducao(String nome, String artista) {
            this.nome = nome;
            this.artista = artista;
        }
    }
}

