import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class database {
    public static Connection getCon(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fees_system","root","rfid2006");
            System.out.println("connected database");
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
    public static boolean validate(String name,String password){
        boolean status=false;
        try{
            Connection con=getCon();
            PreparedStatement ps=con.prepareStatement("select * from studentdetails where name=? and moodle_id=?");
            ps.setString(1,name);
            ps.setString(2,password);
            ResultSet rs=ps.executeQuery();
            status=rs.next();
            con.close();
        }catch(Exception e){System.out.println(e);}



        return status;
    }
    public static int ADDButton(Student a){
        int status=0;
        try{
            Connection con=getCon();
            PreparedStatement ps=con.prepareStatement("insert into studentdetails (name,moodle_id,gmail,contact) values(?,?,?,?)");
            ps.setString(1, a.getname());
            ps.setString(2, String.valueOf(a.getmoodle_id()));
            ps.setString(3, a.getgmail());
            ps.setString(4, String.valueOf(a.getcontact()));
            status=ps.executeUpdate();
            con.close();

        }catch(Exception e){System.out.println(e);}
        return status;
    }



        public static List<Student> StudentList(){
        List<Student> list;
        list = new ArrayList<>();
        try{
            Connection con=getCon();
            PreparedStatement ps=con.prepareStatement("select * from Studentdetails");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Student a=new Student();
                a.setname(rs.getString(1));
                a.setmoodle_id(rs.getString(2));
                a.setgmail(rs.getString(3));
                a.setcontact(rs.getString(4));
                list.add(a);
            }
            con.close();
        }catch(Exception e){System.out.println(e);}
        return list;
    }



}







