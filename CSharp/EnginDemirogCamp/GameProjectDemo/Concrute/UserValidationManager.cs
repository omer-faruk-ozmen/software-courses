using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using GameProjectDemo.Abstract;
using GameProjectDemo.Entities;

namespace GameProjectDemo.Concrute
{
    class UserValidationManager : IUserValidationService
    {
        public bool CheckIfRealPerson(Gamer gamer)
        {
            return true;
        }

        
    }
}
