using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MyDictionary
{
    class MyDict<T,X>
    {
        
        T[] keys;
        X[] values;
        public MyDict()
        {
            keys = new T[0];
            values = new X[0];
        }
        public void Add(T key,X value)
        {
            T[] tempArrayKey = keys;
            X[] tempArrayValues = values;
            keys = new T[keys.Length + 1];
            values = new X[values.Length + 1];
            for (int i = 0; i < tempArrayKey.Length; i++)
            {
                keys[i] = tempArrayKey[i];
                values[i] = tempArrayValues[i];
            }
            keys[keys.Length - 1] = key;
            values[values.Length - 1] = value;

        }
        public int Count
        {
            get { return keys.Length; }
        }
    }
}
