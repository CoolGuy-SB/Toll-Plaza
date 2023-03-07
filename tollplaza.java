import java.util.Scanner;
class tollplaza
{
	int exempted_vehicle;
    int car;
    int commercial_buses;
    int goods_carrier;
	int renewed_pass;
    int revenue_of_exempted_vehicle;
    int revenue_of_car;
    int revenue_of_commercial_buses;
    int revenue_of_goods_carrier;
	int revenue_of_renewed_pass;
	int total;
    String travel_type;
	Scanner sc = new Scanner(System.in);
	
    void get_number_of_vehicles()
    {
		System.out.println("\t\tTOLL PLAZA");
        System.out.println("\t\t----------\n");
        System.out.println("1. How many Exempted Vehicles passed?");
        exempted_vehicle=sc.nextInt();
        System.out.println("\n2. How many car passed?");
        car=sc.nextInt();
        System.out.println("\n3. How many commercial buses vehicles passed?");
        commercial_buses=sc.nextInt();
        System.out.println("\n4. How many goods carrier vehicles passed?");
        goods_carrier=sc.nextInt();
		System.out.println("\n5. How many vehicles have renewed monthly pass?");
        renewed_pass=sc.nextInt();
    }
	
	void calculate_per_vehicle_revenue()
    {
		System.out.println("\n\t\tOne Side OR Two Side");
		System.out.println("\t\t--------------------\n");
        revenue_of_exempted_vehicle = 0;

        System.out.println("1. Did car travel one side or two side?");
        travel_type=sc.nextLine();
		travel_type=sc.nextLine();
		if(travel_type.equalsIgnoreCase("one"))
        {
            revenue_of_car=car*150;
        }
        else if(travel_type.equalsIgnoreCase("two"))
        {
            revenue_of_car=car*225;
        }
		else
		{
			System.out.println("Please Enter Valid Input!!!!!");
		}

        System.out.println("\n2. Did commercial bus travel one side or two side?");
        travel_type=sc.nextLine();
        if(travel_type.equalsIgnoreCase("one"))
        {
            revenue_of_commercial_buses=commercial_buses*1050;
        }
        else if(travel_type.equalsIgnoreCase("two"))
        {
            revenue_of_commercial_buses=commercial_buses*1300;
        }
		else
		{
			System.out.println("Please Enter Valid Input!!!!!");
		}
		
        System.out.println("\n3. Did goods carrier travel one side or two side?");
        travel_type=sc.nextLine();
        if(travel_type.equalsIgnoreCase("one"))
        {
            revenue_of_goods_carrier=goods_carrier*200;
        }
        else if(travel_type.equalsIgnoreCase("two"))
        {
            revenue_of_goods_carrier=goods_carrier*300;
        }
		else
		{
			System.out.println("Please Enter Valid Input!!!!!");
		}
        revenue_of_renewed_pass=renewed_pass*500;
    }
	
	void show_per_vehicle_revenue()
    {
        System.out.println("\n\tTotal revenue collection as per Vehicle Type");
        System.out.println("\t--------------------------------------------");
        System.out.println("\nExempted Vehicle=> 0");
        System.out.println("Car=> "+ revenue_of_car);
        System.out.println("Commercial Bus=> "+ revenue_of_commercial_buses);
        System.out.println("Goods Carrier=> "+ revenue_of_goods_carrier);
		System.out.println("Renewed Monthly Pass Vehicles=> "+ revenue_of_renewed_pass);
    }
	
    void show_total_revenue()
    {
        total=revenue_of_car+revenue_of_commercial_buses+revenue_of_goods_carrier+revenue_of_renewed_pass;
        System.out.println("\nTotal Day Revenue=> "+total);
    }
	
	public static void main(String arg[])
	{
		tollplaza obj = new tollplaza();
		obj.get_number_of_vehicles();
		obj.calculate_per_vehicle_revenue();
		obj.show_per_vehicle_revenue();
		obj.show_total_revenue();
	}
}
