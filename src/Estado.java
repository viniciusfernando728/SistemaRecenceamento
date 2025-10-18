public class Estado {
    private String nome;
    private Municipio capital;
    private Municipio[] municipios;

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public Municipio getCapital(){return this.capital;}
    public void setCapital(Municipio capital){this.capital = capital;}

    public Municipio[] getMunicipios(){return this.municipios;}
    public void setMunicipios(Municipio[] municipios){this.municipios = municipios;}

    public Estado(String nome, Municipio capital, Municipio[] municipios){
        this.nome = nome;
        this.capital = capital;
        this.municipios = municipios;
    }

    public long populacaoEstado(){
        long populacaoTotal = 0;
        for (Municipio municipio : municipios){
            populacaoTotal += municipio.getPopulacao();
        }

        return populacaoTotal;
    }

    public float areaEstado(){
        float areaTotal = 0;
        for (Municipio municipio : municipios){
            areaTotal += municipio.getArea();
        }

        return areaTotal;
    }

    public float densidadeDemograficaEstado(long populacaoTotal, float areaTotal){
        return populacaoTotal / areaTotal;
    }

    public void maiorPibPerCapita(float referencia){
        for (Municipio municipio : municipios) {
            if (municipio.pibPerCapita() > referencia)
                municipio.show();
        }
    }

    public void municipiosPartido(String partido){
        for (Municipio municipio : municipios){
            if (municipio.getPrefeito().getPartido().equals(partido)){
                System.out.println("\nMunicípio: " + municipio.getNome());
                System.out.println("Prefeito: " + municipio.getPrefeito().getNome());
            }
        }
    }
}
