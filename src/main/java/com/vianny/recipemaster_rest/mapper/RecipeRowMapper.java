package com.vianny.recipemaster_rest.mapper;

import com.vianny.recipemaster_rest.models.Recipe;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RecipeRowMapper implements RowMapper<Recipe> {

    @Override
    public Recipe mapRow(ResultSet rs, int rowNum) throws SQLException {
        Recipe recipe = new Recipe();
        recipe.setId(rs.getLong("id"));
        recipe.setTitle(rs.getString("title"));
        recipe.setIngredients(rs.getString("ingredients"));
        recipe.setInstruction(rs.getString("instruction"));
        return recipe;
    }
}
