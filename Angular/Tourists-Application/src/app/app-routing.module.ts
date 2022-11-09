import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { RegisterTouristComponent } from './register-tourist/register-tourist.component';
import { TouristListComponent } from './tourist-list/tourist-list.component';

const routes: Routes = 
[
 {path:'Home', component: HomePageComponent},

 {path:'', redirectTo:'Home', pathMatch:'full'},

 {path:'Register', component:RegisterTouristComponent},

 {path:'Tourists', component:TouristListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
