package expresiones_Composite;

public class Sumar extends Operacion {

	public Sumar(Expresion expr1, Expresion expr2) {
		this.setExpr1(expr1);
		this.setExpr2(expr2);
	}

	@Override
	public int operar() {
		int operando1 = this.getExpr1().operar();
		int operando2 = this.getExpr2().operar();
		return operando1 + operando2;
	}

	@Override
	public String ver() {
		return "(" + this.getExpr1().ver() + "+" + this.getExpr2().ver() + ")";
	}

}
