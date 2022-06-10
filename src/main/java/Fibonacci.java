import java.util.Arrays;

public class Fibonacci {
    public static String answer(int loopType, int n) {
        return Arrays.toString(calculate(loopType, n));
    }

    public static int[] calculate(int loopType, int n) {
        int[] answer = new int[n];
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

    public static int[] inFor(int x) {
        int[] res = new int[x + 1];
        res[0] = 0;
        res[1] = 1;
        if (x < 2)
            return res;
        for (int i = 2; i < res.length; i++) {
            res[i] = res[i - 1] + res[i - 2];

        }
        return res;
    }

    public static int[] inWhile(int x) {
        int[] res = new int[x + 1];
        res[0] = 0;
        res[1] = 1;
        if (x < 2)
            return res;
        int i = 2;
        while (i < res.length) {
            res[i] = res[i - 1] + res[i - 2];
            i++;
        }
        return res;
    }

    public static int[] inDoWhile(int x) {
        int[] res = new int[x + 1];
        res[0] = 0;
        res[1] = 1;
        if (x < 2)
            return res;
        int i = 2;
        do {
            res[i] = res[i - 1] + res[i - 2];
            i++;
        }
        while (i < res.length);
        {

        }
        return res;
    }

}

