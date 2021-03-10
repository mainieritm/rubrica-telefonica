package it.iad.rubricagruppo3.service.impl;

import it.iad.rubricagruppo3.model.Utente;
import it.iad.rubricagruppo3.repoository.LoginRepository;
import it.iad.rubricagruppo3.service.LoginService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    LoginRepository loginRepository;
    
    @Override
    public boolean checkLogin(String userName, String password) {
        //Check login su database
        List<Utente> utenti;
        //Cerco sul database l'utente con userName e Password inseriti dal client
        utenti = loginRepository.findByUsernameAndPassword(userName, password);
        // Se utenti ha almeno un elemento il login è true altrimenti false
        if (utenti.size() > 0){
            return true;
        }else{
            return false;
        }
        
        //Alternativa checkLogin
        
//        if (userName.equals("utente") && password.equals("password")){
//            return true;
//        }else{
//            return false;
//        }
    }
    
}
