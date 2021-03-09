import { Component, OnInit } from '@angular/core';
import { Contatto } from '../contatto';

@Component({
  selector: 'app-campo-add',
  templateUrl: './campo-add.component.html',
  styleUrls: ['./campo-add.component.css']
})
export class CampoAddComponent implements OnInit {

  contatto: Contatto = new Contatto();

  constructor() { }

  ngOnInit(): void {
  }

  aggiungi(){
    
  }

}
