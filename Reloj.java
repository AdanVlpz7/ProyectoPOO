public class Reloj extends Accesorio{

	protected boolean isTouch = false;
	protected String color;

	//constructores

	public Reloj(){
		System.out.println("Soy un reloj!");
	}

	public Reloj(int _cantidad, float _costo,float _precioVenta,String _fechaComprado, String _marca, String _color, boolean _isTouch){
		super(_cantidad,_costo,_precioVenta,_fechaComprado);
		this.color = _color;
		this.isTouch = _isTouch;
	}

	public Reloj(float _costo, String _marca, String _fechaComprado, String _fechaVendido, String _lugarEntrega, String _marca, String _color, boolean _isTouch){
		super(_costo, _marca, _fechaComprado, _fechaVendido,_lugarEntrega);
		this.color = _color;
		this.isTouch = _isTouch;
	}
	//setters y getters
	public String getMarca(){
		return marca;
	}

	public void setMarca(String _marca){
		marca = _marca;
	}

	public boolean getIsTouch(){
		return isTouch;
	}

	public void setIsTouch(boolean _isTouch){
		isTouch = _isTouch;
	}

	public String getColor(){
		return color;
	}
	
	public void setColor(String _color){
		color = _color;
	}

}