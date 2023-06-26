public class Find_the_Losers of_the_Circular_Game
{

    public int[] circularGameLosers(int n, int k) {
        int[] map = new int[n];
        // map[i] tracks the number of times ith member recieves the ball

        int i = 0, cnt = 1;
        while (true) {
            map[i]++;
            if (map[i] == 2)
                break; // break out of the loop whenever any member recieves the ball 2nd time, i.e.
                       // GAME_OVER
            i = (i + (cnt * k)) % n;
            cnt++; // to increase the multiple of k: k, 2*k, 3*k, 4*k, etc
        }

        int len = 0; // For storing how many members are the losers, i.e. did not recieve the ball
                     // even once
        for (int num : map)
            if (num == 0)
                len++;

        int index = 0, ans[] = new int[len];
        for (int j = 0; j < n; j++) {
            if (map[j] == 0)
                ans[index++] = j + 1;
        }
        return ans;
    }

}
