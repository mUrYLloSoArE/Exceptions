package model;

import java.math.BigDecimal;

public class Moedas {

	private String moeda="";
	private String opcao="";
	private BigDecimal valor = new BigDecimal("0.0");
	private	boolean rodando = true;
    private BigDecimal valorEuro= new BigDecimal("6.15");
    private BigDecimal valorDolarA= new BigDecimal("5.25");
    private BigDecimal valorDolarC= new BigDecimal("4.15");
    private BigDecimal valorLibra= new BigDecimal("7.50");
    
	public String getMoeda() {
		return moeda;
	}
	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}
	public String getOpcao() {
		return opcao;
	}
	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public boolean getRodando() {
			return rodando;
		}
	public void setRodando(boolean rodando) {
		this.rodando = rodando;
	}
	public BigDecimal getValorEuro() {
		return valorEuro;
	}
	public BigDecimal getValorDolarA() {
		return valorDolarA;
	}
	public BigDecimal getValorDolarC() {
		return valorDolarC;
	}
	public BigDecimal getValorLibra() {
		return valorLibra;
	}
	
	
    	
}
