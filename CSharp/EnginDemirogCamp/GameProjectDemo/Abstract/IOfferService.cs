using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using GameProjectDemo.Entities;

namespace GameProjectDemo.Abstract
{
    interface IOfferService
    {
        void Add(Offer offer);
        void Delete(Offer offer);
        void Update(Offer offer);
    }
}
