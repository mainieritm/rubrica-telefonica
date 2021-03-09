package it.iad.rubricagruppo3.controller;

import it.iad.rubricagruppo3.dto.ContattoDto;
import it.iad.rubricagruppo3.dto.CriterioRicercaDto;
import it.iad.rubricagruppo3.dto.ListaContattiDto;
import it.iad.rubricagruppo3.dto.UtenteDto;
import it.iad.rubricagruppo3.service.LoginService;
import it.iad.rubricagruppo3.service.RubricaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class RubricaController {

    @Autowired
    RubricaService rubricaService;
    
    //@Autowired
    //LoginService loginService;

    @RequestMapping("/conta")
    @ResponseBody
    public long conta() {
        return rubricaService.conta();
    }

    @RequestMapping("/search")
    @ResponseBody
    public ListaContattiDto search(@RequestBody CriterioRicercaDto dto) {
        return new ListaContattiDto(rubricaService.search(dto.getStringa()));
    }

    @RequestMapping("/cancella-rubrica")
    @ResponseBody
    public ListaContattiDto cancellaRubrica(@RequestBody ContattoDto dto) {
        return new ListaContattiDto(rubricaService.cancellaRubrica(dto.getContatto().getId()));
    }

    @RequestMapping("/aggiungi-rubrica")
    @ResponseBody
    public ListaContattiDto aggiungiRubrica(@RequestBody ContattoDto dto) {
        return new ListaContattiDto(rubricaService.aggiungiRubrica(dto.getContatto()));
    }

    @RequestMapping("/main-page")
    @ResponseBody
    public ListaContattiDto mainPage() {
        return new ListaContattiDto(rubricaService.trovaTutti());
    }
    
//    @RequestMapping("/login")
//    @ResponseBody
//    public UtenteDto checkLogin(@RequestBody UtenteDto dto){
//        
//        return new UtenteDto(dto.getUtente(),
//                loginService.checkLogin(dto.getUtente().getUsername(), 
//                                        dto.getUtente().getPassword()));
//    }
}
