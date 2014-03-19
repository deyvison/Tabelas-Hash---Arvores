package hash.table.encadeada;


public class Main {

	
	public static void main(String[] args) {
		HashTable tabela = new HashTable();
		tabela.inserir(new Registro("Deyvison","098.787.565-56"));
		tabela.inserir(new Registro("Chico","539.869.987-12"));
		tabela.inserir(new Registro("Maria","867.868.334.656-67"));
	//	tabela.imprimir();
		
		String result = tabela.buscar("098.787.565-56");
		System.out.println(result);
	}
	
	
	
	
}
