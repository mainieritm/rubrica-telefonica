import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Contatto } from '../contatto';
import { ContattoDto } from '../contatto-dto';
import { ListaContattiDto } from '../lista-contatti-dto';

@Component({
  selector: 'app-tabella',
  templateUrl: './tabella.component.html',
  styleUrls: ['./tabella.component.css']
})
export class TabellaComponent implements OnInit {

  contatto: Contatto = new Contatto();
  contatti: Contatto [] = [];

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  remove(i: number){
    let dto: ContattoDto = new ContattoDto();
    dto.contatto.id = i;
    let oss: Observable<ListaContattiDto> = this.http.post<ListaContattiDto>('http://localhost:8080/cancella-rubrica', dto);
    oss.subscribe(d => this.contatti=d.contatti);
  }

  displayList(){
    let oss: Observable<ListaContattiDto> = this.http.get<ListaContattiDto>('http://localhost:8080/main-page');
    oss.subscribe(d => this.contatti = d.contatti);
  }

}
