create external table orders (
  order_id int,
  order_date string,
  order_customer_id int,
  order_status string
) row format delimited fields terminated by ','
location '/user/srikanth/daily_revenue/orders';
