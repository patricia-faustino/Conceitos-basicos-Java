
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean withdraw(double valor) {
		double valorMaisTaxa = valor + 0.2;
		return super.withdraw(valorMaisTaxa);
	}

	@Override
	public void deposit(double valor) {
		super.saldo += valor;
	}

}
