package com.coin.product;

import java.awt.event.*;

import javax.swing.*;

import com.coin.part.imp.AMDCPU;
import com.coin.part.imp.IntelCPU;
import com.coin.part.imp.Seagate;
import com.coin.part.imp.WestDigital;
import com.coin.part.type.CPU;
import com.coin.part.type.Disk;

public class ComputerStore {
	public static void main(String[] args) {

		CPU intel = new IntelCPU("intel cpu", 2, 1000);
		Disk seagate = new Seagate("Seagate disk", 1000, 40960);		
		Computer computer1 = new Computer("computer 1", intel, seagate);		
		
		CPU amd = new AMDCPU("AMD cpu", 800, 2);
		Disk westdigital = new WestDigital("West Digital disk", 2000, 81920);
		Computer computer2 = new Computer("computer 2", amd, westdigital);		
		
		JFrame frame = new JFrame("商店窗口");
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp = new JPanel();
		frame.add(jp);
		JButton add1 = new JButton("add a AMDCPU");
		JButton add2 = new JButton("add a IntelCPU");
		JButton add3 = new JButton("add a Seagate");
		JButton add4 = new JButton("add a WestDigital");
		jp.add(add1);
		jp.add(add2);
		jp.add(add3);
		jp.add(add4);
		add1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            	JOptionPane.showMessageDialog(jp,"no computer","提示",1);
            }
        });
		add2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            	JOptionPane.showMessageDialog(jp,"wc","提示",1);
            }
        });
		add3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            	JOptionPane.showMessageDialog(jp,computer1.description(),"",1);
            }
        });
		add4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            	JOptionPane.showMessageDialog(jp,computer2.description(),"提示",1);
            }
        });
		frame.setVisible(true);
	}
}
