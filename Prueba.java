import java.util.Scanner;
public class Prueba{
	public static void main(String[] args) {
		char ans = 'n';
		char adminAns = 'n';
		String contrasena = "nati";
		
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
					Admin adan = new Admin();
					System.out.println("Que desea realizar? Escriba el numero de la opcion");
					System.out.println("1. Añadir cartera al inventario");
					System.out.println("2. Añadir reloj al inventario");
					System.out.println("3. Añadir gorra al inventario");
					System.out.println("4. Añadir pulsera al inventario");
					System.out.println("5. Describir venta de articulo");
					System.out.println("6. Visualizar inventario");
					System.out.println("7. Salir del modo admin");
					System.out.println("8. Salir del programa");
					int i = leer.nextInt();
					LlamarMetodosAdmin(adan,i);
					if(i == 7)
						adminKey = false;
					if(i == 8)
						return;

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

	public static void LlamarMetodosAdmin(Admin admin, int index){	
		Scanner leer = new Scanner(System.in);	
		String _fechaComprado;
		String _marca;				
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
				Cartera c = new Cartera(_cantidad,_costo,_precioVenta,_separadores,_fechaComprado,true,true,true);
				admin.AnadirCartera(c);
			break;
			case 2:

				System.out.println("Para agregar un reloj al inventario necesitaremos cierta informacion");
				System.out.println("Cuando se compro esta cartera? Escribir en formato dd-mm-year");
				_fechaComprado = leer.next();
				System.out.println("Que marca es esta cartera?");
				_marca = leer.next();
				System.out.println("Cual fue su costo?");
				_costo = leer.nextFloat();
				System.out.println("Cual sera su precio de venta?");
				_precioVenta = leer.nextFloat();
				System.out.println("Cuantas de este reloj se compraron?");
				cantidad = leer.nextInt();
				Reloj r;
				//admin.AnadirReloj(r);
			break;
			case 3:
				System.out.println("Para agregar una gorra al inventario necesitaremos cierta informacion");
				//preguntar que articulo se agregara
				System.out.println("Cual fue su costo?");
				_costo = leer.nextFloat();
				System.out.println("Cual sera su precio de venta?");
				_precioVenta = leer.nextFloat();
				System.out.println("Cuantas de esta gorra se compraron?");
				cantidad = leer.nextInt();
				Gorra g;
				//admin.AnadirGorra(g);
			break;
			case 4:
				System.out.println("Para agregar una pulsera al inventario necesitaremos cierta informacion");
				//preguntar que articulo se agregara
				System.out.println("Cual fue su costo?");
				_costo = leer.nextFloat();
				System.out.println("Cual sera su precio de venta?");
				_precioVenta = leer.nextFloat();
				System.out.println("Cuantas de esta pulsera se compraron?");
				cantidad = leer.nextInt();
				Pulsera p;
				//admin.AnadirPulsera(p);
			break;						
			case 5:
				System.out.println("Para declarar vendido un articulo es requerido lo siguiente:");
				admin.SenalarVentaArticulo();
			break;
			
			case 6: 
				System.out.println("El admin OBVIO tiene acceso al inventario");
				admin.DesplegarInventario();
			break;

		}
	}

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