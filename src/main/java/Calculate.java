
public class Calculate {
    public static String answer(int algorithmId, int loopType, int n) {
        switch (algorithmId) {
            case 1:
                return Fibonacci.answer(loopType, n);
            case 2:
              return   Factorial.answer(loopType, n);
        }
       return "";
    }
}
