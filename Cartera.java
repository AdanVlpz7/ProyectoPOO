import java.io.Serializable;
public class Cartera extends Accesorio implements java.io.Serializable{
	
	//variables
	protected boolean esDosCuerpos = true;
	protected boolean tieneCierreMonedas = false;
	protected boolean tieneCierreBilletes = false;
	protected int separadores = 0; //variable que distingue cuantos separadores para tarjetas o identificaciones tiene una cartera
	protected boolean tieneEspacioFotografia = false;

	//constructores
	public Cartera(){
		System.out.println("Soy una cartera sin información");
	}

	public Cartera(int _cantidad,float _costo, float _precioVenta, String _marca,String _fechaComprado,String _sku, int _separadores, boolean _esDosCuerpos, boolean _tieneCierreMonedas, boolean _tieneCierreBilletes){
		super(_cantidad,_costo,_precioVenta,_marca,_fechaComprado,_sku);
		this.separadores = _separadores;
		this.esDosCuerpos = _esDosCuerpos;
		this.tieneCierreMonedas = _tieneCierreMonedas;
		this.tieneCierreBilletes = _tieneCierreBilletes;
	}

	@Override
	public String toString(){
		return "\n{" +this.sku+"}[" + this.cantidad +"] ["+this.precioVenta +"] Cartera " + marca + " de " + ((esDosCuerpos) ? "dos cuerpos " : "tres cuerpos ") + ((tieneCierreMonedas) ? " con cierre para monedas " : " sin cierre para monedas ")
		+ "con " + separadores + " para tarjetas y " + ((tieneEspacioFotografia) ? "con espacio para fotografia " : "sin espacio para fotografia ") + "y " + ((tieneCierreBilletes) ? "cierre para billetes" : "sin cierre para billetes");
	}
	//setters y getters
	public String getMarca(){
		return marca;
	}

	public void setMarca(String _marca){
		marca = _marca;
	}

	public boolean getEsDeDosCuerpos(){
		return esDosCuerpos;
	}

	public void setEsDeDosCuerpos(boolean _esDosCuerpos){
		esDosCuerpos = _esDosCuerpos;
	}

	public int getSeparadores(){
		return separadores;
	}

	public void setSeparadores(int _separadores){
		separadores = _separadores;
	}

	public boolean getCierreMonedas(){
		return tieneCierreMonedas;
	}

	public void setCierreMonedas(boolean _tieneCierreMonedas){
		tieneCierreMonedas = _tieneCierreMonedas;
	}

	public boolean getCierreBilletes(){
		return tieneCierreBilletes;
	}

	public void setCierreBilletes(boolean _tieneCierreBilletes){
		tieneCierreBilletes = _tieneCierreBilletes;
	}

	public boolean getEspacioFotografia(){
		return tieneEspacioFotografia;
	}

	public void setEspacioFotografia(boolean _tieneEspacioFotografia){
		tieneEspacioFotografia = _tieneEspacioFotografia;
	}

}