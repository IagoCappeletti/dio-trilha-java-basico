import java.util.concurrent.ThreadLocalRandom;

public class ExemplosWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.printf("Valor do doce: %.2f adicionado no carrinho\n", valorDoce);
            mesada = mesada - valorDoce;
            System.out.printf("Mesada: %.2f\n" ,mesada);
        }
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 10);
    }
}
