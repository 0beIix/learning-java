import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        float total = 0;
        float nonContTotal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("People contributing: ");
        int contributing = scanner.nextByte();
        float[] costs = new float [contributing];
        float[] owed = new float [contributing];
        System.out.print("People participating: ");
        int participating = scanner.nextByte();
        int notContributing = participating - contributing;
        //cycle through contributers to colect prices 
        for (int i = 0; i < contributing; i++){
            System.out.print("Enter price payed be person " + (i+1) + ": ");
            float price = scanner.nextFloat();
            costs[i] = price;
            total += price;
        }
        System.out.println("\nTotal cost: " + total);
        System.out.println("\n\n\t Cost organizer - owed \n");
        float totalSharedCost = total/participating;
        for (int i = 0; i < contributing; i++){
            System.out.print("Person " + (i+1) + " payed " + costs[i]);
            owed[i] = costs[i] - totalSharedCost;
            System.out.println(" is owed " + owed[i]);
        }
        System.out.println("\n\nShared cost per person: " + totalSharedCost);
        nonContTotal = totalSharedCost * notContributing;
        System.out.println("Total non contributing: " + nonContTotal);
        System.out.println("Each non contributer pays person 1: " + totalSharedCost);
        System.out.println("This adds up to: " + nonContTotal);
        System.out.println("\nP1 pays P2: " + owed[1]);
        nonContTotal -= owed[1];
        System.out.println("P1 pays P3: " + owed[2]);
        nonContTotal -= owed[2];
        System.out.println("This leaves P1 with: " + nonContTotal);
        scanner.close();
    }
}
