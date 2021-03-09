package it.iad.rubricagruppo3.service;

import it.iad.rubricagruppo3.model.Contatto;
import java.util.List;


public interface RubricaService {
    int conta();
    List<Contatto> search(String criterio);
    List<Contatto> cancellaRubrica(Long id);
    List<Contatto> aggiungiRubrica(Contatto contatto);
    List<Contatto> trovaTutti();
}
