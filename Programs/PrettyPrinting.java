package Programs;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 456.76465f;
        System.out.printf("Formatted float is %.2f \n", a);

        System.out.printf("a is %.2f \n", a);

        System.out.println(Math.PI);

        System.out.printf("Pi is : %.3f \n", Math.PI);

        System.out.printf("Hello my name is %s and I am %s \n", "Anvesh", "cool");
        System.out.printf("Hello my name is %s and my Roll no is %d \n", "Anvesh", 28);
        int b = 18, c = 5;
        System.out.printf("%d + %d = %d \n", b, c, b+c);
    }
}
