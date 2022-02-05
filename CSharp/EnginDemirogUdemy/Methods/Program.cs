using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Methods
{
    class Program
    {
        static void Main(string[] args)
        {
            Product product1 = new Product();
            Product product2 = new Product();

            product1.Name = "Elma";
            product1.Price = 15;
            product1.Description = "Amasya Elması";

            product2.Name = "Çilek";
            product2.Price = 30;
            product2.Description = "Reçellik çilek";

            Product[] products = new Product[] { product1, product2 };

            foreach (Product product in products)
            {
                Console.WriteLine(product.Name);
                Console.WriteLine(product.Price);
            }

            //instance
            BasketMenager basketMenager = new BasketMenager();

            basketMenager.Add(product1);

            Add("Ömer Faruk");


            var result = Add2(20, 40);
            Console.WriteLine(result);

            int number1 = 20;
            int number2;

            var result2 = Add3(ref number1,out number2);
            Console.WriteLine(result2);
            Console.WriteLine(number1);

            Console.WriteLine(Multiply(2,5));
            Console.WriteLine(Multiply(2, 5,9));

            Console.WriteLine(Add4(3,6,7,87,3,543,5,34,34));

            Console.ReadLine();
        }

        static void Add(string message)
        {
            Console.WriteLine("Added! " +message);
        }

        //default value
        static int Add2(int number1, int number2=50)
        {
            var result = number1 + number2;
            return result;
        }

        static int Add3(ref int number1,out int number2)
        {
            number1 = 40;
            number2 = 50;
            return number1 + number2;
        }

        static int Multiply(int number1, int number2)
        {
            return number1 * number2;
        }
        static int Multiply(int number1, int number2,int number3)
        {
            return number1 * number2*number3;
        }

        static int Add4(params int[] numbers)
        {
            return numbers.Sum();
        }
    }
}
