public class Gorra extends Accesorio{
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
	public Gorra(String _marca, String _color, String _talla){
		marca = _marca;
		color = _color;
		talla = _talla;
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