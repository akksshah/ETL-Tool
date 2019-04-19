package etl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class transpage extends javax.swing.JFrame {


	public dataset ds[] = new dataset[10000];
	public int z;


	public transpage() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		key = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		merge = new javax.swing.JLabel();
		dedup = new javax.swing.JLabel();
		calc = new javax.swing.JLabel();
		form = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Transformation Process:");

		key.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		key.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		jButton1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
		jButton1.setText("Start");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		merge.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		merge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		dedup.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		dedup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		calc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		calc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		form.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		form.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
			.addGap(79, 79, 79)
			.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
			.addGroup(layout.createSequentialGroup()
			.addGap(135, 135, 135)
			.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
			.addGroup(layout.createSequentialGroup()
			.addGap(108, 108, 108)
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addComponent(merge, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(dedup, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(calc, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
			.addContainerGap(92, Short.MAX_VALUE)));
		layout.setVerticalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
			.addContainerGap()
			.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			.addComponent(merge, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(18, 18, 18)
			.addComponent(dedup, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			.addComponent(calc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
			.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(21, 21, 21)));

		pack();
	} // </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		for (int i = 0; i < 10000; i++)
		ds[i] = new dataset();
		try {
			BufferedReader in = new BufferedReader(new FileReader("/Users/aakash/Desktop/DWM Project/ETL-Tool-master/src/etl/extractedfinalAkks.txt"));
			String line;
			while ( in .ready()) {
				line = in .readLine();
					ds[z].id = Integer.parseInt(line.split(",")[0]);
					ds[z].name = line.split(",")[1];
					ds[z].marital = line.split(",")[2];
					ds[z].age = Integer.parseInt(line.split(",")[3]);
					ds[z].income = Integer.parseInt(line.split(",")[4]);
					ds[z].company = line.split(",")[5];
					ds[z].usage = Integer.parseInt(line.split(",")[6]);
					ds[z].phone = line.split(",")[7];
					ds[z].address = line.split(",")[8];
					ds[z].gender = line.split(",")[9];
					ds[z].lname = line.split(",")[10];
					z++;
                                /*ds[z].name = line.split(",")[0];
				ds[z].g = line.split(",")[1].charAt(0);
				ds[z].age = Integer.parseInt(line.split(",")[2]);
				ds[z].usage = Integer.parseInt(line.split(",")[3]);
				ds[z].op1 = line.split(",")[4];
				ds[z].op2 = line.split(",")[5];
				ds[z].lname = line.split(",")[6];
				z++;
                                */
			} in .close();



			String ans_file = "", temp = "";

			ans_file = "";
			temp = "";
			for (int i = 0; i < z; i++) {
//				System.out.println(ds[i].id + "," + ds[i].name + "," + ds[i].marital + "," + ds[i].age + "," + ds[i].income + "," + ds[i].company + "," + ds[i].usage + "," + ds[i].phone + "," + ds[i].address + "," + ds[i].gender);
				temp = ds[i].id + "," + ds[i].name + " " + ds[i].lname +"," + ds[i].marital + "," + ds[i].age + "," + ds[i].income + "," + ds[i].company + "," + ds[i].usage + "," + ds[i].phone + "," + ds[i].address + "," + ds[i].gender;
				temp = temp + "\n";
				ds[i].fullname = "" + ds[i].name + " " + ds[i].lname;
				System.out.print(">>>>>>>>>>>>>>>>>>>" + temp);
				ans_file = ans_file + temp;
			}
			try {
				System.out.println("=======================================================================================");
				FileWriter fw = new FileWriter("/Users/aakash/Desktop/DWM Project/ETL-Tool-master/src/etl/MergedName.txt");
				fw.write(ans_file);
				fw.close();
			} catch (Exception e) {}
//			for (int i = 0; i < z; i++)
//			System.out.println(ds[i].name + "," + ds[i].gender + "," + ds[i].age + "," + ds[i].income + "," + ds[i].usage + "," + ds[i].lname);

			//merge.setText("2---\"Merging\" : First name and last name");
			merge.setText("2---\"Deduplication\"");
//			for (int i = 0; i < z; i++) {
//				if (ds[i].lname.compareTo("-") != 0) ds[i].fullname = ds[i].name + " " + ds[i].lname;
//				else ds[i].fullname = ds[i].name;
//			}
			ans_file = "";
			Set<String> hashSet = new HashSet<String>();
			for (int i = 0; i < z; i++) {
				System.out.println(i);
//				System.out.println(ds[i].id + "," + ds[i].name + "," + ds[i].marital + "," + ds[i].age + "," + ds[i].income + "," + ds[i].company + "," + ds[i].usage + "," + ds[i].phone + "," + ds[i].address + "," + ds[i].gender);
				temp = ds[i].id + "," + ds[i].name + " " + ds[i].lname +"," + ds[i].marital + "," + ds[i].age + "," + ds[i].income + "," + ds[i].company + "," + ds[i].usage + "," + ds[i].phone + "," + ds[i].address + "," + ds[i].gender;
				temp = temp + "\n";
//				System.out.print(">>>>>>>>>>>>>>>>>>>" + temp);
				if(hashSet.contains(ds[i].fullname)) {
					continue;
				}
				else {
					hashSet.add(ds[i].fullname);
					ans_file = ans_file + temp;
				}
			}
			try {
				System.out.println("=======================================================================================");
				FileWriter fw = new FileWriter("/Users/aakash/Desktop/DWM Project/ETL-Tool-master/src/etl/Deduplication.txt");
				fw.write(ans_file);
				fw.close();
			} catch (Exception e) {}
			//dedup.setText("3---\"Deduplication\"");
			dedup.setText("3---\"Key Reconstruction\" : variable-KEY");

			ans_file = "";
			BufferedReader br = new BufferedReader(new FileReader("/Users/aakash/Desktop/DWM Project/ETL-Tool-master/src/etl/Deduplication.txt"));
			int x = 0;
			while ( br.ready()) {
				line = br.readLine();
				ds[z].id = Integer.parseInt(line.split(",")[0]);
				ds[z].fullname = line.split(",")[1];
				ds[z].marital = line.split(",")[2];
				ds[z].age = Integer.parseInt(line.split(",")[3]);
				ds[z].income = Integer.parseInt(line.split(",")[4]);
				ds[z].company = line.split(",")[5];
				ds[z].usage = Integer.parseInt(line.split(",")[6]);
				ds[z].phone = line.split(",")[7];
				ds[z].address = line.split(",")[8];
				ds[z].gender = line.split(",")[9];
				x++;
				//ds[z].lname = line.split(",")[10];
			}
			System.out.println("??????????????????????????????????????????????");
			System.out.println(x);
			for(int i = 0 ; i < x ; i++){
				ds[i].id = i + 1;
			}
			for (int i = 0; i < x; i++) {
//				System.out.println(ds[i].id + "," + ds[i].name + "," + ds[i].marital + "," + ds[i].age + "," + ds[i].income + "," + ds[i].company + "," + ds[i].usage + "," + ds[i].phone + "," + ds[i].address + "," + ds[i].gender);
				temp = ds[i].id + "," + ds[i].fullname + "," + ds[i].marital + "," + ds[i].age + "," + ds[i].income + "," + ds[i].company + "," + ds[i].usage + "," + ds[i].phone + "," + ds[i].address + "," + ds[i].gender;
				temp = temp + "\n";
				ans_file = ans_file + temp;
			}
			try {
				System.out.println("=======================================================================================");
				FileWriter fw = new FileWriter("/Users/aakash/Desktop/DWM Project/ETL-Tool-master/src/etl/keyReconstructedfinal.txt");
				fw.write(ans_file);
				fw.close();
			} catch (Exception e) {}
			//key.setText("");
			key.setText("1---\"Merging\" : First name and last name");


			for (int i = 0; i < z; i++) {
				for (int j = i + 1; j < z; j++) {
					if (ds[i].fullname.compareTo(ds[j].fullname) == 0 && ds[i].usage == ds[j].usage) {
						ds[j].fullname = "duplicate";
						z--;
					}
				}
			}

			calc.setText("4---\"Calculated values\" : Minutes to Hours");
			ans_file = "";
			for(int i = 0 ; i < x ; i++) {
				if(ds[i].usage < 200000){
					ds[i].offer = "low";
				}
				else if(ds[i].usage >=200000 && ds[i].usage <500000) {
					ds[i].offer = "medium";
				}
				else {
					ds[i].offer = "high";
				}
			}
			for (int i = 0; i < x; i++) {
//				System.out.println(ds[i].id + "," + ds[i].name + "," + ds[i].marital + "," + ds[i].age + "," + ds[i].income + "," + ds[i].company + "," + ds[i].usage + "," + ds[i].phone + "," + ds[i].address + "," + ds[i].gender);
				temp = ds[i].id + "," + ds[i].fullname + "," + ds[i].marital + "," + ds[i].age + "," + ds[i].income + "," + ds[i].company + "," + ds[i].usage + "," + ds[i].phone + "," + ds[i].address + "," + ds[i].gender + "," + ds[i].offer;
				temp = temp + "\n";
				ans_file = ans_file + temp;
			}
			try {
				System.out.println("=======================================================================================");
				FileWriter fw = new FileWriter("/Users/aakash/Desktop/DWM Project/ETL-Tool-master/src/etl/CalculateValue.txt");
				fw.write(ans_file);
				fw.close();
			} catch (Exception e) {}


			form.setText("5---\"Format Revision\" Char to String");


			for (int i = 0; i < x; i++) {
				if(ds[i].gender.equalsIgnoreCase("MALE") || ds[i].gender.equalsIgnoreCase("0") || ds[i].gender.equalsIgnoreCase("M")) {
					ds[i].gen = "M";
				}
				else {
					ds[i].gen = "F";
				}
			}
			ans_file = "";
			for (int i = 0; i < x; i++) {
//				System.out.println(ds[i].id + "," + ds[i].name + "," + ds[i].marital + "," + ds[i].age + "," + ds[i].income + "," + ds[i].company + "," + ds[i].usage + "," + ds[i].phone + "," + ds[i].address + "," + ds[i].gender);
				temp = ds[i].id + "," + ds[i].fullname + "," + ds[i].marital + "," + ds[i].age + "," + ds[i].income + "," + ds[i].company + "," + ds[i].usage + "," + ds[i].phone + "," + ds[i].address + "," + ds[i].gen + "," + ds[i].offer;
				temp = temp + "\n";
				ans_file = ans_file + temp;
			}
			try {
				System.out.println("=======================================================================================");
				FileWriter fw = new FileWriter("/Users/aakash/Desktop/DWM Project/ETL-Tool-master/src/etl/FormatRevison.txt");
				fw.write(ans_file);
				fw.close();
				FileWriter fw1 = new FileWriter("/Users/aakash/Desktop/DWM Project/ETL-Tool-master/src/etl/transformed.txt");
				fw1.write(ans_file);
				fw1.close();
			} catch (Exception e) {}



		} catch (Exception e) {}

	}//GEN-LAST:event_jButton1ActionPerformed
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new transpage().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel calc;
	private javax.swing.JLabel dedup;
	private javax.swing.JLabel form;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel key;
	private javax.swing.JLabel merge;
	// End of variables declaration//GEN-END:variables
}