
public interface Autenticavel {  
	
	/*
	Chama-se interface pois � a maneira pela qual poderemos conversar com um Autenticavel .
    Interface � a maneira atrav�s da qual conversamos com um objeto.
   Lemos a interface da seguinte maneira: "quem desejar ser autentic�vel precisa saber autenticar dado
   um inteiro e retornando um booleano". Ela � um contrato onde quem assina se responsabiliza por
   implementar esses m�todos (cumprir o contrato).
   Uma interface pode definir uma s�rie de m�todos, mas nunca conter implementa��o deles. Ela s�
   exp�e o que o objeto deve fazer, e n�o como ele faz, nem o que ele tem. Como ele faz vai ser definido
    em uma implementa��o dessa interface.
	 */
	
	
	public boolean autentica(int senha);
	
}
