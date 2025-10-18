public class Prefeito {
    private String nome;
    private String partido;

    public Prefeito(String nome, String partido){
        this.nome = nome;
        this.partido = partido;
    }

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public String getPartido(){return this.partido;}
    public void setPartido(String partido){this.partido = partido;}
}
