using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using GameProjectDemo.Abstract;
using GameProjectDemo.Adapters;
using GameProjectDemo.Concrute;
using GameProjectDemo.Entities;

namespace GameProjectDemo
{
    class Program
    {
        static void Main(string[] args)
        {
            GamerManager gamerManager = new GamerManager(new Adapters.UserValidationManager());

            gamerManager.Register(new Gamer { BirthTime = new DateTime(1999,2,15),FirstName = "Ömer Faruk",LastName = "Özmen",NationalityId = ""});
            

            Console.ReadLine();
        }
    }
}
