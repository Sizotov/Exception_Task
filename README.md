## Задание 2
### Дано:

try {
int d = 0;

double catchedRes1 = intArray[8] / d;

System.out.println("catchedRes1 = " + catchedRes1);

}

catch (ArithmeticException e) 
{

System.out.println("Catching exception: " + e);
}

**Ошибки**:

_1. Переменная intArray не была объявлена и инициализирована;_

_2. Арифметическая ошибка (поэтому выбрасывает ArithmeticException e) так как написано деление на ноль._


## Задание 3
### Дано:

public static void main(String[] args) throws Exception
{


try {

int a = 90;

int b = 3;

System.out.println(a / b);

printSum(23, 234);

int[] abc = { 1, 2 };

abc[3] = 9;

}

catch (Throwable ex) {

System.out.println("Что-то пошло не так...");

} 

catch (NullPointerException ex) {

System.out.println("Указатель не может указывать на null!");

} 

catch (IndexOutOfBoundsException ex) {

System.out.println("Массив выходит за пределы своего размера!");

}

}

public static void printSum(Integer a, Integer b) throws FileNotFoundException {
System.out.println(a + b);
}

**Ошибки**:
1. Метод printSum не определен в коде - ошибка компиляции или должен вызываться из другого класса.
2. Идет обращение к третьему элементу массива 

   int[] abc = { 1, 2 };

   abc[3] = 9;
   
   хотя у массива два элемента, поэтому выбрасывает IndexOutOfBoundsException ex.
3. Порядок блоков catch не так написан: из-за того, что Throwable ex первым стоит, следующие за ним исключения не будут показыватся.
