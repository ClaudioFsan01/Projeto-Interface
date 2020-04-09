
public abstract class Funcionario {   // a palavra chave abstract impede que essa classe seja instanciada
	
	private String nome;
	private String cpf;	
	protected double salario;
	protected String cargo;
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}	
	
	public String getCPF() {
		return this.cpf;
	}
		
	public void setSalario(double salario)
	{
		this.salario = salario;
	}
	
	public double getSalario()
	{
		return this.salario;
	}
	
	public abstract String getCargo();
	
	
	
		
	

}
