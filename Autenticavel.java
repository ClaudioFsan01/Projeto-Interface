
public interface Autenticavel {  
	
	/*
	Chama-se interface pois é a maneira pela qual poderemos conversar com um Autenticavel .
    Interface é a maneira através da qual conversamos com um objeto.
   Lemos a interface da seguinte maneira: "quem desejar ser autenticável precisa saber autenticar dado
   um inteiro e retornando um booleano". Ela é um contrato onde quem assina se responsabiliza por
   implementar esses métodos (cumprir o contrato).
   Uma interface pode definir uma série de métodos, mas nunca conter implementação deles. Ela só
   expõe o que o objeto deve fazer, e não como ele faz, nem o que ele tem. Como ele faz vai ser definido
    em uma implementação dessa interface.
	 */
	
	
	public boolean autentica(int senha);
	
}
