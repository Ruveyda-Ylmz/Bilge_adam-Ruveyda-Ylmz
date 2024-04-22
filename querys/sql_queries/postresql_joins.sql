--JOIN işlemi
SELECT product_id ,product_name,category_name
FROM products
INNER JOIN categories ON products.category_id = categories.category_id;
--

SELECT product_id ,product_name,category_name
FROM products AS p
INNER JOIN categories AS c ON p.category_id = c.category_id;
--product'daki category_id ile categories'teki category_id  arsında eşleşen veriler için;
--product'tan product_id ve product_name ,categories'den category_name sütununu birleştirir ve kayıtları döner.

SELECT testproduct_id ,product_name,category_name
FROM testproducts AS t
INNER JOIN categories AS c ON t.category_id = c.category_id;

SELECT * FROM products;