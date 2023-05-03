package homework_nr_2;

public class homework_2 {
    public static void main(String[] args) {
        int month = 6;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }

        System.out.println();

        for (int a = 100; a <= 1000; a++)
            if (a % 5 == 0) {
                System.out.println(a);
            }

        System.out.println();


        float a = 0;
        for (float i = 1; i <= 97; i += 2) {
            a += i / (i + 2);
        }
        System.out.println(a);

        System.out.println();


        for (int r = 0; r != 9; r++) {
            for (int e = 0; e != r; e++)
                System.out.print("*");
            System.out.println("*"); }

        String A = "";
        char star = '*';
        for (int i = 1; i <= 9; i++){
            A += star;
            System.out.println(A);
        }
    }

}


