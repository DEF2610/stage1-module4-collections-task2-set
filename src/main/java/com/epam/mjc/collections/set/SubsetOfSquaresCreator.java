package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new TreeSet<>();
        for (int value : sourceList) {
            if ((int) Math.pow(value, 2) >= lowerBound && (int) Math.pow(value, 2) <= upperBound) {
                set.add((int) Math.pow(value, 2));
            }
        }
        return set;
    }
}
