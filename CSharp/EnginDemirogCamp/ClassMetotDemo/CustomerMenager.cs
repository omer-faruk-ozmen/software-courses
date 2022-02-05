using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassMetotDemo
{
    class CustomerMenager
    {
        public void Add(Customer customer)
        {
            Console.WriteLine($"{customer.Name} isimli kişinin sisteme kaydı yapılmıştır.");
        }

        public void Listing()
        {
            Console.WriteLine("Müşteriler listeleniyor");
        }

        public void Delete(Customer customer)
        {
            Console.WriteLine($"{customer.Name} isimli kişi sistemden silinmiştir");
        }

    }
}
