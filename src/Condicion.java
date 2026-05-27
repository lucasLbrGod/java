public class Condicion {
    public static void main(String[] args) { // psvm ou main atalho
        int anoDeLancamento = 2021;
        boolean incluidoNoPlano = true;
        double nota = 8.9;
        String tipoDePlano = "plus";
       
        if (anoDeLancamento >= 2021) {
            System.out.println(" tops filmes atuais");
        }else {
            System.out.println("filmes retro");
        }

        if (incluidoNoPlano == true || tipoDePlano.equals("plus")) {
            System.out.println("incluso");
        }else{
            System.out.println("pague a locação");
        }


        
    }
}
