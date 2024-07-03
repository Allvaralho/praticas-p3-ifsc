package packpage;

import java.util.ArrayList;

public class Main { 
	public static void main(String[] args) {
		Tutor tutor1 = new Tutor();
		tutor1.setNomeCompleto("Thalles");
		
		Gato gato1 = new Gato();
		gato1.setApelido("Pjl");
		gato1.setNomeCientifico("Felis Catus");
		gato1.setPedigree("ALEATORIO");
		gato1.setClasse("Siames");
		tutor1.setGato(gato1);
		
		Tutor tutor2 = new Tutor();
		tutor2.setNomeCompleto("Marco");
		Gato gato2 = new Gato();
		gato2.setApelido("Pedro");
		gato2.setNomeCientifico("Felis Catus");
		gato2.setPedigree("ALEATORIO2");
		gato2.setClasse("persa");
		tutor2.setGato(gato2);
		
		Tutor tutor3 = new Tutor();
		tutor3.setNomeCompleto("Eduarda");
		Gato gato3 = new Gato();
		gato3.setApelido("Luz");
		gato3.setNomeCientifico("Felis Catus");
		gato3.setPedigree("ALEATORIO3");
		gato3.setClasse("Ragdoll");
		tutor3.setGato(gato3);
		
	ArrayList<Tutor> Att = new ArrayList<>();
        Att.add(tutor1);
        Att.add(tutor2);
        Att.add(tutor3);
        
        for (Tutor tutor : Att) {
			System.out.println(tutor.getNomeCompleto());
			System.out.println(tutor.getGato().getApelido());
			System.out.println(tutor.getGato().getNomeCientifico());
			System.out.println(tutor.getGato().getClasse());
			System.out.println(tutor.getGato().getPedigree());
			System.out.println("=====================================");
		}
        
		
	}

}
