
--yapılan işlemin function olduğunu anlamak için () varmı diye bakılır.


--SELCET STATMENT
SELECT customer_name , country FROM customers;
--customer_name ve country sütünlarını ve bilgilerini 'customers' tablosundan getirir.

SELECT * FROM customers;
-- * ALL anlamına gelir. bu durumda da cusomers tablosuna ait tüm verileri getirir.

------------------------------------

--DISTINCT STATEMENT (DISTINCT = özgün )
SELECT DISTINCT country FROM customers;
--tekrar eden değerleri (DISTINCT) değerleri döndürmek için kullanılır.yineleme olmadan özgün veri getirir.

SELECT COUNT (DISTINCT country) FROM customers; 
--kaç adet özgün(distinct) ülke oludğunu döndürür.

------------------------------------

--WHERE CLAUSE (Filtrelemek için)
SELECT * FROM customers WHERE city = 'London';
--yalnızca belirli bir koşulu sağlayan verileri getirir.
--yukarıda ki örnekte bu koşul,şehrin adını 'London' olması koşuludur.

------------------------------------

--ORDER BY (sıralamak için)
SELECT * FROM customers ORDER BY city; 
--küçükten büyüğe (doğal sıralama/artan sıralama) yapmak için kullnılır.
--hem artan hem azalan sıralama yapılabilir(ASC/DESC).

SELECT * FROM customers ORDER BY city ASC;
--(ASC) -> artan yönde sıralama (doğal sıralama).kayıtların ilgili sütunun artacapı şekilde sıralama yapar.

SELECT * FROM customers ORDER BY city DESC;
--(DESC) -> azalan yönde sıralama (reverse order).kayıtları ilgili sütunun azalacağı şekilde sıralar.

------------------------------------

--LIMIT CLAUSE
SELECT * FROM customers LIMIT 20;
-- LIMIT döndürülecek maksimum kayıt sayısını sınırlandırır.


------------------------------------

--OFFSET CLASUE
SELECT * FROM customers LIMIT 20 OFFSET 40;
--döndürülecek kayıtları seçmeye nereden başlayacağımza belirtmek için kullanılır.
---Yukarıda ki örnekte 20 kayıt döndürmek istiyoruz,
--OFFSET 40 diyerek bu 20 kayıtı 40.kayıttan sonra alıyoruz. (40 dahil değil)

------------------------------------

--MIN() and MAX() Functions
--hem sayı hem de stringlerde çalışır 
SELECT MIN(city) FROM customers;
--customers tablosunda city kolunda en düşük değeri getirir.
--bu bir sayı ise en küçük sayıyı ,
--kelime ise ASCII tablosuna göre en önde gelen kelimeyi getirir.

SELECT MAX(city) FROM customers;
--MAX() fonksiyonu maksimum değeri döndürür.

------------------------------------

--SUTUNU yeniden adlandırma.
SELECT MAX(city) AS alphabeticcall_last_city FROM customers;
--city sütununu alphabeticcall_last_city ismi ile değiştirdik

--COUNT() Function
SELECT COUNT(customer_id) FROM customers;
--COUNT() Functiyonu belirtilen ölçütle eşleşen sayısını döndürür.
--NOT: NULL değerleri saymaz.

SELECT COUNT(customer_id) FROM customers WHERE city = 'London';
--şehri London olanların adetini getir.

------------------------------------

--SUM() Function
SELECT SUM (customer_id) FROM customers;
--kayıtların belirtilen sütuna ait olan değerlerini toplar ve sonucu döner.

--AVG() Function
SELECT AVG(customer_id) FROM customers;
--kayıtların belirtilen sütuna ait olan değerleri ortalamsını döner.

--IN Operatoru
SELECT * FROM customers WHERE country IN ('Germany','France','UK');
--IN operatörü WHERE clause'undaki olması değerlerin bir listesini belirtmemize olanak tanır.
--IN operatöru birden fazla OR koşulunun kısaltılmasıdır.
-- yukarıda ki örnekteki durum; 'Germany' , 'France' , 'UK' de olan tüm müşterileri getir.

SELECT * FROM customers WHERE country NOT IN ('Germany','France','UK');
--IN operatörünün önüne NOT keyword'kullanarak.
--listedeki değerlerden herhangi biri değil(NOT) olan tüm kayıtları döndürürsünüz.
--Yukarıda ki örnekteki durum; 'Germany','France'yada 'UK' OLMAYAN tüm müşterileri getir.

--IN(SELECT)
SELECT * FROM customers WHERE customer_id IN(1,2,3,4);
--tabloda ki customer_id si 1,2,3,4 olan değerleri döndür demek.

SELECT * FROM customers WHERE customer_id IN(SELECT customer_id FROM orders);
--daha önce sipariş vermiş olan kullanıcıları getirir.
--önce orders tablosuna gider ve her bir sipariş için customer_id'leri toplar ve bir liste(tablo) halinde geitirir.
--onda sonra bu listede ki id'leri customers tablosunda ki idler ile eşleştirir,
--eşleşen sonuçları birer customer olarak yazar.


SELECT * FROM customers WHERE customer_id NOT IN(SELECT customer_id FROM orders);
--daha önce sipariş vermemiş kullanıcıları getirecek.

------------------------------------

--BETWEEN operatoru
SELECT * FROM customers WHERE customer_id BETWEEN 10 AND 15;
--BETWEEN operatörü belirli bir aralıktaki değerleri seçer.Değerler sayı, metin ya da tarih olabilir.
--BETWEEN operatöru kapsayıcıdır. Başlangıç ve bitiş değerleri dahildir.

SELECT * FROM customers WHERE city BETWEEN 'A' AND 'E';
--BETWEEN operatörü belirli bir aralıktaki değerleri seçer.Değerler sayı, metin ya da tarih olabilir.
--BETWEEN operatöru kapsayıcıdır. 
--metin karşılaştırmalarında son değeri dahil etmez.

SELECT * FROM customers 
WHERE country BETWEEN 'Austria' AND 'UK';
--country'si Austria il UK arasında olan bütün customerları döndürür.

--ORDER BY CLAUSE 
SELECT * FROM customers 
WHERE country BETWEEN 'Austria' AND 'UK'
ORDER BY country;
--country'si Austria ve UK arasında olan bütün kullanıcıları,ülkeleri baz alarak sıralamaya sokar ve döndürür.

------------------------------------

--Aliases(takma isim)
SELECT customer_id AS id FROM customers;
--burada ki id anaktar kelimedir.
--SQL aliases bir tabloya veya tabloda ki bir sütuna geçici bir ad vermek için kullanılır.
--genellikle sütün adlarını daha okunaklı hale getirmek için kullanılır.
--bir allias yalnızca söz konusu sorgu süresince geçerlidir.
--AS anahtar sözcüğü ile oluşturulur.


------------------------------------







