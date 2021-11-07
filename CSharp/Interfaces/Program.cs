using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interfaces
{
    class Program
    {
        static void Main(string[] args)
        {
            PersonMenager menager = new PersonMenager();

            Customer customer = new Customer
            {
                Id = 1,
                FirstName = "Ömer Faruk",
                LastName = "Özmen",
                Address = "Kars"
            };

            Student student = new Student
            {
                Id = 1,
                FirstName = "Ömer Faruk",
                LastName = "Özmen",
                Departmant = "Computer Programming"
            };
            menager.Add(customer);

            menager.Add(student);

            Console.ReadLine();
        }
    }

    interface IPerson
    {
        int Id { get; set; }
        string FirstName { get; set; }
        string LastName { get; set; }
    }

    class Customer : IPerson
    {
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string Address { get; set; }
    }

    class Student : IPerson
    {
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string Departmant { get; set; }
    }

    class PersonMenager
    {
        public void Add(IPerson person)
        {
            Console.WriteLine(person.FirstName);
        }
    }
}
