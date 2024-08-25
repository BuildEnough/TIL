using System;
using static System.Console;

namespace Hello
{
    class MainApp
    {
        // program start
        static void Main(String[] args)
        {
            if (args.Length == 0)
            {
                Console.WriteLine("사용법: Hello.exe");
                return;
            }
            WriteLine("Hello, {0}", args[0]);
        }
    }
}