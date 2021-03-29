import java.util.Scanner;

public class Gamblersruin {
    public static void main(String[] args) {
        int win = 0, money = 0;
        double randomnumber = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Initial money:");
        int n = keyboard.nextInt();
        System.out.print("Goal:");
        int goal = keyboard.nextInt();
        System.out.print("Probability of winning in a round:");
        double p = keyboard.nextDouble();
        System.out.print("Number of times the game will be simulated:");
        int simulationtime = keyboard.nextInt();
        int counter = 0;
        money = n;
        while (counter < simulationtime) {

            while (money > 0 && money < goal) {
                randomnumber = Math.random();

                if (randomnumber <= p) {
                    money++;

                } else {
                    money--;
                }
                if (money == goal) {
                    win++;

                }


            }
            counter++;
            money = n;

        }

        System.out.println("Win:" + win);

        System.out.println("Lose:" + (simulationtime - win));

    }
}
