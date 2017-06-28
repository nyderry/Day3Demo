/**
 * Created by Ny Derry on 6/28/2017.
 */
public class WhileLoopInfinite {
    public static void main(String[] args) {
        while (true) {

            //this code will run endlessly

            //System.out.println("looping");

            //to break out of this loop you will want
            //to include a conditional statement
            //to break out of the loop -- you can use the
            //keyword break

            int randomNum = (int) (Math.random() * 10); //generate random # 0-10

            System.out.println(randomNum);

            if (randomNum == 7) {
                System.out.println("value is found -- exit loop!");
                break;
            }
        }
        System.out.println();
        System.out.println("Continue statement example below");

        for (int i = 0; i < 5; i++) { //will execute at least 5 times
            int randomNum2 = (int) (Math.random() * 10); //generate random #10

            if (randomNum2 > 7) {
                System.out.println("invalid number -- continue loop");
                continue;
            }
            System.out.println(randomNum2); //only executes if randomNum2 ,=7
        }
    }
}
