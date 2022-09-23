-- 1. test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee (
	id INT PRIMARY KEY,
	name VARCHAR (50),
	birthday DATE,
	email VARCHAR (100)
);

-- 2. Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (id, name, birthday, email) values (1, 'Cherri', '1985-07-01', 'cvosse0@statcounter.com');
insert into employee (id, name, birthday, email) values (2, 'Oswell', '1988-04-15', 'ocorneille1@51.la');
insert into employee (id, name, birthday, email) values (3, 'Norrie', '1989-05-19', 'nbowart2@bandcamp.com');
insert into employee (id, name, birthday, email) values (4, 'Nickie', '1988-04-25', 'npaunsford3@utexas.edu');
insert into employee (id, name, birthday, email) values (5, 'Kaitlyn', '1994-11-15', 'kgosland4@furl.net');
insert into employee (id, name, birthday, email) values (6, 'Delila', '1983-04-30', 'dvoaden5@reverbnation.com');
insert into employee (id, name, birthday, email) values (7, 'Ronda', '1998-02-16', 'rgibby6@dailymail.co.uk');
insert into employee (id, name, birthday, email) values (8, 'Claude', '1983-06-18', 'ccrier7@technorati.com');
insert into employee (id, name, birthday, email) values (9, 'Rora', '1989-01-24', 'rmcfee8@wikispaces.com');
insert into employee (id, name, birthday, email) values (10, 'Alphonse', '1999-04-14', 'agove9@last.fm');
insert into employee (id, name, birthday, email) values (11, 'Perceval', '1997-12-20', 'pridingsa@youku.com');
insert into employee (id, name, birthday, email) values (12, 'Fabian', '1990-05-26', 'fkeatsb@diigo.com');
insert into employee (id, name, birthday, email) values (13, 'Austin', '1985-02-25', 'abodsworthc@rambler.ru');
insert into employee (id, name, birthday, email) values (14, 'Shoshanna', '1988-08-17', 'skulasd@instagram.com');
insert into employee (id, name, birthday, email) values (15, 'Borden', '1986-05-13', 'bwalentae@oracle.com');
insert into employee (id, name, birthday, email) values (16, 'Stormi', '1999-03-12', 'sabberleyf@washingtonpost.com');
insert into employee (id, name, birthday, email) values (17, 'Crystie', '1995-11-27', 'cspurriorg@soup.io');
insert into employee (id, name, birthday, email) values (18, 'Cletus', '1991-11-13', 'ccoursonh@photobucket.com');
insert into employee (id, name, birthday, email) values (19, 'Patton', '1997-08-01', 'plawryi@adobe.com');
insert into employee (id, name, birthday, email) values (20, 'Pieter', '1994-05-10', 'pstairmandj@tumblr.com');
insert into employee (id, name, birthday, email) values (21, 'Bellanca', '1999-06-21', 'bbankesk@ezinearticles.com');
insert into employee (id, name, birthday, email) values (22, 'Willy', '1990-02-12', 'wfridl@jimdo.com');
insert into employee (id, name, birthday, email) values (23, 'Barret', '1989-08-11', 'bludlammem@epa.gov');
insert into employee (id, name, birthday, email) values (24, 'Tallie', '1980-11-28', 'tpitkeathlyn@networkadvertising.org');
insert into employee (id, name, birthday, email) values (25, 'Vannie', '2000-08-19', 'vmicheo@twitpic.com');
insert into employee (id, name, birthday, email) values (26, 'Mason', '1992-09-02', 'mwilcockep@ucla.edu');
insert into employee (id, name, birthday, email) values (27, 'Winnie', '1980-11-22', 'wodeaq@storify.com');
insert into employee (id, name, birthday, email) values (28, 'Jedidiah', '1980-10-14', 'jrubker@geocities.jp');
insert into employee (id, name, birthday, email) values (29, 'Nadiya', '1987-09-08', 'ntreppass@arizona.edu');
insert into employee (id, name, birthday, email) values (30, 'Luther', '1999-07-13', 'lnoquett@epa.gov');
insert into employee (id, name, birthday, email) values (31, 'Boycie', '1981-09-26', 'bkofaxu@free.fr');
insert into employee (id, name, birthday, email) values (32, 'Dur', '1984-07-06', 'dkenwrightv@nifty.com');
insert into employee (id, name, birthday, email) values (33, 'Berrie', '1985-04-21', 'battwellw@godaddy.com');
insert into employee (id, name, birthday, email) values (34, 'Domeniga', '1984-09-15', 'dtapscottx@dedecms.com');
insert into employee (id, name, birthday, email) values (35, 'Thomasine', '1998-09-23', 'tniesingy@comcast.net');
insert into employee (id, name, birthday, email) values (36, 'Sigismundo', '1989-09-01', 'stuckwoodz@tmall.com');
insert into employee (id, name, birthday, email) values (37, 'Sayers', '2000-06-15', 'sfowler10@cbsnews.com');
insert into employee (id, name, birthday, email) values (38, 'Oby', '1986-03-18', 'ofawlks11@cargocollective.com');
insert into employee (id, name, birthday, email) values (39, 'Woodie', '1995-10-09', 'wburner12@sitemeter.com');
insert into employee (id, name, birthday, email) values (40, 'Kelwin', '1997-04-09', 'kmansel13@home.pl');
insert into employee (id, name, birthday, email) values (41, 'Elden', '1984-11-14', 'egallagher14@princeton.edu');
insert into employee (id, name, birthday, email) values (42, 'Jonah', '1991-09-14', 'jbramwich15@skype.com');
insert into employee (id, name, birthday, email) values (43, 'Dwayne', '1988-11-14', 'dtrevallion16@ovh.net');
insert into employee (id, name, birthday, email) values (44, 'Jill', '1993-09-11', 'jkinsella17@rambler.ru');
insert into employee (id, name, birthday, email) values (45, 'Kellby', '1988-03-20', 'kvollam18@skyrock.com');
insert into employee (id, name, birthday, email) values (46, 'Shannon', '1982-02-27', 'sbishop19@time.com');
insert into employee (id, name, birthday, email) values (47, 'Reese', '1986-05-21', 'rchrishop1a@telegraph.co.uk');
insert into employee (id, name, birthday, email) values (48, 'Robena', '1999-01-12', 'rhovington1b@constantcontact.com');
insert into employee (id, name, birthday, email) values (49, 'Blakeley', '1998-07-19', 'bclaxson1c@bravesites.com');
insert into employee (id, name, birthday, email) values (50, 'Cassie', '1980-11-18', 'cwalkden1d@sina.com.cn');

-- 3. Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee 
SET name = 'Samet',
	birthday = '1994-10-09',
	email = 'samet@samet.com'
WHERE id = 10;

UPDATE employee 
SET name = 'Melih',
	birthday = '1992-11-09',
	email = 'melih@melih.com'
WHERE id = 15;

UPDATE employee 
SET name = 'Mert',
	birthday = '1990-12-12',
	email = 'mert@mert.com'
WHERE id = 2;

UPDATE employee 
SET name = 'Salih',
	birthday = '1989-01-01',
	email = 'salih@salih.com'
WHERE id = 49;

UPDATE employee 
SET name = 'Göktuğ',
	birthday = '1993-05-28',
	email = 'goktug@goktug.com'
WHERE id = 31;

-- 4. Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee
WHERE id = 30;

DELETE FROM employee
WHERE id = 22;

DELETE FROM employee
WHERE id = 1;

DELETE FROM employee
WHERE id = 9;

DELETE FROM employee
WHERE id = 41;