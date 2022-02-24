package com.javatpoint.dao;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;  
import com.javatpoint.beans.Emp;  
  
public class EmpDao {  
JdbcTemplate template;  
  
public void setTemplate(JdbcTemplate template) {  
    this.template = template;  
}  
public int save(Emp p){  
    String sql="insert into stu99(name,age,place,marks) values('"+p.getName()+"',"+p.getAge()+",'"+p.getPlace()+"',"+p.getMarks()+")";  
    return template.update(sql);  
}  
public int update(Emp p){  
    String sql="update stu99 set name='"+p.getName()+"', age="+p.getAge()+",place='"+p.getPlace()+"'marks='"+p.getMarks()+"' where id="+p.getId()+"";  
    return template.update(sql);  
}  
public int delete(int id){  
    String sql="delete from stu99 where id="+id+"";  
    return template.update(sql);  
}  
public Emp getEmpById(int id){  
    String sql="select * from stu99 where id=?";  
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));  
}  
public List<Emp> getEmployees(){  
    return template.query("select * from stu99",new RowMapper<Emp>(){  
        public Emp mapRow(ResultSet rs, int row) throws SQLException {  
            Emp e=new Emp();  
            e.setId(rs.getInt(1));  
            e.setName(rs.getString(2));  
            e.setAge(rs.getInt(3));  
            e.setPlace(rs.getString(4));
            e.setMarks(rs.getInt(5));  
            return e;  
        }  
    });  
}  
}  