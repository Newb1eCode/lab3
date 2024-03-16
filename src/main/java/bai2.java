public class bai2 {

    public int Chia(int a, int b) {
        if (b == 0) {
            throw  new ArithmeticException("Divide by zero");
        }
        return a / b;
    }
}
