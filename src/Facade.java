class Facade {

	void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);

		CrmService.gravarCliente(nome, cep, cidade, estado);

		String cpf = CepApi.getInstancia().recuperarCpf(cep);
		String celular = CepApi.getInstancia().recuperarCelular(cep);

		CrmService.gravarCliente2(nome, cep, cpf, celular);
	}
}
