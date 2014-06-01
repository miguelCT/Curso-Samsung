package sumaResta;

import java.util.ArrayList;

public class Operacion extends Operando{


	public int total(ArrayList<Operando> arr) {
		int total = 0;
		for (Operando o : arr) {
			total = total + o.operar();
		}
		return total;

	}

	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return 0;
	}
}
