package br.ufpb.dcx.sistemacomercial;

public abstract class Cliente {
	private String nome;
	private String endereco;
	private String email;

	public abstract String getId();

public Cliente(String nome, String endereco, String email) {
	this.setNome(nome);
	this.endereco = endereco;
	this.email = email;
	}

public String toString() {
	return this.nome;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

}

