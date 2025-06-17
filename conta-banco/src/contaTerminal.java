import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numConta;
        String agencia;
        String nomeCliente;
        double saldo;
        System.out.println("#################################");
        System.out.println("#####Bem vindo ao Banco Dio!#####");
        System.out.println("#################################");
        System.out.println("Por favor, informe seu nome:");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o número da Agência:");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da Conta:");
        numConta = sc.nextInt();        
        System.out.println("Por favor, informe o saldo inicial:");
        saldo = sc.nextDouble();
        System.out.println("#################################");
        System.out.println("#####Dados da Conta#####");
        System.out.printf("Olá %s, obrigado por criar uma conta no nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numConta, saldo);
        sc.close();
    }
}
        