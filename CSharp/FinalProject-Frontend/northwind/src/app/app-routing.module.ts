import { ProductAddComponent } from './components/product-add/product-add.component';
import { CategoryComponent } from './components/category/category.component';
import { ProductComponent } from './components/product/product.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', pathMatch: 'full', component: ProductComponent },
  { path: 'home', component: ProductComponent },
  { path: 'products', component: ProductComponent },
  { path: 'categories', component: CategoryComponent },
  { path: 'products/category/:categoryId', component: ProductComponent },
  { path: 'products/add', component: ProductAddComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
