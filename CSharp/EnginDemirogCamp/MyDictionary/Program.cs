using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MyDictionary
{
    class Program
    {
        static void Main(string[] args)
        {
            MyDict<int, string> namesCode = new MyDict<int, string>();
            namesCode.Add(1, "Ömer Faruk");
            namesCode.Add(2, "Rasim");
            namesCode.Add(2, "Ayşe");
            namesCode.Add(2, "Fatma");

            
            Console.WriteLine(namesCode.Count);

            

            Console.ReadLine();
        }
    }
}
