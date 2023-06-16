package br.senai.sp.jandira;

import javax.swing.JOptionPane;

public class TiposDeTringulo {

	public static void main(String[] args) {

		String strLadoA, strLadoB, strLadoC;
		int ladoA, ladoB, ladoC;

		strLadoA = JOptionPane.showInputDialog("Qual o valor do Lado A?");
		ladoA = Integer.parseInt(strLadoA);

		strLadoB = JOptionPane.showInputDialog("Qual o valor do Lado B?");
		ladoB = Integer.parseInt(strLadoB);

		strLadoC = JOptionPane.showInputDialog("Qual o valor do Lado C?");
		ladoC = Integer.parseInt(strLadoC);

		if (ladoC < ladoA + ladoB && ladoB < ladoA + ladoC && ladoA < ladoB + ladoC) {
			JOptionPane.showMessageDialog(null, "Parabéns, você possui um triângulo!! \n Clique em OK para saber o tipo...");
			if (ladoA == ladoB && ladoB == ladoC) {
				JOptionPane.showMessageDialog(null, "Este é um triângulo Equilátero!");
			} else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
				JOptionPane.showMessageDialog(null, "Este é um triângulo Isósceles!");
			} else {
				JOptionPane.showMessageDialog(null, "Este é um triângulo Escaleno!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Infelizmente os dados não equivalem ao de um triângulo!!");
		}
	}

}
