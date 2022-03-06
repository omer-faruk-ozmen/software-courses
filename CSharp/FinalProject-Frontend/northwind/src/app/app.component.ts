import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title:string = 'northwind';
  user:string="Ömer Faruk Özmen";
  product1:any={productId:1,productName:"Bardak",categoryId:1,unitPrice:5}
  product2={productId:2,productName:"Laptop",categoryId:2,unitPrice:785}
  product3={productId:3,productName:"Keyboard",categoryId:3,unitPrice:15}
  product4={productId:4,productName:"Mouse",categoryId:3,unitPrice:25}
  product5={productId:5,productName:"Camera",categoryId:2,unitPrice:75}

  products = [this.product1,this.product2,this.product3,this.product4,this.product5]
}
