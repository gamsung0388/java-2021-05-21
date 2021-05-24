package ex07_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210427_1_emp2 {

	public static void main(String[] args) {
		// 사원테이블에서 연봉이 10000이상인 사원의
		// employee id firstname salary 조회
		// 연봉의 내림차순 정렬
		Connection con = DBConn.getConn();
		List<EmployeesDTO2> list = new ArrayList<>();//DATE형으로
		ResultSet rs =null;
		Statement stmt = null;
		try {
			
			String sql = "SELECT E.EMPLOYEE_ID,E.FIRST_NAME,E.HIRE_DATE,E.SALARY FROM EMPLOYEES E WHERE SALARY>=10000 ORDER BY E.SALARY DESC";
			stmt = con.createStatement();
			rs =stmt.executeQuery(sql);//조회
			while(rs.next()){
				int employee_id = rs.getInt("employee_id");
				String first_name = rs.getString("first_name");
				int salary = rs.getInt("salary");
				Date hire_date = rs.getDate("Hire_date");
				EmployeesDTO2 edto = new EmployeesDTO2(employee_id,first_name,hire_date,salary);
				list.add(edto);
			}
			
		} catch (SQLException e) {
			System.out.println("sql문 예외");
			e.printStackTrace();
		} 
		
		System.out.println(list);
		for (EmployeesDTO2 dto : list) {
			System.out.println(dto.getEmployee_id()+ " /"+ dto.getFirst_name()+" /"+ dto.getHire_date() +" /"+dto.getSalary());
		}
		
	}

}
