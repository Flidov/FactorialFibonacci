public class Factorial {

    public static String answer(int loopType, int n) {
        return "" + (calculate(loopType, n));
    }

    public static int calculate(int loopType, int n) {
        int answer = 0;
        switch (loopType) {
            case 1:
                answer = inFor(n);
                break;
            case 2:
                answer = inWhile(n);
                break;
            case 3:
                answer = inDoWhile(n);
        }
        return answer;
    }

    public static int inFor(int x) {
        if (x < 2)
            return x;
        int res = x;
        for (int i = x; i != 1; i--) {
            res *= (i - 1);
        }
        return res;
    }

    public static int inWhile(int x) {
        if (x < 2)
            return x;
        int res = x;
        while (x != 1) {
            res *= --x;

        }

        return res;
    }

    public static int inDoWhile(int x) {
        if (x < 2)
            return x;
        int res = x;
        do {
            res *= --x;
        }
        while (x != 1);
        return res;
    }

}
