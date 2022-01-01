import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ADD_STUDENT extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton CLEARButton;
    private JButton ADDButton;
    private JButton BACKButton;
    private JPanel ASJP;
    public JPasswordField passwordField1;
    public JPasswordField passwordField2;
    private JMenuBar menuBar;
    private JToolBar toolBar = new JToolBar();
    private JMenu testMenu = new JMenu("Test");
    private JMenuItem disableActionItem = new JMenuItem("Disable the Action");


    ADD_STUDENT() {
        setContentPane(ASJP);
        setTitle("add students");
        setSize(400, 300);
        this.setJMenuBar(menuBar);
        getToolkit();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        BACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                newoptionform m = new newoptionform();
                m.setVisible(true);

            }
        });
     /*   ADDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText();
                int moodle_id = Integer.parseInt(textField2.getText());
                String gmail = textField3.getText();
                int contact = Integer.parseInt(textField4.getText());
                Student s1 = new Student(name, moodle_id, gmail, contact);
                System.out.println("enter in data base");
                int status = database.save(s1);
                System.out.println("data added succesfully" + status);
                if (status > 0) {
                    JOptionPane.showMessageDialog(null, "added sucessfully");
                    dispose();
                    ADD_STUDENT obj = new ADD_STUDENT();
                    obj.repaint();
                } else {
                }
                dispose();
                JOptionPane.showMessageDialog(null, "unable to add");
                ADD_STUDENT obj = new ADD_STUDENT();
                obj.repaint();
            }
        });
*/
        CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ADD_STUDENT obj = new ADD_STUDENT();

                if (textField1 != null && textField2 != null && textField3 != null && textField4 != null) {
                    System.out.println("enter in if block");
                    dispose();
                    obj.repaint();
                } else {
                    JOptionPane.showMessageDialog(null, "fill information");
                }
            }
        });

        ADDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText();
                int moodle_id = Integer.parseInt(textField2.getText());
                String gmail = textField3.getText();
                int contact = Integer.parseInt(textField4.getText());

                //  String course=textField_2.getText();
                //  int fee=Integer.parseInt(textField_3.getText());
                //  int paid=Integer.parseInt(textField_4.getText());
                //  int due=Integer.parseInt(textField_5.getText());
                //  String address=textArea.getText();
                //   String city=textField_6.getText();
                // String state=textField_7.getText();
                // String country=textField_8.getText();

                Student a = new Student(name, moodle_id, gmail, contact);
                int status = database.ADDButton(a);
                // Student s=new Student(name,email,course,fee,paid,due,address,city,state,country,contactno);
                //  int status=StudentDao.save(s);

                if (status > 0) {
                    dispose();
                    JOptionPane.showMessageDialog(ADD_STUDENT.this, "Student added successfully!");
                    ADD_STUDENT A = new ADD_STUDENT();
                    A.repaint();
                    //   textField.setText("");textField_1.setText("");textField_2.setText("");
                    //  textField_3.setText("");textField_4.setText("");textField_5.setText("");
                    //  textField_6.setText("");textField_7.setText("");textField_8.setText("");
                    //  textField_9.setText("");textArea.setText("");
                    // textField1.setText("");
                    // textField2.setText("");
                    // textField3.setText("");
                    //  textField4.setText("");
                } else {
                    dispose();
                    JOptionPane.showMessageDialog(ADD_STUDENT.this, "Sorry, Unable to add student!");
                    ADD_STUDENT A = new ADD_STUDENT();
                    A.repaint();
                }
            }
        });
    }


    public static void main(String[] args) {
        ADD_STUDENT obj1 = new ADD_STUDENT();
        obj1.createUIComponents();

    }


    private void createUIComponents() {
        // TODO: place custom component creation code here

    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        ASJP = new JPanel();
        ASJP.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(8, 3, new Insets(0, 0, 0, 0), -1, -1));
        ASJP.setBackground(new Color(-12828863));
        ASJP.setForeground(new Color(-4473925));
        final JToolBar toolBar1 = new JToolBar();
        ASJP.add(toolBar1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(-1, 20), null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("A.P.SHAH.INSTITUTE OF TECHNOLOGY");
        toolBar1.add(label1);
        final JLabel label2 = new JLabel();
        label2.setForeground(new Color(-15132135));
        label2.setText("NAME");
        ASJP.add(label2, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setForeground(new Color(-15132135));
        label3.setText("MOODLE ID");
        ASJP.add(label3, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setForeground(new Color(-15132136));
        label4.setText("CONTACT NO");
        ASJP.add(label4, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textField1 = new JTextField();
        ASJP.add(textField1, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        textField3 = new JTextField();
        ASJP.add(textField3, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        textField4 = new JTextField();
        ASJP.add(textField4, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        ADDButton = new JButton();
        ADDButton.setText("ADD");
        ASJP.add(ADDButton, new com.intellij.uiDesigner.core.GridConstraints(7, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        CLEARButton = new JButton();
        CLEARButton.setText("CLEAR");
        ASJP.add(CLEARButton, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        BACKButton = new JButton();
        BACKButton.setText("BACK");
        ASJP.add(BACKButton, new com.intellij.uiDesigner.core.GridConstraints(7, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setForeground(new Color(-15132135));
        label5.setText("GMAIL");
        ASJP.add(label5, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textField2 = new JFormattedTextField();
        ASJP.add(textField2, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setForeground(new Color(-15132135));
        label6.setText("PASSWORD");
        ASJP.add(label6, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label7 = new JLabel();
        label7.setForeground(new Color(-15132135));
        label7.setText("CONFIRM PASSWORD");
        ASJP.add(label7, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        passwordField1 = new JPasswordField();
        ASJP.add(passwordField1, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        passwordField2 = new JPasswordField();
        ASJP.add(passwordField2, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return ASJP;
    }

}



