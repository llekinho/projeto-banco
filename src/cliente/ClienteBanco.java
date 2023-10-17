package cliente;

public class ClienteBanco {

    private String nomeCliente = "Alex Silva";
    private String tipoDeConta = "Corrente";
    private float saldoDaConta = 0;

    public void exibeContaBancaria() {
        System.out.println("*************************************************\n");
        System.out.println("Dados iniciais do cliente:" +
                "\nNome:                " + nomeCliente +
                "\nTipo de conta:       " + tipoDeConta +
                "\nSaldo Inicial:       R$" + saldoDaConta);
        System.out.println("\n*************************************************\n\n");
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void transferenciaRecebida(float valorRecebido) {
        this.saldoDaConta += valorRecebido;
    }

    public void transferenciaEfetuada(float valorTransferido) {
        this.saldoDaConta -= valorTransferido;
    }

    public void exibeTipoDeOperacao() {
        System.out.println("\nTipo de Operação\n");
        System.out.println("1 - Consultar saldos");
        System.out.println("2 - Receber valor");
        System.out.println("3 - transferir valor");
        System.out.println("4 - Sair");

        System.out.println("\nDigite a opção desejada: \n");
    }
}
