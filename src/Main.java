import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> palavrasSecretas = new ArrayList<>();
        palavrasSecretas.add("cobra");
        palavrasSecretas.add("elefante");
        palavrasSecretas.add("girafa");

        Random random = new Random();
        int tamanhoDoArray = palavrasSecretas.size();
        int indicePalavraAleatoria = random.nextInt(tamanhoDoArray);
        String palavraSecreta = palavrasSecretas.get(indicePalavraAleatoria);

        ArrayList<Character> letrasDescobertas = new ArrayList<>();

        for (int i = 0; i < palavraSecreta.length(); i++) {
            letrasDescobertas.add('_');

        }

        int tentativas = 7;
        boolean palavraDescoberta = false;

        while (!palavraDescoberta && tentativas > 0){
            System.out.println();
            System.out.println("Palavra: " + letrasDescobertas);
            System.out.println("Chute uma letra: ");
            char chute = sc.next().charAt(0);

            boolean acertou = false;

            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == chute){
                    letrasDescobertas.set(i, chute);
                    acertou = true;
                }
            }

            if (!acertou){
                tentativas--;
                System.out.println("Vc tem mais " + tentativas + " tentativas.");
            }

            palavraDescoberta = !letrasDescobertas.contains('_');

        }

        if(palavraDescoberta){
            System.out.println("Parabéns vc acertou!!!! <3 <3 <3");
        }else {
            System.out.println("Vc perdeu!!!! Chora vagabundo :'( ");
        }
    }
}