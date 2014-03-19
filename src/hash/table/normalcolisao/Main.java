package hash.table.normalcolisao;

public class Main {

	
	
	
	public static void main(String[] args) {
		HashTable tabela = new HashTable();
		Cliente c = new Cliente("Deyvison","12312301");
		Cliente c1 = new Cliente("Josefa","77777701");
		Cliente c2 = new Cliente("Maria","77777799");
		
		tabela.adicionar(c);
		tabela.adicionar(c1);
		tabela.adicionar(c2);

		Cliente result = tabela.pesquisar(c2.cpf);
		
		System.out.println(result.info());
		
		
		
		
	}
}
