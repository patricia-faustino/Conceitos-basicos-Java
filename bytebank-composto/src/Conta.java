public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfere(Conta contaDestino, double valor) {
		if (this.saldo >= 0) {
			saca(valor);
			contaDestino.deposita(valor);
			return true;
		}
		return false;
	}
}
