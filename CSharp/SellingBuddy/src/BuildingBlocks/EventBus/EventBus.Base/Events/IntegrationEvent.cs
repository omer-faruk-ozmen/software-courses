using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EventBus.Base.Events
{
    public class IntegrationEvent
    {

        [JsonProperty]
        public Guid OrderId { get; private set; }

        [JsonProperty]
        public DateTime CreatedDate { get; private set; }


        
        public IntegrationEvent()
        {
            OrderId = Guid.NewGuid();
            CreatedDate = DateTime.Now;
        }

        [JsonConstructor]
        public IntegrationEvent(Guid orderId, DateTime createdDate)
        {
            OrderId = orderId;
            CreatedDate = createdDate;
        }
    }
}
