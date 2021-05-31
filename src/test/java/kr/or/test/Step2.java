package kr.or.test;
/**
 * 
 * 이 클래스는 메서드기반의  Step1 클래스를 객체기반의 클래스로 변경한 클래스
 *
 */
class MemberVO {
	private String name;
	private int age;
	private String phoneNum;
	// 위 프라이빗 멤버변수의 입출력을 구현한 메서드를 만듦(아래)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// String을 반환(return) 겟 메서드
	public String getPhoneNum() {
		return phoneNum;
	}
	// void한(반환값이없는) 입력하는 셋 메서드
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;//프라이빗 변수를 직접접근 못하니까
		// 퍼블릿 메서드로 입력하게 만들어 놓은 구조
	}
	
	
}
public class Step2 {
	
	public static void main(String[] args) {
		// MemberVo클래스자료형(회원정보) 객체를 생성(아래
		MemberVO memberVO = new MemberVO();
		memberVO.setName("홍길동");
		memberVO.setAge(10);
		memberVO.setPhoneNum("000-0000-0000");
		MemberVO memberVO2 = new MemberVO();
		memberVO2.setName("성춘향");
		memberVO2.setAge(10);
		memberVO2.setPhoneNum("111-1111-1111");
		MemberVO memberVO3 = new MemberVO();
		memberVO3.setName("각시탈");
		memberVO3.setAge(28);
		memberVO3.setPhoneNum("333-3333-3333");
		MemberVO[] members = new MemberVO[3];
		members[0] = memberVO;
		members[0] = memberVO;
		members[0] = memberVO;
		MemberService memberService = new MemberSercive();
		memberService.printMember(members);
		
	}

}
 class MemberService {
	 
 }
