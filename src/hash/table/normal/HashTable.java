package hash.table.normal;

public class HashTable {

	
	Cliente[] clientes;
	
	public HashTable(){
		clientes = new Cliente[100];
	}
	
	public int hash(String chave){
		int tam = chave.length();
		char penultimo = chave.charAt(tam -2);
		char ultimo = chave.charAt(tam -1);
		String retorno =""+penultimo + ultimo; 
		return Integer.parseInt((retorno));
	}
	
	public void adicionar(Cliente c){
		if(clientes [this.hash(c.cpf)] != null){
			throw new RuntimeException("Posição já ocupada!!");
		}
		clientes [this.hash(c.cpf)] = c;
	}
	
	public int getPos(Cliente c){
		return this.hash(c.cpf);
	}
	
	public Cliente pesquisar(String chave){
		return this.clientes[this.hash(chave)];
	}
	
	public void remover(String chave){
		clientes[this.hash(chave)] = null;
	}
}
