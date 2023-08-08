import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("People contributing:");
        int contributing = scanner.nextByte();
        int[] costs = new int [contributing];
        System.out.print("People participating:");
        int participating = scanner.nextByte();
        for (int i = 0; i < contributing; i++){
            System.out.print("Enter price payed be person " + (i+1) + ": ");
            int price = scanner.nextByte();
            costs[i] = price;
            total += price;
            System.out.println(total);
        }
        int totalCost = total/participating;
        System.out.println(totalCost);
        for (int i = 0; i < contributing; i++){
            System.out.println("Person " + (i+1) + " payed " + costs[i]);
        }
    }
}
