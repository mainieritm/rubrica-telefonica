import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { ErrorMessagePageComponent } from './error-message-page/error-message-page.component';
import { MainPageComponent } from './main-page/main-page.component';
import { SearchPageComponent } from './search-page/search-page.component';
import { CountPageComponent } from './count-page/count-page.component';
import { FormsModule } from '@angular/forms';
import { TabellaComponent } from './tabella/tabella.component';
import { RicercaComponent } from './ricerca/ricerca.component';
import { CampoAddComponent } from './campo-add/campo-add.component';
import { HttpClientModule} from '@angular/common/http'


@NgModule({
  declarations: [
    AppComponent,
    LoginPageComponent,
    ErrorMessagePageComponent,
    MainPageComponent,
    SearchPageComponent,
    CountPageComponent,
    TabellaComponent,
    RicercaComponent,
    CampoAddComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
