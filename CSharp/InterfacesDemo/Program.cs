﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterfacesDemo
{
    class Program
    {
        static void Main(string[] args)
        {
            IWorker[] workers = new IWorker[3] { new Menager(), new Worker(), new Robot() };

            foreach (var worker in workers)
            {
                worker.Work();
            }

            IEat[] eats = new IEat[2] { new Worker(), new Menager() };
            foreach (var eat in eats)
            {
                eat.Eat();
            }

            Console.ReadLine();

        }
    }


    interface IWorker
    {
        void Work();
    }

    interface IEat
    {
        void Eat();
    }

    interface ISalary
    {
        void GetSalary();
    }
    class Menager : IWorker, IEat, ISalary
    {
        public void Work()
        {
            throw new NotImplementedException();
        }

        public void Eat()
        {
            throw new NotImplementedException();
        }

        public void GetSalary()
        {
            throw new NotImplementedException();
        }
    }
    class Worker : IWorker, IEat, ISalary
    {
        public void Work()
        {
            throw new NotImplementedException();
        }

        public void Eat()
        {
            throw new NotImplementedException();
        }

        public void GetSalary()
        {
            throw new NotImplementedException();
        }
    }
    class Robot : IWorker
    {
        public void Work()
        {
            throw new NotImplementedException();
        }
    }
}
