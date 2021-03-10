import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Contatto } from '../contatto';
import { ContattoDto } from '../contatto-dto';
import { ListaContattiDto } from '../lista-contatti-dto';

@Component({
  selector: 'app-campo-add',
  templateUrl: './campo-add.component.html',
  styleUrls: ['./campo-add.component.css']
})
export class CampoAddComponent implements OnInit {

  contatto: Contatto = new Contatto();
  contatti: Contatto[];

  constructor(private http: HttpClient) { 
    
  }

  ngOnInit(): void {
  }

  aggiungi(){
    let dto: ContattoDto = new ContattoDto();
    dto.contatto = this.contatto;
    let oss: Observable<ListaContattiDto> = this.http.post<ListaContattiDto>('http://localhost:8080/aggiungi-rubrica', dto);
    oss.subscribe(d => this.contatti=d.contatti);
    this.contatto = new Contatto();
  }

}
