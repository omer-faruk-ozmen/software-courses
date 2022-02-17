﻿using System;
using System.Collections.Generic;
using System.Linq;

namespace Linq
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Category> categories = new List<Category>
            {
                new Category{CategoryId=1,CategoryName="Bilgisayar"},
                new Category{CategoryId = 2,CategoryName = "Telefon"}
            };
            List<Product> products = new List<Product>
            {
                new Product
                {
                    ProductId = 1, CategoryId = 1, ProductName = "Acer Laptop", QuantityPerUnit = "32 gb ram",
                    UnitPrice = 10000, UnitsInStock = 5
                },
                new Product
                {
                    ProductId = 2, CategoryId = 2, ProductName = "Samsung", QuantityPerUnit = "4 gb ram",
                    UnitPrice = 5000, UnitsInStock = 7
                },
                new Product
                {
                    ProductId = 3, CategoryId = 1, ProductName = "Msi Laptop", QuantityPerUnit = "64 gb ram",
                    UnitPrice = 18000, UnitsInStock = 15
                },
                new Product
                {
                    ProductId = 4, CategoryId = 2, ProductName = "Apple", QuantityPerUnit = "3 gb ram",
                    UnitPrice = 13000, UnitsInStock = 0
                },
                new Product
                {
                    ProductId = 5, CategoryId = 2, ProductName = "Huawei", QuantityPerUnit = "8 gb ram",
                    UnitPrice = 15000, UnitsInStock =8
                }
            };

            
            
        }

        static List<Product> GetProducts(List<Product> products)
        {

            return products.Where(p => p.UnitPrice > 5000 && p.UnitsInStock > 3).ToList();
        }
    }





    class Product
    {
        public int ProductId { get; set; }
        public int CategoryId { get; set; }
        public string ProductName { get; set; }
        public string QuantityPerUnit { get; set; }
        public decimal UnitPrice { get; set; }
        public int UnitsInStock { get; set; }
    }

    class Category
    {
        public int CategoryId { get; set; }
        public string CategoryName { get; set; }
    }
}
