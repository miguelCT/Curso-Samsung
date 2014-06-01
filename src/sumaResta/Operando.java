package sumaResta;

import java.util.ArrayList;

public abstract class Operando {
	public Operando() {
	};

	public abstract int operar();

	public abstract int total(ArrayList<Operando> arr);
}
