package lab.edd;

public class Lotes {
	String fechaVto;
	double precioCosto;
	double comision;
	double PrecioVenta=getPrecioVenta(precioCosto);
	
	
	public double getPrecioVenta(double costo){
		double venta=0;
		double x=(25/100)*costo;
		venta=x+costo;
	
		return venta;		
	}
	
	public Lotes (String fechaVto, double precioCosto, double comision, String[] input) {
		this.fechaVto=fechaVto;
		this.precioCosto=precioCosto;
		this.comision=comision;
	}
}
