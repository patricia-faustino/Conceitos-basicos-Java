
public class Gerente extends Funcionario {
	private int senha;

	public boolean autentica(int senha) {
		return this.senha == senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public double getBonificacao() {
		// super: atributo vem diretamente do pai
		return super.getSalario();
	}
}
