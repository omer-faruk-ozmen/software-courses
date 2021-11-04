using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loops
{
    class Program
    {
        static void Main(string[] args)
        {
            ForLoop();

            WhileLoop();

            DoWhileLoop();

            string[] students = new string[3] {"Ömer", "Faruk", "Özmen"};
            foreach (var student in students)
            {
                Console.WriteLine(student);
            }

            Console.ReadLine();
        }

        private static void DoWhileLoop()
        {
            int number = 10;
            do
            {
                Console.WriteLine(number);
                number--;
            } while (number >= 11);
        }

        private static void WhileLoop()
        {
            int number = 0;
            while (number <= 100)
            {
                Console.WriteLine("Now number is {0}", number);
                number += 1;
            }
            Console.WriteLine("Finished!");
        }

        private static void ForLoop()
        {
            for (int i = 0; i <= 100; i += 2)
            {
                Console.WriteLine(i);
            }
            Console.WriteLine("Finished!");
        }
    }
}
