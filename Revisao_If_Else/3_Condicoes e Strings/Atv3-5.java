package Atividades_IfElse;
import java.util.Scanner;
public class Atv4_1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a primeira palavra: ");
            String palavra1 = scanner.nextLine();

            System.out.print("Digite a segunda palavra: ");
            String palavra2 = scanner.nextLine();

            if (palavra1.equalsIgnoreCase(palavra2)) {
                System.out.println("As palavras são iguais.");
            } else {
                System.out.println("As palavras são diferentes.");
            }

            scanner.close();
        }
    }






