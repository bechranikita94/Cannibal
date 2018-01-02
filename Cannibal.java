import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Class Cannibal Starts
public class Cannibal {

    // Main Method Start
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();      // Input number of numbers to be entered
        int q = scanner.nextInt();      // Input number of queries to be entered
        Set<Integer> numberSet = new HashSet<>();
        for (int i=0; i<n; i++) {
            numberSet.add(scanner.nextInt());       // Input Numbers
        }

        ArrayList<Integer> numbers = new ArrayList<>(numberSet);
        Collections.sort(numbers);      // Sorts numbers into descending order
        for (int i=0; i<q; i++) {
            int count = 0;
            int query = scanner.nextInt();      // Input query number
            for (int j=0; j<numbers.size(); j++) {
                if (numbers.get(j) < query) {
                    int tempdiff = query - numbers.get(j);
                    if (tempdiff <= j) {
                        count++;
                    }
                }
                else {
                    count = count + numbers.size() - j;
                    break;
                }
            }
            System.out.print(count + " ");
        }
        System.out.println();
    }   // Main Method Ends
}   // Class Cannibal Ends