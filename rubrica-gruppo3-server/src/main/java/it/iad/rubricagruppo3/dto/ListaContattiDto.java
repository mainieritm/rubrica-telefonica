package it.iad.rubricagruppo3.dto;

import it.iad.rubricagruppo3.model.Contatto;
import java.util.List;

public class ListaContattiDto {
    List<Contatto> contatti;

    public ListaContattiDto() {
    }

    public ListaContattiDto(List<Contatto> contatti) {
        this.contatti = contatti;
    }

    public List<Contatto> getContatti() {
        return contatti;
    }

    public void setContatti(List<Contatto> contatti) {
        this.contatti = contatti;
    }    
}
