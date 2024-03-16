public class bai1 {
    public float div(int a , int b) throws Exception{
        if(isInteger(a) || isInteger(b)) {
            throw new ArithmeticException("Loi");
        }
        return (float)a+b;
    }
    private boolean isInteger(int number) {
        try {
            Integer.parseInt(String.valueOf(number));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
