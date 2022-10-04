-- 1. film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
SELECT COUNT (length) FROM film
WHERE length> ANY
(
	SELECT AVG (length) FROM film
);
-- 2.film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
SELECT COUNT (rental_rate) FROM film
WHERE rental_rate =
(
	SELECT MAX (rental_rate) FROM film
);
-- 3. film tablosunda en düşük rental_rate ve en düşük replacement_cost değerlerine sahip filmleri sıralayınız.
SELECT title FROM film
WHERE (rental_rate, replacement_cost) =
(
	SELECT MIN (rental_rate), MIN (replacement_cost) FROM film 
);
-- 4. payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.
SELECT customer_id FROM payment group by customer_id;