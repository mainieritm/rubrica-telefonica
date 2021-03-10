package it.iad.rubricagruppo3.repoository;

import it.iad.rubricagruppo3.model.Utente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Utente, Long>{
    List<Utente> findByUserNameAndPassword(String userName, String password);
}
