import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa: \"Por favor, digite o número da Agência !\"");
        String agencia = scanner.nextLine();

        ContaTerminal contaTerminal = new ContaTerminal(1,350, "Mario Games", agencia);


        System.out.println("Usuário: " + contaTerminal.getAgencia());

        System.out.println("Olá " + contaTerminal.getNomeCliente() +
                ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+ contaTerminal.getAgencia() +
                ", conta "+ contaTerminal.getNumero() + " e seu saldo "
                + contaTerminal.getSaldo() +
                " já está disponível para saque.");



        scanner.close();

    }
}
