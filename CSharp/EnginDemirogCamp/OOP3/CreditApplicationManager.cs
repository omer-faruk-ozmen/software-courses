using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOP3
{
    class CreditApplicationManager
    {
        public void Application(ICreditManager creditManager, ILoggerService loggerService)
        {
            creditManager.Calculate();
            loggerService.Log();
        }

        public void CreditPreInformation(List<ICreditManager> credits)
        {
            foreach(var credit in credits)
            {
                credit.Calculate();
            }
        }
    }
}
