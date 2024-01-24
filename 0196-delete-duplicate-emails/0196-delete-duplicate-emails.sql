# Write your MySQL query statement below

delete a
from Person a
inner join Person b on a.email = b.email
where a.id > b.id