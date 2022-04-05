package modelo;

public class Veiculo {

	private String placa;
	private int anoModelo;
	private int anoFabricacao;
	private String modelo;
	private String marca;
	private double valor;
	
	
	public Veiculo() {
		
	}
	
	public Veiculo(String placa,int anoModelo, int anoFabricacao, String modelo, String marca, double valor) {
		this.placa = placa;
		this.anoModelo = anoModelo;
		this.anoFabricacao = anoFabricacao;
		this.modelo = modelo;
		this.marca = marca;
		this.valor = valor;
		
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getAnoModelo() {
		return anoModelo;
	}


	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}


	public int getAnoFabricacao() {
		return anoFabricacao;
	}


	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
}