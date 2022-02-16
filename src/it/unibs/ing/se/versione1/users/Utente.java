package it.unibs.ing.se.versione1.users;

import java.util.ArrayList;

public class Utente {

	private ArrayList<Articolo> articoli_scambiabili;
	
	public Utente () {
		this.articoli_scambiabili = new ArrayList<Articolo>();
	}
	
	
	/**
	 * Metodo statico getNewPassword che riceve in input la lunghezza della password
	 * scelta dall'utente e dato un alfabeto genera in modo casuale la password
	 * @param passwordSize
	 * @return la stringa della password generata
	 */
	public static String getNewPassword (int passwordSize) 
    { 
		/** @param alphabet contiene tutti i possibili caratteri che comporranno la password */
		String alphabet = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz?!@#$%&";
		//create the StringBuffer
		StringBuilder password = new StringBuilder(passwordSize);
  
        for (int m = 0; m < passwordSize; m++) 
        { 
            // Scelgo un carattere di alphabet
        	/** @param randomIndexCharInAlphabet rappresenta l段ndice, generato in modo casuale, della posizione del carattere all段nterno della stringa alphabet*/
            int randomIndexCharInAlphabet = (int)( alphabet.length() * Math.random() ); 

            // add the characters
            password.append(alphabet.charAt(randomIndexCharInAlphabet)); 
        } 

        return password.toString(); 
    } 

	/**
	 * Metodo statico getNewUsername che riceve in input la lunghezza dello username
	 * scelta dall'utente e dato un alfabeto genera in modo casuale lo username
	 * @param usernameSize
	 * @return la stringa dello username generata
	 */
	public static String getNewUsername (int usernameSize) 
	{
		/** @param alphabet contiene tutti i possibili caratteri che comporranno lo username */
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		//create the StringBuffer
		StringBuilder username = new StringBuilder(usernameSize);
  
        for (int m = 0; m < usernameSize; m++) 
        { 
            // Scelgo un carattere di alphabet
        	/** @param randomIndexCharInAlphabet rappresenta l段ndice, generato in modo casuale, della posizione del carattere all段nterno della stringa alphabet*/
            int randomIndexCharInAlphabet = (int)( alphabet.length() * Math.random() ); 

            // add the characters
            username.append(alphabet.charAt(randomIndexCharInAlphabet)); 
        } 

        return username.toString(); 
	}
}
