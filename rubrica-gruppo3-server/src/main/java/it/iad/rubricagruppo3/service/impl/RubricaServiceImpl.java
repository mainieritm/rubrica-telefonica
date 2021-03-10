package it.iad.rubricagruppo3.service.impl;

import it.iad.rubricagruppo3.model.Contatto;
import it.iad.rubricagruppo3.repoository.RubricaRepository;
import it.iad.rubricagruppo3.service.RubricaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RubricaServiceImpl implements RubricaService{
    @Autowired
    RubricaRepository rubricaRepository;
    
    @Override
    public long conta() {
        return rubricaRepository.count();
    }

    @Override
    public List<Contatto> search(String criterio) {
        return rubricaRepository.findByNomeLike(criterio);
    }

    @Override
    public List<Contatto> cancellaRubrica(Long id) {
        rubricaRepository.deleteById(id);
        return trovaTutti();
    }

    @Override
    public List<Contatto> aggiungiRubrica(Contatto contatto) {
        rubricaRepository.save(contatto);
        return trovaTutti();
    }

    @Override
    public List<Contatto> trovaTutti() {
        return rubricaRepository.findAll();
    }
    
}
