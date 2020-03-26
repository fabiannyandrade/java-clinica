package br.fai.clinica;

public abstract class Animal {

	public void nomeAnimal() {
		System.out.println("Nome:");
	}
	
	public void idAnimal() {
		System.out.println("| Id;");
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private String nome;
	private int id;
}
