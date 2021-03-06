package bytebank;

public class TestaMetodos {

	public static void main(String[] args) {
		Conta conta = new Conta();

		conta.saldo = 50;

		conta.deposita(100);

		System.out.println(conta.saldo);

		boolean saqueConcluido = conta.saca(20);

		System.out.println(conta.saldo);

		Conta contaDaMarcela = new Conta();

		contaDaMarcela.deposita(1000);

		boolean transferenciaConcluida = contaDaMarcela.transfere(conta, 500);

		if (transferenciaConcluida) {
			System.out.println(contaDaMarcela.saldo);

			System.out.println(conta.saldo);
		}
	}

}
