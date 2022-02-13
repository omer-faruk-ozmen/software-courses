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

            IPersonManager customerManager = new CustomerManager();
            customerManager.Add();

            IPersonManager employeeManager = new EmployeeManager();
            employeeManager.Update();

            ProjectManager projectManager = new ProjectManager();
            projectManager.Add(customerManager);

            projectManager.Add(new InternManger());

            Console.ReadLine();
        }
    }
    interface IPersonManager
    {
        void Add();
        void Update();
    }

    class CustomerManager : IPersonManager
    {
        public void Add()
        {
            Console.WriteLine("Muşteri eklendi");
        }

        public void Update()
        {
            Console.WriteLine("Muşteri Güncellendi");
        }
    }

    class EmployeeManager : IPersonManager
    {
        public void Add()
        {
            Console.WriteLine("Personel eklendi");
        }

        public void Update()
        {
            Console.WriteLine("Personel güncellendi");
        }
    }
    class InternManger : IPersonManager
    {
        public void Add()
        {
            Console.WriteLine("Stajyer eklendi");
        }

        public void Update()
        {
            Console.WriteLine("Stajyer güncellendi");
        }
    }
    class ProjectManager
    {
        public void Add(IPersonManager personManager)
        {
            personManager.Add();
        }
    }
}
