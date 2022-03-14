package main.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumScoreFromRemovingStones_1753 {

    public int AeqBeqC(int a){
        return a + Math.floorDiv(a, 2);
    }

    public int AlessBlessC(int a, int b, int c){
        if(a + b > c) {
            int temp = b - a;
            if (b != c) {
                return temp + AeqBlessC(a, c - temp);
            } else {
                return temp + AeqBeqC(a);
            }
        } else {
            return a + b;
        }
    }

    public int AeqBlessC(int a, int c){
        if (a + a > c) {
            int temp = (c - a) * 2;
            return temp + AeqBeqC(c - temp);
        } else {
            return a + a;
        }
    }

    public int AlessBeqC(int a, int b){
        if(a%2 == 0) {
            return b;
        } else {
            return b + Math.floorDiv(a, 2);
        }
    }

    public int maximumScore(int a, int b, int c) {
        List<Integer> temp = new ArrayList<>();
        temp.add(a);
        temp.add(b);
        temp.add(c);
        Collections.sort(temp);
        a = temp.get(0);
        b = temp.get(1);
        c = temp.get(2);

        if(a != b && b != c){
            return AlessBlessC(a, b, c);
        } else if(a != c && a == b) {
            return AeqBlessC(a, c);
        } else if(a != b){
            return AlessBeqC(a, b);
        } else {
            return AeqBeqC(a);
        }
    }
}
