package oop_figuras;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import uzd1.MinkuTante;
public class Figuras {
	static ArrayList <Centrs> centraObjekti = new ArrayList<>();
	static ArrayList <Cetrsturis> cetrsturaObjekti = new ArrayList<>();
	static ArrayList <Aplis> aplaObjekti = new ArrayList<>();
	static ArrayList <Trijsturis> trijsturaObjekti = new ArrayList<>();
	
	
	static String []objektuPogas = {"Centrs", "Četrstūris", "Aplis",
			"Trijstūris", "Atgriezties"};

	public static void main(String[] args) {
		/*
		//Izveido Centra objektu
		Centrs centraP1 = new Centrs (-10, 12);
		System.out.println(centraP1.izvaditKoordinatas());
		centraP1.parvietot(4, -5);
		System.out.println(centraP1.izvaditKoordinatas());
		
		//izveidot Cetrstura objektu
		Cetrsturis cetrsturis1 = new Cetrsturis();
		System.out.println(cetrsturis1.izvaditCetrsturaInfo());
		
		System.out.println(cetrsturis1.punkts.izvaditKoordinatas());
		
		Cetrsturis cetrsturis2 = new Cetrsturis(centraP1, 5, 11);
		System.out.println(cetrsturis2.izvaditCetrsturaInfo()+"\n"+
				cetrsturis1.punkts.izvaditKoordinatas()+
				"\ns = "+cetrsturis2.cLaukums());
		
		
		Centrs punkts2 = new Centrs (5,23);
		Aplis aplis1 = new Aplis(punkts2,5);
		System.out.println(aplis1.izvaditAplaInfo()+"\n"+
		"s="+aplis1.rinkaLaukums()+"\n"+
		"C="+aplis1.rinkaLinija());
		*/
		int izvele, poga;
		
		
		do {
			izvele = MinkuTante.skaitlaParbaude(
					  "Ko vēlies darīt?\n"
					+ "1 - Apturēt\n"
					+ "2 - Izvedot objektus\n"
					+ "3 - Aplūkot objektus\n"
					+ "4 - Izsaukt metodi", 0, 4);
			if(izvele == -1) izvele = 0;
			switch(izvele) {
			case 1: 
				JOptionPane.showMessageDialog(null,
					"Programma apturēta!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
				OIzveide.izveidotObjektu();
				break;
			}
		}while(izvele != 0);
	
	}
}
