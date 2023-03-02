package futebol;

import java.util.Date;

public class Jogador {
	public String nome;
	public String posicao;
	public Date dataNas;
	public String nacionalidade;
	public double altura;
	public double peso;
	
	public Jogador() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public Date getDataNas() {
		return dataNas;
	}
	public void setDataNas(Date dataNas) {
		this.dataNas = dataNas;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
