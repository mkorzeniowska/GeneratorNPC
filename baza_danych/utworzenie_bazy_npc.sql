IF (DB_ID('NPC') IS NULL)							-- sprawdza czy na serwerze istnieje  
BEGIN
	CREATE DATABASE [NPC]							-- jeżeli nie to jest tworzona
	PRINT 'Utworzono bazę NPC'					-- komunikat diagnostyczny 
END ELSE
	PRINT 'Baza NPC już istnieje'					-- komunikat diagnostyczny 
GO													-- GO (przesłanie i wykonanie powyższych poleceń jako jeden batch)

USE [NPC]											-- jeżeli nie to jest tworzona
GO													-- przełączenie w kontekst bazy NPC


IF OBJECT_ID (N'Plec', N'U') IS NULL		-- sprawdza czy w bazie istnieje tabela Plec 
BEGIN
	CREATE TABLE [dbo].[Plec](				-- jeżeli nie, jest ona tworzona 
		[plecID] [int] IDENTITY(1,1) PRIMARY KEY, 
		[plec] [nvarchar](50) NOT NULL,
	) 

	PRINT 'Utworzono tabelę Plec'			-- komunikat diagnostyczny 
END ELSE											
    PRINT 'Tabela Plec już istnieje'		-- komunikat diagnostyczny 
GO	

IF OBJECT_ID (N'Rasa', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Rasa](				-- dodać szybkość?
		[rasaID] [int] IDENTITY(1,1) PRIMARY KEY,
		[rasa] [nvarchar] (50) NOT NULL,
		[bonusID] [int] NOT NULL --jaka forma???
	)

	PRINT 'Utworzono tabelę Rasa'			
END ELSE											
    PRINT 'Tabela Rasa już istnieje'		
GO	

IF OBJECT_ID (N'Podrasa', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Podrasa](				
		[podrasaID] [int] IDENTITY(1,1) PRIMARY KEY,
		[podrasa] [nvarchar] (50) NOT NULL,
		[bonusID] [int],
		[rasaID] [int] 
	)

	PRINT 'Utworzono tabelę Podrasa'			
END ELSE											
    PRINT 'Tabela Podrasa już istnieje'		
GO

IF OBJECT_ID (N'Klasa', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Klasa](				
		[klasaID] [int] IDENTITY(1,1) PRIMARY KEY,
		[klasa] [nvarchar] (100) NOT NULL, --dodać pw, kp? biegłości? 
		[iloscUm] [int],
		)

	PRINT 'Utworzono tabelę Klasa'			
END ELSE											
    PRINT 'Tabela Klasa już istnieje'		
GO

IF OBJECT_ID (N'Wiek', N'U') IS NULL		-- sprawdza czy w bazie istnieje tabela Wiek 
BEGIN
	CREATE TABLE [dbo].[Wiek](				-- jeżeli nie, jest ona tworzona 
		[wiekID] [int] IDENTITY(1,1) PRIMARY KEY,
		[wiek] [nvarchar] (100) NOT NULL 
		) 

	PRINT 'Utworzono tabelę Wiek'			--
END ELSE											
    PRINT 'Tabela Wiek już istnieje'		 
GO	

IF OBJECT_ID (N'Imiona', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Imiona](				
		[imieID] [int] IDENTITY(1,1) PRIMARY KEY,
		[imie] [nvarchar] (500) NOT NULL,
		[rasaID] [int], 
		[plecID] [int]
		)

	PRINT 'Utworzono tabelę Imiona'			
END ELSE											
    PRINT 'Tabela Imiona już istnieje'		
GO	

IF OBJECT_ID (N'Nazwiska', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Nazwiska](				
		[nazwiskoID] [int] IDENTITY(1,1) PRIMARY KEY,
		[nazwisko] [nvarchar] (500) NOT NULL,
		[rasaID] [int], 
	    )

	PRINT 'Utworzono tabelę Nazwiska'			
END ELSE											
    PRINT 'Tabela Nazwiska już istnieje'		
GO

IF OBJECT_ID (N'Charakter', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Charakter](				
		[charakterID] [int] IDENTITY(1,1) PRIMARY KEY,
		[charakter] [nvarchar] (100) NOT NULL
        )

	PRINT 'Utworzono tabelę Charakter'			
END ELSE											
    PRINT 'Tabela Charakter już istnieje'		
GO

IF OBJECT_ID (N'Charakter_Rasy', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Charakter_Rasy](				
		[charakter_rasyID] [int] IDENTITY(1,1) PRIMARY KEY,
		[charakterID] [int],
		[rasaID] [int]
        )

	PRINT 'Utworzono tabelę Charakter_Rasy'			
END ELSE											
    PRINT 'Tabela Charakter_Rasy już istnieje'		
GO

IF OBJECT_ID (N'Charakter_Klasy', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Charakter_Klasy](				
		[charakter_klasyID] [int] IDENTITY(1,1) PRIMARY KEY, 
		[charakterID] [int],
		[klasaID] [int]
        )

	PRINT 'Utworzono tabelę Charakter_Klasy'			
END ELSE											
    PRINT 'Tabela Charakter_Klasy już istnieje'		
GO

IF OBJECT_ID (N'Atrybuty', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Atrybuty](				
		[atrybutID] [int] IDENTITY(1,1) PRIMARY KEY NOT NULL,
		[sila] [int] NOT NULL,
		[zrecznosc] [int] NOT NULL,
		[kondycja] [int] NOT NULL,
		[inteligencja] [int] NOT NULL,
		[madrosc] [int] NOT NULL,
		[charyzma] [int] NOT NULL
	)

	PRINT 'Utworzono tabelę Atrybut'			
END ELSE											
    PRINT 'Tabela Atrybut już istnieje'		
GO

IF OBJECT_ID (N'Bonus', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Bonus](				
		[bonusID] [int] IDENTITY(1,1) PRIMARY KEY,
		[bonus] [int],
		[bonusValue] [int],
		[opis] [nvarchar] (500)
	)

	PRINT 'Utworzono tabelę Bonus'			
END ELSE											
    PRINT 'Tabela Bonus już istnieje'		
GO	

IF OBJECT_ID (N'Umiejetnosci', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Umiejetnosci](				
		[umiejetnoscID] [int] IDENTITY(1,1) PRIMARY KEY,
		[umiejetnosc] [nvarchar] (100) NOT NULL
        )

	PRINT 'Utworzono tabelę Umiejetnosci'			
END ELSE											
    PRINT 'Tabela Umiejetnosci już istnieje'		
GO

IF OBJECT_ID (N'Umiejetnosci_Rasa', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Umiejetnosci_Rasa](				
		[umiejetnosc_rasaID] [int] IDENTITY(1,1) PRIMARY KEY,
		[umiejetnoscID] [int],
		[rasaID] [int], 
        )

	PRINT 'Utworzono tabelę Umiejetnosci_Rasa'			
END ELSE											
    PRINT 'Tabela Umiejetnosci_Rasa już istnieje'		
GO

IF OBJECT_ID (N'Umiejetnosci_Podrasa', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Umiejetnosci_Podrasa](				
		[umiejetnosc_podrasaID] [int] IDENTITY(1,1) PRIMARY KEY,
		[umiejetnoscID] [int],
		[podrasaID] [int] NOT NULL, 
        )

	PRINT 'Utworzono tabelę Umiejetnosci_Podrasa'			
END ELSE											
    PRINT 'Tabela Umiejetnosci_Podrasa już istnieje'		
GO

IF OBJECT_ID (N'Umiejetnosci_Klasa', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Umiejetnosci_Klasa](				
		[umiejetnosc_klasaID] [int] IDENTITY(1,1) PRIMARY KEY,
		[umiejetnoscID] [int],
		[klasaID] [int] NOT NULL, 
        )

	PRINT 'Utworzono tabelę Umiejetnosci_Klasa'			
END ELSE											
    PRINT 'Tabela Umiejetnosci_Klasa już istnieje'		
GO

IF OBJECT_ID (N'Umiejetnosci_Person', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Umiejetnosci_Person](				
		[umiejetnosc_personID] [int] IDENTITY(1,1) PRIMARY KEY,
		[umiejetnoscID] [int],
		[personID] [int]
        )

	PRINT 'Utworzono tabelę Umiejetnosci_Klasa'			
END ELSE											
    PRINT 'Tabela Umiejetnosci_Klasa już istnieje'		
GO

IF OBJECT_ID (N'Wyglad', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Wyglad](				
		[wygladID] [int] IDENTITY(1,1) PRIMARY KEY,
		[wyglad] [nvarchar] (500) NOT NULL,
		[plecID] [int] NOT NULL,
		[rasaID] [int] NOT NULL, 
		[podrasaID] [int],
		[wiekID] [int] NOT NULL
        )

	PRINT 'Utworzono tabelę Wyglad'			
END ELSE											
    PRINT 'Tabela Wyglad już istnieje'		
GO

IF OBJECT_ID (N'Osobowosc', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Osobowosc](				
		[osobowoscID] [int] IDENTITY(1,1) PRIMARY KEY,
		[cecha] [nvarchar] (500) NOT NULL
		)
		
	PRINT 'Utworzono tabelę Osobowosc'			
END ELSE											
    PRINT 'Tabela Osobowosc już istnieje'		
GO

--stara tabela Person
IF OBJECT_ID (N'Person', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Person](				
		[personID] [int] IDENTITY(1,1) PRIMARY KEY,
		[imieID] [int] NOT NULL,
		[nazwiskoID] [int],
		[rasaID] [int] NOT NULL,
		[podrasaID] [int],
		[klasaID] [int] NOT NULL,
		[atrybutID] [int] NOT NULL,
		[charakterID] [int] NOT NULL,
		[wygladID] [int] NOT NULL,
		[plecID] [int] NOT NULL,
		[osobowoscID] [int] NOT NULL, --jak dodać dwie cechy? 2x osobowoscID?
		CONSTRAINT [FK_Person1] FOREIGN KEY ([rasaID]) REFERENCES [dbo].[Rasa] ([rasaID]),
		CONSTRAINT [FK_Person2] FOREIGN KEY([podrasaID])  REFERENCES [dbo].[Podrasa] ([podrasaID]),
		CONSTRAINT [FK_Person3] FOREIGN KEY([klasaID])  REFERENCES [dbo].[Klasa] ([klasaID]),
		CONSTRAINT [FK_Person4] FOREIGN KEY ([atrybutID]) REFERENCES [dbo].[Atrybuty] ([atrybutID]),
		CONSTRAINT [FK_Person6] FOREIGN KEY ([charakterID]) REFERENCES [dbo].[Charakter] ([charakterID]),
		CONSTRAINT [FK_Person7] FOREIGN KEY ([wygladID]) REFERENCES [dbo].[Wyglad] ([wygladID]),
		CONSTRAINT [FK_Person8] FOREIGN KEY ([plecID]) REFERENCES [dbo].[Plec] ([plecID]),
		CONSTRAINT [FK_Person9] FOREIGN KEY ([osobowoscID]) REFERENCES [dbo].[Osobowosc] ([osobowoscID]),
		CONSTRAINT [FK_Person10] FOREIGN KEY ([imieID]) REFERENCES [dbo].[Imiona] ([imieID]),
		CONSTRAINT [FK_Person11] FOREIGN KEY ([nazwiskoID]) REFERENCES [dbo].[Nazwiska] ([nazwiskoID])
		)

	PRINT 'Utworzono tabelę Person'			
END ELSE											
    PRINT 'Tabela Person już istnieje'		
GO

--nowa tabela Person
IF OBJECT_ID (N'Person', N'U') IS NULL		
BEGIN
	CREATE TABLE [dbo].[Person](				
		[personID] [int] IDENTITY(1,1) PRIMARY KEY,
		[plec] [nvarchar] (500) NOT NULL,
		[imie] [nvarchar] (500) NOT NULL,
		[nazwisko] [nvarchar] (500) NOT NULL,
		[rasa] [nvarchar] (500) NOT NULL,
		[podrasa] [nvarchar] (500),
		[klasa] [nvarchar] (500) NOT NULL,
		[charakter] [nvarchar] (500) NOT NULL,
		[sila] [int] NOT NULL,
		[kondycja] [int] NOT NULL,
		[zrecznosc] [int] NOT NULL,
		[inteligencja] [int] NOT NULL,
		[madrosc] [int] NOT NULL,
		[charyzma] [int] NOT NULL,
		[wyglad] [nvarchar] (500),
		[osobowosc] [nvarchar] (500)
		)

	PRINT 'Utworzono tabelę Person'			
END ELSE											
    PRINT 'Tabela Person już istnieje'		
GO

--dodanie kluczy 
ALTER TABLE [dbo].[Rasa]  WITH CHECK ADD  
	CONSTRAINT [FK_Rasa2] FOREIGN KEY ([bonusID]) REFERENCES [dbo].[Bonus] ([bonusID])
	ON DELETE CASCADE
	ON UPDATE NO ACTION --lepiej set null?
GO

ALTER TABLE [dbo].[Podrasa]  WITH CHECK ADD  
	CONSTRAINT [FK_Podrasa1] FOREIGN KEY ([rasaID]) REFERENCES [dbo].[Rasa] ([rasaID])
	ON DELETE NO ACTION
	ON UPDATE NO ACTION,
	CONSTRAINT [FK_Podrasa2] FOREIGN KEY ([bonusID]) REFERENCES [dbo].[Bonus] ([bonusID])
	ON DELETE NO ACTION
	ON UPDATE NO ACTION
GO

--ALTER TABLE [dbo].[Klasa]  WITH CHECK ADD  
	--CONSTRAINT [FK_Klasa2] FOREIGN KEY ([bonusID]) REFERENCES [dbo].[Bonus] ([bonusID])
	--ON DELETE SET NULL
	--ON UPDATE CASCADE
--GO

--ALTER TABLE [dbo].[Wiek]  WITH CHECK ADD  
	--CONSTRAINT [FK_Wiek] FOREIGN KEY ([rasaID]) REFERENCES [dbo].[Rasa] ([rasaID])
--GO

ALTER TABLE [dbo].[Imiona]  WITH CHECK ADD  
	CONSTRAINT [FK_Imiona1] FOREIGN KEY ([rasaID]) REFERENCES [dbo].[Rasa] ([rasaID])
	ON DELETE NO ACTION
	ON UPDATE CASCADE,
	CONSTRAINT [FK_Imiona2] FOREIGN KEY ([plecID]) REFERENCES [dbo].[Plec] ([plecID])
	ON DELETE NO ACTION
	ON UPDATE CASCADE
GO

ALTER TABLE [dbo].[Nazwiska]  WITH CHECK ADD  
	CONSTRAINT [FK_Nazwiska] FOREIGN KEY ([rasaID]) REFERENCES [dbo].[Rasa] ([rasaID])
	ON DELETE NO ACTION
	ON UPDATE CASCADE
GO

ALTER TABLE [dbo].[Charakter_Rasy]  WITH CHECK ADD  
	CONSTRAINT [FK_Charakter_Rasy1] FOREIGN KEY ([rasaID]) REFERENCES [dbo].[Rasa] ([rasaID])
	ON DELETE NO ACTION
	ON UPDATE CASCADE,
	CONSTRAINT [FK_Charakter_Rasy2] FOREIGN KEY ([charakterID]) REFERENCES [dbo].[Charakter] ([charakterID])
	ON DELETE NO ACTION
	ON UPDATE CASCADE
GO

ALTER TABLE [dbo].[Charakter_Klasy]  WITH CHECK ADD  
	CONSTRAINT [FK_Charakter_Klasy1] FOREIGN KEY ([charakterID]) REFERENCES [dbo].[Charakter] ([charakterID])
	ON DELETE NO ACTION
	ON UPDATE CASCADE,
	CONSTRAINT [FK_Charakter_Klasy2] FOREIGN KEY ([klasaID]) REFERENCES [dbo].[Klasa] ([klasaID])
	ON DELETE NO ACTION
	ON UPDATE CASCADE
GO


ALTER TABLE [dbo].[Umiejetnosci_Rasa]  WITH CHECK ADD  
	CONSTRAINT [FK_Umiejetnosc_Rasa1] FOREIGN KEY ([rasaID]) REFERENCES [dbo].[Rasa] ([rasaID])
	ON DELETE NO ACTION
	ON UPDATE CASCADE
GO

ALTER TABLE [dbo].[Umiejetnosci_Podrasa]  WITH CHECK ADD  
	CONSTRAINT [FK_Umiejetnosc_Podrasa1] FOREIGN KEY ([podrasaID]) REFERENCES [dbo].[Podrasa] ([podrasaID])
	ON DELETE NO ACTION
	ON UPDATE CASCADE
GO

ALTER TABLE [dbo].[Umiejetnosci_Klasa]  WITH CHECK ADD  
	CONSTRAINT [FK_Umiejetnosc_Klasa1] FOREIGN KEY ([klasaID]) REFERENCES [dbo].[Klasa] ([klasaID])
	ON DELETE NO ACTION
	ON UPDATE CASCADE
GO

ALTER TABLE [dbo].[Umiejetnosci_Person]  WITH CHECK ADD  
	CONSTRAINT [FK_Umiejetnosc_Person1] FOREIGN KEY ([personID]) REFERENCES [dbo].[Person] ([personID])
	ON DELETE NO ACTION
	ON UPDATE CASCADE
GO


ALTER TABLE [dbo].[Wyglad]  WITH CHECK ADD  
	CONSTRAINT [FK_Wyglad1] FOREIGN KEY ([wiekID]) REFERENCES [dbo].[Wiek] ([wiekID]),
	CONSTRAINT [FK_Wyglad2] FOREIGN KEY ([rasaID]) REFERENCES [dbo].[Rasa] ([rasaID]),
	CONSTRAINT [FK_Wyglad3] FOREIGN KEY ([podrasaID]) REFERENCES [dbo].[Podrasa] ([podrasaID]),
	CONSTRAINT [FK_Wyglad4] FOREIGN KEY ([wiekID]) REFERENCES [dbo].[Wiek] ([wiekID])
GO


--dodać możliwość usuwania i dodawania przy foreign key
--dodać polskie znaki dla bazy

