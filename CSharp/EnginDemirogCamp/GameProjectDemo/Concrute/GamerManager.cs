using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using GameProjectDemo.Abstract;
using GameProjectDemo.Entities;

namespace GameProjectDemo.Concrute
{
    class GamerManager : IGamerService
    {
        private IUserValidationService _userValidationService;

        public GamerManager(IUserValidationService userValidationService)
        {
            _userValidationService = userValidationService;
        }

        public void Register(Gamer gamer)
        {
            if (_userValidationService.CheckIfRealPerson(gamer))
            {
                Console.WriteLine($"{gamer.FirstName} mernis doğrulama başarılı. Kullanıcı sisteme eklendi");
            }
            else
            {
                Console.WriteLine($"{gamer.FirstName} Doğrulama başarısız.");
            }
        }
        public void Delete()
        {
            Console.WriteLine("Kullanıcı silindi.");
        }

        

       

        public void Update()
        {
            throw new NotImplementedException();
        }
    }
}
