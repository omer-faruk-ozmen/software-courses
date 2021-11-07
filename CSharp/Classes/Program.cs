using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes
{
    class Program
    {
        static void Main(string[] args)
        {
            CustomerMenager customerMenager = new CustomerMenager();
            customerMenager.Add();
            customerMenager.Update();

            ProductMenager productMenager = new ProductMenager();
            productMenager.Add();
            productMenager.Update();


            Customer customer = new Customer();
            customer.Id = 1;
            customer.City = "Kars";

            Customer customer2 = new Customer
            {
                Id=2,City="Kars",FirstName="Ömer Faruk",LastName = "Özmen"
            };
            Console.WriteLine(customer2.City);
            Console.WriteLine(customer2.FirstName);



            Console.ReadLine();
        }

        
    }
}
