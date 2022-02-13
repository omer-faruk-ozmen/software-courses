using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using GameProjectDemo.Abstract;
using GameProjectDemo.Entities;
using GameProjectDemo.KPSPublicService;

namespace GameProjectDemo.Adapters
{
    class UserValidationManager : IUserValidationService
    {
        public bool CheckIfRealPerson(Gamer gamer)
        {
            KPSPublicSoapClient client = new KPSPublicSoapClient();
            return client.TCKimlikNoDogrula(Convert.ToInt64(gamer.NationalityId), gamer.FirstName.ToUpper(),
                gamer.LastName.ToUpper(), gamer.BirthTime.Year);
        }
    }
}
