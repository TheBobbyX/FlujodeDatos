package com.utp.flujodatos.materias;

public class Materias {
	private String nombre;
	private String cedula;
	private double parciales[];
	private double proyectos[];
	private double semestral;	
	protected double porParciales;
	protected double porProyectos;
	protected double porSemestral;
	
	public Materias(double par, double pro, double sem){
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public double[] getParciales() {
		return parciales;
	}
	public void setParciales(double[] parciales) {
		this.parciales = parciales;
	}
	public double[] getProyectos() {
		return proyectos;
	}
	public void setProyectos(double[] proyectos) {
		this.proyectos = proyectos;
	}
	public double getSemestral() {
		return semestral;
	}
	public void setSemestral(double semestral) {
		this.semestral = semestral;
	}	
}
