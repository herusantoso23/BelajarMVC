package sinau.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import sinau.model.PersegiPanjang;
import sinau.view.PersegiPanjangGui;

public class PersegiPanjangHitungLuasActionListener implements ActionListener{
	private PersegiPanjangGui persegiPanjangGui;

	public PersegiPanjangHitungLuasActionListener(PersegiPanjangGui persegiPanjangGui){
		this.persegiPanjangGui = persegiPanjangGui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JTextField textPanjang = this.persegiPanjangGui.getTextPanjang();
		JTextField textLebar = this.persegiPanjangGui.getTextLebar();
		JTextField textHasil = this.persegiPanjangGui.getTextHasil();

		if(!textPanjang.getText().trim().isEmpty()){
			if(!textLebar.getText().trim().isEmpty()){
				PersegiPanjang persegiPanjang = new PersegiPanjang();

				Double panjang, lebar, luas;
				panjang = Double.parseDouble(textPanjang.getText());
				lebar = Double.parseDouble(textLebar.getText());

				persegiPanjang.setPanjang(panjang);
				persegiPanjang.setLebar(lebar);

				luas = persegiPanjang.hitungLuas();
				textHasil.setText(luas.toString());
			}
			else{
				JOptionPane.showMessageDialog(persegiPanjangGui, "Masukan nilai lebar !");
			}
		} else {
			JOptionPane.showMessageDialog(persegiPanjangGui, "Masukan nilai Panjang !");
		}




	}
}
