public class Estudos{
    public static void main(String[] args) throws Exception {
        System.out.println("JVM (Java Virtual Machine) - é a Máquina Virtual do Java responsável por executar o bytecode");
        System.out.println("JRE (Java Runtime Environment) - Ambiente de Execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar o seu código e para a JVM executar o seu program");
        
        String nome = "lucas";
        int aulas = 4;

        String mensagem = String.format(
                "Olá, %s!" +
                "Boas vindas ao curso de Java." +
                "Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!",
                nome, aulas);
                // %d indica um valor inteiro 
                // %s indica que uma String será inserida 
                // %f indica um valor de ponto flutuante. se tiver %2F 2 casas decimais e assim adiante
            System.out.println(mensagem);
    }
}
