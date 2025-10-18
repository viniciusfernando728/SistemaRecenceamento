public class Municipio {
    private String nome;
    private long populacao;
    private float area;
    private float pib;
    private Prefeito prefeito;

    public Municipio(String nome, long populacao, float area, float pib, Prefeito prefeito){
        this.nome = nome;
        this.populacao = populacao;
        this.area = area;
        this.pib = pib * (float) Math.pow(10, 9);
        this.prefeito = prefeito;
    }

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public long getPopulacao(){return this.populacao;}
    public void setPopulacao(long populacao){this.populacao = populacao;}

    public float getArea(){return this.area;}
    public void setArea(float area){this.area = area;}

    public float getPib(){return this.pib;}
    public void setPib(float pib){this.pib = pib;}

    public Prefeito getPrefeito(){return this.prefeito;}
    public void setPrefeito(Prefeito prefeito){this.prefeito = prefeito;}

    public float densidadeDemografica(){
        return this.populacao / this.area;
    }

    public float pibPerCapita(){
        return this.pib / this.populacao;
    }

    public void show(){
        System.out.println("\nMunicípio: " + this.nome);
        System.out.printf("População: %d habitantes", this.populacao);
        System.out.printf("\nÁrea: %.2f km²", this.area);
        System.out.printf("\nDensidade Demográfica: %.2f hab/km²", this.densidadeDemografica());
        System.out.printf("\nPIB: R$ %.2f", this.pib);
        System.out.printf("\nPrefeito: %s (%s)", this.prefeito.getNome(), this.prefeito.getPartido());
        System.out.printf("\nPIB Per Capita: R$ %.2f \n", this.pibPerCapita());
    }
}
