package com.vianny.recipemaster_rest.services;

import com.vianny.recipemaster_rest.mapper.RecipeRowMapper;
import com.vianny.recipemaster_rest.models.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public MainService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Recipe recipe) {
        String query = "INSERT INTO recipes (title, ingredients, instruction, created_at) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(query, recipe.getTitle(), recipe.getIngredients(), recipe.getInstruction(), recipe.getCreated_at());
    }

    public void update(int id, Recipe recipe) {
        String query = "UPDATE recipes SET title = ?, ingredients = ?, instruction = ? WHERE id = ?";
        jdbcTemplate.update(query, recipe.getTitle(), recipe.getIngredients(), recipe.getInstruction(), id);
    }

    public void delete(int id) {
        String query = "DELETE from recipes WHERE id = ?";
        jdbcTemplate.update(query, id);
    }

    public List<Recipe> getAll() {
        String query = "SELECT * from recipes";
        return jdbcTemplate.query(query, new RecipeRowMapper());
    }

    public Recipe getByID(int id) {
        String query = "SELECT * from recipes WHERE id = ?";
        return jdbcTemplate.queryForObject(query, new RecipeRowMapper(), id);
    }
}
