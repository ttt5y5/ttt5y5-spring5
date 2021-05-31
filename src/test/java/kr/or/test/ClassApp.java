package kr.or.test;
/**
 * 1.이 클래스는 클래스 상속(extends)에 연습,
 * 2.오브젝트(객체)생성과 new 키워드(예약어) 생성자메서드 사용 연습,
 * 3.추상클래스(Abstract) 대한 연습
 * @author User
 *
 */
//오브젝트생성에 필요한 new 키워드 생성자메서드 사용한 실습(아래)
class Circle {
	private int r; //원의 반지름으로 쓸 변수
	// 생성자 메서드(아래)
    // public Circle() {} 만들지 않아도 자동으로 만들어짐.
	public Circle(int radius) {
		r = radius; //Get Set 중에 Set(저장) 멤버변수에 처리
	}
	// 원의 넓이를 반환, 반환리턴값의 크기가 더블형(아래)
	public double getCircle() {
		double result = r*r*3.14; //
		return result;
	}
}
// 클래스 상속에 대한 연습(아래)
class Employee { //고용(사원,취업)
	int mSalary; //m 멤버변수 사원 월급 변수
	String mDept; // 사원 부서
	public void doJob() {
		System.out.println("환영합니다. 직원 여러분!");
	}
}
class Salesman extends Employee { //extends 확장 -> 상속
	public Salesman() { //클래스명과 똑같은 이름의 메서드가 생성자 함수
		// 자동으로 생성되는데, 개발자가 커스터마이징 할때 만듦.
		mDept = "판매부서"; //부모클래스의 변수를 상속받아서 사용가능
	}
	public void doJob() {
		System.out.println("환영합니다. "+mDept+" 여러분!!!");
	}
}
class Development extends Employee {
	public Development() {
		mDept = "개발부서";
	}
	public void doJob() {
		System.out.println("환영합니다. "+mDept+" 여러분!!!!");
	}
}
// 추상클래스 구현 코딩
abstract class GraphicObject {
	int x,y;
	abstract void draw(); //구현내용이 없고, 메서드 명만존재. 추상 메서드
	//추상 메서드를 만드는 이유는 메서드가 많을때 개발자가 구현할때 어려움이 존재.
	// 위 문제를 해소하는 기능의 클래스. 수백개의 메서드를 이름만 모아서,유지보수가 편리
}
// 추상클래스 사용(아래)
class Traiangle extends GraphicObject {

	@Override
	void draw() {
		// 삼각형만들기
		System.out.println("  *  ");
		System.out.println(" * * ");
		System.out.println("*****");
	}
}
class Rectangle extends GraphicObject{

	@Override
	void draw() {
		// 사각형 만들기
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
	}

	
}
public class ClassApp {

	public static void main(String[] args) {
		//추상클래스를 이용해서 오버라이드 메서드 사용(아래)
		GraphicObject traiangleObject = new Traiangle();
		GraphicObject rectangleObject = new Rectangle();
		traiangleObject.draw();
		rectangleObject.draw();
		// 개발자가 입력한 반지름의 원의 넓이를 구하는 오브젝트를 생성(아래)
		Circle circle = new Circle(5); //반지름이 5인 원의 넓이를 구하는 객체생성
		System.out.println("원의 넓이는" + circle.getCircle());
		circle = null; //오브젝트(메모리) 반환
		
		Employee employee = new Employee();
		Salesman salesman = new Salesman();
		Development development = new Development();
		employee.doJob();
		salesman.doJob();
		development.doJob();
	}
	
}
