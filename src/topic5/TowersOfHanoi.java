package topic5;

/**
 * Towers of Hanoi
 * Pole are labeled 1, 2,3
 * Each disk is also labeled 1 to numberOfDisks
 * @author Frank Walsh
 *
 */
public class TowersOfHanoi {
        public static void move(int numberOfDisks, int startPole, int tempPole, int endPole) {
                if (numberOfDisks> 0){  
                move(numberOfDisks-1, startPole, endPole, tempPole);
                System.out.println("Move " +numberOfDisks + " from " + startPole + " to " +endPole);
                move(numberOfDisks-1, tempPole, startPole, endPole);
                }
        }

        public static void main(String[] args) {
                move(3, 1, 2, 3);
        }


}