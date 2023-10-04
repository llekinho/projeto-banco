import java.util.Scanner;

public class appBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoOperacao = 0;
        String nomeCliente = "Alex Silva";
        String tipoDeConta = "Corrente";
        double saldoDaConta = 2500.00;

        System.out.println("*************************************************\n");
        System.out.println("Dados iniciais do cliente:" +
                "\nNome:                " + nomeCliente +
                "\nTipo de conta:       " + tipoDeConta +
                "\nSaldo Inicial:       R$" + saldoDaConta);
        System.out.println("\n*************************************************\n\n");

        while (opcaoOperacao != 4) {
            System.out.println("Tipo de Operação\n");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - transferir valor");
            System.out.println("4 - Sair");

            System.out.println("\nDigite a opção desejada: ");

            opcaoOperacao = scanner.nextInt();

            switch (opcaoOperacao) {
                case 1:
                    System.out.println(saldoDaConta);
                    break;

                case 2:
                    System.out.println("Digite o valor a receber:");
                    float valorRecebido = scanner.nextFloat();
                    saldoDaConta += valorRecebido;
                    System.out.println("Saldo atualizado:" + saldoDaConta);
                    break;

                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    float valorTransferido = scanner.nextFloat();
                    if (valorTransferido > saldoDaConta) {
                        System.out.println("Não há saldo sufuciente para fazer essa transferência.");
                    } else {
                        saldoDaConta -= valorTransferido;
                        System.out.println("Saldo atualizado: " + saldoDaConta);
                    }
                    break;

            }
        }
    }
}
