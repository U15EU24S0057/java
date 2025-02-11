public class Laptop{
public static void main(String[] args){
System.out.println("Learning Local Variable");
String laptopName="Dell";
double price=25999.23;
byte noOflaptop=5;
long contactNumber=9807654321L;
System.out.println("Info of Laptop");
System.out.println("Laptop Name:"+laptopName);
System.out.println("Price:"+price);
System.out.println("No of laptop:"+noOflaptop);
System.out.println("contact Number:"+contactNumber);
double total_price = price*noOflaptop;
System.out.println("total price is:"+total_price);
float gst = 0.18F;
double gstAmount = total_price*gst;
System.out.println("GST is:"+gstAmount);
}
}





