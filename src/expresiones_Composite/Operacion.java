package expresiones_Composite;

public abstract class Operacion extends Expresion {
	private Expresion expr1;
	private Expresion expr2;

	public Expresion getExpr1() {
		return expr1;
	}

	public void setExpr1(Expresion expr1) {
		this.expr1 = expr1;
	}

	public Expresion getExpr2() {
		return expr2;
	}

	public void setExpr2(Expresion expr2) {
		this.expr2 = expr2;
	}

	@Override
	public abstract int operar();

	@Override
	public abstract String ver();

}
