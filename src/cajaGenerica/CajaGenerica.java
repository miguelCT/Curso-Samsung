package cajaGenerica;

public class CajaGenerica<T> {
		
	private  T almacen;
	
	public void almacenar(T objeto){
		assert objeto != null: "El objeto introducido es nulo";
		if(almacen!=null){
			throw new RuntimeException("El almacén está lleno y no podemos introducir nada");
		}
		this.almacen=objeto;
	}
	
	public T extraer(){
		if(almacen==null){
			throw new RuntimeException("El almacén está vacío y no podemos extraaer nada");
		}
		T aux= almacen;
		almacen=null;
		return aux;
		
		
	}

}
