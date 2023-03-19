package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new HashSet<>(firstSet);
        Set<String> third = new HashSet<>(thirdSet);
        set.retainAll(secondSet);
        third.removeAll(firstSet);
        third.removeAll(secondSet);
        set.addAll(third);
        return set;
    }
}