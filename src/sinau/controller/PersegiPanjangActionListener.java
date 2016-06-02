package sinau.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import sinau.model.PersegiPanjang;
import sinau.view.PersegiPanjangGui;

public class PersegiPanjangActionListener implements ActionListener{
	private PersegiPanjangGui persegiPanjangGui;

	public PersegiPanjangActionListener(PersegiPanjangGui persegiPanjangGui){
		this.persegiPanjangGui = persegiPanjangGui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JTextField textPanjang = this.persegiPanjangGui.getTextPanjang();
		JTextField textLebar = this.persegiPanjangGui.getTextLebar();
		JTextField textHasil = this.persegiPanjangGui.getTextHasil();

		PersegiPanjang persegiPanjang = new PersegiPanjang();
		Double panjang, lebar, luas, keliling;
		panjang = Double.parseDouble(textPanjang.getText());
		lebar = Double.parseDouble(textLebar.getText());

		persegiPanjang.setPanjang(panjang);
		persegiPanjang.setLebar(lebar);

		String action = e.getActionCommand();
		switch(action){
		case "buttonHitungLuas":
			luas = persegiPanjang.hitungLuas();
			textHasil.setText(luas.toString());
			break;
		case "buttonHitungKeliling":
			keliling = persegiPanjang.hitungKeliling();
			textHasil.setText(keliling.toString());
			break;
		}
	}
}
