package com.johir;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ManasaStones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt() - 1;
            int a = in.nextInt();
            int b = in.nextInt();
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            int sum = n * min;
            Set<Integer> used = new HashSet<Integer>();
            for (int j = 0; j < n; j++) {
                if (!used.contains(sum)) {
                    System.out.print(sum + " ");
                    used.add(sum);
                }
                sum -= min;
                sum += max;
            }
            if (used.contains(sum))
                System.out.println();
            else
                System.out.println(sum);
        }

	}

}
