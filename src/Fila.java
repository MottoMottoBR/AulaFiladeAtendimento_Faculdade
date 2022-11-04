import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Fila {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Variavel
        String escolha = "null";

        int sim = 1;
        int nao = 2;

        String[] vaga = new String[10];
        vaga[0] = "VAGA1";
        vaga[1] = "VAGA2";
        vaga[2] = "VAGA3";
        vaga[3] = "VAGA4";
        vaga[4] = "VAGA5";
        vaga[5] = "VAGA6";
        vaga[6] = "VAGA7";
        vaga[7] = "VAGA8";
        vaga[8] = "VAGA9";
        vaga[9] = "VAGA10";

        do{

        System.out.println("Vagas Disponiveis \n" + Arrays.toString(vaga));
        System.out.print("Escolha uma vaga ");
        escolha = ler.nextLine().toUpperCase();

    Check.exibiMsg(escolha,vaga);
      System.out.println( "Adicionado com sucesso! ");
      System.out.println( "Fila atual de atendimento! ");

            System.out.println("Vagas Disponiveis \n" + Arrays.toString(vaga));

      // System.out.println(Arrays.toString(vaga));
      System.out.println("Para adicionar ( 1 ) Remover ( 2 )  ");

        sim = ler.nextInt();
            System.out.println("voce escolheu adicionar! ");
            System.out.print("Escolha uma vaga ");
            escolha = ler.nextLine().toUpperCase();
            Check.exibiMsg(escolha,vaga);
            //chama a funçao de esolha das vagas

        }while ( sim == 1);{
            System.out.print("Programa finalizado");
        }


    }

}