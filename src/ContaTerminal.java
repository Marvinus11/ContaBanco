import java.util.Scanner;

public class ContaTerminal {
    Scanner sc = new Scanner(System.in);

    int conta;
    double saldo = 100.00;
    String agencia, nomeCliente;

    public void criarConta() {
        System.out.println("Olá, bem-vindo(a)!!");
        System.out.println("Para começarmos, insira o número da conta: ");
        conta = sc.nextInt();
        System.out.println("Agora insira o número da agência: ");
        agencia = sc.next();
        System.out.println("Agora nome: ");
        nomeCliente =  sc.next();
        System.out.println("Conta criada com sucesso!");

        System.out.format("Olá %s, obrigado por criar uma conta em nosso banco %n", nomeCliente);
        System.out.format("O número da sua conta é %s %n", conta);
        System.out.format("Sua agência é %s %n", agencia);
        System.out.format("Você tem %s disponível para saque %n", saldo);
    }

}
