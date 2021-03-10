import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Contatto } from '../contatto';
import { RubricaServiceService } from '../rubrica-service.service';

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css']
})
export class MainPageComponent implements OnInit {

  constructor(private router: Router, public rubrica: RubricaServiceService) { }

  ngOnInit(): void {
  }

  vaiAConta(){
    this.router.navigateByUrl("/count");
  }

  vaiARicerca(){
    this.router.navigateByUrl("/search");
  }

  aggiornaCont(contatti: Contatto[]){
    this.rubrica.contatti = contatti;
  }

}
