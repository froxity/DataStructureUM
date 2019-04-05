package lab7;

/**
 *
 * @author wic180001
 */
import java.util.*;

public class Q5Main {

    static MyStack<String> twrA = new MyStack<>();
    static MyStack<String> twrB = new MyStack<>();
    static MyStack<String> twrC = new MyStack<>();
    static ArrayList<String> tempA = new ArrayList<>();
    static ArrayList<String> tempB = new ArrayList<>();
    static ArrayList<String> tempC = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Create 3 tower A,B,C
        //Stack<String> twr = new Stack<>();

        //User input for size of Tower
        System.out.print("Enter the size of 1st Tower(A): ");
        int size = input.nextInt();

        insertFirstTower(size);
        PrintTower();
        while (!(twrA.isEmpty() && twrB.isEmpty())) {
            ArrangeBlockEven();
            PrintTower();
        }
        //System.out.println(twrA.getSize()); //debug
        //System.out.println(twrA.toString());

    }

    public static void insertFirstTower(int size) {
        //pushing big size until habis to tower A
        for (int i = size; i >= 1; i--) {
            String block = "";
            for (int j = i; j >= 1; j--) {
                block = block + "#";
            }
            //System.out.println(block); //debug
            twrA.push(block);
        }

    }

    public static void PrintTower() {
        System.out.println("Tower A");
        PrintTowerA();
        System.out.println("Tower B");
        PrintTowerB();
        System.out.println("Tower C");
        PrintTowerC();
    }

    public static void PrintTowerA() {
        //print tower A process
        int loop = twrA.getSize();
        for (int i = 0; i < loop; i++) {
            String element = twrA.pop();
            System.out.println(element);
            tempA.add(element);
        }

        //System.out.println(tempA.size()); //debug
        //push back original after printing 
        for (int i = tempA.size() - 1; i >= 0; i--) {
            twrA.push(tempA.get(i));
        }
    }

    public static void PrintTowerB() {
        //print tower B process
        int loop = twrB.getSize();
        for (int i = 0; i < loop; i++) {
            String element = twrB.pop();
            System.out.println(element);
            tempB.add(element);
        }

        //System.out.println(tempA.size()); //debug
        //push back original after printing 
        for (int i = tempB.size() - 1; i >= 0; i--) {
            twrB.push(tempB.get(i));
        }
    }

    public static void PrintTowerC() {
        //print tower B process
        int loop = twrC.getSize();
        for (int i = 0; i < loop; i++) {
            String element = twrC.pop();
            System.out.println(element);
            tempC.add(element);
        }

        //System.out.println(tempA.size()); //debug
        //push back original after printing 
        for (int i = tempC.size() - 1; i >= 0; i--) {
            twrC.push(tempC.get(i));
        }
    }

    public static void ArrangeBlockEven() {
        twrB.push(twrA.pop());
        twrC.push(twrA.pop());
        twrC.push(twrB.pop());
    }
}
