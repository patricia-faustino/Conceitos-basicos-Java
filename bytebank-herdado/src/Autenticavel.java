
//contrato assinado por quem implementa
public interface Autenticavel {

	public abstract boolean autentica(int senha);

	public abstract void setSenha(int senha);
}
