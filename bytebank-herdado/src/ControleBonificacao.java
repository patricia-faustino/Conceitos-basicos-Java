
public class ControleBonificacao {
	private double soma;

	public void registraBonificacao(Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao();
		this.soma += bonificacao;
	}

	public double getSoma() {
		return soma;
	}
}
