using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VirtualMethods
{
    class Program
    {
        static void Main(string[] args)
        {
            SqlServer sqlServer = new SqlServer();
            sqlServer.Add();
            MySql mySql = new MySql();
            mySql.Delete();

            Console.ReadLine();
        }
    }
    class Database
    {
        public virtual void Add()
        {
            Console.WriteLine("Added by default");
        }
        public virtual void Delete()
        {
            Console.WriteLine("Deleted by default");
        }
    }
    class MySql : Database
    {

    }
    class SqlServer : Database
    {
        public override void Add()
        {
            Console.WriteLine("Added by Sql code");
            //base.Add();
        }
        public override void Delete()
        {
            Console.WriteLine("Deleted by Sql code");
            //base.Delete();
        }
    }
}
