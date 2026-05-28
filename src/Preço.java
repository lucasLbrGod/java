public class Preço {
    public static void main(String[] args) throws Exception { 
        String as = "************";
        double preco = 50.5;

        int quant = 2;

        double fim = preco * quant;

        System.out.println(fim);

        System.out.println(as);
        double dolar = 10;

        double reais = dolar * 4.94;

        System.out.println(reais);

        System.out.println(as);
        double precoOriginal = 100;

        double percentualDesc = 0.10;

        double porcen = precoOriginal - (percentualDesc * precoOriginal);

        System.out.println(precoOriginal);
        System.out.println(porcen);
    }
}