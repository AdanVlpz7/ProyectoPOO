import java.io.Serializable;
public class Reloj extends Accesorio implements java.io.Serializable{

	protected boolean isTouch = false;
	protected String color;

	//constructores

	public Reloj(){
		System.out.println("Soy un reloj!");
	}

	public Reloj(int _cantidad,float _costo, float _precioVenta, String _marca,String _fechaComprado, String _sku, String _color, boolean _isTouch){
		super(_cantidad,_costo,_precioVenta,_marca,_fechaComprado,_sku);
		this.color = _color;
		this.isTouch = _isTouch;
	}

	public String toString(){
		return "\n{" +this.sku+"}[" + this.cantidad +"] ["+this.precioVenta +"] Reloj " + marca + ((isTouch) ? " touch " :  " normal ") + " color: " + color;
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