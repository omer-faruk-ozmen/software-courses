using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Arrays
{
    class Program
    {
        static void Main(string[] args)
        {
            //1.yöntem
            string[] students = new string[3] { "Ömer", "Faruk", "Özmen" };

            //2.yöntem
            students[0] = "Ömer";
            students[1] = "Faruk";
            students[2] = "Özmen";

            //3.yöntem
            string[] students2 = { "Ömer", "Faruk", "Özmen" };

            foreach (var student in students)
            {
                Console.WriteLine(student);
            }
            foreach (var student in students2)
            {
                Console.WriteLine(student);
            }


            Console.WriteLine("--------------------------");


            string[,] regions = new string[5, 3]
            {
                {"İstanbul","İzmit","Balıkesir"},
                { "Ankara","Konya","Niğde"},
                { "Antalya","Adana","Mersin"},
                { "Rize","Trabzon","Samsun"},
                { "İzmir","Muğla","Manisa"},
            };

            for (int i = 0; i <= regions.GetUpperBound(0); i++)
            {
                for (int j = 0; j <= regions.GetUpperBound(1); j++)
                {
                    Console.WriteLine(regions[i,j]);
                }
                Console.WriteLine("********");
            }


            Console.WriteLine();
            Console.ReadLine();
        }
    }
}
