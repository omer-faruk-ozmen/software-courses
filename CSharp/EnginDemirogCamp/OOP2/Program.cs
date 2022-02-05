using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOP2
{
    class Program
    {
        static void Main(string[] args)
        {
            IndividualCustomer customer = new IndividualCustomer();
            customer.CustomerNumber = "12345";
            customer.CustomerFirstName = "Ömer Faruk";
            customer.CustomerLastName = "Özmen";


            CoorporateCustomer customer2 = new CoorporateCustomer();
            customer2.CustomerNumber = "123455";
            customer2.CooporateName = "Seç Market";
            customer2.TaxNumber = "123456789";
        }
    }
}
