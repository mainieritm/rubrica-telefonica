package it.iad.rubricagruppo3.dto;

import it.iad.rubricagruppo3.model.Contatto;

public class ContattoDto {
    private Contatto contatto;

    public ContattoDto() {
    }
    
    public ContattoDto(Contatto contatto) {
        this.contatto = contatto;
    }

    public Contatto getContatto() {
        return contatto;
    }

    public void setContatto(Contatto contatto) {
        this.contatto = contatto;
    }
    
}
