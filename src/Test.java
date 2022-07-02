import java.util.Scanner;
class Test {
	Scanner teclado = new Scanner(System.in);
	String nome = teclado.next();
	
	public static void main(String[] args) {
		
		Facade facade = new Facade();
		facade.migrarCliente("Victor Dias", "38400644");
	}
}
