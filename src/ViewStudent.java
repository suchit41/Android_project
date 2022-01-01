import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ViewStudent extends JFrame {
    static ViewStudent frame;
    public ViewStudent() {
        //Code to view data in JTable
        List<Student> list=database.StudentList();
        int size=list.size();

        String data[][]=new String[size][12];
        int row=0;
        for(Student s:list){
            data[row][1]=String.valueOf(s.getRollno());
            data[row][0]=s.getName();
            data[row][2]=s.getEmail();
          /*  data[row][3]=s.getCourse();
            data[row][4]=String.valueOf(s.getFee());
            data[row][5]=String.valueOf(s.getPaid());
            data[row][6]=String.valueOf(s.getDue());
            data[row][7]=s.getAddress();
            data[row][8]=s.getCity();
            data[row][9]=s.getState();
            data[row][10]=s.getCountry();*/
            data[row][3]=String.valueOf(getContactno());

            row++;
        }
        String columnNames[]={"Name","moodle_id","Email","Contact No"};

        JTable jt=new JTable(data,columnNames);
        JScrollPane sp=new JScrollPane(jt);
        add(sp);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 800, 400);
    }

    private long getContactno() {
        return 0;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new ViewStudent();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
