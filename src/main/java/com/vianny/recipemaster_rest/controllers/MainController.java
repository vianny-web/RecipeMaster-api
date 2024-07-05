package com.vianny.recipemaster_rest.controllers;

import com.vianny.recipemaster_rest.models.Recipe;
import com.vianny.recipemaster_rest.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {
    private final MainService mainService;
    @Autowired
    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @PostMapping("/recipe")
    public String createRecipe(@RequestBody Recipe recipe) throws Exception{
        mainService.save(recipe);
        return "Success create!";
    }

    @PutMapping("/recipe")
    public String updateRecipe(@RequestParam int id, @RequestBody Recipe recipe) throws Exception{
        mainService.update(id, recipe);
        return "Success update!";
    }

    @DeleteMapping("/recipe")
    public String updateRecipe(@RequestParam int id) throws Exception{
        mainService.delete(id);
        return "Success delete!";
    }

    @GetMapping("/getAllRecipes")
    public List<Recipe> getAllRecipes() throws Exception{
        return mainService.getAll();
    }

    @GetMapping("/getRecipe")
    public Recipe getRecipe(@RequestParam int id) throws Exception{
        return mainService.getByID(id);
    }
}
