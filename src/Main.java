public class Main {

    public static void main(String[] args) {

        switchEx('C');

    }
    public static void switchEx(char x) {

        switch (Character.toLowerCase(x)) {
            case 'a': case 'b': case 'c': case 'd': case 'e':
                System.out.println("Value of char is " + x);
                break;
//            case 'A': case 'B': case 'C': case 'D': case 'E':
//                System.out.println("Value of char is " + x);
//                break;
            default:
                System.out.println("Value not found");
                break;
        }
    }
}
