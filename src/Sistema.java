public class Sistema {

    public static Estado gerarEstado(String nome){
        Municipio[] municipios = new Municipio[4];

        Prefeito prefeito = new Prefeito("André Fernandes", "PL");
        Municipio capital = new Municipio("Fortaleza", 2428708L, 312.35F, 73.4F, prefeito);
        municipios[0] = capital;

        Prefeito prefeito1 = new Prefeito("Oscar Rodrigues", "União");
        Municipio municipio1 = new Municipio("Sobral", 203023L, 2068.47F, 5.4F, prefeito1);
        municipios[1] = municipio1;

        Prefeito prefeito2 = new Prefeito("Naumi Amorim", "PSD");
        Municipio municipio2 = new Municipio("Caucaia", 355679L, 1223.20F, 10.4F, prefeito2);
        municipios[2] = municipio2;

        Prefeito prefeito3 = new Prefeito("Roberto Pessoa", "União");
        Municipio municipio3 = new Municipio("Maracanaú", 234509L, 105.08F, 12.3F, prefeito3);
        municipios[3] = municipio3;

        return new Estado(nome, capital, municipios);
    }

    public static void main(String[] args){
        Estado estado = gerarEstado("Ceará");

        System.out.printf("\n======= CENSO DO ESTADO DO %s =======\n", estado.getNome().toUpperCase());

        System.out.println("Capital: " + estado.getCapital().getNome());
        System.out.printf("População Total: %d habitantes", estado.populacaoEstado());
        System.out.printf("\nÁrea Total: %.2f km²", estado.areaEstado());
        System.out.printf("\nDensidade Demográfica: %.2f hab/km²",
                            estado.densidadeDemograficaEstado(estado.populacaoEstado(), estado.areaEstado()));

        System.out.println("\n\n========================================");
        System.out.println("Munícipios com maior renda per capita:");
        estado.maiorPibPerCapita(30000);

        System.out.println("\n========================================");
        System.out.println("Munícipios do partido União");
        estado.municipiosPartido("União");
    }
}
