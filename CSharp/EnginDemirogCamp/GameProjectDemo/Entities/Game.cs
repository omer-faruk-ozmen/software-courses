using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GameProjectDemo.Entities
{
    class Game
    {
        public int Id { get; set; }
        public string GameName { get; set; }
        public double UnitPrice { get; set; }
        public double DiscountedPrice { get; set; }
    }
}
