
public class TestaCriacaoDeConta {
	public static void main(String[] args) {
		Cliente patricia = new Cliente();

		patricia.nome = "Patricia Faustino";
		patricia.cpf = "222.222.222-22";
		patricia.profissao = "Desenvolvedora Full Stack";

		Conta contaPatricia = new Conta();
		//composi��o de objetos
		contaPatricia.titular = patricia;

		System.out.println(contaPatricia.titular.nome);
	}
}