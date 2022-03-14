package main;

import main.medium.FindtheKthLargestIntegerintheArray_1985;
import main.medium.MaximumScoreFromRemovingStones_1753;
import main.medium.SearchSuggestionsSystem_1268;

public class Program {
    public static void main(String[] args) {

        SearchSuggestionsSystem_1268 task = new SearchSuggestionsSystem_1268();
        System.out.println(
                task.suggestedProducts(new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"},
                        "mouse")
        );

        MaximumScoreFromRemovingStones_1753 task2 = new MaximumScoreFromRemovingStones_1753();
        System.out.println(
                task2.maximumScore(5,5,8)
        );

        FindtheKthLargestIntegerintheArray_1985 task3 = new FindtheKthLargestIntegerintheArray_1985();
        System.out.println(
                task3.kthLargestNumber(
                        new String[]{"3", "6", "7", "10"},4)
        );
    }
}
