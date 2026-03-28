class Swiggy{
	public static String validateAndOrder(long mobileNumber,String foodName,String restaurantName,String address,String userName){

	System.out.println("validateAndOrder method is started");

	String orderStatus=null;

	if(mobileNumber!=0 && foodName!=null && restaurantName!=null && address!=null && userName!=null){
		
		if(foodName.length()>3 && restaurantName.length()>3 && userName.length()>3){
			orderStatus="Hello "+userName+" Your order "+foodName+" from "+restaurantName+" is placed successfully";

    }else{

        orderStatus="Please check the length of Food Name, Restaurant Name or User Name";

    }

	}else{

    orderStatus="Please enter the valid order details";

}

    System.out.println("validateAndOrder method is Ended");

    return orderStatus;

}

}