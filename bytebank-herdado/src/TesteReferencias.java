
public class TesteReferencias {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Marcos");
		gerente.setSalario(8000.00);
		gerente.autentica(123);
		
		Funcionario funcionario = new Funcionario();
		  
		funcionario.setNome("Marcos");
		funcionario.setSalario(123);
		funcionario.setSalario(2000.00);
		
		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setSalario(5000.00);
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		controleBonificacao.registraBonificacao(gerente);
		controleBonificacao.registraBonificacao(editorVideo);
		controleBonificacao.registraBonificacao(funcionario);
		
		System.out.println(controleBonificacao.getSoma());
	}
}
