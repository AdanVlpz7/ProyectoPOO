import java.io.Serializable;
public class Gorra extends Accesorio implements java.io.Serializable{
	String marca;
	String talla;
	String color;

	//constructores
	public Gorra(){
		System.out.println("Soy una gorra");
	}

	public Gorra(String _marca,String _color){
		marca = _marca;
		color = _color;
	}
	public Gorra(int _cantidad,float _costo, float _precioVenta, String _marca,String _fechaComprado, String _sku, String _color, String _talla){
		super(_cantidad,_costo,_precioVenta,_marca,_fechaComprado,_sku);
		marca = _marca;
		color = _color;
		talla = _talla;
	}

	public String toString(){
		return "\n{" +this.sku+"}["+  this.cantidad +"] ["+this.precioVenta +"] Gorra " + marca + " talla " + talla + "color " + color;
	}

	//setters y getters 
	public void setMarca(String _marca){
		marca = _marca;
	}

	public String getMarca(){
		return marca;
	}

	public void setTalla(String _talla){
		talla = _talla;
	}

	public String getTalla(){
		return talla;
	}

	public void setColor(String _color){
		color = _color;
	}

	public String getColor(){
		return color;
	}
}