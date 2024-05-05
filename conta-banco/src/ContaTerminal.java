import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeDoCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        System.out.println("Por favor, digite o número da Agência!");
        numero = sc.nextInt();

        System.out.println("Por favor, insira a Agência!");
        sc.nextLine();
        agencia = sc.nextLine();
        
        System.out.println("Por favor, insira seu nome!");
        nomeDoCliente = sc.nextLine();
        
        System.out.println("Por favor, insira seu saldo!");
        saldo = sc.nextDouble();

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponivel para saque.", nomeDoCliente, agencia, numero, saldo);

        System.out.println(mensagem);
        sc.close();
    }
}
