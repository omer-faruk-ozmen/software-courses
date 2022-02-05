using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TypesAndVeriables
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World");
            

            //Value Types
            int number1 = 10;
            int number2 = 20;
            Console.Write("Number1 is {0} Number2 {1}",number1,number2);

            

            Console.ReadLine();
        }
    }

    enum Days
    {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
    }
}
