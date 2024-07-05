CREATE TABLE recipes (
    id SERIAL PRIMARY KEY,
    title text,
    ingredients text,
    instruction text,
    created_at TIMESTAMP
);