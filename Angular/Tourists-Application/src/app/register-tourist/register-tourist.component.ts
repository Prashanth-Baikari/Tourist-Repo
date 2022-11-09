import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Tourist } from '../Tourist';
import { TouristsService } from '../tourists.service';

@Component({
  selector: 'app-register-tourist',
  templateUrl: './register-tourist.component.html',
  styleUrls: ['./register-tourist.component.css']
})
export class RegisterTouristComponent implements OnInit {

  tourist: Tourist=new Tourist();
  constructor(private touristService:TouristsService, private router:Router) { }

  ngOnInit(): void {
  }
Register(){
  this.touristService.registerTourist(this.tourist).subscribe( data => {
    console.log(data);
    alert('Registration Successful ');
    this.router.navigate(['/Home']);
    
  },
 error => console.log(error)
  );
}
onSubmit(){
  this.Register();
}
}
