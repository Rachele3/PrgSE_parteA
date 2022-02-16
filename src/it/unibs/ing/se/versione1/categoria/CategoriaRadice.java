package it.unibs.ing.se.versione1.categoria;

import java.util.ArrayList;

public class CategoriaRadice extends Categoria {
	
	private String stato_di_conservazione;
	private String descrizione_libera;

	public CategoriaRadice(String nome, String descrizione, ArrayList<String> campi_nativi) 
	{
		super(nome, descrizione, campi_nativi);
		campi_nativi.add(stato_di_conservazione);
		campi_nativi.add(descrizione_libera);
	}

	/**
	 * METODO per aggiungere un nuovo campo nativo alla categoria
	 * @param nuovoCampo
	 * @param a_cn
	 */
	public void addCampoNativo (String nuovoCampo, ArrayList<String> a_cn) 
	{
		/** @param trovato = utilizzato per verificare se il campo che si vuole aggiungere è già presente */
		boolean trovato = false;
		
		if (nuovoCampo != null) 
		{
			/** CICLO FOR per verificare se il campo che si vuole aggiungere è già esistente */
			for (int i = 0; i < a_cn.size(); i++) 
			{
				if ( (nuovoCampo.equalsIgnoreCase(a_cn.get(i))) ) 
				{
					trovato = true;
					System.out.println("ATTENZIONE - Campo già esistente");
				}
			}
			
			if (trovato == false)
				a_cn.add(nuovoCampo);	
		}
			
	}
	
}
