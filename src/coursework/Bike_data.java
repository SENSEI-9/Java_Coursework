package coursework;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bike_data implements ActionListener {
	ImageIcon images1,images2,images3,images4,images5,images6,image7,image8,image9;
	JLabel lbl_images1,lbl_images2,lbl_images3,lbl_images4,lbl_images5,lbl_images6,lbl_images7,lbl_images8,lbl_images9;
	JButton bike1,bike2,bike3,bike4,bike5,bike6,bike7,bike8,bike9;
	JPanel bikea,bikeb,bikec,biked,bikee,bikef,bikeg,bikeh,bikei;
	
	public Bike_data(JPanel q) {
		bike1=new JButton("BIKE 1");
		bike1.setBounds(10, 10,150, 50);

		bike1.addActionListener(this);

		bike1.setForeground(new Color(16,1,35));
		bike1.setBackground(new Color(226,11,183));
		q.add(bike1);
		
		
		bike2=new JButton("BIKE 2");
		bike2.setBounds(170, 10,150, 50);
		bike2.setForeground(new Color(226,11,183));	
		bike2.setBackground(new Color(16,1,35));
		bike2.addActionListener(this);
		q.add(bike2);
		
		bike3=new JButton("BIKE 3");
		bike3.setBounds(330, 10,150, 50);
		bike3.setForeground(new Color(226,11,183));	
		bike3.setBackground(new Color(16,1,35));
		bike3.addActionListener(this);
		q.add(bike3);
		
		bike4=new JButton("BIKE 4");
		bike4.setBounds(490, 10,150, 50);
		bike4.setForeground(new Color(226,11,183));	
		bike4.setBackground(new Color(16,1,35));
		bike4.addActionListener(this);
		q.add(bike4);
		
		bike5=new JButton("BIKE 5");
		bike5.setBounds(650, 10,150, 50);
		bike5.setForeground(new Color(226,11,183));	
		bike5.setBackground(new Color(16,1,35));
		bike5.addActionListener(this);
		q.add(bike5);

		bike6=new JButton("BIKE 6");
		bike6.setBounds(810, 10,150, 50);
		bike6.setForeground(new Color(226,11,183));
		bike6.setBackground(new Color(16,1,35));
		bike6.addActionListener(this);
		q.add(bike6);
		
		bike7=new JButton("BIKE 7");
		bike7.setBounds(810, 10,150, 50);
		bike7.setForeground(new Color(226,11,183));
		bike7.setBackground(new Color(16,1,35));
		bike7.addActionListener(this);
		q.add(bike7);
		
		bike8=new JButton("BIKE 8");
		bike8.setBounds(810, 10,150, 50);
		bike8.setForeground(new Color(226,11,183));
		bike8.setBackground(new Color(16,1,35));
		bike8.addActionListener(this);
		q.add(bike8);
		
		bike9=new JButton("BIKE 8");
		bike9.setBounds(810, 10,150, 50);
		bike9.setForeground(new Color(226,11,183));
		bike9.setBackground(new Color(16,1,35));
		bike9.addActionListener(this);
		q.add(bike9);
		
		bikea=new JPanel();
		bikea.setLayout(null);
		q.add(bikea);
		bikea.setBounds(190,90,488,600);
		
		bikeb=new JPanel();
		bikeb.setLayout(null);
		q.add(bikeb);
		
		bikec=new JPanel();
		bikec.setLayout(null);
		q.add(bikec);
		
		biked=new JPanel();	
		biked.setLayout(null);
		q.add(biked);
		
		bikee=new JPanel();	
		bikee.setLayout(null);
		q.add(bikee);

		bikef=new JPanel();
		bikef.setLayout(null);
		q.add(bikef);
		
		bikeg=new JPanel();
		bikeg.setLayout(null);
		q.add(bikeg);
		
		bikeh=new JPanel();
		bikeh.setLayout(null);
		q.add(bikeh);
		
		bikei=new JPanel();
		bikei.setLayout(null);
		q.add(bikei);
		
		images1= new ImageIcon("tnt135.jpg");
		lbl_images1=new JLabel(images1);
		lbl_images1.setBounds(0, 0, 488, 600);
		lbl_images1.setLayout(null);
		bikea.add(lbl_images1);
		
		images2= new ImageIcon("tnt15.jpg");
		lbl_images2=new JLabel(images2);
		lbl_images2.setBounds(0, 0, 542, 600);
		lbl_images2.setLayout(null);
		bikeb.add(lbl_images2);
		
		images3= new ImageIcon("tnt150i.jpg");
		lbl_images3=new JLabel(images3);
		lbl_images3.setBounds(0, 0, 510, 600);
		lbl_images3.setLayout(null);
		bikec.add(lbl_images3);
		
		images4= new ImageIcon("TRK251.jpg");
		lbl_images4=new JLabel(images4);
		lbl_images4.setBounds(0, 0, 507, 600);
		lbl_images4.setLayout(null);
		biked.add(lbl_images4);
	
		images5= new ImageIcon("180s.jpg");
		lbl_images5=new JLabel(images5);
		lbl_images5.setBounds(0, 0, 472, 600);
		lbl_images5.setLayout(null);
		bikee.add(lbl_images5);

		images6= new ImageIcon("leoncino250.jpg");
		lbl_images6=new JLabel(images6);
		lbl_images6.setBounds(0, 0, 485, 600);
		lbl_images6.setLayout(null);
		bikef.add(lbl_images6);
		
		images6= new ImageIcon("302s.jpg");
		lbl_images6=new JLabel(images6);
		lbl_images6.setBounds(0, 0, 485, 600);
		lbl_images6.setLayout(null);
		bikeg.add(lbl_images6);
		
		images6= new ImageIcon("tnt600i.jpg");
		lbl_images6=new JLabel(images6);
		lbl_images6.setBounds(0, 0, 485, 600);
		lbl_images6.setLayout(null);
		bikeh.add(lbl_images6);
		
		images6= new ImageIcon("752s.jpg");
		lbl_images6=new JLabel(images6);
		lbl_images6.setBounds(0, 0, 485, 600);
		lbl_images6.setLayout(null);
		bikei.add(lbl_images6);
		
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bike1) {
			bike1.setForeground(new Color(16,1,35));	
			bike1.setBackground(new Color(226,11,183));
			bike2.setForeground(new Color(226,11,183));	
			bike2.setBackground(new Color(16,1,35));
			bike3.setForeground(new Color(226,11,183));	
			bike3.setBackground(new Color(16,1,35));
			bike4.setForeground(new Color(226,11,183));	
			bike4.setBackground(new Color(16,1,35));
			bike5.setForeground(new Color(226,11,183));	
			bike5.setBackground(new Color(16,1,35));
			bike6.setForeground(new Color(226,11,183));
			bike6.setBackground(new Color(16,1,35));
			bike7.setForeground(new Color(226,11,183));
			bike7.setBackground(new Color(16,1,35));
			bike8.setForeground(new Color(226,11,183));
			bike8.setBackground(new Color(16,1,35));
			bike9.setForeground(new Color(226,11,183));
			bike9.setBackground(new Color(16,1,35));
			bikea.setBounds(190,90,488,600);
			bikeb.setBounds(0,0,0,0);
			bikec.setBounds(0,0,0,0);
			biked.setBounds(0,0,0,0);
			bikee.setBounds(0,0,0,0);
			bikef.setBounds(0,0,0,0);
			bikeg.setBounds(0,0,0,0);
			bikeh.setBounds(0,0,0,0);
			bikei.setBounds(0,0,0,0);
		}
		else if (e.getSource()==bike2) {
			bike2.setForeground(new Color(16,1,35));	
			bike2.setBackground(new Color(226,11,183));
			bike1.setForeground(new Color(226,11,183));	
			bike1.setBackground(new Color(16,1,35));
			bike3.setForeground(new Color(226,11,183));	
			bike3.setBackground(new Color(16,1,35));
			bike4.setForeground(new Color(226,11,183));	
			bike4.setBackground(new Color(16,1,35));
			bike5.setForeground(new Color(226,11,183));	
			bike5.setBackground(new Color(16,1,35));
			bike6.setForeground(new Color(226,11,183));
			bike6.setBackground(new Color(16,1,35));
			bike7.setForeground(new Color(226,11,183));
			bike7.setBackground(new Color(16,1,35));
			bike8.setForeground(new Color(226,11,183));
			bike8.setBackground(new Color(16,1,35));
			bike9.setForeground(new Color(226,11,183));
			bike9.setBackground(new Color(16,1,35));
			bikeb.setBounds(190,90,542,600);
			bikea.setBounds(0,0,0,0);
			bikec.setBounds(0,0,0,0);
			biked.setBounds(0,0,0,0);
			bikee.setBounds(0,0,0,0);
			bikef.setBounds(0,0,0,0);
			bikeg.setBounds(0,0,0,0);
			bikeh.setBounds(0,0,0,0);
			bikei.setBounds(0,0,0,0);
			
		}
		else if (e.getSource()==bike3) {
			bike3.setForeground(new Color(16,1,35));	
			bike3.setBackground(new Color(226,11,183));
			bike1.setForeground(new Color(226,11,183));	
			bike1.setBackground(new Color(16,1,35));
			bike2.setForeground(new Color(226,11,183));	
			bike2.setBackground(new Color(16,1,35));
			bike4.setForeground(new Color(226,11,183));	
			bike4.setBackground(new Color(16,1,35));
			bike5.setForeground(new Color(226,11,183));	
			bike5.setBackground(new Color(16,1,35));
			bike6.setForeground(new Color(226,11,183));
			bike6.setBackground(new Color(16,1,35));
			bike7.setForeground(new Color(226,11,183));
			bike7.setBackground(new Color(16,1,35));
			bike8.setForeground(new Color(226,11,183));
			bike8.setBackground(new Color(16,1,35));
			bike9.setForeground(new Color(226,11,183));
			bike9.setBackground(new Color(16,1,35));
			bikec.setBounds(190,90,510,600);
			bikea.setBounds(0,0,0,0);
			bikeb.setBounds(0,0,0,0);
			biked.setBounds(0,0,0,0);
			bikee.setBounds(0,0,0,0);
			bikef.setBounds(0,0,0,0);
			bikeg.setBounds(0,0,0,0);
			bikeh.setBounds(0,0,0,0);
			bikei.setBounds(0,0,0,0);
		}
		else if (e.getSource()==bike4) {
			bike4.setForeground(new Color(16,1,35));	
			bike4.setBackground(new Color(226,11,183));
			bike1.setForeground(new Color(226,11,183));	
			bike1.setBackground(new Color(16,1,35));
			bike2.setForeground(new Color(226,11,183));	
			bike2.setBackground(new Color(16,1,35));
			bike3.setForeground(new Color(226,11,183));	
			bike3.setBackground(new Color(16,1,35));
			bike5.setForeground(new Color(226,11,183));	
			bike5.setBackground(new Color(16,1,35));
			bike6.setForeground(new Color(226,11,183));
			bike6.setBackground(new Color(16,1,35));
			bike7.setForeground(new Color(226,11,183));
			bike7.setBackground(new Color(16,1,35));
			bike8.setForeground(new Color(226,11,183));
			bike8.setBackground(new Color(16,1,35));
			bike9.setForeground(new Color(226,11,183));
			bike9.setBackground(new Color(16,1,35));
			biked.setBounds(190,90,510,600);
			bikea.setBounds(0,0,0,0);
			bikeb.setBounds(0,0,0,0);
			bikec.setBounds(0,0,0,0);
			bikee.setBounds(0,0,0,0);
			bikef.setBounds(0,0,0,0);
			bikeg.setBounds(0,0,0,0);
			bikeh.setBounds(0,0,0,0);
			bikei.setBounds(0,0,0,0);
		}
		else if (e.getSource()==bike5) {
			bike5.setForeground(new Color(16,1,35));	
			bike5.setBackground(new Color(226,11,183));
			bike1.setForeground(new Color(226,11,183));	
			bike1.setBackground(new Color(16,1,35));
			bike2.setForeground(new Color(226,11,183));	
			bike2.setBackground(new Color(16,1,35));
			bike3.setForeground(new Color(226,11,183));	
			bike3.setBackground(new Color(16,1,35));
			bike4.setForeground(new Color(226,11,183));	
			bike4.setBackground(new Color(16,1,35));
			bike6.setForeground(new Color(226,11,183));
			bike6.setBackground(new Color(16,1,35));
			bike7.setForeground(new Color(226,11,183));
			bike7.setBackground(new Color(16,1,35));
			bike8.setForeground(new Color(226,11,183));
			bike8.setBackground(new Color(16,1,35));
			bike9.setForeground(new Color(226,11,183));
			bike9.setBackground(new Color(16,1,35));
			bikee.setBounds(190,90,510,600);
			bikea.setBounds(0,0,0,0);
			bikeb.setBounds(0,0,0,0);
			bikec.setBounds(0,0,0,0);
			biked.setBounds(0,0,0,0);
			bikef.setBounds(0,0,0,0);
			bikeg.setBounds(0,0,0,0);
			bikeh.setBounds(0,0,0,0);
			bikei.setBounds(0,0,0,0);
		}

		else if (e.getSource()==bike6) {
			bike6.setForeground(new Color(16,1,35));	
			bike6.setBackground(new Color(226,11,183));
			bike1.setForeground(new Color(226,11,183));	
			bike1.setBackground(new Color(16,1,35));
			bike2.setForeground(new Color(226,11,183));	
			bike2.setBackground(new Color(16,1,35));
			bike3.setForeground(new Color(226,11,183));	
			bike3.setBackground(new Color(16,1,35));
			bike4.setForeground(new Color(226,11,183));	
			bike4.setBackground(new Color(16,1,35));
			bike5.setForeground(new Color(226,11,183));
			bike5.setBackground(new Color(16,1,35));
			bike7.setForeground(new Color(226,11,183));
			bike7.setBackground(new Color(16,1,35));
			bike8.setForeground(new Color(226,11,183));
			bike8.setBackground(new Color(16,1,35));
			bike9.setForeground(new Color(226,11,183));
			bike9.setBackground(new Color(16,1,35));
			bikef.setBounds(190,90,510,600);
			bikea.setBounds(0,0,0,0);
			bikeb.setBounds(0,0,0,0);
			bikec.setBounds(0,0,0,0);
			biked.setBounds(0,0,0,0);
			bikee.setBounds(0,0,0,0);
			bikeg.setBounds(0,0,0,0);
			bikeh.setBounds(0,0,0,0);
			bikei.setBounds(0,0,0,0);
		}
		
		else if (e.getSource()==bike7) {
			bike7.setForeground(new Color(16,1,35));	
			bike7.setBackground(new Color(226,11,183));
			bike1.setForeground(new Color(226,11,183));	
			bike1.setBackground(new Color(16,1,35));
			bike2.setForeground(new Color(226,11,183));	
			bike2.setBackground(new Color(16,1,35));
			bike3.setForeground(new Color(226,11,183));	
			bike3.setBackground(new Color(16,1,35));
			bike4.setForeground(new Color(226,11,183));	
			bike4.setBackground(new Color(16,1,35));
			bike5.setForeground(new Color(226,11,183));
			bike5.setBackground(new Color(16,1,35));
			bike6.setForeground(new Color(226,11,183));
			bike6.setBackground(new Color(16,1,35));
			bike8.setForeground(new Color(226,11,183));
			bike8.setBackground(new Color(16,1,35));
			bike9.setForeground(new Color(226,11,183));
			bike9.setBackground(new Color(16,1,35));
			bikeg.setBounds(190,90,510,600);
			bikea.setBounds(0,0,0,0);
			bikeb.setBounds(0,0,0,0);
			bikec.setBounds(0,0,0,0);
			biked.setBounds(0,0,0,0);
			bikee.setBounds(0,0,0,0);
			bikef.setBounds(0,0,0,0);
			bikeh.setBounds(0,0,0,0);
			bikei.setBounds(0,0,0,0);
		}
		
		else if (e.getSource()==bike8) {
			bike8.setForeground(new Color(16,1,35));	
			bike8.setBackground(new Color(226,11,183));
			bike1.setForeground(new Color(226,11,183));	
			bike1.setBackground(new Color(16,1,35));
			bike2.setForeground(new Color(226,11,183));	
			bike2.setBackground(new Color(16,1,35));
			bike3.setForeground(new Color(226,11,183));	
			bike3.setBackground(new Color(16,1,35));
			bike4.setForeground(new Color(226,11,183));	
			bike4.setBackground(new Color(16,1,35));
			bike5.setForeground(new Color(226,11,183));
			bike5.setBackground(new Color(16,1,35));
			bike6.setForeground(new Color(226,11,183));
			bike6.setBackground(new Color(16,1,35));
			bike7.setForeground(new Color(226,11,183));
			bike7.setBackground(new Color(16,1,35));
			bike9.setForeground(new Color(226,11,183));
			bike9.setBackground(new Color(16,1,35));
			bikeh.setBounds(190,90,510,600);
			bikea.setBounds(0,0,0,0);
			bikeb.setBounds(0,0,0,0);
			bikec.setBounds(0,0,0,0);
			biked.setBounds(0,0,0,0);
			bikee.setBounds(0,0,0,0);
			bikef.setBounds(0,0,0,0);
			bikeg.setBounds(0,0,0,0);
			bikei.setBounds(0,0,0,0);
		}
		
		else if (e.getSource()==bike9) {
			bike9.setForeground(new Color(16,1,35));	
			bike9.setBackground(new Color(226,11,183));
			bike1.setForeground(new Color(226,11,183));	
			bike1.setBackground(new Color(16,1,35));
			bike2.setForeground(new Color(226,11,183));	
			bike2.setBackground(new Color(16,1,35));
			bike3.setForeground(new Color(226,11,183));	
			bike3.setBackground(new Color(16,1,35));
			bike4.setForeground(new Color(226,11,183));	
			bike4.setBackground(new Color(16,1,35));
			bike5.setForeground(new Color(226,11,183));
			bike5.setBackground(new Color(16,1,35));
			bike6.setForeground(new Color(226,11,183));
			bike6.setBackground(new Color(16,1,35));
			bike7.setForeground(new Color(226,11,183));
			bike7.setBackground(new Color(16,1,35));
			bike8.setForeground(new Color(226,11,183));
			bike8.setBackground(new Color(16,1,35));
			bikei.setBounds(190,90,510,600);
			bikea.setBounds(0,0,0,0);
			bikeb.setBounds(0,0,0,0);
			bikec.setBounds(0,0,0,0);
			biked.setBounds(0,0,0,0);
			bikee.setBounds(0,0,0,0);
			bikef.setBounds(0,0,0,0);
			bikeg.setBounds(0,0,0,0);
			bikeh.setBounds(0,0,0,0);
		}
	}
}