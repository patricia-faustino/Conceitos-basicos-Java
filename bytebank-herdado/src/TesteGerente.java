
public class TesteGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();

		gerente.setNome("Fernanda Souza");
		gerente.setCpf("333.333.222-44");
		gerente.setSenha(123);
		gerente.setSalario(8000.00);
		
		Autenticavel gerenteNovo = new Gerente();

		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());

		System.out.println(gerente.autentica(123));

		System.out.println(gerente.getSalario());
	}
}
