using System;
using Business.Concrete;
using DataAccess.Concrete.EntityFramework;
using DataAccess.Concrete.InMemory;

namespace ConsoleUI
{
    class Program
    {
        static void Main(string[] args)
        {
            ProductManager productManager = new ProductManager(new EfProductDal());

            foreach (var product in productManager.GetAll())
            {
                Console.WriteLine(product.ProductName);
            }

            Console.WriteLine("----------Filtered category id----------");
            foreach (var product in productManager.GetAllByCategoryId(id:1))
            {
                Console.WriteLine(product.ProductName);
            }
            Console.WriteLine("----------Filtered Unit Price----------");
            foreach (var product in productManager.GetByUnitPrice(min:50,max:500))
            {
                Console.WriteLine(product.ProductName);
            }


        }
    }
}
