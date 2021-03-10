import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Utente } from '../utente';
import { UtenteDto } from '../utente-dto';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  nomeUtente: string;
  password: string;

  constructor(private http: HttpClient, private router: Router) { }

  ngOnInit(): void {
  }

  login() {
    let dto: UtenteDto = new UtenteDto();
    let utente: Utente = new Utente();
    utente.username = this.nomeUtente;
    utente.password = this.password;
    dto.utente = utente;
    let oss: Observable<UtenteDto> = this.http.post<UtenteDto>('http://localhost:8080/login', dto);
    oss.subscribe(d => {
      if (d.autenticato == true) {
        this.router.navigateByUrl("/main")
      } else {
        this.router.navigateByUrl("/error");
      }
    });
  }

}