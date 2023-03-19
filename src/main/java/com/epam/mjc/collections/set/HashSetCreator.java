package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> integerHashSet = new HashSet<>();
        for (int value : sourceList) {
            if (value % 2 == 0) {
                while (value % 2 == 0) {
                    integerHashSet.add(value);
                    value /= 2;
                }
                integerHashSet.add(value);
            } else {
                integerHashSet.add(value);
                integerHashSet.add(value * 2);
            }
        }
        return integerHashSet;
    }
}
