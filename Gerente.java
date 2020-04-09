
public class Gerente extends  Funcionario implements Autenticavel{
	/*
	 E o Gerente pode "assinar" o contrato, ou seja, implementar a interface. No momento em que ele
implementa essa interface, ele precisa escrever os métodos pedidos pela interface (muito parecido com o
efeito de herdar métodos abstratos, aliás, métodos de uma interface são públicos e abstratos, sempre).
Para implementar usamos a palavra chave implements na classe:

O implements pode ser lido da seguinte maneira: "A classe Gerente se compromete a ser tratada
como Autenticavel , sendo obrigada a ter os métodos necessários, definidos neste contrato".

A partir de agora, podemos tratar um Gerente como sendo um Autenticavel . Ganhamos mais
polimorfismo! Temos mais uma forma de referenciar a um Gerente, podemos usar uma referencia do tipo Autenticavel para referenciar 
um Gerente.
	 */

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	 public int getSenha() {
	    	return this.senha;
	    }
	
	public String getCargo() {
		return this.cargo =  "Gerente";
	}	
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
		
	}
	

}
