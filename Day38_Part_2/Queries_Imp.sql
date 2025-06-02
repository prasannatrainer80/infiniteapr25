select sum(amount) from dailyExpenses where groupId=1;

select sum(amountCollected) from groupMembers 
where groupId=1;

SELECT 
    SUM(Amount),paidBy
FROM
    dailyexpenses
WHERE
    groupId = 1
    Group By PaidBy;

