class CepApi {

	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	static CepApi getInstancia() {
		return instancia;
	}
	
	String recuperarCidade(String cep) {
		return "Uberlandia";
	}
	
	String recuperarEstado(String cep) {
		return "Mg";
	}

	String recuperarCpf(String cep) {
		return "12063677666";
	}
	
	String recuperarCelular(String cep) {
		return "(34)98404787777";
	}
}
