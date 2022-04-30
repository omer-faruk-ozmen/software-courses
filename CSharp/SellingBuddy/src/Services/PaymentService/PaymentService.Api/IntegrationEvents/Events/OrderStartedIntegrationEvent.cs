using EventBus.Base.Events;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace PaymentService.Api.IntegrationEvents.Events
{
    public class OrderStartedIntegrationEvent: IntegrationEvent
    {
        public Guid Id { get; set; }

        public OrderStartedIntegrationEvent()
        {

        }

        public OrderStartedIntegrationEvent(Guid id)
        {
            Id = id;
        }
    }
}
