package hash.table.encadeada;

public class HashTable {

	
	Registro head = null;
	
	
	
	
	public HashTable(){
		
	}
	
	public void inserir(Registro r){
		
		if(head == null){
			head = r;
		}else{
			Registro aux = head;
			
			while(aux.prox != null){
				aux = aux.prox;
			}
			aux.prox = r;
		}
		
	}

	public void imprimir() {
		
		Registro aux = head;
		
		while(aux.prox != null){
			System.out.println(aux.info());
			aux = aux.prox;
		}
		System.out.println(aux.info());
	}

	public String buscar(String id) {
		if(this.head == null){
			throw new RuntimeException("ERRO!!!!");
		}
		Registro aux = this.head;
		while(aux.prox != null){
			if(aux.chave_CPF.equals(id)){
				return aux.info();
			}
			aux = aux.prox;
		}
		return null;
	}
	
	
	
	
	
	
	
	
}
