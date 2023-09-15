package org.example;

public abstract class Sweet {
    private String name;
    private Double weight;
    private Double sugarWeight;

    @Override
    public String toString() {
        return "Sweet [" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sugarWeight=" + sugarWeight +
                ']';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getSugarWeight() {
        return sugarWeight;
    }

    public void setSugarWeight(Double sugarWeight) {
        this.sugarWeight = sugarWeight;
    }
}
