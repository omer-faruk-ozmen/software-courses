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
            ILoggerService fileLoggerService = new FileLoggerService();

            List<ILoggerService> loggers = new List<ILoggerService> { new FileLoggerService(), new DatabaseLoggerService()};

            creditApplication.Application(personalFinanceCreditManager,loggers);

            creditApplication.Application(personalFinanceCreditManager, new List<ILoggerService> {databaseLoggerService,fileLoggerService});

            creditApplication.Application(transportCreditManager, new List<ILoggerService> { new DatabaseLoggerService(),new FileLoggerService()});


            List<ICreditManager> credits = new List<ICreditManager>() { personalFinanceCreditManager,transportCreditManager};

            creditApplication.CreditPreInformation(credits);

            Console.ReadLine();
        }
    }
}
