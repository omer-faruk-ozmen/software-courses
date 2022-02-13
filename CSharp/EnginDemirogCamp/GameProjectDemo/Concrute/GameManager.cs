using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using GameProjectDemo.Abstract;
using GameProjectDemo.Entities;

namespace GameProjectDemo.Concrute
{
    class GameManager : IGameService
    {
        public void Add(Game game)
        {
            Console.WriteLine("Add game successful");
        }

        public void Delete(Game game)
        {
            Console.WriteLine("Delete game successful");
        }

        public void Update(Game game)
        {
            Console.WriteLine("Update game successful");
        }
    }
}
