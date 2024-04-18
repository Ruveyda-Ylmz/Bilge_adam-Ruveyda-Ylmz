--tabloya veri kaydı gerçekleştirme
--Syntax su şekilde olucak -> INSERT INTO tabloAdi (Tablonun fieldları(kolon isimleri))
                           --VALUES (kollon veri türüne denk gelen verileri doldurur.)

INSERT INTO cars(brand,model,year) --SQL de string çift tırnak ("") ile değil ,
VALUES('Ford','Mustang',1976);      --tek tırnak ('') ile yazılır