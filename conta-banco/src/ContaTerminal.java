import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

            System.out.print("Por favor, digite o número da Conta: ");
            int numero = sc.nextInt();

            System.out.print("Por favor, digite o número da Agência: ");
            String agencia = sc.next();

            System.out.print("Digite o seu Nome: ");
            sc.nextLine();
            String nomeCompleto = sc.nextLine();

            System.out.print("Digite o valor do Saldo: ");
            Double saldo = sc.nextDouble();

            System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
