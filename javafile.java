My first javascript file.
  
select * from customers c right join orders o on c.customer_id= o.customer_id;

select * from customers c left join orders o on c.customer_id= o.customer_id union all
select * from customers c right join orders o on c.customer_id= o.customer_id;
select * from customer c cross join orders o on c.customer_id= o.customer_id;

select * from customers c inner join orders o on c.customer_id= o.customer_id;
