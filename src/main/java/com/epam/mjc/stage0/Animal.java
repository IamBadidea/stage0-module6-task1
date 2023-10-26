package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public static void main(String[] args) {
        System.out.println(new Animal("black", 4, true).getDescription());
    }

    public String getDescription() {
        String wordByPaws = pawToWord();
        String wordByFur = hasFurToWord();

        return String.format(
                "This animal is mostly %s. It has %d %s and %s fur.", color, numberOfPaws, wordByPaws, wordByFur);
    }

    private String pawToWord() {
        if (numberOfPaws > 1) {
            return "paws";
        }
        return "paw";
    }
    private String hasFurToWord() {
        if (hasFur) {
            return "a";
        }
        return "no";
    }
}
