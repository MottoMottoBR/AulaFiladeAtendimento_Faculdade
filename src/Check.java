import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Check {

    public  static void exibiMsg( String escolha, String[] vaga ) {
        Scanner teclado = new Scanner(System.in);
        String msgPergunta = "Digite o nome do paciente";


        if (Objects.equals(escolha, vaga[0])) {
            System.out.println(msgPergunta);
            vaga[0] = escolha = teclado.nextLine();
            Date data = new Date();

        }
        if (Objects.equals(escolha, vaga[1])) {
            System.out.println(msgPergunta);
            vaga[1] = escolha = teclado.nextLine();
        }
        if (Objects.equals(escolha, vaga[2])) {
            System.out.println(msgPergunta);
            vaga[2] = escolha = teclado.nextLine();
        }
        if (Objects.equals(escolha, vaga[3])) {
            System.out.println(msgPergunta);
            vaga[3] = escolha = teclado.nextLine();
        }
        if (Objects.equals(escolha, vaga[4])) {
            System.out.println(msgPergunta);
            vaga[4] = escolha = teclado.nextLine();
        }
        if (Objects.equals(escolha, vaga[5])) {
            System.out.println(msgPergunta);
            vaga[5] = escolha = teclado.nextLine();
        }
        if (Objects.equals(escolha, vaga[6])) {
            System.out.println(msgPergunta);
            vaga[6] = escolha = teclado.nextLine();
        }
        if (Objects.equals(escolha, vaga[7])) {
            System.out.println(msgPergunta);
            vaga[7] = escolha = teclado.nextLine();
        }
        if (Objects.equals(escolha, vaga[8])) {
            System.out.println(msgPergunta);
            vaga[8] = escolha = teclado.nextLine();
        }
        if (Objects.equals(escolha, vaga[9])) {
            System.out.println(msgPergunta);
            vaga[9] = escolha = teclado.nextLine();
        }

    }

}