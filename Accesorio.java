import java.io.Serializable;
public class Accesorio implements java.io.Serializable{
	
	protected String marca;
	protected int cantidad = 0;
	protected float costo = 0;
	protected float precioVenta = 0;
	protected String fechaComprado;
	protected String fechaVendido;
	protected String lugarEntrega;
	protected String sku;

	//constructores
	public Accesorio(){
		System.out.println("Soy un accesorio");
	}

	public Accesorio(int _cantidad,float _costo, float _precioVenta, String _marca,String _fechaComprado, String _sku){
	 	this.sku = _sku;
		this.marca = _marca;
		this.cantidad = _cantidad;
		this.precioVenta = _precioVenta;
		this.costo = _costo;
		this.fechaComprado = _fechaComprado;
	}

	public Accesorio(int _cantidad, float _costo, String _marca, float _precioVenta, String _fechaComprado, String _fechaVendido, String _lugarEntrega, String _sku){
		this.sku = _sku;
		this.cantidad = _cantidad;
		this.costo = _costo;
		this.marca = _marca;
		this.precioVenta = _precioVenta;
		this.fechaComprado = _fechaComprado;
		this.fechaVendido = _fechaVendido;
		this.lugarEntrega = _lugarEntrega;
	}

	//setters y getters
	public void setCosto(float _costo){
		costo = _costo;
	}

	public float getCosto(){
		return costo;
	}

	public String getFechaComprado(){
		return fechaComprado;
	}

	public void setFechaComprado(String _fechaComprado){
		fechaComprado = _fechaComprado;
	}

	public String getFechaVendido(){
		return fechaVendido;
	}

	public void setFechaVendido(String _fechaVendido){
		fechaVendido = _fechaVendido;
	}

	public String getLugarEntrega(){
		return lugarEntrega;
	}

	public void setLugarEntrega(String _lugarEntrega){
		lugarEntrega = _lugarEntrega;
	}
}