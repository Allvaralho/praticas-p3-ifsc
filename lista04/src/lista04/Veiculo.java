package lista04;

public class Veiculo {

	private String nome;
	private Integer ano;
	private Integer NRodas;
	private String fabricante;
	private String Cor;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Integer getNRodas() {
		return NRodas;
	}
	public void setNRodas(Integer nRodas) {
		NRodas = nRodas;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
}
