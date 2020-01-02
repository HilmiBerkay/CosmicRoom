import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class OrderScreen extends JFrame {

	private JPanel contentPane;
	private JTextField CWtf;
	private JTextField MWtf;
	private JTextField CBtf;
	private JTextField Btf;
	private JTextField PZtf;
	private JTextField PTtf;
	private JTextField Ctf;
	private JTextField Wtf;
	private JTextField Ttf;
	private JTextField Ltf;
	private JTextField Etf;
	private JTextField MWRtf;
	private JTextField CCKtf;
	private JTextField TDtf;
	private JTextField BKtf;
	private JTextField SFtf;
	private JTextField Stf;
	private JTextField CCtf;
	private ArrayList<String> list;
	private MealFactory mealFactory;
	private DrinkFactory drinkFactory;
	private DessertFactory dessertFactory;
	private OperationDb opertionDb;
	private JTextField totalTxt;
	private OperationDb connection;
	private PreparedStatement prSt;
	private Statement st;
	private String table_name;
	

	/**
	 * Create the frame.
	 */
	public OrderScreen(String table_name) {
		opertionDb = OperationDb.getOperationDb();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1046, 532);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		drinkFactory = (DrinkFactory)flyWeight.TakeFactory(flyWeight.Drink);
		mealFactory = (MealFactory)flyWeight.TakeFactory(flyWeight.Meal);
		dessertFactory=(DessertFactory)flyWeight.TakeFactory(flyWeight.Dessert);
		
		setTitle(getTitle());
		DefaultListModel<Products> produsctsListModel = new DefaultListModel<Products>();
		this.table_name = table_name;
		
		JLabel CMSheader = new JLabel("Cafe  Managment  System");
		CMSheader.setBounds(259, 11, 340, 42);
		CMSheader.setFont(new Font("Vladimir Script", Font.PLAIN, 34));
		contentPane.add(CMSheader);
		
		JCheckBox CwCb = new JCheckBox("ChickenWrap");
		CwCb.setBounds(35, 134, 115, 23);
		contentPane.add(CwCb);
		
		JCheckBox MwCb = new JCheckBox("Meet Wrap");
		MwCb.setBounds(35, 184, 115, 23);
		contentPane.add(MwCb);
		
		JCheckBox ComboBoxCb = new JCheckBox("Combo Box");
		ComboBoxCb.setBounds(35, 230, 115, 23);
		contentPane.add(ComboBoxCb);
		
		JCheckBox BurgerCb = new JCheckBox("Burger");
		BurgerCb.setBounds(35, 279, 115, 23);
		contentPane.add(BurgerCb);
		
		JCheckBox PizzaCb = new JCheckBox("Vegan Pizza");
		PizzaCb.setBounds(35, 326, 115, 23);
		contentPane.add(PizzaCb);
		
		JCheckBox PastaCb = new JCheckBox("Pasta");
		PastaCb.setBounds(35, 374, 115, 23);
		contentPane.add(PastaCb);
		
		JCheckBox CokeCb = new JCheckBox("Coke");
		CokeCb.setBounds(259, 134, 124, 23);
		contentPane.add(CokeCb);
		
		JCheckBox WaterCb = new JCheckBox("Water");
		WaterCb.setBounds(259, 184, 124, 23);
		contentPane.add(WaterCb);
		
		JCheckBox TeaCb = new JCheckBox("Tea");
		TeaCb.setBounds(259, 230, 124, 23);
		contentPane.add(TeaCb);
		
		JCheckBox LatteCb = new JCheckBox("Latte");
		LatteCb.setBounds(259, 279, 127, 23);
		contentPane.add(LatteCb);
		
		JCheckBox EssperessoCb = new JCheckBox("Essperesso");
		EssperessoCb.setBounds(259, 326, 124, 23);
		contentPane.add(EssperessoCb);
		
		JCheckBox MineralWaterCb = new JCheckBox("Mineral Water");
		MineralWaterCb.setBounds(262, 374, 124, 23);
		contentPane.add(MineralWaterCb);
		
		JCheckBox CheeseCakeCb = new JCheckBox("Cheese Cake");
		CheeseCakeCb.setBounds(489, 134, 124, 23);
		contentPane.add(CheeseCakeCb);
		
		JCheckBox SebastianCb = new JCheckBox("Sebastian");
		SebastianCb.setBounds(489, 184, 124, 23);
		contentPane.add(SebastianCb);
		
		JCheckBox SuffleCb = new JCheckBox("Suffle");
		SuffleCb.setBounds(489, 230, 124, 23);
		contentPane.add(SuffleCb);
		
		JCheckBox BaklavaCb = new JCheckBox("Baklava");
		BaklavaCb.setBounds(489, 279, 124, 23);
		contentPane.add(BaklavaCb);
		
		JCheckBox TurkishDelightCb = new JCheckBox("Turkish Delight");
		TurkishDelightCb.setBounds(489, 326, 124, 23);
		contentPane.add(TurkishDelightCb);
		
		JCheckBox ChocalateCakeCb = new JCheckBox("ChocalateCake");
		ChocalateCakeCb.setBounds(489, 374, 124, 23);
		contentPane.add(ChocalateCakeCb);
		
		CWtf = new JTextField();
		CWtf.setBounds(165, 135, 42, 20);
		contentPane.add(CWtf);
		CWtf.setColumns(10);
		
		MWtf = new JTextField();
		MWtf.setBounds(165, 185, 42, 20);
		contentPane.add(MWtf);
		MWtf.setColumns(10);
		
		CBtf = new JTextField();
		CBtf.setBounds(165, 231, 42, 20);
		contentPane.add(CBtf);
		CBtf.setColumns(10);
		
		Btf = new JTextField();
		Btf.setBounds(165, 280, 42, 20);
		contentPane.add(Btf);
		Btf.setColumns(10);
		
		PZtf = new JTextField();
		PZtf.setBounds(165, 327, 42, 20);
		contentPane.add(PZtf);
		PZtf.setColumns(10);
		
		PTtf = new JTextField();
		PTtf.setBounds(165, 375, 42, 20);
		contentPane.add(PTtf);
		PTtf.setColumns(10);
		
		Ctf = new JTextField();
		Ctf.setColumns(10);
		Ctf.setBounds(406, 135, 42, 20);
		contentPane.add(Ctf);
		
		Wtf = new JTextField();
		Wtf.setColumns(10);
		Wtf.setBounds(406, 185, 42, 20);
		contentPane.add(Wtf);
		
		Ttf = new JTextField();
		Ttf.setColumns(10);
		Ttf.setBounds(406, 231, 42, 20);
		contentPane.add(Ttf);
		
		Ltf = new JTextField();
		Ltf.setColumns(10);
		Ltf.setBounds(406, 280, 42, 20);
		contentPane.add(Ltf);
		
		Etf = new JTextField();
		Etf.setColumns(10);
		Etf.setBounds(406, 327, 42, 20);
		contentPane.add(Etf);
		
		MWRtf = new JTextField();
		MWRtf.setColumns(10);
		MWRtf.setBounds(406, 375, 42, 20);
		contentPane.add(MWRtf);
		
		CCKtf = new JTextField();
		CCKtf.setColumns(10);
		CCKtf.setBounds(631, 374, 42, 20);
		contentPane.add(CCKtf);
		
		TDtf = new JTextField();
		TDtf.setColumns(10);
		TDtf.setBounds(631, 326, 42, 20);
		contentPane.add(TDtf);
		
		BKtf = new JTextField();
		BKtf.setColumns(10);
		BKtf.setBounds(631, 279, 42, 20);
		contentPane.add(BKtf);
		
		SFtf = new JTextField();
		SFtf.setColumns(10);
		SFtf.setBounds(631, 230, 42, 20);
		contentPane.add(SFtf);
		
		Stf = new JTextField();
		Stf.setColumns(10);
		Stf.setBounds(631, 184, 42, 20);
		contentPane.add(Stf);
		
		CCtf = new JTextField();
		CCtf.setColumns(10);
		CCtf.setBounds(631, 134, 42, 20);
		contentPane.add(CCtf);
		
		JList list = new JList();
		list.setBounds(730, 137, 268, 260);
		contentPane.add(list);
		
		JButton OLback = new JButton("Back");
		OLback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TableSelection tblsc = new TableSelection();
				tblsc.setVisible(true);
				setVisible(false);
			}
		});
		OLback.setBounds(35, 433, 115, 23);
		contentPane.add(OLback);
		
		JButton OLhome = new JButton("Home Page");
		OLhome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mainscr = new MainMenu();
				mainscr.setVisible(true);
				setVisible(false);
			}
		});
		OLhome.setBounds(290, 433, 115, 23);
		contentPane.add(OLhome);
		
		totalTxt = new JTextField();
		totalTxt.setBounds(681, 434, 86, 20);
	
		contentPane.add(totalTxt);
		totalTxt.setColumns(10);
		totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
		
		
		JButton OLsave = new JButton("Save");
		OLsave.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) {
				
				
				
				if(CwCb.isSelected()) {
					
					Meal product = (Meal)mealFactory.makeProducts();
					product.setName("Chicken Wrap");
					product.setPrice(10);
					product.setIsVeg(false);
					
					if(CWtf.getText().equals("")) {
						
						product.setQuantity(0);
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					else {
						
						product.setQuantity(Integer.parseInt(CWtf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
					
				}
				
				if(MwCb.isSelected()) {
					
					Meal product = (Meal)mealFactory.makeProducts();
					product.setName("Meet Wrap");
					product.setPrice(15);
					product.setIsVeg(false);
					
					if(MWtf.getText().equals("")) {
						
						product.setQuantity(0);
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					else {
						
						product.setQuantity(Integer.parseInt(MWtf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
						
					}
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
				}
				
				if(ComboBoxCb.isSelected()) {
					
					Meal product = (Meal)mealFactory.makeProducts();
					product.setName("Combo Box");
					product.setPrice(14);
					product.setIsVeg(false);
					totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					
					if(CBtf.getText().equals("")) {
						
						product.setQuantity(0);
					}
					else {
						
						product.setQuantity(Integer.parseInt(CBtf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
				}
				
				if(BurgerCb.isSelected()) {
					
					Meal product = (Meal)mealFactory.makeProducts();
					product.setName("Burger");
					product.setPrice(13);
					product.setIsVeg(false);
					totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					if(Btf.getText().equals("")) {
						
						product.setQuantity(0);
					}
					else {
						
						product.setQuantity(Integer.parseInt(Btf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
				}
				
				if(PizzaCb.isSelected()) {
					
					Meal product = (Meal)mealFactory.makeProducts();
					product.setName("Vegan Pizza");
					product.setPrice(12);
					product.setIsVeg(true);
					totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					
					
					if(PZtf.getText().equals("")) {
						
						product.setQuantity(0);
					}
					else {
						
						product.setQuantity(Integer.parseInt(PZtf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
				
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
				}
				
				if(PastaCb.isSelected()) {
					
					Meal product = (Meal)mealFactory.makeProducts();
					product.setName("Pasta");
					product.setPrice(11);
					product.setIsVeg(true);
					totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					
					if(PTtf.getText().equals("")) {
						
						product.setQuantity(0);
					}
					else {
						
						product.setQuantity(Integer.parseInt(PTtf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
				}
				
				if(CokeCb.isSelected()) {
					
					Drink product = (Drink)drinkFactory.makeProducts();
					product.setName("Coke");
					product.setIsBottle(true);
					product.setPrice(6);
					totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					
					if(Ctf.getText().equals("")) {
						
						product.setQuantity(0);
					}
					else {
						
						product.setQuantity(Integer.parseInt(Ctf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
				}
				
				if(WaterCb.isSelected()) {
					
					Drink product = (Drink)drinkFactory.makeProducts();
					product.setName("Water");
					product.setPrice(3);
					product.setIsBottle(true);
					
					
					if(Wtf.getText().equals("")) {
						
						product.setQuantity(0);
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					else {
						
						product.setQuantity(Integer.parseInt(Wtf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
				}
				
				if(TeaCb.isSelected()) {
					
					Drink product = (Drink)drinkFactory.makeProducts();
					product.setName("Tea");
					product.setPrice(3);
					product.setIsBottle(false);
					
					if(Ttf.getText().equals("")) {
						
						product.setQuantity(0);
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					else {
						
						product.setQuantity(Integer.parseInt(Ttf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
				}
				
				if(LatteCb.isSelected()) {
					
					Drink product = (Drink)drinkFactory.makeProducts();
					product.setName("Latte");
					product.setPrice(14);
					product.setIsBottle(false);
					
					if(Ltf.getText().equals("")) {
						
						product.setQuantity(0);
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					else {
						
						product.setQuantity(Integer.parseInt(Ltf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
				}
				
				if(EssperessoCb.isSelected()) {
					
					Drink product = (Drink)drinkFactory.makeProducts();
					product.setName("Essperesso");
					product.setPrice(10);
					product.setIsBottle(false);
					
					if(Etf.getText().equals("")) {
						
						product.setQuantity(0);
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					else {
						
						product.setQuantity(Integer.parseInt(Etf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
				}
				
				if(MineralWaterCb.isSelected()) {
					
					Drink product = (Drink)drinkFactory.makeProducts();
					product.setName("Mineral Water");
					product.setPrice(9);
					product.setIsBottle(true);
					
					if(MWRtf.getText().equals("")) {
						
						product.setQuantity(0);
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					else {
						
						product.setQuantity(Integer.parseInt(MWRtf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
				}
				
				if(CheeseCakeCb.isSelected()) {
					
					Dessert product = (Dessert)dessertFactory.makeProducts();
					product.setName("Cheese Cake");
					product.setPrice(20);
					product.setIsMilky(true);
					
					if(CCtf.getText().equals("")) {
						
						product.setQuantity(0);
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					else {
						
						product.setQuantity(Integer.parseInt(CCtf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
				}
				
				if(SebastianCb.isSelected()) {
					
					Dessert product = (Dessert)dessertFactory.makeProducts();
					product.setName("Sebastian");
					product.setPrice(18);
					product.setIsMilky(true);
					
					if(Stf.getText().equals("")) {
						
						product.setQuantity(0);
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					else {
						
						product.setQuantity(Integer.parseInt(Stf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
				}
				
				if(SuffleCb.isSelected()) {
					
					Products product = dessertFactory.makeProducts();
					product.setName("Suffle");
					product.setPrice(17);
					
					if(SFtf.getText().equals("")) {
						
						product.setQuantity(0);
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					else {
						
						product.setQuantity(Integer.parseInt(SFtf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
				}
				
				if(BaklavaCb.isSelected()) {
					
					Products product = dessertFactory.makeProducts();
					product.setName("Baklava");
					product.setPrice(30);
					
					if(BKtf.getText().equals("")) {
						
						product.setQuantity(0);
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					else {
						
						product.setQuantity(Integer.parseInt(BKtf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
				}
				
				if(TurkishDelightCb.isSelected()) {
					
					Products product = dessertFactory.makeProducts();
					product.setName("Turkish Delight");
					product.setPrice(10);
					
					if(TDtf.getText().equals("")) {
						
						product.setQuantity(0);
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					else {
						
						product.setQuantity(Integer.parseInt(TDtf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
				}
				
				if(ChocalateCakeCb.isSelected()) {
					
					Products product = dessertFactory.makeProducts();
					product.setName("Chocolate Cake");
					product.setPrice(15);
					
					if(CCKtf.getText().equals("")) {
						
						product.setQuantity(0);
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					else {
						
						product.setQuantity(Integer.parseInt(CCKtf.getText()));
						product.calcTotalPrice();
						opertionDb.addCheck(getTitle(), product.toString(), product.getTotalPrice());
						totalTxt.setText(Double.toString(opertionDb.getFullPrice(table_name)));
					}
					
					
					produsctsListModel.addElement(product);
					list.setModel(produsctsListModel);
					
					
				}
			}
		});
		OLsave.setBounds(788, 433, 127, 23);
		contentPane.add(OLsave);
		
		
	}
}
