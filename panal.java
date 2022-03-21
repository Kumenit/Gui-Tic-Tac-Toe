package guitic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class panal extends JPanel implements ActionListener,KeyListener{
	static final int width=600;
	static final int hight=600;
	static final int unit=25;
	boolean run1=true;
	boolean me=true;
	int xa=0,xb=0,xc=0,xd=0,xe=0,xf=0,xg=0,xh=0,xi=0;
	int a=0;
	int b=0;
	int c=0;
	int d=0;
	int e1=0;
	int f=0;
	int g1=0;
	int h=0;
	int i=0;
	int x1=0;
	int y1=0;
	int z=0;
	int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0;
	int check=0;
	int x=0,x5,x6,x7,x8,x9;
	int y=0,y5,y6,y7,y8,y9;
	int pos1;
	int pos2;
	int pos3;
	int pos4;
	int pos5;
	int pos6,pos7,pos8,pos9;
	static final int delay=75;
	Timer timer;
	boolean run=false;
	int panx=310;
	ArrayList<Integer> al=new ArrayList<Integer>();
	ArrayList<Integer> ac=new ArrayList<Integer>();
	List<List> list=new ArrayList<List>();
	public void win()
	{
		List<Integer> f1=Arrays.asList(1,2,3);
		List<Integer> f2=Arrays.asList(4,5,6);
		List<Integer> f3=Arrays.asList(7,8,9);
		List<Integer> f4=Arrays.asList(1,4,7);
		List<Integer> f5=Arrays.asList(2,5,8);
		List<Integer> f6=Arrays.asList(3,6,9);
		List<Integer> f7=Arrays.asList(1,5,9);
		List<Integer> f8=Arrays.asList(7,5,3);
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		list.add(f5);
		list.add(f6);
		list.add(f7);
		list.add(f8);
	}
	public panal()
	{
		setPreferredSize(new Dimension(width,hight));
		setFocusable(true);
		setBackground(Color.black);
		addKeyListener(this);
		timer=new Timer(delay,this);
		timer.start();
		win();
	}
	Random r=new Random();
	public void tryinga(int p)
	{
		if(al.size()+ac.size()<8)
		{
		while(al.contains(p) || ac.contains(p))
		{
			pos1=r.nextInt(8)+1;
			if(!(al.contains(pos1)) & !(ac.contains(pos1)))break;
		}
		}
	}
	public void tryingb(int p)
	{
		if(al.size()+ac.size()<8)
		{
		while(al.contains(p) || ac.contains(p))
		{
			pos2=r.nextInt(8)+1;
			if(!(al.contains(pos2)) & !(ac.contains(pos2)))break;
		}
		}
	}
	public void tryingc(int p)
	{
		if(al.size()+ac.size()<8)
		{
		while(al.contains(p) || ac.contains(p))
		{
			pos3=r.nextInt(8)+1;
		if(!(al.contains(pos3)) & !(ac.contains(pos3)))break;
		}
		}
	}
	public void tryingd(int p)
	{
		if(al.size()+ac.size()<8)
		{
		while(al.contains(p) || ac.contains(p))
		{
			pos4=r.nextInt(8)+1;
			if(!(al.contains(pos4)) & !(ac.contains(pos4)))break;
		}
		}
		
	}
	public void tryinge(int p)
	{
		if(al.size()+ac.size()<8)
		{
		while(al.contains(p) || ac.contains(p))
		{
			pos5=r.nextInt(8)+1;
			if(!(al.contains(pos5)) & !(ac.contains(pos5)))break;
		}
		}
	}
	public void tryingf(int p)
	{
		if(al.size()+ac.size()<8)
		{
		while(al.contains(p) || ac.contains(p))
		{
			pos6=r.nextInt(8)+1;
			if(!(al.contains(pos6)) & !(ac.contains(pos6)))break;
		}
		}
	}
	public void tryingg(int p)
	{
		if(al.size()+ac.size()<8)
		{
		while(al.contains(p) || ac.contains(p))
		{
			pos7=r.nextInt(8)+1;
			if(!(al.contains(pos7)) & !(ac.contains(pos7)))break;
		}
		}
		
	}
	public void tryingh(int p)
	{
		if(al.size()+ac.size()<8)
		{
		while(al.contains(p) || ac.contains(p))
		{
			pos8=r.nextInt(8)+1;
			if(!(al.contains(pos8)) & !(ac.contains(pos8)))break;
		}
		}
	}
	public void tryingi(int p)
	{
		if(al.size()+ac.size()<8)
		{
		while(al.contains(p) || ac.contains(p))
		{
			pos9=r.nextInt(8)+1;
			if(!(al.contains(pos9)) & !(ac.contains(pos9)))break;
		}
		}
	}
	public void na() {
	pos1=r.nextInt(8)+1;
	}
	public void nb()
	{
	pos2=r.nextInt(8)+1;
	}
	public void nc()
	{
	pos3=r.nextInt(8)+1;
	}
	public void nd()
	{
	pos4=r.nextInt(8)+1;
	}
	public void ne() {
		pos5=r.nextInt(8)+1;
	}
	public void nf() {
    pos6=r.nextInt(8)+1;
	}
	public void ng() {
	pos7=r.nextInt(8)+1;
	}
	public void nh()
	{
	pos8=r.nextInt(8)+1;
}
	public void ni()
	{
    pos9=r.nextInt(8)+1;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		for(int i=0;i<width/unit;i++)
		{
			g.drawLine(i*unit,0, i*unit,hight);
			g.drawLine(0, i*unit,width, i*unit);
		}
		g.setColor(Color.yellow);
		//g.fillRect(6*unit,6*unit,300,5);
		g.fillRect(6*unit,9*unit, 300,5);
		g.fillRect(6*unit,12*unit,300,5);
		g.setColor(Color.green);
		g.fillRect(10*unit,7*unit,5,200);
		g.fillRect(14*unit,7*unit,5,200);
		//test
		g.setColor(Color.red);
		g.setFont(new Font("Ink free",Font.BOLD,20));
		g.drawString(""+al.size()+ac.size(),200,20);
		
		//1
		if(a>0)
		{
		g.setColor(Color.red);
		g.setFont(new Font("Ink free",Font.BOLD,75));
		g.drawString("X",8*unit-20,9*unit);
		}
		if(b>0)
		{
		g.setColor(Color.red);
		g.setFont(new Font("Ink free",Font.BOLD,75));
		g.drawString("X",11*unit+15,9*unit);
		}
		if(c>0)
		{
		g.setColor(Color.red);
		g.setFont(new Font("Ink free",Font.BOLD,75));
		g.drawString("X",15*unit+15,9*unit);
		}
		if(d>0)
		{
		g.setColor(Color.red);
		g.setFont(new Font("Ink free",Font.BOLD,75));
		g.drawString("X",8*unit-20,12*unit);
		}
		if(e1>0)
		{
		g.setColor(Color.red);
		g.setFont(new Font("Ink free",Font.BOLD,75));
		g.drawString("X",11*unit+15,12*unit);
		}
		if(f>0)
		{
		g.setColor(Color.red);
		g.setFont(new Font("Ink free",Font.BOLD,75));
		g.drawString("X",15*unit+15,12*unit);
		}
		if(g1>0)
		{
		g.setColor(Color.red);
		g.setFont(new Font("Ink free",Font.BOLD,75));
		g.drawString("X",8*unit-20,15*unit);
		}
		if(h>0)
		{
		g.setColor(Color.red);
		g.setFont(new Font("Ink free",Font.BOLD,75));
		g.drawString("X",11*unit+15,15*unit);
		}
		if(i>0)
		{
		g.setColor(Color.red);
		g.setFont(new Font("Ink free",Font.BOLD,75));
		g.drawString("X",15*unit+15,15*unit);
		}
		//check
		if(check==1)
		{
			g.setColor(Color.red);
			g.setFont(new Font("Ink free",Font.BOLD,45));
			g.drawString("Possition taken",125,500);
			check=0;
		}
		//cat
		if(z>0)
		{
			g.setColor(Color.red);
			g.setFont(new Font("Ink free",Font.BOLD,60));
			g.drawString("Cat",125,500);
		}
		//you win
		if(x1>0)
		{
			g.setColor(Color.GREEN);
			g.setFont(new Font("Ink free",Font.BOLD,60));
			g.drawString("You Win!",125,500);
		}
		//cpu Win
		if(y1>0)
		{
			g.setColor(Color.red);
			g.setFont(new Font("Ink free",Font.BOLD,60));
			g.drawString("CPU wins :(",125,500);
		}
		//restart
		if(y1>0 || x1>0 || z>0)
		{
			g.setColor(Color.green);
			g.setFont(new Font("Ink free",Font.BOLD,40));
			g.drawString("press Enter to restart",75,550);
		}
		//cpu
		if(a1>0)
		{
			cpu(pos1);
				g.setColor(Color.blue);
				g.setFont(new Font("Ink free",Font.BOLD,75));
				g.drawString("O",x,y);

		}
		if(a2>0)
		{
			cpu(pos2);
			g.setColor(Color.blue);
			g.setFont(new Font("Ink free",Font.BOLD,75));
			g.drawString("O",x,y);
		}
		if(a3>0)
		{
			cpu(pos3);
			g.setColor(Color.blue);
			g.setFont(new Font("Ink free",Font.BOLD,75));
			g.drawString("O",x,y);
		}
		if(a4>0)
		{
			cpu(pos4);
			g.setColor(Color.blue);
			g.setFont(new Font("Ink free",Font.BOLD,75));
			g.drawString("O",x,y);
		}
		if(a5>0)
		{
			cpu(pos5);
			g.setColor(Color.blue);
			g.setFont(new Font("Ink free",Font.BOLD,75));
			g.drawString("O",x,y);
		}
		if(a6>0)
		{
			cpu(pos6);
			g.setColor(Color.blue);
			g.setFont(new Font("Ink free",Font.BOLD,75));
			g.drawString("O",x,y);
		}
		if(a7>0)
		{
			cpu(pos7);
			g.setColor(Color.blue);
			g.setFont(new Font("Ink free",Font.BOLD,75));
			g.drawString("O",x,y);
		}
		if(a8>0)
		{
			cpu(pos8);
			g.setColor(Color.blue);
			g.setFont(new Font("Ink free",Font.BOLD,75));
			g.drawString("O",x,y);
		}
		if(a9>0)
		{
			cpu(pos9);
			g.setColor(Color.blue);
			g.setFont(new Font("Ink free",Font.BOLD,75));
			g.drawString("O",x,y);
		}
	}
	public void cpu(int a)
	{
		switch (a) {
		case 1:
			x=8*unit-20;
			y=9*unit;
			break;
		case 2:
			x=11*unit+15;
			y=9*unit;
			break;
		case 3:
			x=14*unit+15;
			y=9*unit;
			break;
		case 4:
			x=8*unit-20;
			y=12*unit;
			break;
		case 5:
			x=11*unit+15;
			y=12*unit;
			break;
		case 6:
			x=14*unit+15;
			y=12*unit;
			break;
		case 7:
			x=8*unit-20;
			y=15*unit;
			break;
		case 8:
			x=11*unit+15;
			y=14*unit;
			break;
		case 9:
			x=15*unit+15;
			y=14*unit;
			break;
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(List l:list)
		{
			if(me)
			{
			if(al.containsAll(l))
			{
				x1=1;
				repaint();
				timer.stop();
				run1=false;
				me=false;
			}
			}
			if(me) {
			if (ac.containsAll(l)) {
				y1=1;
					if(xa>0)
					{
						a1=1;
					}
					if(xb>0)
					{
						a2=1;
					}
					if(xc>0)
					{
						a3=1;
					}
					if(xd>0)
					{
						a4=1;
					}
					if(xe>0)
					{
						a5=1;
					}
					if(xf>0)
					{
						a6=1;
					}
					if(xg>0)
					{
						a7=1;
					}
					if(xh>0)
					{
						a8=1;
					}
					if(xi>0)
					{
						a9=1;
					}
				repaint();
				timer.stop();
				run1=false;
				me=false;
			} 
			}
		}
		if(me)
		{
			if(xa>0)
			{
				a1=1;
			}
			if(xb>0)
			{
				a2=1;
			}
			if(xc>0)
			{
				a3=1;
			}
			if(xd>0)
			{
				a4=1;
			}
			if(xe>0)
			{
				a5=1;
			}
			if(xf>0)
			{
				a6=1;
			}
			if(xg>0)
			{
				a7=1;
			}
			if(xh>0)
			{
				a8=1;
			}
			if(xi>0)
			{
				a9=1;
			}
		}
		
		if(me)
		{
		if(al.size()+ac.size()>9)
		{
			z=1;
			repaint();
			timer.stop();
			run1=false;
			me=false;
		}
		}
		
			if(run1)
			{
			repaint();	
			}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_1:
			if(al.contains(1) || ac.contains(1))
			{
				check=1;
			}else {
			run=true;
			a=1;
			al.add(1);
			na();
			tryinga(pos1);
			xa=1;
			ac.add(pos1);
			}
			break;
		case KeyEvent.VK_2:
			if(al.contains(2) || ac.contains(2))
			{
				check=1;
			}else {
			run=true;
			b=1;
			al.add(2);
			nb();
			tryingb(pos2);
			xb=1;
			ac.add(pos2);
			}
			break;
		case KeyEvent.VK_3:
			if(al.contains(3) || ac.contains(3))
			{
				check=1;
			}else {
				run=true;
				c=1;
				al.add(3);
				nc();
				tryingc(pos3);
				xc=1;
				
				ac.add(pos3);
			}
				break;
		case KeyEvent.VK_4:
			if(al.contains(4) || ac.contains(4))
			{
				check=1;
			}else {
			run=true;
			d=1;
			al.add(4);
			nd();
			tryingd(pos4);
			xd=1;
			ac.add(pos4);
			}
		 break;
		case KeyEvent.VK_5:
			if(al.contains(5) || ac.contains(5))
			{
				check=1;
			}else {
			run=true;
			e1=1;
			al.add(5);
			ne();
			tryinge(pos5);
			xe=1;
			ac.add(pos5);
			}
			break;
		case KeyEvent.VK_6:
			if(al.contains(6) || ac.contains(6))
			{
				check=1;
			}else {
			run=true;
			f=1;
			al.add(6);
			nf();
			tryingf(pos6);
			xf=1;
			ac.add(pos6);
			}
			break;
		case KeyEvent.VK_7:
			if(al.contains(7) || ac.contains(7))
			{
				check=1;
			}else {
			run=true;
			g1=1;
			al.add(7);
			ng();
			tryingg(pos7);
			xg=1;
			ac.add(pos7);
			}
			break;
		case KeyEvent.VK_8:
			if(al.contains(8) || ac.contains(8))
			{
				check=1;
			}else {
			run=true;
			h=1;
			al.add(8);
			nh();
			tryingh(pos8);
			xh=1;
			ac.add(pos8);
			}
			break;
		case KeyEvent.VK_9:
			if(al.contains(9) || ac.contains(9))
			{
				check=1;
			}else {
			run=true;
			i=1;
			al.add(9);
			ni();
			tryingi(pos9);
			xi=1;
			ac.add(pos9);
			}
			break;
		case KeyEvent.VK_ENTER:
			if(!run1)
			{
				run1=true;
				me=true;
				xa=0;xb=0;xc=0;xd=0;xe=0;xf=0;xg=0;xh=0;xi=0;
				a=0;
				b=0;
				c=0;
				 d=0;
				 e1=0;
				 f=0;
				 g1=0;
				 h=0;
				 i=0;
				 x1=0;
				 y1=0;
				 z=0;
				 a1=0;a2=0;a3=0;a4=0;a5=0;a6=0;a7=0;a8=0;a9=0;
				 check=0;
				 x=0;x5=0;x6=0;x7=0;x8=0;x9=0;
				y=0;y5=0;y6=0;y7=0;y8=0;y9=0;
				 pos1=0;
				 pos2=0;
				 pos3=0;
				 pos4=0;
				 pos5=0;
				pos6=0;pos7=0;pos8=0;pos9=0;
				//static final int delay=75;
				//Timer timer;
			 run=false;
				panx=310;
				
				repaint();
				timer.start();
				al.clear();
				
				ac.clear();
			}
		
		}
		
	}

}
