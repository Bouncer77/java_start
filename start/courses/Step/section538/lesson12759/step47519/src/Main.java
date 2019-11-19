class Main {
    //Stepik code: start
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int sum = 0;
        if (a == true) ++sum;
        if (b == true) ++sum;
        if (c == true) ++sum;
        if (d == true) ++sum;

        boolean res = false;
        if (sum == 2)
            res = true;
        else
            res = false;

        return res;

    }
//Stepik code: end
}