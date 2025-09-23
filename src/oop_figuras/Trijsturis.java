package oop_figuras;

public class Trijsturis {
	public double k1, k2, k3;
	public Centrs punkts;
	
	public Trijsturis(Centrs p, double k1, double k2, double k3) {
		punkts = p;
		this.k1 = k1;
		this.k2 = k2;
		this.k3 = k3;
	}
	
	public String izvaditTrijsturaInfo() {
		return   "Mala1: "+k1+"cm\n"
				+"Mala2: "+k2+"cm\n"
				+"Mala3: "+k3+"cm";
	}
	
	//uztaisit metodi laukuma aprekinam
	
	public double S() {
		double p = (k1+k2+k3)/2;
		double S = Math.sqrt((p-k1)*(p-k2)*(p-k3));
		return Math.round((S*100.0)/100.0);
	}
}
