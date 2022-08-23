package br.com.alura.clente;

import org.apache.http.client.fluent.Request;

public class ClienteWebService {

	public static void main(String[] args) throws Exception {
		String conteudo = Request
			.Post("http://localhost:8080/gerenciador2/empresas")
			.addHeader("Accept", "application/xml")
			.execute()
			.returnContent()
			.asString();
		
		System.out.println(conteudo);

	}

}
