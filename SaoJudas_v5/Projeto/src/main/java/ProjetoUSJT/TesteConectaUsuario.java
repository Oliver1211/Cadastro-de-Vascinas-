package ProjetoUSJT;

import java.util.Scanner;

public class TesteConectaUsuario {

    public static void main(String[] args) {

        String idUsuario = "vini";
        String senhaUsuario = "123";
        String idTeste;
        String senhaTeste;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrada Usuario");
        idTeste = sc.nextLine();
        System.out.println("Entrada Senha");
        senhaTeste = sc.nextLine();

        if (idUsuario.equals(idTeste) && senhaUsuario.equals(senhaTeste)) {
            System.out.println("Bem vindo");
        } else {
            System.out.println("Usuario ou senha incorretos");
        }

        sc.close();

        System.out.println("-------------");
        System.out.println("id = " + idUsuario);
        System.out.println("id teste = " + idTeste);
        System.out.println("Senha = " + senhaUsuario);
        System.out.println("Senha teste = " + senhaTeste);

    }

}
