import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventoryClass extends JFrame implements ActionListener {
    JPanel sidebar;
    JPanel body;
    JLabel head;
    JButton goods;
    JButton issued;
    JButton vendors;
    JButton bills;
    JButton expired;
    JSeparator line;
    ImageIcon box = new ImageIcon("Box.png");
    ImageIcon users = new ImageIcon("Users.png");
    ImageIcon shopremove =new ImageIcon("shopremove.png");
    ImageIcon receipt = new ImageIcon("Bill.png");
    ImageIcon warning = new ImageIcon("warning.png");
    
    InventoryClass(){
        //sidebar
        sidebar = new JPanel();
        sidebar.setBackground(new Color(0x2B4461));
        sidebar.setBounds(0, 0, 300, 982);
        sidebar.setLayout(null);

        //line on sidebar
        line = new JSeparator();
        line.setBackground(new Color(0xFFFFFF));
        line.setBounds(0, 109, 300, 2);

        //Inventory : text on sidebar
        head = new JLabel();
        head.setText("Inventory.");
        head.setBounds(40,40,127,29);
        head.setForeground(new Color(0xFFFFFF));
        head.setFont(new Font("Poppins",Font.BOLD,24));

        //Goods button
        goods = new JButton();
        goods.setBounds(0, 159, 300, 62);
        goods.setText("Goods");
        goods.setFocusable(false);
        goods.setIcon(box);
        goods.setIconTextGap(16);
        goods.setFont(new Font("Poppins", Font.PLAIN,20));
        goods.setForeground(new Color(0xFFFFFF));
        goods.setBackground(new Color(0x416894));
        goods.setBorder(BorderFactory.createEmptyBorder());

        //Issued button
        issued = new JButton();
        issued.setBounds(0, 229, 300, 62);
        issued.setText("Issued");
        issued.setFocusable(false);
        issued.setIcon(shopremove);
        issued.setIconTextGap(16);
        issued.setFont(new Font("Poppins", Font.PLAIN,20));
        issued.setForeground(new Color(0xFFFFFF));
        issued.setBackground(new Color(0x2B4461));
        issued.setBorder(BorderFactory.createEmptyBorder());

        //Vendors button
        vendors = new JButton();
        vendors.setBounds(0, 299, 300, 62);
        vendors.setText("Vendors");
        vendors.setFocusable(false);
        vendors.setIcon(users);
        vendors.setIconTextGap(16);
        vendors.setFont(new Font("Poppins", Font.PLAIN,20));
        vendors.setForeground(new Color(0xFFFFFF));
        vendors.setBackground(new Color(0x2B4461));
        vendors.setBorder(BorderFactory.createEmptyBorder());

        //Bills button
        bills = new JButton();
        bills.setBounds(0, 369, 300, 62);
        bills.setText("Bills");
        bills.setFocusable(false);
        bills.setIcon(receipt);
        bills.setIconTextGap(16);
        bills.setFont(new Font("Poppins", Font.PLAIN,20));
        bills.setForeground(new Color(0xFFFFFF));
        bills.setBackground(new Color(0x2B4461));
        bills.setBorder(BorderFactory.createEmptyBorder());

        //Expired button
        expired = new JButton();
        expired.setBounds(0, 439, 300, 62);
        expired.setText("Expired");
        expired.setFocusable(false);
        expired.setIcon(warning);
        expired.setIconTextGap(16);
        expired.setFont(new Font("Poppins", Font.PLAIN,20));
        expired.setForeground(new Color(0xFFFFFF));
        expired.setBackground(new Color(0x2B4461));
        expired.setBorder(BorderFactory.createEmptyBorder());

        //Body : container for other components
        body = new JPanel();
        body.setBackground(new Color(0xF6F6F6));
        body.setBounds(300, 0, 1212, 982);
        body.setLayout(null);

        //entire app
        this.setTitle("Inventory");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.white);
        this.add(sidebar);
        this.add(body);
        sidebar.add(head);
        sidebar.add(goods);
        sidebar.add(issued);
        sidebar.add(vendors);
        sidebar.add(bills);
        sidebar.add(expired);
        sidebar.add(line);
    }
    @Override
    public void actionPerformed(ActionEvent e){

    }
}
