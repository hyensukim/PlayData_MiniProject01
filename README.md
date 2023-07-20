# 😊 Topic : 음료 자판기 

# 😊 프로젝트 기간
- 2023.07.18 ~ 2023.07.20(3days)

# 😊 기본 로직
- Service 객체
	1. 자판기에 음료를 추가.(음료 객체 ,갯수)
	2. 자판기 운행.
	3. 판매할 음료 목록 출력.
	4. 구매할 음료를 선택.
	5. 투입 금액 입력 받기.
		4-1. 입력받은 금액 출력.
		4-2. 투입 금액으로 구매 가능한 음료가 없는 경우, 4번으로 continue.
		4-3. 누적 금액으로 구매 가능한 음료가 있는 경우
			- 추가로 금액을 투입하여 더 비싼 음료를 먹고 싶은경우,
	6. 가격이상의 금액 투입 시 해당 음료 출력 + 거스름 돈 출력.
	7. 음료 재고 0되면, while문 탈출.
	8. 자판기 운행 종료.
	
# 😊 객체 관계도
	```
	자판기(BeverageVendingMachine) 
		음료 홀더(BeverageHolder)
			음료(Beverage)
	```

# 😊 객체(Objects)
1. 음료 객체(추상 클래스)
	- 필드
		- 명칭(String)
		- 제조사(String)
		- 캔색상(String)
		- 가격(int)
		- * 용량(int)
		- 탄산여부(boolean)
		- 설탕여부(boolean)
	
	- 메서드
		- getter & setter

2. 음료 홀더(음료 객체를 담는 홀더)
	- 필드
		- holder(ArrayList)
		- 음료 매진 상태(boolean)
	
	- 메서드
		- 홀더에 음료 추가하기(void add(Beverage beverage, int num))
		- 홀더에 있는 음료 정보 조회하기(Beverage getBeverage())
		- 홀더에 있는 음료 잔량 조회하기(int getRemain())
		- 홀더에 음료 매진여부 조회하기(boolean checkSoldOut())

3. 자판기 객체(음료 홀더를 담는 자판기)
	- 필드
		- 전원(boolean)
		- 투입 금액(int)
		- 누적 금액(int)
		- 반환레버 여부(boolean)
		- 음료선택 여부(boolean)
		- 선택된 음료 종류(BeverageHolder)
		- 음료 홀더(BeverageHolder)
		- 음료 목록(HashMap(String, BeverageHolder))

	- 메서드
		- 전원 on - true /off - false
		- 자판기에 음료 종류 추가( void addBeverageKind(Beverage beverage, int num))
		- 음료 종류 리스트 보여주기(void showList())
		- 뽑을 수 있는 음료 리스트 출력(void showAvailableList())
		- 금액 받기(void receiveCash(int cash))
		- 음료 선택(void selectBeverage(String name))
		- 음료 제공(Beverage serveBeverage())
		- 입력 금액과 비교하여 일치하는 음료 리스트 보여주기
			- 음료 가격(String)과 누적 금액(int) 비교
			- true이면 -> 뽑기 가능 상태 true로 변환. -> "음료명"을 뽑을 수 있습니다.
		- 음료 뽑기
			- 뽑을 음료명 입력 시, 해당 객체 반환.
			- 누적금액 - 음료 가격, 잔돈 반환. (0인 경우, 반환 X)
	
# 😊 기능
- 음료 홀더에 음료 추가 기능.
	- BeverageHolder _ add(Beverage beverage) _ ArrayList add()
- 리스트 보여주기.
- 금액 입력 받기.
- 입력 금액 확인하기.(if - else if)
- 금액 일치 항목 조회 후 출력.
- 음료 선택 하기.
- 선택한 음료 출력.
- 거스름돈 출력.
- 매진 시, 매진된 음료라는 명칭이 출력되도록 함.

# 😥 문제점(troubleShooting)
- BeverageHolder _ getBeverage() : ArrayList get() 메서드 사용시, index 값이 없는 경우 IndexOutOfBoundsException 발생.
	- isEmpty() + if 조건문 + 익명객체로 처리함.