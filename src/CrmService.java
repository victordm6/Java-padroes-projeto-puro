class CrmService {

	private CrmService() {
		super();
	}
	
	static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("\nCLIENTE\n");
		System.out.println(nome + " salvo no sistema, Dados:");
		System.out.println("Estado: " + estado);
		System.out.println("Cidade: " + cidade);
		System.out.println("   CEP: " + cep);	
	}

	static void gravarCliente2(String nome, String cep,String cpf, String celular) {
		System.out.println("   CPF: " + cpf);
		System.out.println("Celular:" + celular);
	}
}
