import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Contatto } from '../contatto';
import { CriterioRicercaDto } from '../criterio-ricerca-dto';
import { ListaContattiDto } from '../lista-contatti-dto';
import { RubricaServiceService } from '../rubrica-service.service';

@Component({
  selector: 'app-ricerca',
  templateUrl: './ricerca.component.html',
  styleUrls: ['./ricerca.component.css']
})
export class RicercaComponent implements OnInit {

  criterio: string;

  constructor(private http: HttpClient, public rubrica: RubricaServiceService) { }

  ngOnInit(): void {
  }

  ricerca(){
    let dto: CriterioRicercaDto = new CriterioRicercaDto();
    dto.stringa = this.criterio;
    let oss: Observable<ListaContattiDto> = this.http.post<ListaContattiDto>('http://localhost:8080/search', dto);
    oss.subscribe(d => this.rubrica.contatti=d.contatti);
  }

}
