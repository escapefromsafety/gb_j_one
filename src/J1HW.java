public class J1HW {
    private static double  calculate (int a, int b, int c, int d){
        return a * (b * (c*1.0f / d));
}


public static void main (String[] args){

// Задание 1
double calcResult;
    int a = 3;
    int b = 5;
    int c = 8;
    int d = 3;

    if (d == 0) {
        System.out.println("Параметр d равен 0. Деление на 0 невозможно");
    } else {
       calcResult = calculate(a,b,c,d);
        System.out.println("Результат выражения a * (b + (c / d)): " + calcResult);


    }







}
}