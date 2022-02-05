using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOP3
{
    class Program
    {
        static void Main(string[] args)
        {
            ICreditManager transportCreditManager = new TransportCreditManager();
 
            ICreditManager personalFinanceCreditManager = new PersonalFinanceCreditManager();

            ICreditManager houseCreditManager = new HouseCreditManager();

            CreditApplicationManager creditApplication = new CreditApplicationManager();


            ILoggerService databaseLoggerService = new DatabaseLoggerService();
            ILoggerService fileLoggerService = new DatabaseLoggerService();

            creditApplication.Application(personalFinanceCreditManager,databaseLoggerService);

            creditApplication.Application(transportCreditManager, new FileLoggerService());


            List<ICreditManager> credits = new List<ICreditManager>() { personalFinanceCreditManager,transportCreditManager};

            creditApplication.CreditPreInformation(credits);

            Console.ReadLine();
        }
    }
}
