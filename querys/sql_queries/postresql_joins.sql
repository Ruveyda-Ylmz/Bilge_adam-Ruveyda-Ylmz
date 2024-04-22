--INNER JOIN işlemi
SELECT product_id ,product_name,category_name
FROM products
INNER JOIN categories ON products.category_id = categories.category_id;

SELECT product_id ,product_name,category_name
FROM products AS p
INNER JOIN categories AS c ON p.category_id = c.category_id;
--product'daki category_id ile categories'teki category_id  arsında eşleşen veriler için;
--product'tan product_id ve product_name ,categories'den category_name sütununu birleştirir ve kayıtları döner.
--JOIN ve INNER JOIN aynı sonucu verir.INNER,JOIN için varsayılan(default) birleştirme türüdür.

SELECT testproduct_id ,product_name,category_name
FROM testproducts AS t
INNER JOIN categories AS c ON t.category_id = c.category_id;

SELECT * FROM products;

--INNER JOIN :her iki tabloda da eşleşen değerlere sahip kayıtları döndürür.
--LEFT JOIN :solda ki tabloda ki tüm kayıtları, sağdaki tablodaki eşleşen kayıtları döndür. 
--RIGHT JOIN:sağdaki tabloda ki tüm kayıtları,soldaki tablodaki eşleşen kayıtları döndür.
--FULL JOIN :sol ve sağ tabloda eşleşme olduğunda tüm kayıtları döndür.

------
--LEFT JOIN
SELECT testproduct_id ,product_name,category_name
FROM testproducts AS t
LEFT JOIN categories AS c ON t.category_id = c.category_id;
--LEFT JOINUI kullanarak ,catagories tablosuylaeşleşmeyenler de dahil olamk üzere(category_id) testproducts'dan
--tüm kayıtları aldık.
--LEFT OUTER ve LEFT JOIN aynı sonucu verecektir.OUTER,LEFT JOIN için varsayılan birleştirme türüdür.


--RIGHT JOIN
SELECT testproduct_id ,product_name,category_name
FROM testproducts AS t
RIGHT JOIN categories AS c ON t.category_id = c.category_id;
--RIGHT JOIN sağ tablodan TÜM kayıtları,
--ve sol tablodan eşleşen kayıtları seçer.
--RIGHT OUTER JOIN ve RIGHT JOIN aynı sonucu verecektir.OUTER, RIGHT JOIN  için de varsayılan birleştirme türü

--FULL JOIN
SELECT testproduct_id ,product_name,category_name
FROM testproducts AS t
FULL JOIN categories AS c ON t.category_id = c.category_id;
--FULL JOIN eşleşme olmasa bile her iki tabloda ki tüm kayıtları getirir.eşleşen satırlar için 
--her iki tablodaki değerler de mevcuttur.eşleşme yoksa boş olanlar null gelir.

--CROSS JOIN
--CROSS JOIN keyword'ü ,"sol" tabloda ki tüm kayıtları "sağ" tabloda ki HER KAYITLA eşleştirir.
SELECT testproduct_id ,product_name,category_name
FROM testproducts 
CROSS JOIN categories;

--UNION
--UNION operatörü iki veya daha fazla sorgunun(query) sonuç kümesini birleştirmekiçin kullanılır.
--birleşimde ki sorgular şu kurallara uymalıdır.
  --1 aynı sayıda sütuna sahip olmalrı gerekir.
  --2 sütünlar aynı veri türüne sahip olmalıdır.
  --3 sütünlar aynı sırada olmalıdır.
  
--UNION ile yapılınca özgün veri gelir.
SELECT product_id,product_name,category_id
FROM products
UNION 
SELECT testproduct_id,product_name,category_id
FROM testproducts
ORDER BY product_id;

--UNUION ile yapınca tekrar eden veriler gelir.
--UNION İLE YAPILINCA TEKRAR EDEN VERİLER DE GELİR.
SELECT product_id
FROM products
UNION ALL
SELECT testproduct_id
FROM testproducts
ORDER BY product_id;

--GROUP BY CLAUSE
--GROUP BY genellikle sonuç kümesini bir arada veya daha fazla sütüna göre gruplandırmak için
  --COUNT() ,MAX(), MIN(), SUM(), AVG() gibi bir arada toplama (aggregate) işlevleriyle birlikte kullanılır.
SELECT COUNT (customer_id),country
FROM customers
GROUP BY country;

--GROUP BY with JOIN
SELECT c.contact_name ,COUNT(o.order_id)
FROM orders o
LEFT JOIN customers c ON o.customer_id =c.cutomer_id
GROUP BY c.contact_name;
--order tablosunda her bir order'a ait bir bir customer_id bulunmakta.
--customer tablosunda da yine her customer'ın bir customer_id'si bulunmakt.
--order tablosunda her bir order için customer 'id' ye bakıyor ve COUN'a ekliyor.
--sonrasında customer tablosunda  ilgili customer_id ye denk gelen contact_name ile
--grupluyor ve order adedini veriyor.
--order tablom yok hocadan al.


--HAVING CLAUSE
--HAVING clause SQL'e eklendi çünkü WHERE clause toplama(aggregate) işleviyle kullanılmıyor.
--Aggregate işlemleri genellikle GROUP BY clause'ları ile kullanılır.
--HAVING ekleyerek WHERE'de yaptığımız gibi koşullar yazılabilir.
SELECT COUNT (customer_id),country
FROM customers
GROUP BY country
HAVING COUNT (customer_id)>5;

SELECT orders_id,SUM(product_price) 
FROM orders
LEFT JOIN products ON orders.product_id = products.producut_id
GROUP BY order_id
HAVING SUM (products.price)>23.25;
---
--EXISTS
--EXISTS operatöru bir alt sorguda herhangi bir kaydın varlığını test etmek için kullanılır.
--ALT sorgu bir veya birden fazla kayıt döndürürse EXISTIS operatörü  TRUE  değerini döndürür.
SELECT customers.customer_name
FROM customers
WHERE EXISTS(
  SELECT order_id
  FROM orders
  WHERE customer_id = customer_id
);
--orders tablosu yok

--NOT EXISTS
--EXISTS operatörünü tam ters işlevde çalıştırır.
--Alt sorguda verilen koşulları karşılayan kayıtlar hariç, bütün kayıtları döndürür.
SELECT  customers.customer_name
FROM customers
WHERE NOT EXITSTS (
    SELECT order_id
	FROM ordes
	WHERE customer_id = customers.customer_id
);

CREATE TABLE IF NOT EXISTS employess(
    employess_id INT PRIMARY KEY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	department VARCHAR(50),
	hire_date DATE
 );
 
 --ANY opeatörü
 --ANY operatörü ,tek bir sütün değeri ile diğer değerler aralığı arasında karşılaştırma yapmamızı sağlar.
 --sonuç olarak bir Boolean değeri döndürür.
 --Alt sorgu deeğrlerinden HERHANGİ BİRİ koşulu karşılıyorsa True değerini döndürür.
 --Herhangi (ANY),işlemin aralıktaki değerlerden herhangi biri için True olması durumunda
   --koşulun doğru olacağı anlamına gelir.
SELECT product_name
FROM product
WHERE product_id = ANY(
SELECT product_id
	FROM orders
	WHERE quantity >100;
);
   
   











