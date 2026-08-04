-- SELECT IF(
--     COUNT(DISTINCT salary) >= 2,
--     (SELECT DISTINCT salary
--      FROM Employee
--      ORDER BY salary DESC
--      LIMIT 1 OFFSET 1),
--     NULL
-- ) AS SecondHighestSalary
-- FROM Employee;
select if(
    count(distinct salary)>=2,
    (select distinct salary from Employee order by salary desc limit 1 offset 1),
    null

)as SecondHighestSalary from Employee;