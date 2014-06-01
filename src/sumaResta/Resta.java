package sumaResta;

public class Resta extends Operacion {
	private final int val1, val2;

	public Resta(final int val1, final int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}

	public int getVal1() {
		return this.val1;
	}

	public int getVal2() {
		return this.val2;
	}

	@Override
	public int operar() {
		return this.val1 - this.val2;
	}

}
