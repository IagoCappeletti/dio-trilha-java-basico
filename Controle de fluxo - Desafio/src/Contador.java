import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroParametro = sc.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int segundoParametro = sc.nextInt();
      
        contar(primeiroParametro, segundoParametro);

        sc.close();
    }

    static void contar(int primeiroParametro, int segundoParametro ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (segundoParametro < primeiroParametro){
            throw new ParametrosInvalidosException();
        }
		//realizar o for para imprimir os números com base na variável contagem
        int contagem = segundoParametro - primeiroParametro;
        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
	}
}