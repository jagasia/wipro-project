import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DisplayProductComponent } from './display-product/display-product.component';
import { ViewCartComponent } from './view-cart/view-cart.component';

const routes: Routes = [
  {path:'viewcart',component:ViewCartComponent},
  {path:'displayproducts',component:DisplayProductComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
