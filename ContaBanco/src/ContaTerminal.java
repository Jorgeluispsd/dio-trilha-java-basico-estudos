package ContaBanco.src;
import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        System.out.println("Bem vindo a criação da sua conta no banco!");

        System.out.println("Por favor digite o numero da sua conta: ");
        int NumeroConta;
        NumeroConta = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Por favor digite o numero da sua agencia: ");
        String Agencia;
        Agencia = teclado.nextLine();
        System.out.println("Qual seu nome? ");
        String Nome;
        Nome = teclado.nextLine();
        System.out.println("Por favor digite o valor do seu saldo: ");
        double Saldo;
        Saldo = teclado.nextDouble();

        System.out.println("Olá " + Nome + " obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + " , sua conta é " + NumeroConta + " e seu saldo: " + Saldo + " já está disponivel para saque!");
        System.out.println("Obrigado por confiar em nosso serviço!");
    }
}


