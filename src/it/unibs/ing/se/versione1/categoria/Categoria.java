package it.unibs.ing.se.versione1.categoria;

import java.util.ArrayList;

public class Categoria {

	private String nome;
	private String descrizione;
	private ArrayList<String> campi_nativi;
	private ArrayList<Categoria> sottocategoria;
	
	public Categoria (String nome, String descrizione, ArrayList<String> campi_nativi) 
	{
		this.nome = nome;
		this.descrizione = descrizione;
		this.campi_nativi = campi_nativi;
		this.sottocategoria = new ArrayList<Categoria>();
	}
	
	
	/**  Visualizza elenco Categoria  */
	public void visualizzaCategoria() 
	{              
		System.out.println("\nELENCO SOTTOCATEGORIE");
		
		for (int i = 0; i < this.sottocategoria.size(); i++) 
			System.out.println(this.sottocategoria.get(i).toString());
	
	}
	
	
}
