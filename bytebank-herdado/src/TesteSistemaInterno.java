
public class TesteSistemaInterno {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setSenha(123);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(123);

		Administrador administrador = new Administrador();
		administrador.setSenha(1234);

		SistemaInterno sistemaInterno = new SistemaInterno();
		sistemaInterno.autentica(gerente);
		sistemaInterno.autentica(administrador);
		sistemaInterno.autentica(cliente);
	}

}
