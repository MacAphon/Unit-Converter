/* A program to convert temperature units.
 * Other types of units will be added later.*/

using System;

namespace Unit_Converter
{
    class Program
    {
        static class Temp
        {
            public static void tempConv()
            {
                int submode;
                double temp;

                Console.WriteLine("");
                Console.WriteLine("Select conversion mode");
                Console.WriteLine("");
                Console.WriteLine("1: Celsius to Fahrenheit");
                Console.WriteLine("2: Fahrenheit to Celsius");
                Console.WriteLine("3: Celsius to Kelvin");
                Console.WriteLine("4: Kelvin to Celsius");
                Console.WriteLine("5: Fahrenheit to Kelvin");
                Console.WriteLine("6: Kelvin to Fahrenheit");

                submode = Convert.ToInt32(Console.ReadLine());

                if (submode == 1)
                {
                    Console.WriteLine("");
                    Console.WriteLine("Input temperature in Celsius");
                    temp = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine(tempCF(temp));
                }
                else if (submode == 2)
                {
                    Console.WriteLine("");
                    Console.WriteLine("Input temperature in Fahrenheit");
                    temp = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine(tempFC(temp));
                }
                else if (submode == 3)
                {
                    Console.WriteLine("");
                    Console.WriteLine("Input temperature in Celsius");
                    temp = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine(tempCK(temp));
                }
                else if (submode == 4)
                {
                    Console.WriteLine("");
                    Console.WriteLine("Input temperature in Kelvin");
                    temp = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine(tempKC(temp));
                }
                else if (submode == 5)
                {
                    Console.WriteLine("");
                    Console.WriteLine("Input temperature in Fahrenheit");
                    temp = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine(tempFK(temp));
                }
                else if (submode == 6)
                {
                    Console.WriteLine("");
                    Console.WriteLine("Input temperature in Kelvin");
                    temp = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine(tempKF(temp));
                }
                else
                {
                    Console.WriteLine("Invalid Input");
                }
            }
            public static double tempCF(double celsius)
            {
                return celsius * 1.80 + 32;
            }
            public static double tempFC(double fahrenheit)
            {
                return (fahrenheit - 32) / 1.80;
            }
            public static double tempCK(double celsius)
            {
                return celsius - 273.15;
            }
            public static double tempKC(double kelvin)
            {
                return kelvin + 273.15;
            }
            public static double tempFK(double fahrenheit)
            {
                return (fahrenheit - 32) / 1.80 + 273.15;
            }
            public static double tempKF(double kelvin)
            {
                return (kelvin + 237.15) * 1.8 + 32;
            }
        }

        static void Main(string[] args)
        {
            string mode;

            while (true)
            {
                Console.WriteLine("");
                Console.WriteLine("Select Mode");
                Console.WriteLine("");
                Console.WriteLine("temp:    Temperature");
                mode = Console.ReadLine();
                if (mode == "temp")
                {
                    Temp.tempConv();
                }
            }
        }
    }
}
