package tightcoupling;

public class Order
{
  Customer customer;// dependency
  int oid;
  int distance;
  Order()
  {
	  Customer customer=new Customer();//tight coupling
  }
}
