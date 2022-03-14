package main.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SearchSuggestionsSystem_1268 {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<String> productsSorted = new ArrayList<>(List.of(products));
        List<List<String>> solution = new ArrayList<>();

        Collections.sort(productsSorted);
        StringBuilder currentSearchWord = new StringBuilder();
        for(int i = 0; i < searchWord.length(); i++){
            currentSearchWord.append(searchWord.charAt(i));
            productsSorted = productsSorted.stream()
                    .filter(x -> x.startsWith(currentSearchWord.toString()))
                    .collect(Collectors.toList());
            solution.add(
                    productsSorted.stream()
                            .filter(x -> x.startsWith(currentSearchWord.toString()))
                            .limit(3)
                            .collect(Collectors.toList()));
        }
        return solution;
    }
}
