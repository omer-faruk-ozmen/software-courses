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
            ProductTest();

            //CategoryTest();
        }

        private static void CategoryTest()
        {
            CategoryManager categoryManager = new CategoryManager(new EfCategoryDal());
            foreach (var category in categoryManager.GetAll())
            {
                Console.WriteLine(category.CategoryName);
            }
        }

        private static void ProductTest()
        {
            ProductManager productManager = new ProductManager(new EfProductDal());

            var result = productManager.GetProductDetails();

            if (result.Success==true)
            {
                foreach (var product in result.Data)
                {
                    Console.WriteLine(product.ProductName + " / " + product.CategoryName);
                }
            }
            else
            {
                Console.WriteLine(result.Message);
            }

            /*

            Console.WriteLine("----------Filtered category id----------");
            foreach (var product in productManager.GetAllByCategoryId(id: 1).Data)
            {
                Console.WriteLine(product.ProductName);
            }

            Console.WriteLine("----------Filtered Unit Price----------");
            foreach (var product in productManager.GetByUnitPrice(min: 50, max: 500).Data)
            {
                Console.WriteLine(product.ProductName);
            }
            */
        }
    }
}
