-- Inner Join

select D.Deptno,Dname,Empno,Ename,Job,Sal
from Dept D INNER JOIN Emp E ON D.Deptno = E.Deptno;

select A.AgentId, FirstName, LastName, City,State,
P.PolicyId,ModalPremium,AnnualPremium,PaymentModeId
from Agent A INNER JOIN AgentPolicy AP ON 
A.AgentID = AP.AgentID 
INNER Join Policy P On P.PolicyID= AP.PolicyId;

-- Left-Join 

select D.Deptno,Dname,Empno,Ename,Job,Sal
from Dept D LEFT JOIN Emp E ON D.Deptno = E.Deptno;

select A.AgentId, FirstName, LastName, City,State,
P.PolicyId,ModalPremium,AnnualPremium,PaymentModeId
from Agent A LEFT JOIN AgentPolicy AP ON 
A.AgentID = AP.AgentID 
LEFT Join Policy P On P.PolicyID= AP.PolicyId;

-- Right-Join 

select D.Deptno,Dname,Empno,Ename,Job,Sal
from Dept D RIGHT JOIN Emp E ON D.Deptno = E.Deptno;

select A.AgentId, FirstName, LastName, City,State,
P.PolicyId,ModalPremium,AnnualPremium,PaymentModeId
from Agent A RIGHT JOIN AgentPolicy AP ON 
A.AgentID = AP.AgentID 
RIGHT Join Policy P On P.PolicyID= AP.PolicyId;


