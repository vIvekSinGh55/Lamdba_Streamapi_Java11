
public class Q2 
{
	public static void main(String[] args) 
	{
		MyOrder Order = (price, status) -> {
			if (price > 10000) 
			{
				if (status == "ACCEPTED" || status == "COMPLETED")
				{
					System.out.println("Order Done");			
				}
			} 
			else 
			{
				
				System.out.println("Order is not Done");
				
			}
		};
		Order.result(20000, "COMPLETED");
		Order.result(5000, "COMPLETED");
		Order.result(15000, "ACCEPTED");
		Order.result(2000, "ACCEPTED");


	}
	
		interface MyOrder
		{
			void result(int price, String status);
		}
}
