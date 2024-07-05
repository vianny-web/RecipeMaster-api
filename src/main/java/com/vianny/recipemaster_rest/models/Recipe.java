package com.vianny.recipemaster_rest.models;

import java.time.LocalDate;

public class Recipe {
    private Long id;
    private String title;
    private String ingredients;
    private String instruction;
    private final LocalDate created_at = LocalDate.now();

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

}
