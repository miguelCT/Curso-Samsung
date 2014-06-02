package Patrones.Visitor.Ejemplo_Visitor;

public class Visitador3 extends Visitador {
	private int as = 0;
	private int bs = 0;
	private int maxRepeticionesA = 0;
	private int maxRepeticionesB = 0;

	@Override
	public void visitarElementoA(ElementoA e) {
		this.as++;
		if (bs > maxRepeticionesB)
			maxRepeticionesB = bs;
		bs = 0;
	}

	@Override
	public void visitarElementoB(ElementoB e) {
		this.bs++;
		if (as > maxRepeticionesA)
			maxRepeticionesA = as;
		as = 0;

	}

	public int getMaxRepeticionesA() {
		return maxRepeticionesA;
	}

	public int getMaxRepeticionesB() {
		return maxRepeticionesB;
	}

	public int maximoRepeticiones() {
		return Math.max(getMaxRepeticionesA(), getMaxRepeticionesB());
	}

}
