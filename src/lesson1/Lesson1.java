package lesson1;

public class Lesson1 {
    public static void printMyMessage(int i, double d) {
        System.out.print("Int ->" + i);
        System.out.println();
        System.out.print("Double ->" + d);
    }

    public static int getSum(int a, int b) {
        System.out.println("a+b=" + a + b);
        return a + b;
    }

    public static void getClosest100(double m, double n) {
        double mDelta = Math.abs(100 - m);
        double nDelta = Math.abs(100 - n);
        if (mDelta == nDelta) {
            System.out.println("Equally");
        } else if (mDelta > nDelta) {
            System.out.println("n is closest");
        } else {
            System.out.println("m is closest");
        }
    }

    public static boolean isEven(int a) {
        int rest = a % 2;
        boolean result = rest == 0;
        if (result) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        return result;
    }

    public static void checkRandomIntervalNonOpt() {
        double randomOrigin = Math.random();
        int random = (int) (randomOrigin * 150 + 5);

        if (random <= 25) {
            System.out.println("Ne popal " + random);
        } else if (random > 100) {
            System.out.println("Ne popal " + random);
        } else {
            System.out.println("Popal " + random);
        }
    }

    //                                            5      155
    public static int getRandomFromInterval(int from, int to) {
        //[5 .. 155]
        int start = to - from;//150
        int end = from;//5
        return (int) (Math.random() * start + end);
    }

    public static void checkRandomInterval(int intFrom, int intTo,
                                           int randFrom, int randTo) {
        //double randomOrigin = Math.random();
        //int random = (int) (randomOrigin * 150 + 5);
        int random = getRandomFromInterval(randFrom, randTo);
        if (random > intFrom & random <= intTo) {
            System.out.println("Popal " + random);
        } else {
            System.out.println("Ne popal " + random);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 8};
        //System.out.println(array.length);
        //System.out.println(array[3]);

        for (int i = 0;       i < array.length;        i ++) {
            System.out.print(array[i] + "   ");
        }
        System.out.println();
        System.out.println("Reverse:");

        //printArrayInReverseOrder(array);


        //boolean[] arrayB = {true, false, true};


        //checkRandomInterval(100, 1000, 10, 500);


        //int rand = getRandomFromInterval(5, 155);
        //checkRandomIntervalNonOpt();
        //getClosest100(100, 140);
        //isEven(3);
        //isEven(100009990);

        //System.out.println((int) (Math.random() * 3) + 1);


















        /*printMyMessage(4, 4);
        int sum = getSum(77, 23);

        if (true) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }*/
    }
}
