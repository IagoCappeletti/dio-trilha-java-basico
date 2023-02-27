import java.util.Scanner;

public class PedraPapelAtaque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline left-over

        for (int i = 0; i < n; i++) {
            String player1 = sc.nextLine();
            String player2 = sc.nextLine();

            String result = getResult(player1, player2);
            System.out.println(result);
        }

        sc.close();
    }

    private static String getResult(String player1, String player2) {
        if (player1.equals("ataque") && player2.equals("pedra")) {
            return "Jogador 1 venceu";
        } else if (player1.equals("pedra") && player2.equals("papel")) {
            return "Jogador 1 venceu";
        } else if (player1.equals("papel") && player2.equals("ataque")) {
            return "Jogador 2 venceu";
        } else if (player1.equals("ataque") && player2.equals("papel")) {
            return "Jogador 1 venceu";
        } else if (player1.equals("papel") && player2.equals("pedra")) {
            return "Jogador 2 venceu";
        } else if (player1.equals("pedra") && player2.equals("papel")) {
            return "Jogador 2 venceu";
        } else if (player1.equals("ataque") && player2.equals("ataque")) {
            return "Aniquilacao mutua";
        } else if (player1.equals("pedra") && player2.equals("pedra")) {
            return "Sem ganhador";
        } else {
            return "Ambos venceram";
        }
    }
}
