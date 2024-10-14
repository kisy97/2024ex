USE nation;

SELECT 
    name
FROM 
    countries
WHERE 
    NAME LIKE 'd%'
order BY
    name;
    
SELECT NAME FROM countries
WHERE NAME LIKE '%tan'
ORDER BY NAME;

SELECT NAME FROM countries
WHERE NAME LIKE '%state%'
ORDER BY NAME;

SELECT NAME FROM countries
WHERE NAME LIKE '_n%'
ORDER BY NAME;

SELECT 'V_2019' LIKE '%\_20%';

SELECT NAME, region_id FROM countries
WHERE region_id IN (1,2,3)
ORDER BY NAME;

SELECT NAME, region_id FROM countries
WHERE 
	region_id = 1 OR
	region_id = 2 OR
	region_id = 3
ORDER BY NAME;

SELECT region_id FROM regions
WHERE NAME LIKE '%Asia%';

SELECT NAME, region_id FROM countries
WHERE
	region_id IN (
		SELECT region_id FROM regions
		WHERE NAME LIKE '%Asia%'
	)
ORDER BY NAME;

SELECT name FROM countries
ORDER BY name
LIMIT 6;

SELECT NAME FROM countries
ORDER BY NAME
LIMIT 10 OFFSET 5;

SELECT name FROM countries
ORDER BY name
LIMIT 5, 10;

SELECT NAME, area FROM countries
ORDER BY AREA desc
LIMIT 10;


SELECT NAME, area FROM countries
ORDER BY AREA desc, NAME
LIMIT 1,1;

SELECT NAME, national_day FROM countries
WHERE national_day IS NULL
ORDER BY NAME;

SELECT NAME, national_day FROM countries
WHERE national_day IS not NULL
ORDER BY NAME;

SELECT * FROM guests;

SELECT * FROM vips;

SELECT
	g.guest_id,
	g.name,
	v.vip_id,
	v.name
FROM guests g INNER JOIN vips v
ON v.name = g.name;

SELECT
	g.guest_id,
	g.name,
	v.vip_id,
	v.name
FROM guests g LEFT JOIN vips v
ON v.name = g.name;

SELECT
	g.guest_id,
	g.name,
	v.vip_id,
	v.name
FROM guests g RIGHT JOIN vips v
ON v.name = g.name;

SELECT
	g.guest_id,
	g.name,
	v.vip_id,
	v.name
FROM guests g cross JOIN vips v;

SELECT 
	c.name country, r.name region
FROM countries c
INNER JOIN regions r ON r.region_id = c.region_id
ORDER BY c.name;

SELECT 
	c.name country, r.name region
FROM countries c
INNER JOIN regions r USING (region_id)
ORDER BY c.name;


SELECT 
	c.name country, 
	r.name region,
	t.name continent
FROM countries c
INNER JOIN regions r USING (region_id)
INNER JOIN continents t USING (continent_id)
ORDER BY c.name;

SELECT region_id, COUNT(country_id) FROM countries
GROUP BY region_id
ORDER BY region_id;

SELECT regions.name, COUNT(country_id) FROM countries
INNER JOIN regions USING (region_id)
GROUP BY regions.name
ORDER BY regions.name;

SELECT regions.name region, sum(area) region_area FROM countries
INNER JOIN regions USING (region_id)
GROUP BY regions.name
ORDER BY region_area DESC;

SELECT regions.name region, COUNT(country_id) country_count
FROM countries
INNER JOIN regions USING (region_id)
GROUP BY (regions.name)
HAVING COUNT(region_id) > 10
ORDER BY country_count DESC;

SELECT 
	regions.name region, 
	COUNT(country_id) country_count, 
	SUM(AREA) area
FROM countries
INNER JOIN regions USING (region_id)
GROUP BY (regions.name)
HAVING COUNT(region_id) > 10 and AREA > 1000000
ORDER BY area DESC, country_count DESC;