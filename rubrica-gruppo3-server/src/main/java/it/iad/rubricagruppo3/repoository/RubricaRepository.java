package it.iad.rubricagruppo3.repoository;


import it.iad.rubricagruppo3.model.Contatto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubricaRepository extends JpaRepository <Contatto, Long>{}

    

