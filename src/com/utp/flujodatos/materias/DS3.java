package com.utp.flujodatos.materias;

public class DS3 extends Materias implements Porcentajes{
	
	double porcantajeParciales;
	double porcantajeProyectos;
	double porcantajeSemestral;
	double notaFinal;
	
	//hay que asignarles los porcentajes correctos
	public DS3(double par, double pro, double sem) {
		super(par, pro, sem);
		porParciales = 0;
		porProyectos = 0;
		porSemestral = 0;		
	}

	public double porcantajeParciales(double parciales, int porcentaje) {
		return porcantajeParciales;
	}

	public double porcantajeProyectos(double proyectos, int porcentaje) {
		return porcantajeProyectos;
	}

	public double porcantajeSemestral(double semestral, int porcentaje) {
		return porcantajeSemestral;
	}

	public double notaFinal(double notafinal) {
		notaFinal = porcantajeParciales + porcantajeProyectos + porcantajeSemestral; 
		return notaFinal;
	}
	
}
