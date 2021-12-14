public class Cartera extends Accesorio{
	
	//variables
	protected boolean esDosCuerpos = true;
	protected boolean esDeCierre = false;
	protected boolean tieneCierreMonedas = false;
	protected boolean tieneCierreBilletes = false;
	protected int separadores = 0; //variable que distingue cuantos separadores para tarjetas o identificaciones tiene una cartera
	protected boolean tieneEspacioFotografia = false;

	//constructores
	public Cartera(){
		System.out.println("Soy una cartera sin información");
	}

	public Cartera(String _marca, int _separadores, boolean _esDosCuerpos, boolean _tieneCierreMonedas, boolean _tieneCierreBilletes){
		this.separadores = _separadores;
		this.marca = _marca;
		this.esDosCuerpos = _esDosCuerpos;
		this.tieneCierreMonedas = _tieneCierreMonedas;
		this.tieneCierreBilletes = _tieneCierreBilletes;
	}

	public Cartera(int _cantidad, float _costo,float _precioVenta,int _separadores, String _fechaComprado, String _fechaVendido, String _lugarEntrega, String _marca, boolean _esDosCuerpos, boolean _tieneCierreMonedas, boolean _tieneCierreBilletes){
		super(_cantidad,_costo,_precioVenta,_fechaComprado,_fechaVendido,_lugarEntrega);
		this.marca = _marca;
		this.separadores = _separadores;
		this.esDosCuerpos = _esDosCuerpos;
		this.tieneCierreMonedas = _tieneCierreMonedas;
		this.tieneCierreBilletes = _tieneCierreBilletes;
	}

	public Cartera(int _cantidad, float _costo,String _marca,float _precioVenta,int _separadores, String _fechaComprado, String _marca, boolean _esDosCuerpos, boolean _tieneCierreMonedas, boolean _tieneCierreBilletes){
		super(_cantidad,_costo,_marca,_precioVenta,_fechaComprado);
		this.separadores = _separadores;
		this.esDosCuerpos = _esDosCuerpos;
		this.tieneCierreMonedas = _tieneCierreMonedas;
		this.tieneCierreBilletes = _tieneCierreBilletes;
	}

	@Override
	public String toString(){
		return super.toString() + "\n Soy una cartera marca :{ " + marca + "}, de: " + ((esDosCuerpos) ? "dos cuerpos " : "tres cuerpos ");
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

	public boolean getEsDeCierre(){
		return esDeCierre;
	}

	public void setEsDeCierre(boolean _esDeCierre){
		esDeCierre = _esDeCierre;
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