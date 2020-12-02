import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Att {
	static Student[] s=new Student[52];
	FileOutputStream fos;
	PrintWriter pw;
	JFrame frame;
	JLabel fileName;
	JLabel studName;
	JPanel panel;
	JTextField userText;
	JButton create;
	JButton present;
	JButton absent;
	JButton finish;
	int ind=0;

	public Att(){
		frame = new JFrame("Attendence CSV");
		frame.setSize(400, 500);
		  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fileName = new JLabel("File Name:");
		fileName.setBounds(10,20,80,25);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        
        create = new JButton("Create");
        create.setBounds(100, 80, 80, 25);
        create.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e){ 
		        try {
		        	frame.setVisible(false);
					create();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
		    } 
		});
        present = new JButton("present");
        present.setBounds(100, 200, 80, 25);
        absent = new JButton("absent");
        absent.setBounds(180, 200, 80, 25);
        
        present.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e){ 
		    	if(ind>=s.length) {
		    		exit();
		    	}
		    	if(ind<s.length) {
		    		pw.println(s[ind].roll+","+s[ind].name+","+"Present");
		    		ind++;
		    	}
		    	else
		    		return;
		    	
		    	if(ind<s.length) {
		    	studName.setText("Roll No: "+s[ind].roll+"		Name : "+s[ind].name);
		        
				
		    	}
		    	else
		    		return;
		    } 
		});
        
        absent.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e){ 
		    	if(ind>=s.length) {
		    		exit();
		    	}
		    	if(ind<s.length) {
		    		pw.println(s[ind].roll+","+s[ind].name+","+"Absent");
		    		ind++;
		    	}
		    	else
		    		return;
		    	
		    	if(ind<s.length) {
		    	studName.setText("Roll No: "+s[ind].roll+"		Name : "+s[ind].name);
		        
				
		    	}
		    	else
		    		return;
		    } 
		});
        
        finish = new JButton("finish");
        finish.setBounds(300,420, 80, 25);
        finish.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e){ 
		        exit();
		    } 
		});
        
        panel.add(userText);
		
		frame.add(panel);
		
		panel.add(create);
		
		panel.add(present);
		panel.add(absent);
		panel.add(finish);
		panel.add(fileName);
		
		
		frame.setVisible(true);
		
	}
	
	protected void exit() {
		pw.close();
		System.exit(0);
	}

	public void create() throws FileNotFoundException {
		String file =userText.getText();
		file=file.concat(".csv");
		fos=new FileOutputStream(file, true);
		pw=new PrintWriter(fos);
		pw.println("Roll No,Name,Attendence");
		for(int i=0;i<s.length;i++) {
			s[i]=new Student();
			s[i].roll=i+1;
		}
		fillnames();
		
		studName=new JLabel("Roll No: "+s[ind].roll+"		Name : "+s[ind].name);
        studName.setBounds(10,130,400,25);
		panel.add(studName);
		frame.add(panel);
		frame.setVisible(true);
		

	}
	
	public static void main(String[] args) throws FileNotFoundException {
		new Att();
	}
	
	static void fillnames() {
			s[0].name="Amit Kumar Jagmohan Prasad";
			s[1].name="Auti Yash Dnyandeo ";
			s[2].name="Bajaj Karan Rakesh";
			s[3].name="Bakre Siddhesh Abhay";
			s[4].name="Balghare Mayur Vijay";
			s[5].name="Bamane Arpita Dattatraya";
			s[6].name="Bangera Nihar Shivram";
			s[7].name="Bhagat Hardik Santosh";
			s[8].name="Bhandare Atharv Sandip";
			s[9].name="Birru Shirisha Upendar";
			s[10].name="Chavan Sahil Sanjay";
			s[11].name="Chilkewar Rudratej Laxman";
			s[12].name="Chitte Harshal Rajendra";
			s[13].name="Dalvi Nishant Uday";
			s[14].name="Devkar Shreya Nitin";
			s[15].name="Dixit Prasanna Vinayak";
			s[16].name="Doharey Sapna Subhashchandra";
			s[17].name="Fernando Karon Arasu";
			s[18].name="Gaikwad Saurabh Sunil";
			s[19].name="Gajra Priyank Bipin";
			s[20].name="Gaonkar Jidnya Jagdish";
			s[21].name="Gawali Manali Ramchandra";
			s[22].name="Gore Shubham Dilip";
			s[23].name="Gunjawate Shrushti Shankar";
			s[24].name="Gupta Nilanjana Pradeep";
			s[25].name="Guram Tanay Raghunath";
			s[26].name="Gusain Viveksingh Brijmohan";
			s[27].name="Indulkar Sumedh Nilesh";
			s[28].name="Ingle Chandrashekhar Gopal";
			s[29].name="Jaiswal Arunkumar Rameshwarlal";
			s[30].name="Jha Suraj Kumar Kailash";
			s[31].name="Kadam Payal Harishchandra";
			s[32].name="Karanjekar Isha Mahadev";
			s[33].name="Kedia Krishna Pawan";
			s[34].name="Khatri Keval Hitesh";
			s[35].name="Konar Madhankumar Murugeshan";
			s[36].name="Lad Siddhi Sanjay";
			s[37].name="Ladkar Mansi Ashok";
			s[38].name="Mahato Nivedita Madan";
			s[39].name="Mateen Ahmed Wasim Qureshi";
			s[40].name="Mhatre Niraj Ashish";
			s[41].name="Mhatre Sudhiksha Milind";
			s[42].name="Momin Kaynat Vakeel Ahd";
			s[43].name="I Aryan Murthy";
			s[44].name="Naik Tejas Vilas";
			s[45].name="Nile Divya Arun";
			s[46].name="Oroskar Rohit Vasudev";
			s[47].name="Arkaprabha";
			s[48].name="Patil Sojal";
			s[49].name="Kushagar";
			s[50].name="Bagwe Gaurang Prabhakar";
			s[51].name="Hegde Kartik";		
	}

}


class Student {
	public int roll;
	public String name;
}
