package oop_figuras;

public class Aplis {
	public Centrs punkts;
	public double radiuss;
	
	public Aplis(Centrs p, double r) {
		punkts = p;
		radiuss = r;
	}
	
	public String izvaditAplaInfo() {
		return "Radiuss: "+radiuss;
	}
	
	//izveidot metodi, riņķa līnijas aprēķināšanai
	
	public double rinkaLinija() {
		double C = 2*Math.PI*radiuss;
		return 	Math.round((C*100.0)/100.0);
	}
	
	//rinķa laukuma aprēķināšana
	public double rinkaLaukums() {
		double S= Math.PI*Math.pow(radiuss, 2);
		return Math.round((S*100.0)/100.0);
	}
}
