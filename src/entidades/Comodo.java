package entidades;

public class Comodo {
	
	private String nome;
	private double consumo;
	
	public Comodo(String nome, double consumo) {
		
		this.nome = nome;
		this.consumo = consumo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	
}
