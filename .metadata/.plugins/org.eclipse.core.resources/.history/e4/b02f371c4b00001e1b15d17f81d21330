package chapter17.ex04;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//1. hashCode(), equals()를 재정의 하지 않은 상태.
class A{			//data 필드에 들어오는 값으로 각 객체를 식별하기 위해서는 : hashCode(), equals()가 재정의 되어있어야 set에 넣을때 동일한 값은 동일한 값으로 식별
	
	int data;
	
	
	A(int data){
		this.data = data;
	}


	@Override
	public String toString() {
		return " "+data+ " ";
	}
	
	
}


//2. hashCode(), equals() 메소드 재정의 : data필드의 값이 동일할때 hashCode 가 동일.
class B{
	
	int data;
	B (int data){
		this.data = data;
	}
	
	//1. equals()를 재정의 : Set에 중복된 값을 넣지 않도록 식별자 생성, Object의 equals()는 스택의 주소 비교임.
	//	data 필드의 힙의 값을 비교하도록 재정의 해야됨.
	
	@Override
	public boolean equals(Object obj) { 		//b1.equals(b2)
		if ( obj instanceof B) {		//다운캐스팅전에 물어보는것
			if (this.data == ((B)obj).data) {	//this.data ==> b1의 data,,,,, b2는 업캐스팅되어서 Object클래스이므로 다운캐스팅해서 비교해줌.
				return true;					//힙에 저장된 data필드의 값을 비교
			}else {
				return false;
			}
			
		}
	
		return false;
	}
	
	
	//2. hashCode()를 재정의 : data필드의 값으로 hashCode를 생성하도록 재정의
	//		data 필드의 값이 동일하면 동일한 hashCode()가 생성됨.
	
	@Override
	public int hashCode() {
		
		return Objects.hash(data);		//data필드의 값으로 hashCode를 생성함. 16진수로 된 코드
	}
	
	
	
	
	//객체를 출력시 data필드의 값을 출력
	@Override
	public String toString() {
	
		return " "+data+ " ";
	}
	
	
}








public class Set_Mechanism {
	
	public static void main(String[] args) {
		
		// Set<E> : 1. 방번호[index]가 존재하지 않는다. 
		//			2. 중복된 값을 넣을 수 없다.
		//				- Set에 중복된 값을 넣지 못하도록 하기 위해서는 Object의 2개의 메소드가 재정의 되어있어야한다.
		//				- 객체의 특정 필드의 hashCode(), equals() 가 재정의 되어있어야함.
		//				- <E>에 들어갈 수 있는것 : (Wrapper Class : Boolean, Byte, Short, Integer, Long, Float, Double, Character), String
		//										이것들은 이미 재정의 해놓음.
		//										자신이 생성한 특정한 클래스(Type)를 set에 넣을 경우 : Object의 hashCode(), equals()메소드를 재정의 해야함.
	
	
		//1. Set에 Wrapper class : Integer 를 사용한 경우. 중복된 값이 저장되지 않는다.
		Set<Integer> hSet1 = new HashSet();
		hSet1.add(22);
		hSet1.add(33);
		hSet1.add(22);
		hSet1.add(33);
		hSet1.add(33);
	
		System.out.println(hSet1);
		System.out.println(hSet1.size());
	
		
		
		
		//2. Set에 Wrapper class가 아닌 일반 클래스를 사용한 경우:
		Set<A> hset2 = new HashSet();
		hset2.add(new A(22));
		hset2.add(new A(22));
		hset2.add(new A(22));
		hset2.add(new A(22));
		hset2.add(new A(22));
		hset2.add(new A(22));
		hset2.add(new A(22));
	
		System.out.println(hset2);
		System.out.println(hset2.size());		//7개가 들어가있음.
	
	
		
		
		//3. Set에 B : data 필드에 대해서 hashCode(), equals()재정의 함.
		Set<B> hset3 = new HashSet();
		hset3.add(new B(33));
		hset3.add(new B(33));
		hset3.add(new B(33));
		hset3.add(new B(33));
		hset3.add(new B(33));
		hset3.add(new B(33));
		hset3.add(new B(33));
		
		System.out.println(hset3);			//하나의 값만 있음. 재정의하고 돌리면 자동으로 중복된 값이 없어짐.
		System.out.println(hset3.size());	//같은 값이면 hashCode가 같아서 같은걸로 취급됨. Wrapper클래스는 이과정이 자동으로 되어있음. 내가 만든건 오버라이딩해서 만들어야 이과정이 진행됨.

		
	
	}

}
