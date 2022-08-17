package com.Ranjeet;

enum Name
{
	Ranjeet,Rajneesh;
}
enum food
{
	item1(100),item2(560),item3(120),item4(230),item5(220);
	int item_price;
	food(int item_price)
	{
		this.item_price=item_price;
	}
	public int show_price()
	{
		return item_price;
	}
}

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n1[]=Name.values();
		for(Name n:n1)
		{
			System.out.println("value="+n);
			
			String user_vale="item2";
			
			System.out.println("The price of Item is ="+food.valueOf(user_vale).show_price());
			
			
			
			
			
			
			
			
			
		}
	}

}
