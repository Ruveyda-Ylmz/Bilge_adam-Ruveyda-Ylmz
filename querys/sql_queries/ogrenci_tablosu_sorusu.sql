--tablo oluşturma
CREATE TABLE students(
	name VARCHAR(225),
	surname VARCHAR(225),
	grade INT
);

SELECT * FROM students;

--5 öğrenci kayıt girme
INSERT INTO students(name,surname,grade)
	VALUES
	('ruveyda','yilmaz',70),
	('gamze','aytep',75),
	('tuba','inan',80),
	('ahmet','inan',70),
	('elif','',75);
	
	
--ogrenci soyisim güncelleme
UPDATE students
SET surname = 'korkmaz'
WHERE name = 'ruveyda';

--doğumyılı kolonu ekle
ALTER TABLE students
ADD dogum_yil INT;

--HERKESİN DOĞU YILINI AYNI YAP
UPDATE students
SET dogum_yil = 2000;

--öğrencilerin birinin adı,soyadını,dogunm_yil güncelle
UPDATE students
SET 
	name = 'ruveydaSu',
	surname = 'yılmazSu',
	dogum_yil = 2001
WHERE name IN ('ruveyda'); --WHERE name = ruveyda

--kayıt silme
DELETE FROM students
WHERE  name= 'elif';





	
	