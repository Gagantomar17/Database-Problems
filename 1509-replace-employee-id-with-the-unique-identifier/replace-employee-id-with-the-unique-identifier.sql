# Write your MySQL query statement 
SELECT a.unique_id, b.name
FROM EmployeeUNI AS a
RIGHT JOIN Employees  AS b 
ON a.id = b.id ;