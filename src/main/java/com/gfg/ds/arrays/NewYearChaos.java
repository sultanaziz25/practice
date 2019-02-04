package com.gfg.ds.arrays;

// https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class NewYearChaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        boolean tooChaotic = false;
        int minimumBribes = 0;

        for (int i = 0; i < q.length; i++) {
            // max allowed person at ith position is
            int maxAllowedPosition = (i + 1) + 2;
            if (q[i] > maxAllowedPosition || q[i] > q.length) {
                tooChaotic = true;
                break;
            }
            int bribeCount = q[i] - (i + 1);
            if (Math.abs(bribeCount) <= 2) {
                minimumBribes = minimumBribes + bribeCount;
            }
            /*if (bribeCount > 0) {
                minimumBribes = minimumBribes + bribeCount;
            }*/
        }

        if (tooChaotic) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(minimumBribes);
        }
    }
}

//q: 1 2 5 3 7 8 6 4

// 1 2 3 4 5 6 7 8 <- initial state
// 1 2 3 5 4 6 7 8 <- 5 is bribing
// 1 2 5 3 4 6 7 8 <- 5 is bribing
// 1 2 5 3 4 7 6 8 <- 7 is bribing
// 1 2 5 3 7 4 6 8 <- 7 is bribing
// 1 2 5 3 7 4 8 6 <- 8 is bribing
// 1 2 5 3 7 8 4 6 <- 8 is bribing
// 1 2 5 3 7 8 6 4 <- 6 is bribing


