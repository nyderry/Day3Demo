/**
 * Created by Ny Derry on 6/28/2017.
 */
public class DowhileLoopEx {
    public static void main(String[] args) {
        int i = 1;
        int month = 36;
        double futureValue = 0;//automatically to double
        double monthlyPmt = 330.63;
        double interestRate = 5.99/100; //5.99%

        do {
            futureValue = (futureValue + monthlyPmt) * (1 + interestRate);
            1++;

        }  while (i <= month);

        System.out.println(futureValue);

    }
}
