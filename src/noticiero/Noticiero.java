package noticiero;
import java.util.ArrayList;
import java.util.List;


public class Noticiero {
	private List<Receptor> receptores= new ArrayList<>();

	public List<Receptor> getReceptores() {
		return receptores;
	}
	
//	public boolean contieneReceptor(List<Receptor> arrRec){ Para poder eliminar el getreceptores (para evutar dispersar la funcionalidad de la clase) crearíamos un método similar a este
//		return ;
//		
//	}

	public void setReceptores(List<Receptor> receptores) {
		this.receptores = receptores;
	}
	
	public void registrar ( ReceptorMock receptor){
		receptores.add(receptor);
		
	}
	
	public void informar(String texto){
		for(Receptor r: receptores){
			r.noticia(texto);
		}
		
	}
	
}
