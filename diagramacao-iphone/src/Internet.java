public class Internet {
    private String url;

    public Internet(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public void exibirPagina(){
        System.out.println("Acessando a página: "+this.getUrl());
    }
    public void adicionarPagina(String novaAba){
        System.out.println("Adicionada a página: "+novaAba);
    }
    public String atualizarPagina(){
        return "Atualizada";
    }

    
    
}