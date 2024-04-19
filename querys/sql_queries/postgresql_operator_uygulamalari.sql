--tabloya veri kaydı gerçekleştirme
--Syntax su şekilde olucak -> INSERT INTO tabloAdi (Tablonun fieldları(kolon isimleri))
                           --VALUES (kollon veri türüne denk gelen verileri doldurur.)

INSERT INTO cars(brand,model,year) --SQL de string çift tırnak ("") ile değil , --tek tırnak ('') ile yazılır
VALUES
('Ferrai','Enzo',2002),
('Nissan','R34',1999),
('Nisan','Silvia',1999),
('Cobra','Shebly',1962),
('Aston Martin','DB ',2013),
('Ford','Ranger',2000);



SELECT * FROM cars;

SELECT * FROM cars
WHERE brand = 'Nissan'; --marksı nisan olanı getir.

SELECT * FROM cars
WHERE year < 1999; --yılı 1975 den küçük olanları getir.

SELECT * FROM cars
WHERE year > 1999; --yılı 1975 den büyük olanları getir.

SELECT * FROM cars
WHERE year <= 1999; --yılı 1975 den küçük eşit olanları getir.

SELECT * FROM cars
WHERE year >= 1999; --yılı 1975 den büyük eşit olanları getir.


SELECT * FROM cars
WHERE  brand <> 'Cobra' ; --markası Cobra olmayanları getir.

SELECT * FROM cars
WHERE  brand != 'Cobra' ; --markası Cobra olmayanları getir (YUKATIDA Kİ İLE AYNI İŞE YAPAR).

SELECT * FROM cars
WHERE model LIKE 'R%'; --Modeli 'R' ile başlayanları getir.
                      --% işareti sıfır,bir veya birden fazla karakter temsil eden wildcar dır.
					  

SELECT * FROM cars
WHERE model LIKE 'R3%';	--modeli R3 ile başlayanları getirir.	


SELECT * FROM cars
WHERE model LIKE '%r'; --modelin sonu r ile bitenleri getir demek.

SELECT * FROM cars
WHERE brand LIKE '%a%'; --marksının içinde a harfi geçenleri getir demk.


SELECT * FROM cars
WHERE brand LIKE '%ra%'; --marka da içinde sonunda başında ra harfi olnlar getir.

--Widcard karakteri tek bir karakteri temsil eder.Herhangi bir karakter veya sayı olabilir.
SELECT * FROM cars
WHERE brand LIKE 'F--ra-i';
--Markası F ile başlayan ardından iki adet wildcard karakter alan (--),
--ardından 'ra' ve ardından yine bir wildcard karakter(-) alan markayı getir demek.


--Birden fazla koşulu kontrol etmek istediğimizde AND operatoru kullanılır.
SELECT * FROM cars
WHERE brand = 'Nisan'
AND model ='Silvia'; --markası 'Nisan' ve modeli 'Silvia' olan kayıtları  döndürür. 

--Birden fazla koşuldan herhangi biri doğruluğunu kontrol etmke için OR operotorunu kullanır.
SELECT * FROM cars
WHERE brand = 'Nisan'
OR model ='Enzo'; --markası 'Nisan' ve modeli 'Enzo' olan kayıtları  döndürür. 


-- IN operatörü, bir sütunun değeri listedeki değerlerden herhangi 
-- biriyle/birileriyle eşleştiğinde kullanılır. Bir liste verileceği zaman çok kullanışlıdır.
SELECT * FROM cars 
WHERE brand IN ('Nissan','Aston Martin','Ford');

--Between matematiksel karşılaştırmada kullanılır.
SELECT * FROM cars 
WHERE year BETWEEN 1950 AND 2000; --Yılı 1950 yılı ile 2000 arasında ki bütün verileri getrir.

SELECT * FROM cars
WHERE model IS NULL;--modeli null olan verileri getir demek.

SELECT * FROM cars
WHERE brand NOT LIKE 'F%'; --F ile başlamayan kayıtları döndürür. ->ILIKE case sentivite değil(büyük-küçük harf duyarsız.)

SELECT * FROM cars
WHERE brand NOT LIKE 'f%'; --f ile başlamayan kayıtları döndürür. ->ILIKE case sentivite değil(büyük-küçük harf duyarsız.)


SELECT * FROM cars
WHERE brand NOT IN ('Cobra','Ford','Ferrai');--markanın bu listede olmadığı bütün değerleri döndürür


SELECT * FROM cars 
WHERE year NOT BETWEEN 1950 AND 2000; --Yılı 1950 yılı ile 2000 arasında OLAMYAN ki bütün verileri getrir.

SELECT * FROM cars 
WHERE model IS NOT NULL; --model NULL olmayan bütün değerleri getirir.