package homework_nr_4;

public class HomeWork4 {
    public static void main(String [] args) {
        int[] number = new int[6];
        for (int x = 1; x != 6; x++) {
            number[x] = x;
            System.out.println(number[x]);
        }
        int[] number2 = {12, 34, 56, 1245};
        double sum = 0;
        for(int index = 0; index <= 3; index++) {
            sum += number2[index];
        }
        System.out.println(sum/number2.length);

        int [][] number3 = {{435,743,54},
                            {32,353,4646,}};
        for(int x = 0; x<number3.length;x++){
            for(int i = 0; i<number3[x].length;i++){
                if (number3[x][i]%2==0){
                    System.out.println(number3[x][i]);
                }
            }
        }
    }
}
