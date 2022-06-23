package com.exemplo.map;

public class Produto {
	
		//atributos
		private String nomeProd;
		private String categoriaProd;
		private double precoProd;
		
		// getters e setters
		public String getNomeProd() {
			return nomeProd;
		}
		public void setNomeProd(String nomeProd) {
			this.nomeProd = nomeProd;
		}
		public String getCategoriaProd() {
			return categoriaProd;
		}
		public void setCategoriaProd(String categoriaProd) {
			this.categoriaProd = categoriaProd;
		}
		public double getPrecoProd() {
			return precoProd;
		}
		public void setPrecoProd(double precoProd) {
			this.precoProd = precoProd;
		}
		
		// contructor
		public Produto(String nomeProd, String categoriaProd, double precoProd) {
			super();
			this.nomeProd = nomeProd;
			this.categoriaProd = categoriaProd;
			this.precoProd = precoProd;
		}
		@Override
		public String toString() {
			return this.getNomeProd() + "\t" +
					this.getCategoriaProd() + "\t" +
					this.getPrecoProd();
		}
		
			
		}

