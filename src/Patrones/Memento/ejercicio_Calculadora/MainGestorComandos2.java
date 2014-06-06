package Patrones.Memento.ejercicio_Calculadora;

import java.util.HashSet;
import java.util.Set;

import upm.jbb.IO;
import upm.jbb.io.Log;
import Patrones.Command.ejercicio_Calculadora.Comando;
import Patrones.Command.ejercicio_Calculadora.ComandoImprimir;
import Patrones.Command.ejercicio_Calculadora.ComandoIniciar;
import Patrones.Command.ejercicio_Calculadora.ComandoRestar;
import Patrones.Command.ejercicio_Calculadora.ComandoSumar;

public class MainGestorComandos2 {
	private Set<Comando> comandos = new HashSet<Comando>();

	public void add(Comando comando) {
		this.comandos.add(comando);
	}

	public void ejecutar() {
		Comando comando = (Comando) IO.in.select(this.comandos.toArray());
		comando.execute();
	}

	public static void main(String[] args) {
		CalculadoraMementable calc = new CalculadoraMementable();
		MainGestorComandos2 gestorCom = new MainGestorComandos2();
		GestorMementos<MementoCalculadora> gestorMem = new GestorMementos<MementoCalculadora>();
		gestorCom.add(new ComandoSumar(calc));
		gestorCom.add(new ComandoRestar(calc));
		gestorCom.add(new ComandoIniciar(calc));
		gestorCom.add(new ComandoImprimir(calc));
		gestorCom.add(new ComandoGuardar(calc, gestorMem));
		gestorCom.add(new ComandoDeshacer(calc, gestorMem));
		IO.in.addController(gestorCom);
		IO.out.setLog(Log.DEBUG);
	}
}