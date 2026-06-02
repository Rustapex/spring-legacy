package com.acorn.day2.quiz;
public class OpenAiModel {

    String name;
    String personality;

    int inputPrice;
    int cachedInputPrice;
    int outputPrice;

    public OpenAiModel(String name, String personality,
                       int inputPrice, int cachedInputPrice, int outputPrice) {

        this.name = name;
        this.personality = personality;
        this.inputPrice = inputPrice;
        this.cachedInputPrice = cachedInputPrice;
        this.outputPrice = outputPrice;
    }

    @Override
    public String toString() {

        return name + " / " + personality
                + " / input: $" + inputPrice
                + " / cached: $" + cachedInputPrice
                + " / output: $" + outputPrice;
    }
}