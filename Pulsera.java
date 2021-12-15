import java.io.Serializable;
public class Pulsera extends Accesorio implements java.io.Serializable{
	protected String color;
	protected String marca;

	//constructores
	public Pulsera(){
		System.out.println("Soy una pulsera ");
	}

	public Pulsera(String _color, String _marca){
		color = _color;
		marca = _marca;
	}

	public Pulsera(int _cantidad,float _costo, float _precioVenta, String _marca,String _fechaComprado, String _sku, String _color){
		super(_cantidad,_costo,_precioVenta,_marca,_fechaComprado,_sku);
		color = _color;
		marca = _marca;		
	}

	public String toString(){
		return super.toString() + "\n{" +this.sku+"}[" + this.cantidad + "] ["+this.precioVenta +"] Pulsera  " + marca + " color: " + color;
	}

	//setters y getters
	public void setColor(String _color){
		color = _color;
	}

	public String getColor(){
		return color;
	}

	public void setMarca(String _marca){
		marca = _marca;
	}

	public String getMarca(){
		return marca;
	}
}