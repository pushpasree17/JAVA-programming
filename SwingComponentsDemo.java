import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingComponentsDemo {

    public static void main(String[] args) {
      JWindow window = new JWindow();
        JLabel wl = new JLabel("Welcome to Swing Demo", JLabel.CENTER);
        wl.setFont(new Font("Arial", Font.BOLD, 18));
        window.add(wl);
        window.setSize(300,150);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        try { Thread.sleep(2000); } catch(Exception e){}
        window.setVisible(false);

        
        JFrame frame = new JFrame("Swing Components Example");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10,2));

       
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        
        JCheckBox cbJava = new JCheckBox("Java");
        JCheckBox cbPython = new JCheckBox("Python");

       
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

       
        String city[] = {"Chennai","Delhi","Mumbai","Bangalore"};
        JComboBox combo = new JComboBox(city);

        
        String courses[] = {"AI","IoT","Cyber Security","Data Science"};
        JList list = new JList(courses);

        
        JTextArea area = new JTextArea(3,20);
        JScrollPane scroll = new JScrollPane(area);

        
        JToggleButton toggle = new JToggleButton("ON / OFF");

      
        JButton submit = new JButton("Submit");

        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

               
                JDialog dialog = new JDialog(frame,"Message",true);
                dialog.setSize(200,150);
                dialog.setLayout(new FlowLayout());

                JLabel msg = new JLabel("Form Submitted!");
                JButton ok = new JButton("OK");

                ok.addActionListener(ev -> dialog.dispose());

                dialog.add(msg);
                dialog.add(ok);
                dialog.setLocationRelativeTo(frame);
                dialog.setVisible(true);
            }
        });

        
        panel.add(nameLabel);
        panel.add(nameField);

        panel.add(new JLabel("Skills:"));
        panel.add(cbJava);
        panel.add(new JLabel(""));
        panel.add(cbPython);

        panel.add(new JLabel("Gender:"));
        panel.add(male);
        panel.add(new JLabel(""));
        panel.add(female);

        panel.add(new JLabel("City:"));
        panel.add(combo);

        panel.add(new JLabel("Course List:"));
        panel.add(new JScrollPane(list));

        panel.add(new JLabel("Address:"));
        panel.add(scroll);

        panel.add(toggle);
        panel.add(submit);

        frame.add(panel);
        frame.setVisible(true);
    }
}