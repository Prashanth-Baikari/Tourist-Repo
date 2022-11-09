import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Tourist } from './Tourist';

@Injectable({
  providedIn: 'root'
})
export class TouristsService {
private baseURL="http://localhost:9100/tourists"

  constructor(private httpClient: HttpClient) { }

  registerTourist(tourist: Tourist):Observable<Object>{
    return this.httpClient.post(`${this.baseURL}/register`, tourist)
  }

  getTouristsByFirstNameDesc(): Observable<Tourist[]>{
    return this.httpClient.get<Tourist[]>(`${this.baseURL}/getTouristsByFirstName`);
   }
}
