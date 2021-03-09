package it.iad.rubricagruppo3.dto;

import it.iad.rubricagruppo3.model.Utente;


public class UtenteDto {
    private Utente utente; 
    private boolean autenticato;

    public UtenteDto() {
    }

    public UtenteDto(Utente utente) {
        this.utente = utente;
    }

    public UtenteDto(Utente utente, boolean autenticato) {
        this.utente = utente;
        this.autenticato = autenticato;
    }
    
    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }  

    public boolean isAutenticato() {
        return autenticato;
    }

    public void setAutenticato(boolean autenticato) {
        this.autenticato = autenticato;
    }
}
