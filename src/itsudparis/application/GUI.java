package itsudparis.application;
	import java.awt.BorderLayout;
	import java.awt.Dimension;
	import java.awt.GridLayout;
	import javax.swing.BorderFactory;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;
	import javax.swing.JPanel;
	import javax.swing.JSeparator;
	import javax.swing.JTable;
	import javax.swing.SwingUtilities;

	public class GUI extends JFrame {
	  
	    private JButton exitBtn = new JButton("Exit");

	    private JSeparator separator = new JSeparator();
	    private JMenuItem exitMenu = new JMenuItem("Exit");
	    private JMenu helpMI = new JMenu("Help");
	    private JMenuItem aboutMenu = new JMenuItem("About");
	    private JTable table = new JTable(5, 2);
	    private JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
	    private JPanel panel1 = new JPanel(new BorderLayout());
	    private JPanel panel2 = new JPanel(new GridLayout(1, 2, 10, 10));
	    private JPanel panel3 = new JPanel(new GridLayout(1, 2, 10, 10));

	    public GUI() {

	        super("Maison Intelligente");

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(new Dimension(300, 300));
	        setResizable(false);
	        setLayout(new BorderLayout(10, 10));	        
	        helpMI.add(aboutMenu);
	        panel1.add(table, BorderLayout.CENTER);
	        panel3.add(exitBtn);
	        mainPanel.add(panel2, BorderLayout.NORTH);
	        mainPanel.add(panel1, BorderLayout.CENTER);
	        mainPanel.add(panel3, BorderLayout.SOUTH);
	        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	        add(mainPanel);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                GUI app = new GUI();
	                app.setVisible(true);
	            }
	        });
	    }
	}

