public class SquareDigit {

    public int squareDigits(int n) {
        // TODO Implement me
        int num = 0;
        while (n != 0) {
            num = n % 10;
            num *= num;
        }

        return num;
    }

}
