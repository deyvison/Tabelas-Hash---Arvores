package hash.table.normal;

public class Cliente {

	
	String nome;
	String cpf;
	
	public Cliente(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}

	public String info() {
		return "Nome - "+this.nome+" Cpf - "+this.cpf;
	}
	
	
}
