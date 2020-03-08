package com.nexxie1.gmail;

import java.util.*;
import java.util.stream.IntStream;

public class ExistingPairs {
  /**
   * Complexity O(n^2)
   *
   * @param input - number's array
   * @param sum   - given sum
   * @return - number's array with all existing pairs.
   */
  public static List<Integer> firstTask(int[] input, int sum) {
    final List<Integer> allPairs= new ArrayList<>();
    IntStream.range(0, input.length).forEach(i ->
            IntStream.range(0, input.length)
                    .filter(j -> i != j && input[i] + input[j] == sum)
                    .forEach(j -> allPairs.add(input[i]))

    );
    System.out.println("Array :" + Arrays.toString(input));
    System.out.println("Answer :"+ allPairs);
    return allPairs;
  }

  public void secondTask(int[] input, int sum) {

    Arrays.sort(input);
    int first = 0;
    int last = input.length - 1;

    while (first < last) {
      int s = input[first] + input[last];
      if (s == sum) {
        System.out.println("Array :" + Arrays.toString(input));
        System.out.println("Answer :"+ input[first] + " " + input[last]);
        first++;
        last--;
      } else {
        if (s < sum) first++;
        else last--;
      }
    }
  }

}

