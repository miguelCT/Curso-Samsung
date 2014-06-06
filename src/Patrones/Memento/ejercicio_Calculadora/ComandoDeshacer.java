package Patrones.Memento.ejercicio_Calculadora;

import upm.jbb.IO;
import Patrones.Command.ejercicio_Calculadora.Comando;

public class ComandoDeshacer implements Comando {

	private CalculadoraMementable calculadora;
	private GestorMementos<MementoCalculadora> gestor;

	public ComandoDeshacer(CalculadoraMementable calculadora, GestorMementos<MementoCalculadora> gestor){
		this.calculadora=calculadora;
		this.gestor=gestor;
	}
	@Override
	public void execute() {
		calculadora.restoreMemento(gestor.getMemento((String) IO.in.select(gestor.keys())));
	}


}
