import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.*;
public class Admin{
	private static Admin adm;
	private Properties datosCon;
	protected String nombre;
	List<Accesorio> inventario = new ArrayList<Accesorio>();
	File f = new File("archivo.txt");
	protected float gasto = 0;
	public float ventas = 0;
	protected float ganancias = 0;
	//una lista del inventario
	//una lista con 
	public Admin(){
		//System.out.println("Soy admin papa");
		CargarInventario(inventario,f);
		try{
      		datosCon = new Properties();
      		InputStream dc = new FileInputStream("config.properties");
      		datosCon.load(dc);
      		String _gasto = datosCon.getProperty("gasto");
      		String _ventas = datosCon.getProperty("ventas");
      		String _ganancias = datosCon.getProperty("ganancias");
      		gasto = Float.parseFloat(_gasto);
      		ventas = Float.parseFloat(_ventas);
      		ganancias = Float.parseFloat(_ganancias);
      	}
      	catch(IOException ioe){
     		System.out.println("Error: No fue posible abrir el archivo de conexión");
      		ioe.printStackTrace();
    	}
	}

	public static Admin getInstance(){
		if(adm == null) adm = new Admin();
		return adm;
	}
	/** Metodo para añadir un accesorio 'reloj'
	 * @param reloj objeto con ya caracteristicas definidas a agregar al inventario
	**/
	public void AnadirReloj(Reloj reloj){
		System.out.println("Ingresando reloj al inventario");
		int index = 0;
		index = Buscar(inventario,reloj);
		//modificar estadisticas
		if(reloj.fechaVendido != null)
			ventas += reloj.precioVenta;
		if(index != -1){
			inventario.get(index).cantidad += reloj.cantidad;
		}
		else
			inventario.add((Accesorio)reloj);
		ActualizarStats(reloj);
		GuardarInventario(inventario, f);
	}
	/** Metodo para añadir un accesorio 'cartera'
	 * @param cartera objeto con ya caracteristicas definidas a agregar al inventario
	**/
	public void AnadirCartera(Cartera cartera){
		System.out.println("Ingresando cartera al inventario");
		int index = 0;
		index = Buscar(inventario,cartera);
		System.out.println(index);
		//modificar estadisticas
		if(cartera.fechaVendido != null)
			ventas += cartera.precioVenta;
		if(index != -1){
			inventario.get(index).cantidad += cartera.cantidad;
		}
		else{
			inventario.add((Accesorio)cartera);
		}
		ActualizarStats(cartera);
		GuardarInventario(inventario, f);
	}

	/** Metodo para añadir un accesorio 'gorra'
	 * @param gorra objeto con ya caracteristicas definidas a agregar al inventario
	**/	
	public void AnadirGorra(Gorra gorra){		
		System.out.println("Ingresando gorra al inventario");
		int index = 0;
		//modificar estadisticas
		if(gorra.fechaVendido != null)
			ventas += gorra.precioVenta;		
		index = Buscar(inventario,gorra);
		if(index != -1){
			inventario.get(index).cantidad += gorra.cantidad;
		}
		else
			inventario.add((Accesorio)gorra);
		ActualizarStats(gorra);
		GuardarInventario(inventario, f);
	}
	/** Metodo para añadir un accesorio 'pulsera'
	 * @param pulsera objeto con ya caracteristicas definidas a agregar al inventario
	**/
	public void AnadirPulsera(Pulsera pulsera){
		System.out.println("Ingresando pulsera al inventario");
		int index = 0;
		//modificar estadisticas
		if(pulsera.fechaVendido != null)
			ventas += pulsera.precioVenta;	

		//trabajar con lista	
		index = Buscar(inventario,pulsera);
		if(index != -1){
			inventario.get(index).cantidad += pulsera.cantidad;
		}
		else
			inventario.add((Accesorio)pulsera);
		ActualizarStats(pulsera);
		GuardarInventario(inventario, f);
	}	

	/** Metodo para actualizar las variables que describen estadisticas de ventas
	 * @param a objeto del cual se tomaran su costo y precioVenta
	**/
	public void ActualizarStats(Accesorio a){		
		if(a.fechaVendido == null){
			gasto += a.costo * a.cantidad;
		}
		else{
			//si se ha vendido
			ventas += a.precioVenta;
			
		}
		ganancias = ventas - gasto;
		GuardarStats();

	}
	/** Metodo para actualizar las variables que describen estadisticas de ventas tras una venta
	 * @param a objeto del cual se tomaran su costo y precioVenta
	**/
	public void ActualizarStatsVenta(float a){		
		//gasto += a.costo * a.cantidad;
		ventas += a;
		ganancias = ventas - gasto;
		GuardarStats();

	}
	/** Metodo para imprimir estadisticas
	**/
	public void ImprimirStats(){
		System.out.println("\n");
		System.out.println("Los gastos hechos han sido: " + gasto);
		System.out.println("Las ventas son: " + ventas);
		System.out.println("Las ganancias totales son: " + ganancias);
	}

	/** Metodo para buscar un accesorio en una lista segun su sku
	 * @param a objeto a buscar
	 * @param l lista en la que se buscara el accesorio 'a'
	**/	
	public int Buscar(List l, Accesorio a){
		for(int i = 0; i < inventario.size(); i++){
			if(a.sku.equals(inventario.get(i).sku))
				return i;
			return -1;
		}
		return -1;
	}

	/** Metodo para buscar un accesorio en una lista segun un sku en especifico
	 * @param sku clave que tiene el accesorio a buscar
	 * @param l lista en la que se buscara el sku
	**/	
	public int BuscarPorSku(List l, String sku){
		for(int i = 0; i < inventario.size(); i++){
			if(sku.equals(inventario.get(i).sku))
				return i;
			return -1;
		}
		return -1;
	}	

	/** Metodo para señalar una venta de un accesorio en una lista segun su sku
	 * @param sku objeto a buscar segun este sku
	 * @param cantidad cantidad de los objetos a vender
	**/		
	public void SenalarVentaArticulo(String sku, int cantidad){
		System.out.println("Quitando articulo del inventario por que se vendio");
		int index = 0;
		index = BuscarPorSku(inventario,sku);
		if(index != -1){
			inventario.get(index).cantidad -= cantidad;
		}
		else{
			System.out.println("Este articulo no existia");
		}
		GuardarInventario(inventario, f);
		GuardarStats();
	}

	/** Metodo para imprimir en consola el inventario
	**/	
	public void DesplegarInventario(){
		System.out.println("Desplegando inventario");
		for(int i = 0; i < inventario.size(); i++){
			System.out.println(inventario.get(i));
		}
	}
	/** Metodo para guardar en un archivo un accesorio una lista
	 * @param f archivo a leer
	 * @param l lista que se guardara
	**/
	public void CargarInventario(List l,File f){
		System.out.println("Cargando el inventario");
		try{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		// Se lee el primer objeto
		Object aux = ois.readObject();
           
		// Mientras haya objetos
		while (aux!=null)
		{
    	if (aux instanceof Accesorio)
        	System.out.println(aux);  // Se escribe en pantalla el objeto
    		aux = ois.readObject();

    		inventario.add((Accesorio)aux);
		}
		ois.close();
		}
		catch(IOException io){
			System.out.println(io);	
		}
		catch (ClassNotFoundException e) {
			System.out.println(e);	
		}

	}

	/** Metodo para guardar las estadisticas
	**/
	public void GuardarStats(){
      	datosCon.setProperty("gasto",Float.toString(gasto));
      	datosCon.setProperty("ventas",Float.toString(ventas));
      	datosCon.setProperty("ganancias",Float. toString(ganancias));
	}
	
	/** Metodo para guardar en un archivo un accesorio una lista
	 * @param f archivo a modificar
	 * @param l lista que se guardara
	**/		
	public void GuardarInventario(List l, File f){
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			bw.write("");
			bw.close();
			System.out.println("Guardando inventario");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));

			for(int i = 0; i < l.size(); i++){
				//System.out.println(l[i]);
				oos.writeObject(l.get(i));
			}
			//System.out.println(l);
			oos.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}