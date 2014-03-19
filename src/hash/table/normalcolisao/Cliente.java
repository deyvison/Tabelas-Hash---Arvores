package hash.table.normalcolisao;

public class Cliente {

	String nome;
	String cpf;
	Cliente prox;
	public Cliente(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
		this.prox = null;
	}

	public String info() {
		return "Nome - "+this.nome+" Cpf - "+this.cpf;
	}
	
	
}