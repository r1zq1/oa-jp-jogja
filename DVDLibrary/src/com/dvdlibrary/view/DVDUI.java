package com.dvdlibrary.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.dvdlibrary.domain.DVDException;
import com.dvdlibrary.domain.DVDItem;
import com.dvdlibrary.domain.Genre;
import com.dvdlibrary.service.DVDServiceImpl;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class DVDUI extends JFrame {
	private JTextField tfJudulDVD;
	private JTextField tfTahunTerbit;
	JComboBox<Genre> cbGenre = new JComboBox(Genre.values());
	private DVDServiceImpl service;
	public DVDUI() {
		service = DVDServiceImpl.getInstance();

		setTitle("My DVD Library");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		getContentPane().setLayout(null);
		
		JLabel lblJudulDvd = new JLabel("Judul DVD");
		lblJudulDvd.setBounds(21, 29, 109, 14);
		getContentPane().add(lblJudulDvd);
		
		JLabel lblGenre = new JLabel("Genre");
		lblGenre.setBounds(20, 69, 46, 14);
		getContentPane().add(lblGenre);
		
		JLabel lblTahunTerbit = new JLabel("Tahun Terbit");
		lblTahunTerbit.setBounds(21, 118, 85, 14);
		getContentPane().add(lblTahunTerbit);
		
		tfJudulDVD = new JTextField();
		tfJudulDVD.setBounds(119, 26, 245, 20);
		getContentPane().add(tfJudulDVD);
		tfJudulDVD.setColumns(10);
		
		tfTahunTerbit = new JTextField();
		tfTahunTerbit.setBounds(119, 115, 86, 20);
		getContentPane().add(tfTahunTerbit);
		tfTahunTerbit.setColumns(10);
		
		cbGenre.setBounds(119, 66, 120, 20);
		getContentPane().add(cbGenre);
		
		JButton btnCari = new JButton("Cari");
		btnCari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DVDItem item = service.getDVDItem(tfJudulDVD.getText());
					tfTahunTerbit.setText(""+item.getYear());
					cbGenre.setSelectedItem(item.getGenre());
				} catch (DVDException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			}
		});
		btnCari.setBounds(21, 162, 89, 23);
		getContentPane().add(btnCari);
		
		JButton btnTambah = new JButton("Tambah");
		btnTambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DVDItem item = new DVDItem(tfJudulDVD.getText(), 
							(Genre)cbGenre.getSelectedItem(), 
							Integer.parseInt(tfTahunTerbit.getText()));				
					service.addDVDItem(item);
					JOptionPane.showMessageDialog(null, "Tambah Success");
					clearField();
				} catch (DVDException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				} catch(NumberFormatException ne) {
					JOptionPane.showMessageDialog(null, "Tahun harus integer");					
				}				
			}
		});
		btnTambah.setBounds(138, 162, 89, 23);
		getContentPane().add(btnTambah);
		
		JButton btnUbah = new JButton("Ubah");
		btnUbah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DVDItem item = new DVDItem(tfJudulDVD.getText(), 
							(Genre)cbGenre.getSelectedItem(), 
							Integer.parseInt(tfTahunTerbit.getText()));				
					service.updateDVDItem(item);
					JOptionPane.showMessageDialog(null, "Update Success");
					clearField();
				} catch (DVDException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				} catch(NumberFormatException ne) {
					JOptionPane.showMessageDialog(null, "Tahun harus integer");					
				}
			}
		});
		btnUbah.setBounds(254, 162, 89, 23);
		getContentPane().add(btnUbah);
		
		JButton btnHapus = new JButton("Hapus");
		btnHapus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DVDItem item = new DVDItem(tfJudulDVD.getText(), 
							null,0);				
					service.removeDVDItem(item);
					JOptionPane.showMessageDialog(null, "Hapus Success");
					clearField();
				} catch (DVDException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				} 			
			}
		});
		btnHapus.setBounds(372, 162, 89, 23);
		getContentPane().add(btnHapus);
		
		JButton btnDisplayAll = new JButton("Display All DVD");
		btnDisplayAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ArrayList<DVDItem> items = service.getAllDVDItem();
					System.out.println("Jumlah DVD: " + items.size());
					System.out.println(items);
				} catch (DVDException e) {
					e.printStackTrace();
				}
			}
		});
		btnDisplayAll.setBounds(21, 201, 206, 23);
		getContentPane().add(btnDisplayAll);
		
		JButton btnDisplayByGenre = new JButton("Display By Genre");
		btnDisplayByGenre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ArrayList<DVDItem> items = service.getDVDItemByGenre(cbGenre.getSelectedItem().toString());
					System.out.println("Jumlah DVD Genre "+ cbGenre.getSelectedItem().toString() +": " + items.size());
					System.out.println(items);
				} catch (DVDException e1) {
					e1.printStackTrace();
				}				
			}
		});
		btnDisplayByGenre.setBounds(254, 201, 207, 23);
		getContentPane().add(btnDisplayByGenre);
	}
	private void clearField() {
		tfJudulDVD.setText("");
		tfTahunTerbit.setText("");
	}	
	public static void main(String[] args) {
		new DVDUI().setVisible(true);
	}
}