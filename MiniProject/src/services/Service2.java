package services;

import java.util.Scanner;

import objects.Beverage;
import objects.BeverageVendMach;
import objects.Cider;
import objects.Coke;
import objects.Water;
import objects.ZeroCider;
import objects.ZeroCoke;

public class Service2 {
	
private BeverageVendMach bvm = BeverageVendMach.getVendingMachine();

	public void addBeverage() {
		
		bvm.addBeverageKind(new Coke(), 1);
		bvm.addBeverageKind(new Cider(), 1);
		bvm.addBeverageKind(new ZeroCoke(), 1);
		bvm.addBeverageKind(new ZeroCider(), 1);
		bvm.addBeverageKind(new Water(), 1);
	}
	
	public void RunningVendMach() {	
	
		bvm.powerOn();
		
		while(true) {
			
			Beverage b = null;
			
			if(bvm.getSize() == 0) break;
			
			bvm.showList();
			
			System.out.print("== 음료를 선택해주세요! >>");
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				
				String inputName = sc.next();
				
				b = bvm.selectBeverage(inputName);
				
				if(b == null) {
					continue;
				}else {			
				
					System.out.println("== " + inputName + "을 선택하셨습니다!");
				}
				
				break;
			}
			
			System.out.println();
			
			while(true) {
				
				System.out.print("== 현금을 투입하세요! >>");
				
				String input = sc.next();
				
				if(input.equals("q")) {
					bvm.pullReturnLever();
					int returnCash = bvm.returnCash();
					System.out.println("거스름돈 " + returnCash + "원을 반환합니다.");
					break;
				}
				
				int price = b.getPrice();
				
				int cash = Integer.parseInt(input);
				
				int stack = bvm.receiveCash(cash);
				
				System.out.println("현재 투입한 금액 : " + cash + "원");
				
				if(stack >= price) {
					
					System.out.println("음료가 뽑혔습니다.");
					
					Beverage buyedB = bvm.serveBeverage();
					
					System.out.println();
					int returnCash = bvm.returnCash(buyedB);
					System.out.println("거스름돈 " + returnCash + "원을 반환합니다.");
					break;
				}
			}
		}
		
		System.out.println("음료가 매진되었습니다.");
		bvm.powerOff();
	}
}

