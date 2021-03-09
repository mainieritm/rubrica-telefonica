package it.iad.rubricagruppo3.controller;

import it.iad.rubricagruppo3.service.RubricaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class RubricaController {
    
    @Autowired
    RubricaService rubricaService;
    
    @RequestMapping("/conta")
    @ResponseBody
    public int conta(){
        return 0;
    }
    
}
