package com.siraj.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateInArrayList {

    public static void main(String[] args) {
        RemoveDuplicateInArrayList removeDuplicateInArrayList = new RemoveDuplicateInArrayList();
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(1,1,2,3,3,4));
        removeDuplicateInArrayList.identify(list);
    }

    public void identify(List<Integer> input){
        System.out.println("Provided Input Array Values \n" + input);
        int[] output= new int[input.size()];
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i: input) {
            hs.add(i);
        }
        System.out.println("Output Array After removing duplicates \n" + hs);
    }
}
