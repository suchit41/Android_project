
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
    public class StudentDao {

        public static int ADDButton(Student a){
            int status=0;
            try{
                Connection con=database.getCon();

                PreparedStatement ps=con.prepareStatement("insert into feereport_test(name,moodle_id,email,contactno) values(?,?,?,?)");
              //  PreparedStatement ps=con.prepareStatement("insert into feereport_student(name,email,course,fee,paid,due,address,city,state,country,contactno) values(?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1,a.getName());
                ps.setString(2,String.valueOf(a.getEmail()));
                ps.setString(3,String.valueOf(a.getmoodle_id()));
             //   ps.setString(3, a.getCourse());
             //   ps.setInt(4,a.getFee());
            //    ps.setInt(5,a.getPaid());
             //   ps.setInt(6,a.getDue());
             //   ps.setString(7,a.getAddress());
             //   ps.setString(8,a.getCity());
             //   ps.setString(9,a.getState());
              //  ps.setString(10,a.getCountry());
                ps.setString(4,a.getContactno());
                status=ps.executeUpdate();
                con.close();
            }catch(Exception e){System.out.println(e);}
            return status;
        }
        public static int update(Student a){
            int status=0;
            try{
                Connection con=database.getCon();
                PreparedStatement ps=con.prepareStatement("update feereport_student set name=?,email=?,course=?,fee=?,paid=?,due=?,address=?,city=?,state=?,country=?,contactno=? where rollno=?");
                ps.setString(1,a.getName());
                ps.setString(2,a.getEmail());
                ps.setString(3, a.getCourse());
                ps.setInt(4,a.getFee());
                ps.setInt(5,a.getPaid());
                ps.setInt(6,a.getDue());
                ps.setString(7,a.getAddress());
                ps.setString(8,a.getCity());
                ps.setString(9,a.getState());
                ps.setString(10,a.getCountry());
                ps.setString(11,a.getContactno());
                ps.setInt(12,a.getRollno());
                status=ps.executeUpdate();
                con.close();
            }catch(Exception e){System.out.println(e);}
            return status;
        }
        public static List<Student> view(){
            List<Student> list=new ArrayList<Student>();
            try{
                Connection con=database.getCon();
                PreparedStatement ps=con.prepareStatement("select * from feereport_test");
                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                    Student a=new Student();
                    a.setRollno(rs.getInt("moodle_id"));
                    a.setName(rs.getString("name"));
                    a.setEmail(rs.getString("email"));
                  /*  a.setCourse(rs.getString("course"));
                    a.setFee(rs.getInt("fee"));
                    a.setPaid(rs.getInt("paid"));
                    a.setDue(rs.getInt("due"));
                    a.setAddress(rs.getString("address"));
                    a.setCity(rs.getString("city"));
                    a.setState(rs.getString("state"));
                    a.setCountry(rs.getString("country"));*/
                    a.setContactno(rs.getString("contactno"));
                    list.add(a);
                }
                con.close();
            }catch(Exception e){System.out.println(e);}
            return list;
        }
        public static Student getStudentByRollno(int rollno){
            Student a=new Student();
            try{
                Connection con=database.getCon();
                PreparedStatement ps=con.prepareStatement("select * from feereport_student where rollno=?");
                ps.setInt(1,rollno);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    a.setRollno(rs.getInt("rollno"));
                    a.setName(rs.getString("name"));
                   a.setEmail(rs.getString("email"));
                    a.setCourse(rs.getString("course"));
                    a.setFee(rs.getInt("fee"));
                    a.setPaid(rs.getInt("paid"));
                    a.setDue(rs.getInt("due"));
                    a.setAddress(rs.getString("address"));
                    a.setCity(rs.getString("city"));
                    a.setState(rs.getString("state"));
                    a.setCountry(rs.getString("country"));
                    a.setContactno(rs.getString("contactno"));
                }
                con.close();
            }catch(Exception e){System.out.println(e);}
            return a;
        }
        public static List<Student> due(){
            List<Student> list=new ArrayList<Student>();
            try{
                Connection con=database.getCon();
                PreparedStatement ps=con.prepareStatement("select * from feereport_student where due>0");
                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                    Student a=new Student();
                    a.setRollno(rs.getInt("rollno"));
                    a.setName(rs.getString("name"));
                    a.setEmail(rs.getString("email"));
                    a.setCourse(rs.getString("course"));
                    a.setFee(rs.getInt("fee"));
                    a.setPaid(rs.getInt("paid"));
                    a.setDue(rs.getInt("due"));
                    a.setAddress(rs.getString("address"));
                    a.setCity(rs.getString("city"));
                    a.setState(rs.getString("state"));
                    a.setCountry(rs.getString("country"));
                    a.setContactno(rs.getString("contactno"));
                    list.add(a);
                }
                con.close();
            }catch(Exception e){System.out.println(e);}
            return list;
        }
    }


