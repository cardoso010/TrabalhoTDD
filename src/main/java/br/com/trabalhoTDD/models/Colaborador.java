package br.com.trabalhoTDD.models;

import java.util.List;

public class Colaborador {
	
	private String nome;
	private float qtHorasTrabalhada;
	private float salarioHora;
	private List<Dependente> dependentes;
	
	
	public Colaborador(float qtHorasTrabalhada, float salarioHora, List<Dependente> dependentes) {
		this.qtHorasTrabalhada = qtHorasTrabalhada;
		this.salarioHora = salarioHora;
		this.dependentes = dependentes;
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getQtHorasTrabalhada() {
		return qtHorasTrabalhada;
	}
	public void setQtHorasTrabalhada(float qtHorasTrabalhada) {
		this.qtHorasTrabalhada = qtHorasTrabalhada;
	}
	public float getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(float salarioHora) {
		this.salarioHora = salarioHora;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}
	
	
}
