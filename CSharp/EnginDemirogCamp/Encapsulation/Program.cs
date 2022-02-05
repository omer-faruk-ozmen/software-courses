using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Encapsulation
{
    class Program
    {
        static void Main(string[] args)
        {
            Customer customer = new Customer();
            customer.FirstName = "Ömer Faruk";

            Console.WriteLine(customer.FirstName);

            Console.ReadLine();
        }
    }
}
