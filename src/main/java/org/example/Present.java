package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Present {
    List<Sweet> sweets;
    public Present(){
        sweets=new ArrayList<>();
    }

    public boolean addSweet(Sweet sweet){
        try {
            sweets.add(sweet);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public Double calculateTotalWeight(){
        Double totalWeight = (double) 0;
        for(Sweet sweet:sweets) totalWeight += sweet.getWeight();
        return totalWeight;
    }

    public List<Sweet> filterBySugarRange(Double minSugar,Double maxSugar){
        return sweets.stream().filter(o-> o.getSugarWeight() >= minSugar &&o.getSugarWeight()<=maxSugar).collect(Collectors.toList());
    }
    public List<Sweet> getAllSweets(){
        return sweets;
    }
}
