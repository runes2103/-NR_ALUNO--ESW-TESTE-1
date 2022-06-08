package pt.brunojesus.esg;

public class Main {
    public static void main(String[] args) {

        CalculatorAPI calculatorAPI = new CalculatorAPI();

        System.out.println("Calculating the meaning of life");

        double value = calculatorAPI.multiply(4d,9d,3d);
        System.out.println("4x9x3="+value);

        System.out.print(value+"/2/3=");
        value = calculatorAPI.divide(value, 2d, 3d);
        System.out.println(value);

        System.out.print(value+"-10-(-30)=");
        value = calculatorAPI.sub(value, 10d, -30d);
        System.out.println(value);

        System.out.print(value+"*3(-2)=");
        value = calculatorAPI.multiply(value, 3d, -2d);
        System.out.println(value);

        System.out.print(value+"-(-50)-(-250)-10=");
        value = calculatorAPI.sub(value, -50d, -250d, 10d);
        System.out.println(value);

        System.out.print(value+"+(-32)+12=");
        value = calculatorAPI.sum(value, -32d, 12d);
        System.out.println(value);

        System.out.println("The meaning of life is 42");
    }
}