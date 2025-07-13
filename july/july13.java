//https://leetcode.com/problems/maximum-matching-of-players-with-trainers/?envType=daily-question&envId=2025-07-13
import java.util.Arrays;

public class july13 {

    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int ans = 0;
        int j = 0;
        for (int i = 0; i < players.length; i++) {
            while (j < trainers.length) {
                if (players[i] <= trainers[j]) {
                    ans++;
                    j++;
                    break;
                }
                j++;
            }
        }
        return ans;
    }
}
