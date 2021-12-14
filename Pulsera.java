public class Pulsera extends Accesorio{
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

	public Pulsera(float _costo, String _fechaComprado, String _fechaVendido, String _lugarEntrega, String _color, String _marca){
		super(_costo,_fechaComprado,_fechaVendido,_lugarEntrega);
		color = _color;
		marca = _marca;		
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