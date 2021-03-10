package it.iad.rubricagruppo3.repoository;


import it.iad.rubricagruppo3.model.Contatto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContattoRepository extends JpaRepository <Contatto, Long>{
    List<Contatto> findByNomeLike(String s);
}

    

