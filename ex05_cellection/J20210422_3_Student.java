package ex05_cellection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


//학생클래스
//필드:번호,이름, 전화번호

class Student{
	private int no;
	private String name;
	private String tel;
	
	Student(){}
	public Student(int no, String name, String tel) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
	}
	
	public int getno() {
		return no;
	}
	public void setno(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", tel=" + tel + "]";
	}
	
}

public class J20210422_3_Student {

	public static void main(String[] args) {
//		Student std1 = new Student(1,"태준","5444-2321");
//		Student std2 = new Student(2,"히누","5322-8883");
//		Student std3 = new Student(3,"로키","9533-6753");
		
//		List<Student> arrstd = new ArrayList<>();
//		
//
//		arrstd.add(std1);
//		arrstd.add(std2);
//		arrstd.add(std3);
//		System.out.println(arrstd);
//		
////		for (int i = 0; i < arrstd.size(); i++) {
//////			System.out.println(arrstd.get(i));
////			Student s = arrstd.get(i);
////			System.out.println(s.getno() + " "+s.getName()+" "+s.getTel());
////		}
//		for (Student std : arrstd) {
//			System.out.println(std.getno()+" 번 이름: "+std.getName()+" 전화번호: "+std.getTel());
//		}
		
//		Student std1 = new Student(1,"태준","5444-2321");
//		Student std2 = new Student(3,"히누","5322-8883");
//		Student std3 = new Student(5,"로키","9533-6753");
		
		
//		Map<Integer,Student> hmap = new HashMap<>();
//		hmap.put(std1.getno(),std1);
//		hmap.put(std2.getno(),std2);
//		hmap.put(std3.getno(),std3);
////		System.out.println(hmap);
//		
////		for (int i = 0; i < hmap.size(); i++) {
////			System.out.println(hmap.get(i+1));
////		}
//		
////		Student s = hmap.get(5);
////		System.out.println(s.getno()+" "+s.getName()+" "+s.getTel());
//		
//		//Set:중복되지 않은 데이터들, 순서가 없다
//		 Set<Integer> s1 = hmap.keySet();
////		 System.out.println(s1);
////		
////		 for (Integer s : s1) {
////			System.out.println(s);
////		}
//		 
////		 for (int i = 0; i < s1.size(); i++) {
////			System.out.println(s1.);
////		}
//		
//		 Iterator<Integer> it = s1.iterator(); 
//		 while(it.hasNext()) {
//			 int key = it.next();
////			 System.out.println(key);
//			 Student b = hmap.get(key);
//			 System.out.println(b.getno()+" "+b.getName()+" "+b.getTel());
//		 }
//	}

		//실습) 
		//result : "success"
		//data : ArrayList<Student>
		Student std1 = new Student(1,"태준","5444-2321");
		Student std2 = new Student(3,"히누","5322-8883");
		Student std3 = new Student(5,"로키","9533-6753");
		Map<String, Object> hmap = new HashMap<>();
		hmap.put("result", "success");
		
		List<Student> sl = new ArrayList<>();	
		sl.add(std1);
		sl.add(std2);
		sl.add(std3);
//		System.out.println(sl);
		
		hmap.put("data",sl);
		System.out.println(hmap);
	
//		Object obj = hmap.get("result");
//		System.out.println(obj);
//		
		String result = (String)hmap.get("result");//다운캐스팅
		
		//만약 result가 success라면 학생정보 출력
		//아니면 에러
		
		if (result.equals("success") ) {
			System.out.println("성공");
			List<Student> stdlist = (List<Student>)hmap.get("data");
			System.out.println(stdlist);
			for(Student s : stdlist) {
				System.out.println(s);
				System.out.println(s.getno()+" "+s.getName()+" "+s.getTel());
			}
		}else {
			System.out.println("에러");
		}
		
	
	
	
	}
		
}
