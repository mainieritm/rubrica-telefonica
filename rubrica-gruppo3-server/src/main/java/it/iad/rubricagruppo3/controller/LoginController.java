package it.iad.rubricagruppo3.controller;

import it.iad.rubricagruppo3.dto.UtenteDto;
import it.iad.rubricagruppo3.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class LoginController {
    
    @Autowired
    LoginService loginService;
    
    @RequestMapping("/login")
    @ResponseBody
    public UtenteDto checkLogin(@RequestBody UtenteDto dto) {
        return new UtenteDto(dto.getUtente(),
                loginService.checkLogin(dto.getUtente().getUsername(),
                        dto.getUtente().getPassword()));
    }
}
