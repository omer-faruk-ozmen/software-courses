import { Component, OnInit } from '@angular/core';
import { Product } from './product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css'],
})
export class ProductComponent implements OnInit {
  constructor() {}
  title = 'Ürün Listesi';
  filterText = "a"
  products: Product[] = [
    {
      id: 1,
      name: 'Laptop',
      price: 5000,
      categoryId: 1,
      description: 'Asus ZenBook',
      imageUrl: 'https://images.unsplash.com/photo-1460925895917-afdab827c52f?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1115&q=80',
    },
    {
      id: 2,
      name: 'Mouse',
      price: 50,
      categoryId: 2,
      description: 'Logitech',
      imageUrl: 'https://images.unsplash.com/photo-1527814050087-3793815479db?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1328&q=80',
    },
    {
      id: 1,
      name: 'Laptop',
      price: 5000,
      categoryId: 1,
      description: 'Asus ZenBook',
      imageUrl: 'https://images.unsplash.com/photo-1460925895917-afdab827c52f?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1115&q=80',
    },
    {
      id: 2,
      name: 'Mouse',
      price: 50,
      categoryId: 2,
      description: 'Logitech',
      imageUrl: 'https://images.unsplash.com/photo-1527814050087-3793815479db?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1328&q=80',
    },
    {
      id: 1,
      name: 'Laptop',
      price: 5000,
      categoryId: 1,
      description: 'Asus ZenBook',
      imageUrl: 'https://images.unsplash.com/photo-1460925895917-afdab827c52f?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1115&q=80',
    },
    {
      id: 2,
      name: 'Mouse',
      price: 50,
      categoryId: 2,
      description: 'Logitech',
      imageUrl: 'https://images.unsplash.com/photo-1527814050087-3793815479db?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1328&q=80',
    },
    {
      id: 1,
      name: 'Laptop',
      price: 5000,
      categoryId: 1,
      description: 'Asus ZenBook',
      imageUrl: 'https://images.unsplash.com/photo-1460925895917-afdab827c52f?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1115&q=80',
    },
    {
      id: 2,
      name: 'Mouse',
      price: 50,
      categoryId: 2,
      description: 'Logitech',
      imageUrl: 'https://images.unsplash.com/photo-1527814050087-3793815479db?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1328&q=80',
    },
    {
      id: 1,
      name: 'Laptop',
      price: 5000,
      categoryId: 1,
      description: 'Asus ZenBook',
      imageUrl: 'https://images.unsplash.com/photo-1460925895917-afdab827c52f?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1115&q=80',
    },
    {
      id: 2,
      name: 'Mouse',
      price: 50,
      categoryId: 2,
      description: 'Logitech',
      imageUrl: 'https://images.unsplash.com/photo-1527814050087-3793815479db?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1328&q=80',
    },
    
  ];
  ngOnInit(): void {}
}
