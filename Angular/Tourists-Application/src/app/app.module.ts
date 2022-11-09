import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomePageComponent } from './home-page/home-page.component';
import { RegisterTouristComponent } from './register-tourist/register-tourist.component';
import { TouristListComponent } from './tourist-list/tourist-list.component';

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    RegisterTouristComponent,
    TouristListComponent
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
