--zapytanie  o podrasę
  SELECT p.podrasa, p.rasaID FROM dbo.Podrasa AS p, dbo.Rasa AS r
     WHERE  p.rasaID=r.rasaID AND r.rasaID=2
	 
  SELECT p.podrasa FROM Podrasa AS p, Rasa AS r
     WHERE  p.rasaID=r.rasaID AND r.rasa=N'Krasnolud'
	 
--zapytanie o charakter
  SELECT c.charakter 
  FROM Charakter AS c
  INNER JOIN Rasa AS r ON r.rasaID=c.rasaID
     
	 
	 
--złączenia tabel
SELECT c.charakter 
	FROM (Charakter AS c, Rasa AS r
     WHERE  c.rasaID=r.rasaID AND r.rasa='Drakon')
	 
	 
SELECT c.charakterID, charakter
FROM Charakter c
JOIN Charakter_Rasy cr ON c.charakterID=cr.charakterID 
JOIN Rasa r ON cr.rasaID=r.rasaID
JOIN Charakter_Klasy ck ON c.charakterID=ck.charakterID 
JOIN Klasa k ON ck.klasaID=k.klasaID
WHERE r.rasa='Elf' AND k.klasa='Druid'

--random rasa
SELECT TOP 1 rasa FROM Rasa 
ORDER BY NEWID()

--random podrasa
SELECT TOP 1 p.podrasa
FROM Rasa r
JOIN  Podrasa p ON p.rasaID=r.rasaID
WHERE r.rasa='Elf'
ORDER BY NEWID()

--random klasa
SELECT TOP 1 klasa FROM Klasa
ORDER BY NEWID()

--random wiek
SELECT TOP 1 wiek FROM Wiek
ORDER BY NEWID()

--random płeć
SELECT TOP 1 plec FROM Plec 
ORDER BY NEWID()

--random umiejetnosci
SELECT TOP 3 u.umiejetnosc, r.rasa, p.podrasa
FROM Umiejetnosci u
JOIN Umiejetnosci_Rasa ur ON ur.umiejetnoscID=u.umiejetnoscID
JOIN Rasa r ON ur.rasaID=r.rasaID
JOIN Podrasa p ON r.rasaID=p.rasaID
WHERE r.rasa='Elf' AND p.podrasa='Leśny'
ORDER BY NEWID()

--random imie
SELECT TOP 1 imie FROM Imiona
ORDER BY NEWID()

--random nazwisko
SELECT TOP 1 nazwisko FROM Nazwiska 
ORDER BY NEWID()

--random atrybuty
SELECT TOP 1 sila, kondycja, zrecznosc, inteligencja, madrosc, charyzma  FROM Atrybuty
ORDER BY NEWID()

--random charakter po rasie
SELECT TOP 1 c.charakterID, charakter
FROM Charakter c
JOIN Charakter_Rasy cr ON c.charakterID=cr.charakterID 
JOIN Rasa r ON cr.rasaID=r.rasaID
WHERE r.rasa='Elf' 
ORDER BY NEWID()
