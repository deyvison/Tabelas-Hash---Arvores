package hash.table.encadeada;

public class Registro {
	String chave_CPF;
	String nome;
	Registro prox;
	
	
	public Registro(String nome, String cpf){
		prox = null;
		this.chave_CPF = cpf;
		this.nome = nome;
	}
	public Registro(){
		prox = null;
	}
	public String info() {
		return "Nome "+nome+" Cpf: "+this.chave_CPF;
	}
}
