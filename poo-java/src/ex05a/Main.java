package ex05a;

public class Main {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();
        conta.abrirConta("CC");
        conta.depositar(0);
        conta.sacar(50);
        conta.pagarMensal();
        float saldo = conta.getSaldo();
        System.out.println(saldo);

    }
}
