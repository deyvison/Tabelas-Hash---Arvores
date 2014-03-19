package hash.table.normalcolisao;

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
			Cliente aux = clientes [this.hash(c.cpf)];
			while(aux.prox != null){
				aux = aux.prox;
			}
			aux.prox = c;
			
		}else{
			clientes [this.hash(c.cpf)] = c;
		}
		
	}
	
	public int getPos(Cliente c){
		return this.hash(c.cpf);
	}
	
	public Cliente pesquisar(String chave){
		Cliente c = this.clientes[this.hash(chave)];
		
		if(c == null){
			throw new RuntimeException("Não encontrado!");
		}else{
			Cliente aux = c;
			while(aux.prox != null){
				if(aux.cpf.equals(chave)){
					return aux;
				}
				aux = aux.prox;
			}
			if(aux.cpf.equals(chave)){
				return aux;
			}
			throw new RuntimeException("Não encontrado!");
		}
	}
	
	
	public void remover(String chave){
		
		Cliente aux = clientes[this.hash(chave)];
		
		
	}

	public void imprimir() {
		
		for(Cliente c : clientes){
			if(c != null){
				Cliente aux = c;
				System.out.println(aux.info());
				
				while(aux.prox != null){
					aux = aux.prox;
					System.out.println(aux.info());
				}
			}
			
		}
		
	}
}
