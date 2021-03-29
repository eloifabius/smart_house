package itsudparis.application;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dashboard {
	
	public static JLabel resident1 = new JLabel("Resident 1 : ");
	public static JLabel resident2 = new JLabel("Resident 2 : ");
	public static JLabel text_res1 = new JLabel("------------");
	public static JLabel text_res2 = new JLabel("------------");
	public static JLabel equipements = new JLabel("Equipements utilisés : ");
	public static JLabel txtequip = new JLabel("lit\n canape");
    
	public static JLabel ph1 = new JLabel("Ph1");
	public static JLabel ph2 = new JLabel("Ph2");
	public static JLabel ir1 = new JLabel("Ir1");
	public static JLabel ph3 = new JLabel("Ph3");
	public static JLabel ph4 = new JLabel("Ph4");
	public static JLabel ph5 = new JLabel("Ph5");	
	public static JLabel ph6 = new JLabel("ph6");	
	public static JLabel co1 = new JLabel("Co1");
	public static JLabel co2 = new JLabel("Co2");
	public static JLabel co3 = new JLabel("Co3");
	public static JLabel so1 = new JLabel("So1"); 
	public static JLabel so2 = new JLabel("So2");
	public static JLabel di1 = new JLabel("Di1");
	public static JLabel di2 = new JLabel("Di2");
	public static JLabel te1 = new JLabel("Te1");
	public static JLabel fo3 = new JLabel("Fo3");  
	public static JLabel fo1 = new JLabel("Fo1");
	public static JLabel fo2 = new JLabel("Fo2");
	public static JLabel di3 = new JLabel("Di3");
	public static JLabel di4 = new JLabel("Di4");
	
	public static ImagePanel panel = new ImagePanel(
	        new ImageIcon("resources\\bcg.jpeg").getImage());
	
	public static void allumer(JLabel capteur)
	{	 
	 capteur.setBackground(Color.green);
	 capteur.setOpaque(true);
	 
	}
	
	public static void eteindre(JLabel capteur)
	{	 
	 capteur.setBackground(Color.RED);
	 capteur.setOpaque(true);
	}

    public static void main(String[] args) {
    
    //a la base tous les capteurs sont eteints
    eteindre(ph1);
    eteindre(ph2);
    eteindre(ir1);
    eteindre(ph3);
    eteindre(ph4);
    eteindre(ph5);
    eteindre(ph6);
    eteindre(co1);
    eteindre(co2);
    eteindre(co3);
    eteindre(so1);
    eteindre(so2);
    eteindre(di1);
    eteindre(di2);
    eteindre(te1);
    eteindre(fo3);
    eteindre(fo1);
    eteindre(fo2);
    eteindre(di3);
    eteindre(di4);
    //allumer
    allumer(co1);
    allumer(co2);
    allumer(co3);
    allumer(so1);
    allumer(so2);
    allumer(di1);
    
    //label position
    resident1.setLocation(15,10);
    resident2.setLocation(15,30);
    equipements.setLocation(15,50);
    txtequip.setLocation(15,70);
    text_res1.setLocation(85,18);
    text_res2.setLocation(85,36);
    ph1.setLocation(461,174);
    ph2.setLocation(328,148);
    ir1.setLocation(179,145);
    fo1.setLocation(390,146);
    fo2.setLocation(287,145);
    di4.setLocation(150,252);
    co1.setLocation(547,147);
    co2.setLocation(715,270);
    co3.setLocation(632,291);
    so2.setLocation(460,293);
    di1.setLocation(668,238);
    di2.setLocation(613,211);
    ph6.setLocation(659,262);
    te1.setLocation(431,316);
    fo3.setLocation(595,427);
    ph5.setLocation(478,143);
    ph3.setLocation(451,227);
    ph4.setLocation(316,334);
    di3.setLocation(226,280);
    so1.setLocation(517,221);
    //label size
    text_res1.setSize(new Dimension(50,35));
    text_res2.setSize(new Dimension(50,35));
    ph1.setSize(new Dimension(25,25));
    ph2.setSize(new Dimension(25,25));
    ph4.setSize(new Dimension(25,25));
    ph3.setSize(new Dimension(25,25));
    ph5.setSize(new Dimension(25,25));
    ph6.setSize(new Dimension(25,25));
    fo3.setSize(new Dimension(25,25));
    fo1.setSize(new Dimension(25,25));
    fo2.setSize(new Dimension(25,25));
    di4.setSize(new Dimension(25,25));
    ir1.setSize(new Dimension(25,25));
    di3.setSize(new Dimension(25,25));
    te1.setSize(new Dimension(25,25));
    di1.setSize(new Dimension(25,25));
    di2.setSize(new Dimension(25,25));
    so1.setSize(new Dimension(25,25));
    so2.setSize(new Dimension(25,25));
    co1.setSize(new Dimension(25,25));
    co2.setSize(new Dimension(25,25));
    co3.setSize(new Dimension(25,25));
    
    resident1.setSize(new Dimension(150,50));
    resident2.setSize(new Dimension(150,50));    
    equipements.setSize(new Dimension(150,50));
    txtequip.setSize(new Dimension(150,50));
    //label color    
    //salon.setForeground(Color.blue);
    
    resident1.setForeground(Color.blue);
    resident2.setForeground(Color.blue);
    
    panel.add(equipements);
    panel.add(resident1);
    panel.add(resident2);
    panel.add(text_res1);
    panel.add(text_res2);
    panel.add(ph1);
    panel.add(ph2);
    panel.add(ph3);
    panel.add(ph4);
    panel.add(ph5);
    panel.add(ph6);
    panel.add(co1);
    panel.add(co2);
    panel.add(co3);
    panel.add(so1);
    panel.add(so2);
    panel.add(di1);
    panel.add(di2);
    panel.add(te1);
    panel.add(fo1);
    panel.add(fo3);
    panel.add(fo2);
    panel.add(di3);
    panel.add(di4);
    panel.add(ph2);
    panel.add(ir1);   
    panel.add(txtequip);
    panel.repaint();
    JFrame frame = new JFrame(); 
    frame.setTitle("Maison Intelligente");
    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true);
  }
}

class ImagePanel extends JPanel {

  private Image img;

  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel(Image img) {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }

  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }

	
}
