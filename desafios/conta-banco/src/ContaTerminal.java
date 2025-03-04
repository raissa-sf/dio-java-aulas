import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite o número da sua agência:");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da sua conta:");
        double numeroConta = scanner.nextInt();

        System.out.println("Digite o valor do saldo da sua conta:");
        double saldo = scanner.nextDouble();

        String nomeCompleto = nome + " " + sobrenome;

        
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
       

    }
}

