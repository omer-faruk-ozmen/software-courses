using InterfaceAbstractDemo.Abstract;
using InterfaceAbstractDemo.Adapters;
using InterfaceAbstractDemo.Concrete;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterfaceAbstractDemo
{
    class Program
    {
        static void Main(string[] args)
        {
            BaseCustomerManager customerManager = new StarbuckCustomerManager(new MernisServiceAdapter());
            customerManager.Save(new Customer { DateOfBirth = new DateTime(1998, 2, 15), FirstName = "Ömer Faruk", LastName = "Özmen", NationalityId = "63007162072" });

            Console.ReadLine();
        }
        
    }
}
