import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class MyFrame extends JFrame implements ActionListener {

  // Components of the Form
  private Container c;
  private JLabel title;
  private JLabel name;
  private JTextField tname;
  private JLabel mno;
  private JTextField tmno;
  private JLabel email;
  private JTextField temail;
  private JLabel Reenter_email;
  private JTextField tReenter_email;
  private JLabel mobile_no;
  private JTextField tmobile_no;
  private JLabel category;
  private JRadioButton UNIVERSITY;
  private JRadioButton COLLEGE;
  private ButtonGroup gengp;
  private ButtonGroup gengp2;
  private ButtonGroup gengp3;
  private JRadioButton yes;
  private JRadioButton no;
  private JRadioButton yes2;
  private JRadioButton no2;
  private JLabel previous_accr;
  private JLabel DOE;
  private JComboBox date;
  private JComboBox month;
  private JComboBox year;
  private JLabel add;
  private JTextArea tadd;
  private JCheckBox term;
  private JButton sub;
  private JButton reset;
  private JTextArea tout;
  private JLabel res;
  private JTextArea resadd;
  private JButton easwari;

  private String dates[] = {
    "1",
    "2",
    "3",
    "4",
    "5",
    "6",
    "7",
    "8",
    "9",
    "10",
    "11",
    "12",
    "13",
    "14",
    "15",
    "16",
    "17",
    "18",
    "19",
    "20",
    "21",
    "22",
    "23",
    "24",
    "25",
    "26",
    "27",
    "28",
    "29",
    "30",
    "31"
  };
  private String months[] = {
    "Jan",
    "feb",
    "Mar",
    "Apr",
    "May",
    "Jun",
    "July",
    "Aug",
    "Sup",
    "Oct",
    "Nov",
    "Dec"
  };
  private String years[] = {
    "1995",
    "1996",
    "1997",
    "1998",
    "1999",
    "2000",
    "2001",
    "2002",
    "2003",
    "2004",
    "2005",
    "2006",
    "2007",
    "2008",
    "2009",
    "2010",
    "2011",
    "2012",
    "2013",
    "2014",
    "2015",
    "2016",
    "2017",
    "2018",
    "2019"
  };

  // constructor, to initialize the components
  // with default values.
  public MyFrame() {
    JFrame frame = new JFrame();
    setTitle("NAAC Registration");
    setBounds(400, 200, 1000, 800);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    JLabel jname = new JLabel();
    frame.setBackground(Color.BLUE);
    setResizable(false);

    c = getContentPane();
    c.setLayout(null);

    title = new JLabel("NAAC Registration");
    title.setFont(new Font("Arial", Font.PLAIN, 30));
    title.setSize(300, 30);
    title.setLocation(300, 30);
    c.add(title);

    name = new JLabel("Instituition Name");
    name.setFont(new Font("Arial", Font.PLAIN, 20));
    name.setSize(250, 20);
    name.setLocation(30, 100);
    c.add(name);

    tname = new JTextField();
    tname.setFont(new Font("Arial", Font.PLAIN, 15));
    tname.setSize(190, 20);
    tname.setLocation(200, 100);
    c.add(tname);

    mno = new JLabel("Instituition Code");
    mno.setFont(new Font("Arial", Font.PLAIN, 20));
    mno.setSize(200, 20);
    mno.setLocation(30, 150);
    c.add(mno);

    tmno = new JTextField();
    tmno.setFont(new Font("Arial", Font.PLAIN, 15));
    tmno.setSize(150, 20);
    tmno.setLocation(200, 150);
    c.add(tmno);

    email = new JLabel("EMAIL");
    email.setFont(new Font("Arial", Font.PLAIN, 20));
    email.setSize(250, 20);
    email.setLocation(30, 200);
    c.add(email);

    temail = new JTextField();
    temail.setFont(new Font("Arial", Font.PLAIN, 15));
    temail.setSize(190, 20);
    temail.setLocation(200, 200);
    c.add(temail);

    Reenter_email = new JLabel("Reenter_email");
    Reenter_email.setFont(new Font("Arial", Font.PLAIN, 20));
    Reenter_email.setSize(250, 20);
    Reenter_email.setLocation(30, 250);
    c.add(Reenter_email);

    tReenter_email = new JTextField();
    tReenter_email.setFont(new Font("Arial", Font.PLAIN, 15));
    tReenter_email.setSize(190, 20);
    tReenter_email.setLocation(200, 250);
    c.add(tReenter_email);

    mobile_no = new JLabel("MOBILE_NO");
    mobile_no.setFont(new Font("Arial", Font.PLAIN, 20));
    mobile_no.setSize(250, 20);
    mobile_no.setLocation(30, 350);
    c.add(mobile_no);

    tmobile_no = new JTextField();
    tmobile_no.setFont(new Font("Arial", Font.PLAIN, 15));
    tmobile_no.setSize(190, 20);
    tmobile_no.setLocation(200, 350);
    c.add(tmobile_no);

    category = new JLabel("Category");
    category.setFont(new Font("Arial", Font.PLAIN, 20));
    category.setSize(110, 20);
    category.setLocation(30, 300);
    c.add(category);

    UNIVERSITY = new JRadioButton("UNIVERSITY ");
    UNIVERSITY.setFont(new Font("Arial", Font.PLAIN, 10));
    UNIVERSITY.setSelected(true);
    UNIVERSITY.setSize(100, 20);
    UNIVERSITY.setLocation(200, 300);
    c.add(UNIVERSITY);

    COLLEGE = new JRadioButton("COLLEGE");
    COLLEGE.setFont(new Font("Arial", Font.PLAIN, 10));
    COLLEGE.setSelected(false);
    COLLEGE.setSize(80, 20);
    COLLEGE.setLocation(300, 300);
    c.add(COLLEGE);

    gengp = new ButtonGroup();
    gengp.add(UNIVERSITY);
    gengp.add(COLLEGE);

    category = new JLabel("HostelAvail");
    category.setFont(new Font("Arial", Font.PLAIN, 20));
    category.setSize(200, 20);
    category.setLocation(30, 450);
    c.add(category);

    yes = new JRadioButton("yes");
    yes.setFont(new Font("Arial", Font.PLAIN, 10));
    yes.setSelected(true);
    yes.setSize(100, 20);
    yes.setLocation(200, 450);
    c.add(yes);

    no = new JRadioButton("no");
    no.setFont(new Font("Arial", Font.PLAIN, 10));
    no.setSelected(false);
    no.setSize(80, 20);
    no.setLocation(300, 450);
    c.add(no);

    gengp2 = new ButtonGroup();
    gengp2.add(yes);
    gengp2.add(no);

    DOE = new JLabel("Establishment date");
    DOE.setFont(new Font("Arial", Font.PLAIN, 18));
    DOE.setSize(200, 20);
    DOE.setLocation(30, 500);
    c.add(DOE);

    date = new JComboBox(dates);
    date.setFont(new Font("Arial", Font.PLAIN, 15));
    date.setSize(50, 20);
    date.setLocation(200, 500);
    c.add(date);

    month = new JComboBox(months);
    month.setFont(new Font("Arial", Font.PLAIN, 15));
    month.setSize(60, 20);
    month.setLocation(250, 500);
    c.add(month);

    year = new JComboBox(years);
    year.setFont(new Font("Arial", Font.PLAIN, 15));
    year.setSize(60, 20);
    year.setLocation(320, 500);
    c.add(year);

    add = new JLabel("Courses Offered");
    add.setFont(new Font("Arial", Font.PLAIN, 20));
    add.setSize(100, 20);
    add.setLocation(30, 550);
    c.add(add);

    tadd = new JTextArea();
    tadd.setFont(new Font("Arial", Font.PLAIN, 15));
    tadd.setSize(200, 75);
    tadd.setLocation(200, 550);
    tadd.setLineWrap(true);
    c.add(tadd);

    previous_accr = new JLabel("Are you previously accredited");
    previous_accr.setFont(new Font("Arial", Font.PLAIN, 20));
    previous_accr.setSize(400, 20);
    previous_accr.setLocation(30, 400);
    c.add(previous_accr);

    yes2 = new JRadioButton("yes");
    yes2.setFont(new Font("Arial", Font.PLAIN, 10));
    yes2.setSelected(true);
    yes2.setSize(100, 20);
    yes2.setLocation(300, 400);
    c.add(yes2);

    no2 = new JRadioButton("no");
    no2.setFont(new Font("Arial", Font.PLAIN, 10));
    no2.setSelected(false);
    no2.setSize(80, 20);
    no2.setLocation(400, 400);
    c.add(no2);

    gengp3 = new ButtonGroup();
    gengp3.add(yes2);
    gengp3.add(no2);

    term = new JCheckBox("Accept Terms And Conditions.");
    term.setFont(new Font("Arial", Font.PLAIN, 15));
    term.setSize(250, 20);
    term.setLocation(150, 650);
    c.add(term);

    sub = new JButton("Submit");
    sub.setFont(new Font("Arial", Font.PLAIN, 15));
    sub.setSize(100, 20);
    sub.setLocation(150, 700);
    sub.addActionListener(this);
    c.add(sub);

    reset = new JButton("Reset");
    reset.setFont(new Font("Arial", Font.PLAIN, 15));
    reset.setSize(100, 20);
    reset.setLocation(270, 700);
    reset.addActionListener(this);
    c.add(reset);

    tout = new JTextArea();
    tout.setFont(new Font("Arial", Font.PLAIN, 15));
    tout.setSize(300, 400);
    tout.setLocation(500, 100);
    tout.setLineWrap(true);
    tout.setEditable(false);
    c.add(tout);

    res = new JLabel("");
    res.setFont(new Font("Arial", Font.PLAIN, 20));
    res.setSize(500, 25);
    res.setLocation(100, 730);
    c.add(res);

    easwari = new JButton("Feedback");
    easwari.setFont(new Font("Arial", Font.PLAIN, 15));
    easwari.setSize(150, 20);
    easwari.setLocation(580, 530);
    easwari.addActionListener(this);
    c.add(easwari);

    resadd = new JTextArea();
    resadd.setFont(new Font("Arial", Font.PLAIN, 15));
    resadd.setSize(200, 150);
    resadd.setLocation(580, 730);
    resadd.setLineWrap(true);
    c.add(resadd);

    setVisible(true);
  }

  // method actionPerformed(),to get the action performed,by the user and act accordingly
  final public void actionPerformed(ActionEvent e) {
    if (e.getSource() == sub) {
      if (term.isSelected()) {
        final String data1, data4, data5;

        final String data
          = "\nName : " +
          tname.getText() + "\n" +
          "Code : " +
          tmno.getText() + "\n" +
          "email :" + temail.getText() + "\n" +
          "mobile_no :" + tmobile_no.getText() + "\n";
        if (UNIVERSITY.isSelected())
          data1 = "Category : UNIVERSITY " +
          "\n";
        else
          data1 = "Category : COLLEGE" +
          "\n";
        if (yes2.isSelected())
          data4 = "\nPreviously Accredited : Yes" + "\n";
        else
          data4 = "\nPreviously Accredited : No" + "\n";
        if (yes.isSelected())
          data5 = "Hostel Availability : Yes";
        else
          data5 = "Hostel Availability : No";

        final String data2
          = "DOE : " +
          (String) date.getSelectedItem() +
          "/" + (String) month.getSelectedItem() +
          "/" + (String) year.getSelectedItem() +
          "\n";

        String data3 = "Courses : " + tadd.getText();
        tout.setText(data + data1 + data2 + data3 + data4 + data5);
        tout.setEditable(false);
        res.setText("Registration Successful");

        try {
          File file = new File("input.txt");
          if (!file.exists()) {
            file.createNewFile();
          }
          FileWriter fw = new FileWriter(file, true);
          BufferedWriter bw = new BufferedWriter(fw);
          PrintWriter pw = new PrintWriter(bw);
          //This will add a new line to the file content
          pw.println("");
          pw.println(data1 + data2 + data3 + data4 + data5 + data);
          pw.close();

          System.out.println("Data successfully appended at the end of file");

        } catch (IOException ioe) {
          System.out.println("Exception occurred:");
          ioe.printStackTrace();
        }

      } else {
        tout.setText("");
        resadd.setText("");
        res.setText("Please accept the" +
          " terms & conditions..");
      }

    } else if (e.getSource() == reset) {

      String def = "";
      tname.setText(def);
      tadd.setText(def);
      tmno.setText(def);
      res.setText(def);
      tout.setText(def);
      term.setSelected(false);
      date.setSelectedIndex(0);
      month.setSelectedIndex(0);
      year.setSelectedIndex(0);
      resadd.setText(def);
    }

    if (e.getSource() == easwari) {

      try {
        URI uri = new URI("https://srmeaswari.ac.in/");
        java.awt.Desktop.getDesktop().browse(uri);

      } catch (URISyntaxException | IOException e3) {
        e3.printStackTrace();
      }

    }
  }

}

// Driver Code
class Registration2 {

  public static void main(String[] args) throws Exception {
    MyFrame fi = new MyFrame();
  }
}
