package com.cooksys.ftd.assignments.collections;

import java.util.HashSet;
import java.util.Set;

public class Main {

    /**
     * TODO [OPTIONAL]: Students may use this main method to manually test their code. They can instantiate Employees
     *  and an OrgChart here and test that the various methods they've implemented work as expected. This class and
     *  method are purely for scratch work, and will not be graded.
     */
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);

        System.out.println(set.contains(1));
    }

}
