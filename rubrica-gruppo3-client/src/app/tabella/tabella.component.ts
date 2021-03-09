import { Component, OnInit } from '@angular/core';
import { Contatto } from '../contatto';

@Component({
  selector: 'app-tabella',
  templateUrl: './tabella.component.html',
  styleUrls: ['./tabella.component.css']
})
export class TabellaComponent implements OnInit {

  contatto: Contatto = new Contatto();
  contatti: Contatto [] = [];

  constructor() { }

  ngOnInit(): void {
  }

}
