import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        System.out.println("Por favor, Digite o número da agência : ");
        String numeroAgencia = sc.next();

        System.out.println("Por favor, Digite o número da conta : ");
        int numeroConta= sc.nextInt();

        System.out.println("Por favor Digite o seu nome : ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor digite seu saldo : ");
        double saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +", " + "conta " + numeroConta + " e seu saldo " + saldo + " e já está disponível para saque");
    }
}
