package sinau.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import sinau.controller.PersegiPanjangHitungKelilingActionListener;
import sinau.controller.PersegiPanjangHitungLuasActionListener;

public class PersegiPanjangGui extends JFrame{
	private JLabel labelTitlePersegiPanjang;
	private JLabel sinauAcademy;
	private JLabel labelPanjang;
	private JLabel labelLebar;
	private JLabel labelHasil;
	private JTextField textPanjang;
	private JTextField textLebar;
	private JTextField textHasil;
	private JButton buttonHitungLuas;
	private JButton buttonHitungKeliling;

	public PersegiPanjangGui(){
		super();
		setLayout(null);
		setTitle("Belajar MVC");
		setSize(300, 300);
		setBounds(490, 210, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		labelTitlePersegiPanjang = new JLabel("Aplikasi Hitung Persegi Panjang");
		labelTitlePersegiPanjang.setBounds(52, 20, 200, 20);

		labelPanjang = new JLabel("Panjang");
		labelPanjang.setBounds(20, 60, 50, 20);

		textPanjang = new JTextField();
		textPanjang.setBounds(80, 60, 190, 20);

		labelLebar = new JLabel("Lebar");
		labelLebar.setBounds(20, 90, 50, 20);

		textLebar = new JTextField();
		textLebar.setBounds(80, 90, 190, 20);

		buttonHitungLuas = new JButton("Hitung Luas");
		buttonHitungLuas.setBounds(20, 130, 120, 20);

		buttonHitungKeliling = new JButton("Hitung Keliling");
		buttonHitungKeliling.setBounds(150, 130, 120, 20);

		labelHasil = new JLabel("Hasil");
		labelHasil.setBounds(20, 170, 50, 20);

		textHasil = new JTextField();
		textHasil.setBounds(80, 170, 190, 20);
		textHasil.setEnabled(false);

		sinauAcademy = new JLabel("#SinauDevelop");
		sinauAcademy.setBounds(185, 230, 200, 20);

		buttonHitungLuas.addActionListener(new PersegiPanjangHitungLuasActionListener(this));
		buttonHitungKeliling.addActionListener(new PersegiPanjangHitungKelilingActionListener(this));

		addComponent();
	}

	private void addComponent(){
		add(labelTitlePersegiPanjang);
		add(labelPanjang);
		add(textPanjang);
		add(labelLebar);
		add(textLebar);
		add(buttonHitungLuas);
		add(buttonHitungKeliling);
		add(labelHasil);
		add(textHasil);
		add(sinauAcademy);
	}

	public JTextField getTextPanjang() {
		return textPanjang;
	}

	public JTextField getTextLebar() {
		return textLebar;
	}

	public JTextField getTextHasil() {
		return textHasil;
	}

	public JButton getButtonHitungLuas() {
		return buttonHitungLuas;
	}

	public JButton getButtonHitungKeliling() {
		return buttonHitungKeliling;
	}

}
