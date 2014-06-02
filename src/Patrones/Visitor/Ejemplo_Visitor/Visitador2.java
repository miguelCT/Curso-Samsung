package Patrones.Visitor.Ejemplo_Visitor;

public class Visitador2 extends Visitador {
	private int as = 0;
	private int bs = 0;

	@Override
	public void visitarElementoA(ElementoA e) {
		this.as++;
	}

	@Override
	public void visitarElementoB(ElementoB e) {
		this.bs++;

	}

	public int getAs() {
		return as;
	}

	public int getBs() {
		return bs;
	}

}
