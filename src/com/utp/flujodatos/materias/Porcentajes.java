package com.utp.flujodatos.materias;

public interface Porcentajes {
	
	public double porcantajeParciales(double parciales, int porcentaje); 
	public double porcantajeProyectos(double proyectos, int porcentaje);
	public double porcantajeSemestral(double semestral, int porcentaje);
	public double notaFinal(double notafinal);
}
