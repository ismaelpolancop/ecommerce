INSERT INTO products (name, price, description)
SELECT 'Product 1', 100.0, 'Description 1'
WHERE NOT EXISTS (
    SELECT 1 FROM products WHERE name = 'Product 1'
);

INSERT INTO products (name, price, description)
SELECT 'Product 2', 200.0, 'Description 2'
WHERE NOT EXISTS (
    SELECT 1 FROM products WHERE name = 'Product 2'
);