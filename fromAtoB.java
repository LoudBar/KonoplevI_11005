// Вывести числа от А до В
public class fromAtoB {

    public static void fromAtoB(int a, int b) {
        if (b < a)
            return;
        System.out.println(a);
        fromAtoB(a+1, b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 11;
        fromAtoB(a, b);
    }
}
