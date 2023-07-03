package model;

import java.math.BigDecimal;

public class Alimentos {

	private	boolean rodando = true;
	private	String tipoAlimento;
	private String nomeAlimento;
	private BigDecimal peso = new BigDecimal("0.0");
	private Number qtd;
	
	
	public boolean getRodando() {
		return rodando;
	}
	public void setRodando(boolean rodando) {
		this.rodando = rodando;
	}
	public String getTipoAlimento() {
		return tipoAlimento;
	}
	public void setTipoAlimento(String tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}
	public String getNomeAlimento() {
		return nomeAlimento;
	}
	public void setNomeAlimento(String nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
	}
	public BigDecimal getPeso() {
		return peso;
	}
	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public Number getQtd() {
		return qtd;
	}

	public void setQtd(Number qtd) {
		this.qtd = qtd;
	}

}
