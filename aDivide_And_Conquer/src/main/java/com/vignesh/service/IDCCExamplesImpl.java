package com.vignesh.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDCCExamplesImpl implements IDCCExamples {
    public List<Integer> findMinMax(List<Integer> arrayList) {
        //Brute force approach to find Minimum and Maximum elements in given Array List
        int minElement = arrayList.get(0);
        int maxElement = arrayList.get(0);
        for(Integer element : arrayList) {
            if(element < minElement) {
                minElement = element;
            }
            else if(element > maxElement) {
                maxElement = element;
            }
        }
        return List.of(minElement, maxElement);
    }
}
