package estrutura_de_dados;
import java.util.Queue;
import java.util.LinkedList;

public class Fila {
	private int id;
	private String name;

	
	private Queue<Fila> fila = new LinkedList<Fila>();

	
	public Fila(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void viewListAll() {
		System.out.println("Fila: ");
		for(var id : fila) {
			System.out.println(id + ": " + name);
		}
		
	}
	
	
	public void enqueue(int id) {
		//Adicionar um item a fila
		//fila.add();
	}
	
	public void dequeue() {
		//Remover um item a fila
		//fila.remove();
	}
		
	
}
