using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Strings
{
    class Program
    {
        static void Main(string[] args)
        {
            string city = "Ankara";
            Console.WriteLine(city[0]);

            
            foreach (var item in city)
            {
                Console.WriteLine(item);
            }

            string city2 = "İstanbul";
            string result = city + city2;
            Console.WriteLine(result);

            Console.WriteLine(String.Format("{0} {1}",city,city2));

            string sentence = "My name is Ömer Faruk Özmen";
            var result1 = sentence.Length;
            Console.WriteLine(result1);

            var result2 = sentence.Clone();
            sentence = "My name is Ömer Faruk";
            Console.WriteLine(sentence);

            bool result3= sentence.EndsWith("n");
            bool result4 = sentence.StartsWith("Name");
            var result5 = sentence.IndexOf("Öma");
            var result6 = sentence.IndexOf(" ");
            var result7 = sentence.LastIndexOf(" ");
            var result8 = sentence.Insert(0, "Hello, ");
            var result9 = sentence.Substring(3);
            var result10 = sentence.ToLower();
            var result11 = sentence.ToUpper();
            var result12 = sentence.Replace(" ", "-");
            var result13 = sentence.Remove(3,6);

            Console.WriteLine(result3);
            Console.WriteLine(result4);
            Console.WriteLine(result5);
            Console.WriteLine(result6);
            Console.WriteLine(result7);
            Console.WriteLine(result8);
            Console.WriteLine(result9);
            Console.WriteLine(result10);
            Console.WriteLine(result11);
            Console.WriteLine(result12);
            Console.WriteLine(result13);

            Console.ReadLine();
        }
    }
}
