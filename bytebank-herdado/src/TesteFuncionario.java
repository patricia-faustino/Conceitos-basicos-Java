
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setNome("Patricia Faustino");
		funcionario.setCpf("222.222.222-33");
		funcionario.setSalario(2600.00);

		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getSalario());

	}

}
