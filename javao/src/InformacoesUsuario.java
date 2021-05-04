import java.util.Scanner;

public class InformacoesUsuario {
    public static void main(String[] args) {

        String str;
        Integer valor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");

        // O SCANNER serve para receber dados do usuário
        valor = scanner.nextInt();

        System.out.println(valor+ 10);
    }
}
