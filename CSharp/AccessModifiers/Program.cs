using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AccessModifiers
{
    class Program
    {
        static void Main(string[] args)
        {
        }
    }

    class Customer
    {
        private int Id;
        protected string Name;
        public string City { get; set; }
    }

    class Student:Customer
    {
        public void Save()
        {
            
        }
    }

    internal class Course
    {
        public string Name { get; set; }
    }
    public class CourseDemo
    {
        public string Name { get; set; }
    }
}
