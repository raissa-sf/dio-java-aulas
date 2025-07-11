import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMeInput {
    public static void main(String[] args) {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome:");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();

            // imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
        } catch (InputMismatchException e) {
            System.out.println("Os campos altura e idade precisam ser numéricos");
        }
    }

}
