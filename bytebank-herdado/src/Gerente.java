
public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	@Override
	public double getBonificacao() {
		// super: atributo vem diretamente do pai
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		return this.senha == senha;

	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
