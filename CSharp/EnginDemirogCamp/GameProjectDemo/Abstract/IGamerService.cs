using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using GameProjectDemo.Entities;

namespace GameProjectDemo.Abstract
{
    interface IGamerService
    {
        void Register(Gamer gamer);
        void Delete();
        void Update();
    }
}
