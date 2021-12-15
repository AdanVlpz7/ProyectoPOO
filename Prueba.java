import java.util.Scanner;
public class Prueba{
	public static void main(String[] args) {
		char ans = 'n';
		char adminAns = 'n';
		String contrasena = "nati";
		Admin adan = new Admin();
		boolean adminKey = false;
		boolean userKey = false;
		do{
			Scanner leer = new Scanner(System.in);
			System.out.println("#######################################");
			System.out.println("Bienvenido al sistema de Boby's Shop :D");
			System.out.println("\n");
			System.out.println("¿Es usted un administrador o usuario?");
			System.out.println("Si es administrador escriba 's', si es usuario escriba 'n'");
			adminAns = leer.next().charAt(0);
			//leer admin Ans
			if(adminAns == 's'){
				System.out.println("Ingrese la contrasena para utilizar el metodo");
				String n = leer.next();
				adminKey = PedirContrasena(contrasena,n);
				while(adminKey){
					//usar programa
					//crear admin
					
					System.out.println("Que desea realizar? Escriba el numero de la opcion");
					System.out.println("1. Anadir cartera al inventario");
					System.out.println("2. Anadir reloj al inventario");
					System.out.println("3. Anadir gorra al inventario");
					System.out.println("4. Anadir pulsera al inventario");
					System.out.println("5. Describir venta de articulo");
					System.out.println("6. Visualizar inventario");
					System.out.println("7. Visualizar estadisticas");
					System.out.println("8. Salir del modo admin");
					System.out.println("9. Salir del programa");
					int i = leer.nextInt();
					LlamarMetodosAdmin(adan,i);
					if(i == 8)
						adminKey = false;
					if(i == 9){
						adan.DesplegarInventario();
						return;
					}

				}
				System.out.println("¿Desea intertarlo de nuevo?");
				break;
			}
			if(adminAns == 'n'){
				userKey = true;
				while(userKey){
					Usuario user = new Usuario("miguel");
					System.out.println("Que desea realizar? Escriba el numero de la opcion");
					System.out.println("1. Visualizar inventario");
					System.out.println("2. Buscar si existe un articulo en el inventario");
					System.out.println("3. Salir del modo user");
					System.out.println("4. Salir del programa");
					int i = leer.nextInt();
					LlamarMetodosUser(user,i);
					if(i == 3)
						userKey = false;
					if(i == 4)
						return;		
				}
				break;
			}


		}while(ans == 's');
	}
	/** Metodo para llamar a metodos de la clase user segun lo que solicite el usuario en el menu
	 * @param admin Administrador del programa
	 * @param index Entero para identificar la opcion que solicita el administrador
	**/		
	public static void LlamarMetodosAdmin(Admin admin, int index){	
		Scanner leer = new Scanner(System.in);	
		String _fechaComprado;
		String _marca;				
		String _color;
		String _sku;
		float _costo;
		float _precioVenta;
		//int _separadores;
		int _cantidad;	
		switch(index){
			case 1:
				int _separadores;
				System.out.println("Para agregar un cartera al inventario necesitaremos cierta informacion");
				//preguntar que articulo se agregara
				System.out.println("Cuando se compro esta cartera? Escribir en formato dd-mm-year");
				_fechaComprado = leer.next();
				System.out.println("Cual es el codigo de este articulo?");
				_sku = leer.next();
				System.out.println("Cual fue su costo?");
				_costo = leer.nextFloat();
				System.out.println("Cual sera su precio de venta?");
				_precioVenta = leer.nextFloat();
				System.out.println("Cuantas de esta cartera se compraron?");
				_cantidad = leer.nextInt();
				System.out.println("Que marca es esta cartera?");
				_marca = leer.next();
				System.out.println("Cuantos separadores para tarjetas/identificaciones tiene?");
				_separadores = leer.nextInt();
				Cartera c = new Cartera(_cantidad,_costo,_precioVenta,_marca,_fechaComprado,_sku,_separadores,true,true,true);
				System.out.println(c.toString());
				admin.AnadirCartera(c);
			break;
			case 2:
				System.out.println("Para agregar un reloj al inventario necesitaremos cierta informacion");
				//preguntar que articulo se agregara
				System.out.println("Cuando se compro este reloj? Escribir en formato dd-mm-year");
				_fechaComprado = leer.next();
				System.out.println("Cual es el codigo de este articulo?");
				_sku = leer.next();
				System.out.println("Cual fue su costo?");
				_costo = leer.nextFloat();
				System.out.println("Cual sera su precio de venta?");
				_precioVenta = leer.nextFloat();
				System.out.println("Cuantas de esta reloj se compraron?");
				_cantidad = leer.nextInt();
				System.out.println("Que marca es este reloj?");
				_marca = leer.next();
				System.out.println("Que color es esta pulsera?");
				_color = leer.next();
				Reloj r = new Reloj(_cantidad,_costo,_precioVenta,_marca,_fechaComprado,_sku,_color,true);
				admin.AnadirReloj(r);
			break;
			case 3:
				System.out.println("Para agregar una gorra al inventario necesitaremos cierta informacion");
				//preguntar que articulo se agregara
				System.out.println("Cuando se compro esta gorra? Escribir en formato dd-mm-year");
				_fechaComprado = leer.next();
				System.out.println("Cual es el codigo de este articulo?");
				_sku = leer.next();
				System.out.println("Cual fue su costo?");
				_costo = leer.nextFloat();
				System.out.println("Cual sera su precio de venta?");
				_precioVenta = leer.nextFloat();
				System.out.println("Cuantas de esta gorra se compraron?");
				_cantidad = leer.nextInt();
				System.out.println("Que marca es esta gorra?");
				_marca = leer.next();
				System.out.println("Que color es esta pulsera?");
				_color = leer.next();
				Gorra g = new Gorra(_cantidad,_costo,_precioVenta,_marca,_fechaComprado,_sku,_color,"m");
				admin.AnadirGorra(g);
			break;
			case 4:

				System.out.println("Para agregar una pulsera al inventario necesitaremos cierta informacion");
				//preguntar que articulo se agregara
				System.out.println("Cuando se compro esta pulsera? Escribir en formato dd-mm-year");
				_fechaComprado = leer.next();
				System.out.println("Cual es el codigo de este articulo?");
				_sku = leer.next();				
				System.out.println("Cual fue su costo?");
				_costo = leer.nextFloat();
				System.out.println("Cual sera su precio de venta?");
				_precioVenta = leer.nextFloat();
				System.out.println("Cuantas de esta pulsera se compraron?");
				_cantidad = leer.nextInt();
				System.out.println("Que marca es esta pulsera?");
				_marca = leer.next();
				System.out.println("Que color es esta pulsera?");
				_color = leer.next();
				Pulsera p = new Pulsera(_cantidad,_costo,_precioVenta,_marca,_fechaComprado,_sku,"negra");;
				admin.AnadirPulsera(p);
			break;						
			case 5:
				System.out.println("Para declarar vendido un articulo es requerido lo siguiente:");
				System.out.println("Cual es la identificacion del articulo vendido?");
				_sku = leer.next();
				System.out.println("Cuantos se vendieron?");
				_cantidad = leer.nextInt();
				admin.SenalarVentaArticulo(_sku,_cantidad);
				System.out.println("Cuanto fue la venta total?");
				_cantidad = leer.nextInt();
				admin.ActualizarStatsVenta(_cantidad);
				//admin.ventas += _cantidad;
				//admin.ganancias = admin.ventas - admin.gasto;

			break;
			
			case 6: 
				System.out.println("El admin OBVIO tiene acceso al inventario");
				admin.DesplegarInventario();
			break;
			case 7:
				admin.ImprimirStats();
			break;

		}
	}

	/** Metodo para llamar a metodos de la clase user segun lo que solicite el usuario en el menu
	 * @param user Usuario del programa
	 * @param index Entero para identificar la opcion que solicita el usuario
	**/		
	public static void LlamarMetodosUser(Usuario user, int index){
		switch(index){
			case 1:
				System.out.println("El usuario SI tiene acceso a ver al inventario");
				//preguntar que articulo se agregara
				user.DesplegarInventario();
			break;
			case 2:
				System.out.println("Para buscar un articulo al inventario necesitaremos cierta informacion");
				//preguntar que articulo se agregara
				user.BuscarArticulo();
			break;
		}
	}
	/** Metodo para corroborar si la contrasena es correcta
	 * @param contrasena contrasena que debe ser 
	 * @param n contrasena introducida por el usuario
	**/			
	public static boolean PedirContrasena(String contrasena, String n){
		if(n.equals(contrasena)){
			//acceder a programa
			System.out.println("La contrasena es correcta");
			return true;
		}
		else{
			System.out.println("La clave es incorrecta");
			return false;
		}
	}
}