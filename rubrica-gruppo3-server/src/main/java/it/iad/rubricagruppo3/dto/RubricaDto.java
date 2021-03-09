package it.iad.rubricagruppo3.dto;

import it.iad.rubricagruppo3.model.Contatto;
import java.util.List;

public class RubricaDto {
    List<Contatto> contatti;

    public RubricaDto() {
    }

    public RubricaDto(List<Contatto> contatti) {
        this.contatti = contatti;
    }

    public List<Contatto> getContatti() {
        return contatti;
    }

    public void setContatti(List<Contatto> contatti) {
        this.contatti = contatti;
    }    
}
