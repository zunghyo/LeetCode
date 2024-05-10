# Write your MySQL query statement below

select a.id
from Weather a
where a.temperature > (
    select b.temperature 
    from Weather b 
    where b.recordDate = DATE_ADD(a.recordDate, INTERVAL -1 day)
    );