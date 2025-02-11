public class Item{
public static void main(String anything[]){
	int itemName[]={1,2,3,4,5};
	System.out.println("List of item 1:"+itemName[0]);
	for(int index=0;index<itemName.length;index++){
	System.out.println(itemName[index]);
	}
   System.out.println("reverse array element");
	for(int index= itemName.length-1;index>=0; index--){                                                                                                                                                         
System.out.println("element is:"+itemName[index]);
}
}
}