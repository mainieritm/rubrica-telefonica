import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Contatto } from '../contatto';
import { CriterioRicercaDto } from '../criterio-ricerca-dto';
import { ListaContattiDto } from '../lista-contatti-dto';
import { TabellaComponent } from '../tabella/tabella.component';

@Component({
  selector: 'app-search-page',
  templateUrl: './search-page.component.html',
  styleUrls: ['./search-page.component.css']
})
export class SearchPageComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  vaiAMain(){
    this.router.navigateByUrl("/main");
  }

}
