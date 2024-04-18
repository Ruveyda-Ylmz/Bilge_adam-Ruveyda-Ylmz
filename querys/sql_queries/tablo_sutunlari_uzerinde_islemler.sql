--tabloya yeni kolon ekleme,mevcut kolonu değiştirme veya silme

--tabloya kolon ekleme
ALTER TABLE cars 
ADD color VARCHAR (225);

SELECT * FROM cars;

--tablodan sütün silme
ALTER TABLE cars 
DROP color;

--tabloda kolon ismi değiştirme
ALTER TABLE	cars
RENAME COLUMN color TO colorr;

--colon veri tipini değiştirme
ALTER TABLE cars
ALTER COLUMN colorr TYPE VARCHAR(150);

