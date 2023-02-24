import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
            Double saldo = 25.0;

            System.out.print("Qual valor deseja sacar? R$ ");
            double valorSaque = sc.nextDouble();

            if (valorSaque < saldo) {
                saldo= saldo - valorSaque;
                System.out.printf("Saldo da conta = R$ %.2f" , saldo);
            } else {
                System.out.println("Saldo insuficiente! ");
            }

        sc.close();
    }
}
