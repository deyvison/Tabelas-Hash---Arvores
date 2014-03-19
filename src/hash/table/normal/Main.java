package hash.table.normal;

public class Main {

	public static void main(String[] args) {
		HashTable tabela = new HashTable();
		Cliente c = new Cliente("Deyvison","123.345.567 - 17");
		tabela.adicionar(c);
		//System.out.println(tabela.getPos(c));
		
//		try{
//			tabela.adicionar(c);
//		}catch(Exception e){
//			System.out.println(e.getMessage());
//		}
		
		Cliente c1 =  tabela.pesquisar("17");
		System.out.println(c1.info());
	}
}
