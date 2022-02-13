﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using DataAccess.Abstract;
using Entities.Concrete;

namespace DataAccess.Concrete.InMemory
{
    public class InMemoryProductDal : IProductDal
    {
        //Global değişkenler _ ile verilir.
        
        List<Product> _products;

        public InMemoryProductDal()
        {
            _products = new List<Product>
            {
                new Product{ProductId = 1,CategoryId = 1,ProductName = "Bardak",UnitPrice = 15,UnitsInStock = 15},
                new Product{ProductId = 2,CategoryId = 2,ProductName = "Kamera",UnitPrice = 1500,UnitsInStock = 30},
                new Product{ProductId = 3,CategoryId = 2,ProductName = "Telefon",UnitPrice = 3500,UnitsInStock = 17},
                new Product{ProductId = 4,CategoryId = 2,ProductName = "Klavye",UnitPrice = 150,UnitsInStock = 11},
                new Product{ProductId = 5,CategoryId = 3,ProductName = "Mouse",UnitPrice = 75,UnitsInStock = 36}
            };
        }


        public List<Product> GetAll()
        {
            return _products;
        }

        public void Add(Product product)
        {
            _products.Add(product);
        }

        public void Update(Product product)
        {
            Product productToUpdate = _products.SingleOrDefault(p => p.ProductId == product.ProductId);
            productToUpdate.ProductName = product.ProductName;
            productToUpdate.CategoryId = product.CategoryId;
            productToUpdate.UnitPrice = product.UnitPrice;
            productToUpdate.UnitsInStock = product.UnitsInStock;
        }

        public void Delete(Product product)
        {

            Product productToDelete = _products.SingleOrDefault(p => p.ProductId == product.ProductId);

            _products.Remove(productToDelete);
        }

        public List<Product> GetAllByCategory(int categoryId)
        {
            return _products.Where(p => p.CategoryId == categoryId).ToList();
        }
    }
}
