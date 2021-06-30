package memo;

import java.awt.event.*;

import javax.swing.*;


public class MemoMain {
	    public static void main(String[] args) {                    
	        
	        JFrame f = new JFrame();
	        f.setSize(500,300);  
	                        
	        JTextArea t = new JTextArea();      
	        f.add(t);
	        
	        f.setVisible(true);
	        
	        JMenuBar m = new JMenuBar();
	        f.setJMenuBar( m );
	         
	        JMenu m_file = new JMenu("파일");
	        m.add( m_file);
	        
	        JMenuItem i_save = new JMenuItem("저장");
	        JMenuItem i_load = new JMenuItem("로드");     
	        m_file.add( i_save);
	        m_file.add( i_load);         
	        
	        i_save.addActionListener(new ActionListener() {
	             
	            public void actionPerformed(ActionEvent e) {
	                System.out.println("저장을 실행합니다.");               
	            }            
	        }); 
	        
	        i_load.addActionListener(new ActionListener() {
	             
	            public void actionPerformed(ActionEvent e) {
	                System.out.println("로드를 실행합니다.");               
	            }            
	        }); 
	              
	        
	    }       
	}
