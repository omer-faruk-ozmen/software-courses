using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Collections
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] names = new string[] { "Ömer", "Faruk", "Özmen" };
            Console.WriteLine(names[0]);

           
            List<string> names2 = new List<string> { "Ömer", "Faruk", "Özmen" };

            names2.Add("Selman");

            Console.WriteLine(names2[3]);

            
            Console.ReadLine();
        }
    }
}
