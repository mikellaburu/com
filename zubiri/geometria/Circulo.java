package com.zubiri.geometria;

public class Circulo {

		//Atributos
		private double r=0;
		// int r;
		final private double pi=3.1416;
		

		//contructor por defecto
		public Circulo(){
		this.r=0;
		}

		//constructor por parametro
		public Circulo(double radio){
		this.r=radio;
		}
		
			
		//Metodos get
		public double getRadio(){
			return this.r;
		}
		public double getPi(){
			return this.pi;
		}
		
		//Metodo set
		public void setRadio(double radio){
			this.r=radio;
		}
		
		//Metodo calculaArea
		public double calculaArea(){
			return 2*pi*this.getRadio()*this.getRadio();
		}
		//Metodo calcuraPerimetro
		public double calculaPerimetro(){
			return 2*pi*this.getRadio();
		}
		

	

}

