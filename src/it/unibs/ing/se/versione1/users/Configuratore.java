package it.unibs.ing.se.versione1.users;

import it.unibs.ing.fp.myutility.InputDati;
import it.unibs.ing.pajc.core.FileUtil;

public class Configuratore extends Utente {

	private static final int LUNGHEZZA_PASSWORD = 10;
	private static final int LUNGHEZZA_USERNAME = 7;
	
	private TipoUtente tu;
	private String username;
	private String password;
	
	
	public Configuratore() {
		super();
		this.tu = TipoUtente.CONFIGURATORE;
		assegnaPrimeCredenziali();
		modificaCredenziali();
	}

	public void assegnaPrimeCredenziali () 
	{
		this.username = getNewUsername(LUNGHEZZA_USERNAME);
		this.password = getNewPassword(LUNGHEZZA_PASSWORD);	
		System.out.println("Ecco le sue credenziali per il primo accesso:/nUsername: " 
				+ this.username + "/nPassword: " + this.password);
	}
	
	
	public void modificaCredenziali () 
	{
		System.out.println("MODIFICARE LE CREDENZIALI.");
		boolean corrette = false;
		
		do 
		{
			String user = InputDati.leggiStringaNonVuota("Inserire il vecchio username: ");
			String psw = InputDati.leggiStringaNonVuota("Inserire la vecchia password: ");
			
			if (user.equalsIgnoreCase(this.username) && psw.equalsIgnoreCase(this.password)) 
			{
				this.username = InputDati.leggiStringWithLenghtMax("Inserire nuovo username(" + LUNGHEZZA_USERNAME + "): ", LUNGHEZZA_USERNAME);
				this.password = InputDati.leggiStringWithLenghtMax("Inserire la nuova password(" + LUNGHEZZA_PASSWORD + "): ", LUNGHEZZA_PASSWORD);
				// Qui farei salvataggio delle credenziali su un file
				FileUtil.writeme();
				corrette = true;
				System.out.println("La modifica delle credenziali è avvenuta con successo.");
			}
			else 
				System.out.println("Credenziali errate.");
				
		} while (!corrette);
	}
	
}
