
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta(1337, 24246);

		System.out.println(contaDaMarcela.getSaldo());

		Cliente marcela = new Cliente();
		contaDaMarcela.setTitular(marcela);
		System.out.println(contaDaMarcela.getTitular());

		marcela.setNome("Marcela");
		System.out.println(contaDaMarcela.getTitular().getNome());
		
	}

}
