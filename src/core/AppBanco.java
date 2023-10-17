package core;
import cliente.ClienteBanco;
import java.util.Scanner;

public class AppBanco {
    public static void main(String[] args) {
        ClienteBanco cliente = new ClienteBanco();
        Scanner scanner = new Scanner(System.in);
        int opcaoOperacao = 0;

        cliente.exibeContaBancaria(); // exibir a tela inicial

        while (opcaoOperacao != 4) {
            cliente.exibeTipoDeOperacao(); // exibir os tipos de operaçoes

            opcaoOperacao = scanner.nextInt();

            switch (opcaoOperacao) {
                case 1:
                    System.out.println(cliente.getSaldoDaConta());
                    break;

                case 2:
                    System.out.println("Digite o valor a receber:");
                    cliente.transferenciaRecebida(scanner.nextFloat());
                    
                    System.out.println("Saldo atualizado:" + cliente.getSaldoDaConta());
                    break;

                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");

                    float valorTransferido = scanner.nextFloat();

                    if (valorTransferido > cliente.getSaldoDaConta()) {
                        System.out.println("Não há saldo sufuciente para fazer essa transferência.");
                    }
                    else {
                        cliente.transferenciaEfetuada(valorTransferido);
                        System.out.println("Saldo atualizado: " + cliente.getSaldoDaConta());
                    }
                    break;
            }
        }
    }
}
