package model;

/*
 * author alan fernandes
 * */

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Crianca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private int idade;
	@OneToMany
	private List<Presente> presentes;
	
	public Crianca() {
		super();
	}

	public Crianca(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Presente> getPresentes() {
		return presentes;
	}

	public void setPresentes(List<Presente> presentes) {
		this.presentes = presentes;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
