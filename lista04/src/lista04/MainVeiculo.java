package lista04;

import java.util.ArrayList;

public class MainVeiculo {
public static void main(String[] args) {
	Veiculo v1 = new Veiculo();
	v1.setNome("Uno");
	v1.setCor("Preto");
	v1.setAno(2012);
	v1.setFabricante("Fiat");
	v1.setNRodas(4);
	
	Veiculo v2 = new Veiculo();
	v2.setNome("Passat");
	v2.setCor("Branco");
	v2.setAno(2016);
	v2.setFabricante("VolksWagen");
	v2.setNRodas(4);
	
	Veiculo v3 = new Veiculo();
	v3.setNome("Saveiro");
	v3.setCor("Branco");
	v3.setAno(2016);
	v3.setFabricante("VolksWagen");
	v3.setNRodas(4);
	
	
	ArrayList<Veiculo> veiculos = new ArrayList<>();
	veiculos.add(v1);
	veiculos.add(v2);
	veiculos.add(v3);
	
	for (Veiculo veiculo : veiculos) {
		System.out.println(veiculo.getNome());
		System.out.println(veiculo.getCor());
		System.out.println(veiculo.getAno());
		System.out.println(veiculo.getFabricante());
		System.out.println(veiculo.getNRodas());
	}
	
} 
}

