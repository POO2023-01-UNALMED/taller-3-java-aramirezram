package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1,precio=500,volumen=1;
	private boolean estado;
	Control control;
	private static int numTV=0;
	
	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTV++;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control=control;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		if(volumen>7 || volumen<0) return;
		this.volumen=volumen;
	}
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if (canal>120 || canal<1) return;
		this.canal=canal;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int numTV) {
		TV.numTV=numTV;
	}
	
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if(canal==120 && estado==true) return;
		canal++;
	}
	public void canalDown() {
		if (canal==1 && estado==true) return;
		canal--;
	}
	
	public void volumenUp() {
		if(volumen==7 && estado==true) return;
		volumen++;
	}
	public void volumenDown() {
		if (volumen==0 && estado==true) return;
		volumen--;
	}
	
	
	
}
