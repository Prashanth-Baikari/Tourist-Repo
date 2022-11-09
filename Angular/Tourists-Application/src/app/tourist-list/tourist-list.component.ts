import { Component, OnInit } from '@angular/core';
import { Tourist } from '../Tourist';
import { TouristsService } from '../tourists.service';

@Component({
  selector: 'app-tourist-list',
  templateUrl: './tourist-list.component.html',
  styleUrls: ['./tourist-list.component.css']
})
export class TouristListComponent implements OnInit {
tourists: Tourist[] | undefined;

  constructor(private touristService:TouristsService) { }

  ngOnInit(): void {
    this.onView();
  }
  onView(){
    this.touristService.getTouristsByFirstNameDesc().subscribe(data => {
      this.tourists=data;
    })
  }

}
