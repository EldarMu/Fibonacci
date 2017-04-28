package com.eldar.fibonacci;

public class Fib{

    public int count(int number)
    {
        int a = 0;
        int b = 1;
        if(number==1) return a;
        else if (number==2) return b;
        else
        {
            int result = 0;
            //Если номер меньше трех, функция пропустит цикл
            //Тогда result останется равным нулю, как раз как первые два
            //числа Фибоначчи
            for (int i = 2; i < number; i++) {
                //новое число = сумма двух предыдущих
                result = a + b;

                //теперь a - третье число с конца, b - второе с конца, result - последнее
                //делаем а не третьим с конца, а вторым
                a = b;

                //делаем b не вторым с конца, а последним
                b = result;
                //a и b снова два последних числа
            }
            //Возвращаем полученное число
            return result;
        }
    }
}
