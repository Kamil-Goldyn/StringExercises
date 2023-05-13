public class Main {
    public static void main(String[] args) {

//        printHalfPyramid(5);
//        printPyramid(5);

    }

    //printing half of pyramid with "*" signs
    public static void printHalfPyramid(int levels) {

        for (int i = 0; i < levels; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    //printing pyramid with "*" signs
    public static void printPyramid(int levels) {

        for (int i = 0; i < levels; i++) {
            for (int j = levels-i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}