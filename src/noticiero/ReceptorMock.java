package noticiero;

public class ReceptorMock extends Receptor {
	String noticia = "";

	public String getNoticia() {
		return noticia;
	}

	public void setNoticia(String noticia) {
		this.noticia = noticia;
	}

	public void noticia(String not) {
		this.noticia = not;
	}

}
