package Aula_22_10_2026;

public class Pessoa {
	private String nome;
	private int idade;
	
	// Construtor padrão é criado mesmo não explicitado
	public Pessoa() {
	}
	
	//Método com argumento
	public Pessoa (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//Terceiro Construtor
	public Pessoa (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
}
	public void setNome(String nome) {
		this.nome = nome;
	}
public int getIdade () {
	return idade;
}
	public void setIdade (int idade) {
		this.idade = idade;
	}
}
