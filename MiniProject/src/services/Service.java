//package services;
//
//import objects.*;
//import java.util.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Service {
//	
//	private BeverageVendMach bvm = BeverageVendMach.getVendingMachine();
////	private static boolean insertMoreCash = false;
//	private static boolean anotherBeverage = false;
//	
//	public void addBeverage() {
//		
//		bvm.addBeverageKind(new Coke(), 10);
//		bvm.addBeverageKind(new ZeroCoke(), 10);
//		bvm.addBeverageKind(new Cider(), 10);
//		bvm.addBeverageKind(new ZeroCider(), 10);
//		bvm.addBeverageKind(new Water(), 10);
//	}
//	
//	public void RunningVendMach() {	
//		
//		bvm.powerOn();
//		
//		bvm.showList();
//		
////		Outer : while(true) {
////			
////			System.out.println("============= 금액을 넣어주세요");
////			
////			System.out.println("============= [￦현금 투입구￦] >>");
////			
////			System.out.println("**반환을 원하시면 반환레버(q)를 눌러주세요.");
//
////			Scanner sc = new Scanner(System.in);
////			
////			while(!bvm.couldBuy()|| anotherBeverage) {
////							
////				String in = sc.next();
////				
////				if(in.equalsIgnoreCase("q")) {
////					
////					bvm.pullReturnLever();
////					int returnCash = bvm.returnCash();
////					System.out.println("반환 금액은 " + returnCash + "원 입니다.");
////					break Outer;
////					
////				}else {
////					int cash = Integer.parseInt(in);
////					int stack = bvm.receiveCash(cash);
////					System.out.println("============ [투입한 금액] : " + stack + "원 입니다.");
////					System.out.println();
////					
////					bvm.showAvailableList();
//////					insertMoreCash = false;
////				}
////				
////				if(bvm.couldBuy()) {
////					System.out.println("구매 가능 목록에 원하시는 음료가 있나요?(Y/N) >>");
////					String another = sc.next();
////					if(another.equalsIgnoreCase("y")) {
////						anotherBeverage = true;
////					}else {
////						anotherBeverage = false;
////					}
////				}
////			}
////			
////			if(anotherBeverage) {
////				continue;
////			}
////			
////			while(true) {
////				
////				String in = sc.next();
////				
//////				Pattern pattern = Pattern.compile("\\d");
//////				Matcher matcher = pattern.matcher(in);
////			
////				if(in.equalsIgnoreCase("q")) {
////					
////					bvm.pullReturnLever();
////					int returnCash = bvm.returnCash();
////					System.out.println("반환 금액은 " + returnCash + "원 입니다.");
////					break Outer;
////					
//////				}else if(matcher.find()){
//////					insertMoreCash = true;
//////					continue Outer;
////				}else{
////					
////					System.out.print("음료를 선택해 주세요. >>");
////					
////					String input = sc.next();
////					
////					bvm.selectBeverage(input);
////					
////					Beverage beverage = bvm.serveBeverage();
////					
////					if(beverage != null) {
////						String name = beverage.getName();
////						String manufacturer = beverage.getManufacturer();
////						String color = beverage.getColor();
////						int capacity = beverage.getCapacity();
////						
////						System.out.println();
////						System.out.println("========================");
////						System.out.printf("음료가 나왔습니다^^%n"
////								+ "	|	%s%n"
////								+ "	|	%s%n"
////								+ "	|	%s%n"
////								+ "	|	%dmL%n"
////								,name,manufacturer,color,capacity);
////					}
////					
////					int returnCash = bvm.returnCash();
////					System.out.println("반환 금액은 " + returnCash + "원 입니다.");
////				}
////			}
////		}
//		
//		bvm.powerOff();
//	}
//}
