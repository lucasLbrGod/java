public class main {
    public static void main(String[] args) {
        System.out.println("Este é o meu primeiro programa em java");
        System.out.println("Filme Homem Aranha: Sem Volta Para Casa");

        int anoDeLancamento = 2021;
        System.out.println("O filme foi lançado em: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        System.out.println("O filme está incluído no plano: " + incluidoNoPlano);
        double notaIMDB = 8.9;
        System.out.println("A nota do filme é: " + notaIMDB);


        double media = (8.9 + 7.5 + 9.0) / 3;
        System.out.println("A média das notas é: " + media);

        String sinopse;
        sinopse = """ 
                 O filme segue Peter Parker, que lida com as consequências de sua identidade secreta como 
                 Homem-Aranha, enquanto enfrenta novos desafios e inimigos.
                 Muito bom
                 Ano de lançamento: 
                 """ + anoDeLancamento; //""" """ os triplo aspas dupla divide a string em várias linhas, e o + anoDeLancamento concatena a variável com a string

        System.out.println(sinopse);

        String senha = "12345";

        if (senha.equals("12345")) {
            System.out.println("A senha está correta");
        } else {
            System.out.println("A senha está incorreta");
        }


    }
}
