package model;

public class Departamento {
	
	public int andar;
	public String nome;
	public String descricao;

	public Departamento(int andar, String nome, String descricao) {
		this.andar = andar;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public Departamento() {
		super();
	}

	@Override
	public int hashCode() {
		return andar;
	}

	@Override
	public String toString() {
		return nome +" - "+ descricao+" - Andar "+andar;
	}
	
	

}
