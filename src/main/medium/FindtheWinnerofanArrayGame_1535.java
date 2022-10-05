package main.medium;

public class FindtheWinnerofanArrayGame_1535 {
    /**
     * I've got a couple of ideas but everything related to removing and adding to the end of the array seemed super
     * slow and not really efficient, so I decided to rethink my approach. Considering, the array doesn't change,
     * it just rotates, there is no way where, if we roll through the whole array without reaching the goal -
     * result won't be just the highest number so, essentially the solution I ended up with was to find the highest number,
     * while counting current wins for one rotation of the array. If we find the winner - it's the one getting returned,
     * if not - we just return the highest value in the array.
     */

    public int getWinner(int[] arr, int k) {
        int curr = arr[0];
        int won = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > curr) {
                curr = arr[i];
                won = 0;
            }
            if (++won >= k) {
                return curr;
            }
        }
        return curr;
    }
}
