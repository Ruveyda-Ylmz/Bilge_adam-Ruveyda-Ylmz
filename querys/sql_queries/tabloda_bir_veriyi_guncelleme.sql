--cars tablosunda güncelle,brand'i ferrari olanların color'ını 'red' yap.
UPDATE cars
SET color = ''
WHERE brand IN ('Ford');

/*
UPDATE cars
SET color = ''
WHERE brand = 'Ford';
*/

SELECT * FROM cars;

--cars tablosunda ki tüm color değerlerini red yapar
UPDATE cars
SET color = 'red';

