import java.util.Scanner;

public class SistemaInterno {
	
	/*
	 A partir de agora, podemos tratar um Gerente ou um Diretor como sendo um Autenticavel . Ganhamos mais
     polimorfismo! Temos mais uma forma de referenciar a um Gerente e um Diretor
	
	 */
	
	public static void main(String [] args) {
		
  		Gerente ge = new Gerente();
  		Diretor di = new Diretor();
  		Cliente cl = new Cliente();
  		
  		//ge.setSenha(123);
  		//di.setSenha(125);
  		cl.setSenha(130);
		
		//login(ge);	
		//login(di);	
		login(cl);	
		
	}

	public static void login(Autenticavel a) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Informe a senha para acessar o sistema : ");		
		int senha = sc.nextInt();
				
		if(a.autentica(senha) ==true) {
			System.out.println(" Acesso permitido !");
		}
		else {
			System.out.println(" Acesso negado senha incorreta !");
		}
	}
}
