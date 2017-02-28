package Ushtrime;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kuizi {

	private JFrame frame;
	private JPanel p1, p2, p3;
	private JLabel[] arrayLabels;
	private JRadioButton[] arrayRButtons;
	private ButtonGroup[] arrayGroups;
	private JPanel[] arrayPanels;
	private CardLayout cl;
	private JButton b1, b2;
	private int piket;

	public Kuizi() {
		frame = new JFrame();
		frame.setSize(700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());
		frame.setTitle("Kuizi");
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		cl = new CardLayout();
		p2 = new JPanel();
		p2.setLayout(cl);
		arrayPanels = new JPanel[20];
		// Shfaqja e pyetjeve dhe e pergjigjeve
		for (int i = 0; i < arrayPanels.length; i++) {
			arrayPanels[i] = new JPanel();
			p2.add(arrayPanels[i], String.valueOf(i));
			arrayPanels[i].setLayout(new GridLayout(0, 1));
		}
		// Alternativat e pyetjeve (radio butonat)
		arrayRButtons = new JRadioButton[80];
		for (int i = 0; i < arrayRButtons.length; i++) {
			arrayRButtons[i] = new JRadioButton();
			switch (i) {
			case 0:
				arrayRButtons[i].setText("Anelidet dhe urodelet");
				break;
			case 1:
				arrayRButtons[i].setText("Urodelet, hardhuca dhe insektet");
				break;
			case 2:
				arrayRButtons[i].setText("Planoret, urodelet, anelidet");
				break;
			case 3:
				arrayRButtons[i].setText("Shpuzoret, grykoret dhe planariet");
				break;
			case 4:
				arrayRButtons[i].setText("Vezet oligolecite");
				break;
			case 5:
				arrayRButtons[i].setText("Vezet telolecite");
				break;
			case 6:
				arrayRButtons[i].setText("Vezet alecite");
				break;
			case 7:
				arrayRButtons[i].setText("Vezet centrolecite");
				break;
			case 8:
				arrayRButtons[i].setText("Profazen 2 te mejozes");
				break;
			case 9:
				arrayRButtons[i].setText("Profazen 1 te mejozes");
				break;
			case 10:
				arrayRButtons[i].setText("Metafazen 2 te mejozes");
				break;
			case 11:
				arrayRButtons[i].setText("Metafazen 1 te mejozes");
				break;
			case 12:
				arrayRButtons[i].setText("Lizosome");
				break;
			case 13:
				arrayRButtons[i].setText("Mitokondrie");
				break;
			case 14:
				arrayRButtons[i].setText("Sferozome");
				break;
			case 15:
				arrayRButtons[i].setText("Sferozome");
				break;
			case 16:
				arrayRButtons[i].setText("Retikulumi endoplazmatik");
				break;
			case 17:
				arrayRButtons[i].setText("Mitokondriet");
				break;
			case 18:
				arrayRButtons[i].setText("Lizosomet");
				break;
			case 19:
				arrayRButtons[i].setText("Sferozomet");
				break;
			case 20:
				arrayRButtons[i].setText("Zigonemen");
				break;
			case 21:
				arrayRButtons[i].setText("Diplonemen");
				break;
			case 22:
				arrayRButtons[i].setText("Diakinezen");
				break;
			case 23:
				arrayRButtons[i].setText("Pakinemen");
				break;
			case 24:
				arrayRButtons[i].setText("Epistaze");
				break;
			case 25:
				arrayRButtons[i].setText("Komplementim");
				break;
			case 26:
				arrayRButtons[i].setText("Penetracion");
				break;
			case 27:
				arrayRButtons[i].setText("Ekspresivitet");
				break;
			case 28:
				arrayRButtons[i].setText("Valence ekologjike");
				break;
			case 29:
				arrayRButtons[i].setText("Faktore ekologjik");
				break;
			case 30:
				arrayRButtons[i].setText("Nishe ekologjike");
				break;
			case 31:
				arrayRButtons[i].setText("Biotop");
				break;
			case 32:
				arrayRButtons[i].setText("Polimeraza");
				break;
			case 33:
				arrayRButtons[i].setText("Endonukleaza");
				break;
			case 34:
				arrayRButtons[i].setText("Topoizomeraza");
				break;
			case 35:
				arrayRButtons[i].setText("Helikaza");
				break;
			case 36:
				arrayRButtons[i].setText("Lukthi");
				break;
			case 37:
				arrayRButtons[i].setText("Pankreasi");
				break;
			case 38:
				arrayRButtons[i].setText("Zorra e holle");
				break;
			case 39:
				arrayRButtons[i].setText("Zorra e trashe");
				break;
			case 40:
				arrayRButtons[i].setText("Cerebellum");
				break;
			case 41:
				arrayRButtons[i].setText("Cerebrum");
				break;
			case 42:
				arrayRButtons[i].setText("Pons");
				break;
			case 43:
				arrayRButtons[i].setText("Hippocampus");
				break;
			case 44:
				arrayRButtons[i].setText("Insuline");
				break;
			case 45:
				arrayRButtons[i].setText("Glukagon");
				break;
			case 46:
				arrayRButtons[i].setText("Amiline");
				break;
			case 47:
				arrayRButtons[i].setText("Somatostatine");
				break;
			case 48:
				arrayRButtons[i].setText("20%");
				break;
			case 49:
				arrayRButtons[i].setText("30%");
				break;
			case 50:
				arrayRButtons[i].setText("40%");
				break;
			case 51:
				arrayRButtons[i].setText("50%");
				break;
			case 52:
				arrayRButtons[i].setText("Cerebellum");
				break;
			case 53:
				arrayRButtons[i].setText("Cerebrum");
				break;
			case 54:
				arrayRButtons[i].setText("Pons");
				break;
			case 55:
				arrayRButtons[i].setText("Thalamus");
				break;
			case 56:
				arrayRButtons[i].setText("Nekroze");
				break;
			case 57:
				arrayRButtons[i].setText("Apoptoze");
				break;
			case 58:
				arrayRButtons[i].setText("Celikoze");
				break;
			case 59:
				arrayRButtons[i].setText("Narkoze");
				break;
			case 60:
				arrayRButtons[i].setText("Muskujt");
				break;
			case 61:
				arrayRButtons[i].setText("Sistemin e qarkullimit te gjakut");
				break;
			case 62:
				arrayRButtons[i].setText("Procesit te frymemarrjes");
				break;
			case 63:
				arrayRButtons[i].setText("Organeve te tretjes");
				break;
			case 64:
				arrayRButtons[i].setText("Oksigjen");
				break;
			case 65:
				arrayRButtons[i].setText("Karbon");
				break;
			case 66:
				arrayRButtons[i].setText("Hidrogjen");
				break;
			case 67:
				arrayRButtons[i].setText("Azot");
				break;
			case 68:
				arrayRButtons[i].setText("Femuri");
				break;
			case 69:
				arrayRButtons[i].setText("Kocka ballore");
				break;
			case 70:
				arrayRButtons[i].setText("Humerusi");
				break;
			case 71:
				arrayRButtons[i].setText("Stapesi");
				break;
			case 72:
				arrayRButtons[i].setText("Femuri");
				break;
			case 73:
				arrayRButtons[i].setText("Kocka ballore");
				break;
			case 74:
				arrayRButtons[i].setText("Humerusi");
				break;
			case 75:
				arrayRButtons[i].setText("Stapesi");
				break;
			case 76:
				arrayRButtons[i].setText("Acid pantotenik");
				break;
			case 77:
				arrayRButtons[i].setText("Biotine");
				break;
			case 78:
				arrayRButtons[i].setText("Acid folik");
				break;
			case 79:
				arrayRButtons[i].setText("Ciankobalamina");
				break;

			}
		}
		// Grupet e butonave me nga 4 anetare
		// (meqe vetem njera nga alternativat eshte e sakte)
		arrayGroups = new ButtonGroup[20];
		int j = 0;
		for (int i = 0; i < arrayGroups.length; i++) {
			arrayGroups[i] = new ButtonGroup();
			arrayGroups[i].add(arrayRButtons[j]);
			arrayGroups[i].add(arrayRButtons[j + 1]);
			arrayGroups[i].add(arrayRButtons[j + 2]);
			arrayGroups[i].add(arrayRButtons[j + 3]);
			j += 4;
		}
		// Pyetjet
		arrayLabels = new JLabel[20];
		for (int i = 0; i < arrayLabels.length; i++) {
			arrayLabels[i] = new JLabel();
			switch (i) {
			case 0:
				arrayLabels[i].setText("1. Cilet organizma kane aftesi te plote regjeneruese ?");
				break;
			case 1:
				arrayLabels[i].setText("2. Cilat veze nuk kane materie rezerve-viteline ?");
				break;
			case 2:
				arrayLabels[i].setText("3. Kur ndodh rikombinimi i gjeneve ?");
				break;
			case 3:
				arrayLabels[i].setText("4. Ku kryhet frymemarrja qelizore ?");
				break;
			case 4:
				arrayLabels[i].setText("5. Kush e kryen transportimin brenda dhe jashte qelizore ?");
				break;
			case 5:
				arrayLabels[i].setText("6. Me cfare perfundon profaza ?");
				break;
			case 6:
				arrayLabels[i]
						.setText("7. Si quhet bashkeveprimi mes gjenesh ne percaktimin e nje vecorie te caktuar ?");
				break;
			case 7:
				arrayLabels[i].setText(
						"8. Si quhet diapazoni i ndryshueshmerise se veprimit te faktoreve ekologjike brenda te cilit eshte e mundur jeta ?");
				break;
			case 8:
				arrayLabels[i].setText("9. Kush e eliminon spiralizimin e dyfishte te ADN-se ?");
				break;
			case 9:
				arrayLabels[i].setText("10. Nga kush sekretohen insulina dhe glukagoni ?");
				break;
			case 10:
				arrayLabels[i].setText("11. Ku eshte e lokalizuar kujtesa e njeriut ?");
				break;
			case 11:
				arrayLabels[i].setText(
						"12. Cilin hormon e liron pankreasi kur niveli i sheqerit ne organizem eshte i ulet ?");
				break;
			case 12:
				arrayLabels[i].setText("13. Sa % te peshes trupore e perbejne muskujt ?");
				break;
			case 13:
				arrayLabels[i].setText("14. Si quhet ndryshe truri i vogel ?");
				break;
			case 14:
				arrayLabels[i].setText("15. Si quhet \"vetvrasja\" e qelizes ?");
				break;
			case 15:
				arrayLabels[i].setText("16. Angiologjia eshte shkenca mbi ... ");
				break;
			case 16:
				arrayLabels[i].setText("17. Cilin element e permban cdo molekule organike ?");
				break;
			case 17:
				arrayLabels[i].setText("18. Cila eshte kocka me e gjate te njeriu ?");
				break;
			case 18:
				arrayLabels[i].setText("19. Cila eshte kocka me e vogel te njeriu ?");
				break;
			case 19:
				arrayLabels[i].setText("20. Si quhet ndryshe vitamina B9 ?");
				break;
			}
		}
		p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		// Rotate panels with questions
		b1 = new JButton("Kalo te pyetja tjeter");
		b1.setEnabled(true);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.next(p2);
				b1.setEnabled(true);
				b2.setEnabled(true);
				b1.setText("Kalo te pyetja tjeter");
			}
		});
		b2 = new JButton("Pergjigju pyetjes");
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b1.setEnabled(true);
				if (arrayRButtons[3].isSelected() || arrayRButtons[6].isSelected() || arrayRButtons[9].isSelected()
						|| arrayRButtons[13].isSelected() || arrayRButtons[16].isSelected()
						|| arrayRButtons[22].isSelected() || arrayRButtons[25].isSelected()
						|| arrayRButtons[28].isSelected() || arrayRButtons[34].isSelected()
						|| arrayRButtons[37].isSelected() || arrayRButtons[43].isSelected()
						|| arrayRButtons[45].isSelected() || arrayRButtons[50].isSelected()
						|| arrayRButtons[52].isSelected() || arrayRButtons[57].isSelected()
						|| arrayRButtons[61].isSelected() || arrayRButtons[65].isSelected()
						|| arrayRButtons[68].isSelected() || arrayRButtons[75].isSelected()) {
					piket += 5;
					JOptionPane.showMessageDialog(null, "E sakte");
				} else if (arrayRButtons[78].isSelected()) {
					piket += 5;
					JOptionPane.showMessageDialog(null, "E sakte, ju fituat: " + piket + " / 100" + " pike");
					b1.setText("Rifillo kuizin nga fillimi");
				} else if (arrayRButtons[76].isSelected() || arrayRButtons[77].isSelected()
						|| arrayRButtons[79].isSelected()) {
					JOptionPane.showMessageDialog(null, "Gabim, ju fituat: " + piket + " / 100" + " pike");
					b1.setText("Rifillo kuizin nga fillimi");
				} else {
					JOptionPane.showMessageDialog(null, "Gabim");
				}
				for (int i = 0; i < 20; i++) {
					arrayGroups[i].clearSelection();
				}
				b2.setEnabled(true);
			}
		});
	}

	private void initialize() {
		p3.add(b1);
		p3.add(b2);
		int q = 0;
		for (int w = 0; w < 20; w++) {
			arrayPanels[w].add(arrayLabels[w]);
			arrayPanels[w].add(arrayRButtons[q]);
			arrayPanels[w].add(arrayRButtons[q + 1]);
			arrayPanels[w].add(arrayRButtons[q + 2]);
			arrayPanels[w].add(arrayRButtons[q + 3]);
			q += 4;
		}
		frame.add(p1, BorderLayout.NORTH);
		frame.add(p2, BorderLayout.CENTER);
		frame.add(p3, BorderLayout.SOUTH);
		cl.show(p2, "0");
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Kuizi klasa = new Kuizi();
		klasa.initialize();
	}
}