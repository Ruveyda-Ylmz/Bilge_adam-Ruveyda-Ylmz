INSERT INTO public.tbl_customer_orders(
	 customer_name, customer_email, order_id, order_date, order_total_amount)
	VALUES ('tuba', 'tuba@gmail.com', 2, 452545, 545.5452);
	

INSERT INTO public.tbl_customer(
 customer_name, customer_email)
VALUES ('gamze', 'gazmee@gmail.com');

INSERT INTO public.tbl_orders(
 order_date, order_total_amount ,customer_id)
VALUES ( 134211, 452.545, 2);
	

SELECT * FROM tbl_customer_orders; 

SELECT * FROM tbl_customer;

SELECT * FROM tbl_orders;

