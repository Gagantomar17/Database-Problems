# Write your MySQL query statement below
SELECT e.name, b.bonus 
FROM Employee AS e
LEFT JOIN Bonus AS b
ON e.empId = b.empId
where b.bonus <1000 OR e.empId NOT IN(
    SELECT empId FROM Bonus
)