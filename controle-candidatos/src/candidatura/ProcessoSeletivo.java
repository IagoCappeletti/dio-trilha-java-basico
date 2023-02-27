package candidatura;

import java.sql.Blob;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.text.StyledEditorKit.BoldAction;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("           PROCESSO SELETIVO           ");
        System.out.println("==========================================");
        selecaoCandidatos();
        imprimriSelecionados ();

        String[] candidatos = {"FELPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato: candidatos) {
            entrarEmContato(candidato);
        }
    }

    static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 1;
        Boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu){ 
            System.out.println("Conseguimos contato com "+ candidato + " na " + tentativasRealizadas + " Tentativa\n");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas " + tentativasRealizadas + " Realizada\n");
        }
    }

    //método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimriSelecionados () {
        String[] candidatos = {"FELPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for (int i = 0; i < candidatos.length; i++) {
            System.out.printf("\nO candidato de Nº %d é %s",i , candidatos[i]);
        }
    }

    static void selecaoCandidatos () {
        String[] candidatos = {"FELPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE",};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
        /*candidatosSelecionados e eu só posso selecinar 5, mas eu só posso selecionar 
        enquanto tiver pessoas para eu buscar na minha lista de candidatura */ 
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("\nO candidato %s solicitou este valor de salário %.2f\n", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.printf("O candidato %s foi selecionado para a vaga\n", candidato);
                candidatosSelecionados++;
            } else {
                System.out.printf("O candidato %s NÃO foi selecionado para a vaga\n", candidato);
            }
            candidatoAtual++;
        }
        System.out.println("\n==========================================");
        System.out.println("        PROCESSO SELETIVO FINALIZADO");
        System.out.println("==========================================");
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2100);
    }

    static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}