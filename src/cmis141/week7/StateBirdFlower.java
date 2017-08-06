package cmis141.week7;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class StateBirdFlower {
    private static StateBirdFlower statesList = new StateBirdFlower();
    // create Map and class objects for later use
    private Map<String, String[]> statesHash = new HashMap<>();

    private StateBirdFlower() {
        // no-argument constructor
        //                                         Bird                       Flower              Tree
        statesHash.put("alabama", new String[]{"Yellowhammer", "Camellia", "Southern Pine"});
        statesHash.put("california", new String[]{"California Valley Quail", "Golden Poppy", "California Redwood"});
        statesHash.put("delaware", new String[]{"Blue Hen Chicken", "Peach Blossom", "American Holly"});
        statesHash.put("maryland", new String[]{"Baltimore Oriole", "Black Eyed Susan", "White Oak"});
    }

    public static void main(String[] args) {
        // introduction message
        System.out.println("Please enter a state name to retrieve the state bird, flower, and tree.");

        // run main while loop
        statesList.mainPrompt(new String[]{"maryland", "California"});
        System.out.println("Thank you for playing.");

    } // end main

    // return bird value
    private String getBird(String state) {
        return statesHash.get(state)[0];
    }

    // return flower value
    private String getFlower(String state) {
        return statesHash.get(state)[1];
    }

    // return tree value
    private String getTree(String state) {
        return statesHash.get(state)[2];
    }

    // main menu. Ask user for state name until "None" is entered.
    private void mainPrompt(String args[]) {
        // create a scanner for user input
        Scanner input = new Scanner(System.in);
        String response;

        while (true) {
            // request a state name and
            System.out.print("Enter a state name: ");
            response = input.next().toLowerCase();

            // if response is none, exit
            if (Objects.equals(response, "none")) break;

            // if response is not in hash, start over
            if (!statesHash.containsKey(response)) {
                System.out.println("Please limit your responses to valid state names or None.");
                continue;
            }

            // print bird, flower, and tee
            System.out.println("Bird: " + statesList.getBird(response));
            System.out.println("Flower: " + statesList.getFlower(response));
            System.out.println("Tree: " + statesList.getTree(response));
        }
        input.close();
    }
}// end class
