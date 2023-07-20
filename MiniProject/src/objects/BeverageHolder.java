package objects;

import java.util.*;

public class BeverageHolder {
	
	// 음료 홀더
	private List<Beverage> holder = new ArrayList<>();

	// 매진 여부
	private boolean isSoldOut = false;
	
	public boolean isSoldOut() {
		return isSoldOut;
	}

	// 홀더에 음료 추가
	public void add(Beverage beverage, int num) {
		for(int i=0; i < num; i++) {
			holder.add(beverage);
		}
	}
	
	// 홀더에 음료 빼기
	public void draw() {
		if(getRemain() != 0) {
			holder.remove(holder.size()-1);
		}
	}
	
	// 홀더 안에 음료 조회
	public Beverage getBeverage() {
		Beverage beverage = null;
		
		if(!holder.isEmpty()) {
			beverage = holder.get(0);
		}else {
			beverage = new Beverage() {};
		}
		
		return beverage;
	}
	
	// 음료 남은 갯수 조회
	public int getRemain() {
		return holder.size();
	}
	
}
