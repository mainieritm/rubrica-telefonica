import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Contatto } from '../contatto';
import { ContattoDto } from '../contatto-dto';
import { ListaContattiDto } from '../lista-contatti-dto';
import { RubricaServiceService } from '../rubrica-service.service';

@Component({
  selector: 'app-tabella',
  templateUrl: './tabella.component.html',
  styleUrls: ['./tabella.component.css']
})
export class TabellaComponent implements OnInit {

  contatto: Contatto = new Contatto();

  constructor(private http: HttpClient, public rubrica: RubricaServiceService) {
    this.displayList();
   }

  ngOnInit(): void {
  }

  rimuovi(i: number){
    let dto: ContattoDto = new ContattoDto();
    this.contatto.id = i;
    dto.contatto = this.contatto;
    let oss: Observable<ListaContattiDto> = this.http.post<ListaContattiDto>('http://localhost:8080/cancella-rubrica', dto);
    oss.subscribe(d => this.rubrica.contatti=d.contatti);
  }

  displayList(){
    let oss: Observable<ListaContattiDto> = this.http.get<ListaContattiDto>('http://localhost:8080/main-page');
    oss.subscribe(d => this.rubrica.contatti = d.contatti);
  }

}
