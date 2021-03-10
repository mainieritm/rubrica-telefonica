import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RubricaServiceService } from '../rubrica-service.service';

@Component({
  selector: 'app-count-page',
  templateUrl: './count-page.component.html',
  styleUrls: ['./count-page.component.css']
})
export class CountPageComponent implements OnInit {

  contatore: number;

  constructor(private router: Router, public rubrica: RubricaServiceService) {
    this.contatore = rubrica.contatti.length;
   }

  ngOnInit(): void {
  }

  vaiAMain(){
    this.router.navigateByUrl("/main");
  }

}