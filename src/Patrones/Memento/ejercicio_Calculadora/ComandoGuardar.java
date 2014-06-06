package Patrones.Memento.ejercicio_Calculadora;

import upm.jbb.IO;
import Patrones.Command.ejercicio_Calculadora.Comando;

public class ComandoGuardar implements Comando {

	private CalculadoraMementable calculadora;
	private GestorMementos<MementoCalculadora> gestor;

	public ComandoGuardar(CalculadoraMementable calculadora, GestorMementos<MementoCalculadora> gestor){
		this.calculadora=calculadora;
		this.gestor=gestor;
	}
	@Override
	public void execute() {
		gestor.addMemento(IO.in.readString("Introduce el ID del backup"),this.calculadora.createMemento());
	}

}
