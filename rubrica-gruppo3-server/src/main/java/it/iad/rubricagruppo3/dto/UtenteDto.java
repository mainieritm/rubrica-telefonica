package it.iad.rubricagruppo3.dto;

import it.iad.rubricagruppo3.model.Utente;


public class UtenteDto {
    private Utente utente;

    public UtenteDto() {
    }

    public UtenteDto(Utente utente) {
        this.utente = utente;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }  
}
