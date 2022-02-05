using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassMetotDemo
{
    class Program
    {
        static void Main(string[] args)
        {
            Customer customer1 = new Customer();
            Customer customer2 = new Customer();


            customer1.Name = "Ömer Faruk";
            customer1.Surname = "Özmen";

            customer2.Name = "Rasim";
            customer2.Surname = "Akbal";

            Customer[] customers = new Customer[] { customer1, customer2 };


            CustomerMenager customerMenager = new CustomerMenager();
            customerMenager.Delete(customer1);

            customerMenager.Add(customer2);

            customerMenager.Listing();

            Console.ReadLine();

        }
    }
}
