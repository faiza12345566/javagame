import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Startt  extends JFrame{
   final private Font mainfont=new Font("Segeo print" ,Font.BOLD,18);
  JFrame f; 
  int current=0; 
  int checkgame=0; 

  int[] array = new int[24];
  JFrame frameObj;    

  static int firstran=0;
  static int secran=0;
  static int thirdran=0;
  static int fourthran=0;



    public void initialize(){

        
        Color c1 = new Color(102- 51- 0);  
    
    
     //   ImageIcon icon= new ImageIcon("images/Colour_0.png");
     ImageIcon icon = new ImageIcon(new ImageIcon("images/Empty.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

     ImageIcon icon1 = new ImageIcon(new ImageIcon("images/Empty.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
     ImageIcon icon2 = new ImageIcon(new ImageIcon("images/Score_0.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
     ImageIcon icon3 = new ImageIcon(new ImageIcon("images/Score_1.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
  

     ImageIcon mainicon0 =  new ImageIcon(new ImageIcon("images/Colour_0.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
     ImageIcon mainicon01 =  new ImageIcon(new ImageIcon("images/Colour_1.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
     ImageIcon mainicon02 =  new ImageIcon(new ImageIcon("images/Colour_2.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
     ImageIcon mainicon03 =  new ImageIcon(new ImageIcon("images/Colour_3.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
     ImageIcon mainicon04 =  new ImageIcon(new ImageIcon("images/Colour_4.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
     ImageIcon mainicon05 =  new ImageIcon(new ImageIcon("images/Colour_5.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
     ImageIcon mainicon06 =  new ImageIcon(new ImageIcon("images/Colour_6.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));


     ImageIcon mainicon =  new ImageIcon(new ImageIcon("images/Colour_0.png").getImage().getScaledInstance(35, 50, Image.SCALE_DEFAULT));
     ImageIcon mainicon1 = new ImageIcon(new ImageIcon("images/Colour_1.png").getImage().getScaledInstance(35, 50, Image.SCALE_DEFAULT));
     ImageIcon mainicon2 = new ImageIcon(new ImageIcon("images/Colour_2.png").getImage().getScaledInstance(35, 50, Image.SCALE_DEFAULT));
     ImageIcon mainicon3 = new ImageIcon(new ImageIcon("images/Colour_3.png").getImage().getScaledInstance(35, 50, Image.SCALE_DEFAULT));
     ImageIcon mainicon4 = new ImageIcon(new ImageIcon("images/Colour_4.png").getImage().getScaledInstance(35, 50, Image.SCALE_DEFAULT));
     ImageIcon mainicon5 = new ImageIcon(new ImageIcon("images/Colour_5.png").getImage().getScaledInstance(35, 50, Image.SCALE_DEFAULT));
     ImageIcon mainicon6 = new ImageIcon(new ImageIcon("images/Colour_6.png").getImage().getScaledInstance(35, 50, Image.SCALE_DEFAULT));
       // thumb.setIcon(icon);
  
      // thumb.setPreferredSize(new Dimension(50, 50));
      
      JPanel mainpanel=new JPanel();
      mainpanel.setLayout(new GridLayout(7,1));

//first start

JPanel leftpanel=new JPanel();
leftpanel.setBackground(c1);
leftpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      
JLabel thumb01 = new JLabel("");
thumb01.setIcon(icon);
thumb01.setIcon(icon);
leftpanel.add(thumb01);

JLabel thumb02 = new JLabel("");
thumb02.setIcon(icon);
thumb02.setIcon(icon);
leftpanel.add(thumb02);

JLabel thumb03 = new JLabel("");
thumb03.setIcon(icon);
thumb03.setIcon(icon);
leftpanel.add(thumb03);

JLabel thumb04 = new JLabel("");
thumb04.setIcon(icon);
thumb04.setIcon(icon);
leftpanel.add(thumb04);

   

JPanel rightpanel=new JPanel();
rightpanel.setLayout(new GridLayout(2,2,0,0));

JLabel thumb05= new JLabel("");
thumb05.setIcon(icon1);
rightpanel.add(thumb05);

JLabel thumb06= new JLabel("");
thumb06.setIcon(icon1);
rightpanel.add(thumb06);

JLabel thumb07= new JLabel("");
thumb07.setIcon(icon1);
rightpanel.add(thumb07);

JLabel thumb08= new JLabel("");
thumb08.setIcon(icon1);
rightpanel.add(thumb08);

leftpanel.add(rightpanel);
mainpanel.add(leftpanel);

//first end


//second start

JPanel leftpanel1=new JPanel();
leftpanel1.setBackground(c1);
leftpanel1.setLayout(new FlowLayout(FlowLayout.LEFT));

JLabel thumb11 = new JLabel("");
thumb11.setIcon(icon);
thumb11.setIcon(icon);
leftpanel1.add(thumb11);

JLabel thumb12 = new JLabel("");
thumb12.setIcon(icon);
thumb12.setIcon(icon);
leftpanel1.add(thumb12);

JLabel thumb13 = new JLabel("");
thumb13.setIcon(icon);
thumb13.setIcon(icon);
leftpanel1.add(thumb13);

JLabel thumb14 = new JLabel("");
thumb14.setIcon(icon);
thumb14.setIcon(icon);
leftpanel1.add(thumb14);

   
JPanel rightpanel1=new JPanel();
rightpanel1.setLayout(new GridLayout(2,2,0,0));
   
JLabel thumb15= new JLabel("");
thumb15.setIcon(icon1);
rightpanel1.add(thumb15);

JLabel thumb16= new JLabel("");
thumb16.setIcon(icon1);
rightpanel1.add(thumb16);

JLabel thumb17= new JLabel("");
thumb17.setIcon(icon1);
rightpanel1.add(thumb17);

JLabel thumb18= new JLabel("");
thumb18.setIcon(icon1);
rightpanel1.add(thumb18);

leftpanel1.add(rightpanel1);
mainpanel.add(leftpanel1);

//second end



//third start

JPanel leftpanel2=new JPanel();
leftpanel2.setBackground(c1);
leftpanel2.setLayout(new FlowLayout(FlowLayout.LEFT));

JLabel thumb21 = new JLabel("");
thumb21.setIcon(icon);
thumb21.setIcon(icon);
leftpanel2.add(thumb21);

JLabel thumb22 = new JLabel("");
thumb22.setIcon(icon);
thumb22.setIcon(icon);
leftpanel2.add(thumb22);

JLabel thumb23 = new JLabel("");
thumb23.setIcon(icon);
thumb23.setIcon(icon);
leftpanel2.add(thumb23);

JLabel thumb24 = new JLabel("");
thumb24.setIcon(icon);
thumb24.setIcon(icon);
leftpanel2.add(thumb24);

   
JPanel rightpanel2=new JPanel();
rightpanel2.setLayout(new GridLayout(2,2,0,0));
   
JLabel thumb25= new JLabel("");
thumb25.setIcon(icon1);
rightpanel2.add(thumb25);

JLabel thumb26= new JLabel("");
thumb26.setIcon(icon1);
rightpanel2.add(thumb26);

JLabel thumb27= new JLabel("");
thumb27.setIcon(icon1);
rightpanel2.add(thumb27);

JLabel thumb28= new JLabel("");
thumb28.setIcon(icon1);
rightpanel2.add(thumb28);

leftpanel2.add(rightpanel2);
mainpanel.add(leftpanel2);

//third end




//fourth start

JPanel leftpanel3=new JPanel();
leftpanel3.setBackground(c1);
leftpanel3.setLayout(new FlowLayout(FlowLayout.LEFT));

JLabel thumb31 = new JLabel("");
thumb31.setIcon(icon);
thumb31.setIcon(icon);
leftpanel3.add(thumb31);

JLabel thumb32 = new JLabel("");
thumb32.setIcon(icon);
thumb32.setIcon(icon);
leftpanel3.add(thumb32);

JLabel thumb33 = new JLabel("");
thumb33.setIcon(icon);
thumb33.setIcon(icon);
leftpanel3.add(thumb33);

JLabel thumb34 = new JLabel("");
thumb34.setIcon(icon);
thumb34.setIcon(icon);
leftpanel3.add(thumb34);

   
JPanel rightpanel3=new JPanel();
rightpanel3.setLayout(new GridLayout(2,2,0,0));
   
JLabel thumb35= new JLabel("");
thumb35.setIcon(icon1);
rightpanel3.add(thumb35);

JLabel thumb36= new JLabel("");
thumb36.setIcon(icon1);
rightpanel3.add(thumb36);

JLabel thumb37= new JLabel("");
thumb37.setIcon(icon1);
rightpanel3.add(thumb37);

JLabel thumb38= new JLabel("");
thumb38.setIcon(icon1);
rightpanel3.add(thumb38);

leftpanel3.add(rightpanel3);
mainpanel.add(leftpanel3);

//fourth end



//fifh start

JPanel leftpanel4=new JPanel();
leftpanel4.setBackground(c1);
leftpanel4.setLayout(new FlowLayout(FlowLayout.LEFT));

JLabel thumb41 = new JLabel("");
thumb41.setIcon(icon);
thumb41.setIcon(icon);
leftpanel4.add(thumb41);

JLabel thumb42 = new JLabel("");
thumb42.setIcon(icon);
thumb42.setIcon(icon);
leftpanel4.add(thumb42);

JLabel thumb43 = new JLabel("");
thumb43.setIcon(icon);
thumb43.setIcon(icon);
leftpanel4.add(thumb43);

JLabel thumb44 = new JLabel("");
thumb44.setIcon(icon);
thumb44.setIcon(icon);
leftpanel4.add(thumb44);

   
JPanel rightpanel4=new JPanel();
rightpanel4.setLayout(new GridLayout(2,2,0,0));
   
JLabel thumb45= new JLabel("");
thumb45.setIcon(icon1);
rightpanel4.add(thumb45);

JLabel thumb46= new JLabel("");
thumb46.setIcon(icon1);
rightpanel4.add(thumb46);

JLabel thumb47= new JLabel("");
thumb47.setIcon(icon1);
rightpanel4.add(thumb47);

JLabel thumb48= new JLabel("");
thumb48.setIcon(icon1);
rightpanel4.add(thumb48);

leftpanel4.add(rightpanel4);
mainpanel.add(leftpanel4);

//fifth end



//sixth start

JPanel leftpanel5=new JPanel();
leftpanel5.setBackground(c1);
leftpanel5.setLayout(new FlowLayout(FlowLayout.LEFT));

JLabel thumb51 = new JLabel("");
thumb51.setIcon(icon);
thumb51.setIcon(icon);
leftpanel5.add(thumb51);

JLabel thumb52 = new JLabel("");
thumb52.setIcon(icon);
thumb52.setIcon(icon);
leftpanel5.add(thumb52);

JLabel thumb53 = new JLabel("");
thumb53.setIcon(icon);
thumb53.setIcon(icon);
leftpanel5.add(thumb53);

JLabel thumb54 = new JLabel("");
thumb54.setIcon(icon);
thumb54.setIcon(icon);
leftpanel5.add(thumb54);

   
JPanel rightpanel5=new JPanel();
rightpanel5.setLayout(new GridLayout(2,2,0,0));
   
JLabel thumb55= new JLabel("");
thumb55.setIcon(icon1);
rightpanel5.add(thumb55);

JLabel thumb56= new JLabel("");
thumb56.setIcon(icon1);
rightpanel5.add(thumb56);

JLabel thumb57= new JLabel("");
thumb57.setIcon(icon1);
rightpanel5.add(thumb57);

JLabel thumb58= new JLabel("");
thumb58.setIcon(icon1);
rightpanel5.add(thumb58);

leftpanel5.add(rightpanel5);
mainpanel.add(leftpanel5);

//sixth end

JPanel leftpanel9=new JPanel();
leftpanel9.setBackground(c1);
leftpanel9.setLayout(new FlowLayout(FlowLayout.LEFT));




JButton thumb91 = new JButton("");
thumb91.setBackground(c1);
thumb91.setPreferredSize(new Dimension(35, 50));
thumb91.setIcon(mainicon);


JButton thumb92 = new JButton("");
thumb92.setBackground(c1);
thumb92.setPreferredSize(new Dimension(35, 50));
thumb92.setIcon(mainicon1);


JButton thumb93 = new JButton("");
thumb93.setBackground(c1);
thumb93.setPreferredSize(new Dimension(35, 50));
thumb93.setIcon(mainicon2);

JButton thumb94 = new JButton("");
 thumb94.setBackground(c1);
 thumb94.setPreferredSize(new Dimension(35, 50));
thumb94.setIcon(mainicon3);


JButton thumb95 = new JButton("");
 thumb95.setBackground(c1);
 thumb95.setPreferredSize(new Dimension(35, 50));
     thumb95.setIcon(mainicon4);



JButton thumb96 = new JButton("");
thumb96.setBackground(c1);
thumb96.setPreferredSize(new Dimension(35, 50));
thumb96.setIcon(mainicon5);  


JButton thumb97 = new JButton("");
thumb97.setBackground(c1);
thumb97.setPreferredSize(new Dimension(35, 50));
    thumb97.setIcon(mainicon6);




thumb91.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

if(current==0){thumb51.setIcon(mainicon0); 
    checkgame=0;     
if(firstran==0){thumb55.setIcon(icon2); checkgame++;}
else if(secran==0){thumb55.setIcon(icon3); }
else if(thirdran==0){thumb55.setIcon(icon3); }
else if(fourthran==0){thumb55.setIcon(icon3); }
}

if(current==1){thumb52.setIcon(mainicon0); 
if(secran==0){thumb56.setIcon(icon2);  checkgame++; }    
 else if(firstran==0){thumb56.setIcon(icon3); }
 else if(thirdran==0){thumb56.setIcon(icon3); }
else if(fourthran==0){thumb56.setIcon(icon3); }
}

if(current==2){thumb53.setIcon(mainicon0);  
if(thirdran==0){thumb57.setIcon(icon2);  checkgame++; }    
else if(firstran==0){thumb57.setIcon(icon3); }
else if(secran==0){thumb57.setIcon(icon3); }
else if(fourthran==0){thumb57.setIcon(icon3); }
}

if(current==3){thumb54.setIcon(mainicon0);     
if(fourthran==0){thumb58.setIcon(icon2);  checkgame++; } 
else if(firstran==0){thumb58.setIcon(icon3); }
else if(secran==0){thumb58.setIcon(icon3); }
else if(thirdran==0){thumb58.setIcon(icon3); }

}
if(checkgame==4){
System.out.println("You Won");
thumb91.setEnabled(false);
thumb92.setEnabled(false);
thumb93.setEnabled(false);
thumb94.setEnabled(false);
thumb95.setEnabled(false);
thumb96.setEnabled(false);
thumb97.setEnabled(false);

checkgame=0;
}


if(current==4){thumb41.setIcon(mainicon0);  
    checkgame=0;    
    if(firstran==0){thumb45.setIcon(icon2); checkgame++; }
    else if(secran==0){thumb45.setIcon(icon3); }
    else if(thirdran==0){thumb45.setIcon(icon3); }
     else if(fourthran==0){thumb45.setIcon(icon3); }
    }
    
    if(current==5){thumb42.setIcon(mainicon0);    
    if(secran==0){thumb46.setIcon(icon2); checkgame++;}  
    else if(firstran==0){thumb46.setIcon(icon3); }
    
    else if(thirdran==0){thumb46.setIcon(icon3); }
    else if(fourthran==0){thumb46.setIcon(icon3); }
    }
    
    if(current==6){thumb43.setIcon(mainicon0); 
    if(thirdran==0){thumb47.setIcon(icon2);checkgame++; }     
    else if(firstran==0){thumb47.setIcon(icon3); }
    else if(secran==0){thumb47.setIcon(icon3); }
    
    else if(fourthran==0){thumb47.setIcon(icon3); }
    }
    
    if(current==7){thumb44.setIcon(mainicon0); 
    if(fourthran==0){thumb48.setIcon(icon2);checkgame++; }     
    else if(firstran==0){thumb48.setIcon(icon3); }
    else if(secran==0){thumb48.setIcon(icon3); }
    else if(thirdran==0){thumb48.setIcon(icon3); }

    }

    if(checkgame==4)
{
    System.out.println("You Won");
thumb91.setEnabled(false);
thumb92.setEnabled(false);
thumb93.setEnabled(false);
thumb94.setEnabled(false);
thumb95.setEnabled(false);
thumb96.setEnabled(false);
thumb97.setEnabled(false);

checkgame=0;
}

    if(current==8){thumb31.setIcon(mainicon0);  
        checkgame=0;    
        if(firstran==0){thumb35.setIcon(icon2);checkgame++;  }
        else if(secran==0){thumb35.setIcon(icon3); }
        else if(thirdran==0){thumb35.setIcon(icon3); }
        else if(fourthran==0){thumb35.setIcon(icon3); }
        }
        
        if(current==9){thumb32.setIcon(mainicon0); 
        if(secran==0){thumb36.setIcon(icon2); checkgame++; }     
        else if(firstran==0){thumb36.setIcon(icon3); }
      
       else if(thirdran==0){thumb36.setIcon(icon3); }
       else if(fourthran==0){thumb36.setIcon(icon3); }
        }
        
        if(current==10){thumb33.setIcon(mainicon0);
        if(thirdran==0){thumb37.setIcon(icon2); checkgame++; }      
        else if(firstran==0){thumb37.setIcon(icon3); }
        else if(secran==0){thumb37.setIcon(icon3); }
        
        else if(fourthran==0){thumb37.setIcon(icon3); }
        }
        
        if(current==11){thumb34.setIcon(mainicon0);
        if(fourthran==0){thumb38.setIcon(icon2); checkgame++; }      
        else if(firstran==0){thumb38.setIcon(icon3); }
        else if(secran==0){thumb38.setIcon(icon3); }
        else if(thirdran==0){thumb38.setIcon(icon3); }
      
        }


        if(checkgame==4)
        {
            System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
        }

        if(current==12){thumb21.setIcon(mainicon0);
            checkgame=0;      
            if(firstran==0){thumb25.setIcon(icon2); checkgame++; }
            else if(secran==0){thumb25.setIcon(icon3); }
           else if(thirdran==0){thumb25.setIcon(icon3); }
            else if(fourthran==0){thumb25.setIcon(icon3); }
            }
            
            if(current==13){thumb22.setIcon(mainicon0);
            if(secran==0){thumb26.setIcon(icon2); checkgame++; }      
            else if(firstran==0){thumb26.setIcon(icon3); }
            else if(thirdran==0){thumb26.setIcon(icon3); }
            else if(fourthran==0){thumb26.setIcon(icon3); }
            }
            
            if(current==14){thumb23.setIcon(mainicon0); 
            if(thirdran==0){thumb27.setIcon(icon2); checkgame++; }     
            else if(firstran==0){thumb27.setIcon(icon3); }
           else if(secran==0){thumb27.setIcon(icon3); }
         
           else if(fourthran==0){thumb27.setIcon(icon3); }
            }
            
            if(current==15){thumb24.setIcon(mainicon0);   
           if(fourthran==0){thumb28.setIcon(icon2); checkgame++; }   
           else if(firstran==0){thumb28.setIcon(icon3); }
           else if(secran==0){thumb28.setIcon(icon3); }
           else if(thirdran==0){thumb28.setIcon(icon3); }
           
            }
            if(checkgame==4)
            {
                System.out.println("You Won");
thumb91.setEnabled(false);
thumb92.setEnabled(false);
thumb93.setEnabled(false);
thumb94.setEnabled(false);
thumb95.setEnabled(false);
thumb96.setEnabled(false);
thumb97.setEnabled(false);

checkgame=0;
            }

            if(current==16){thumb11.setIcon(mainicon0);
                checkgame=0;      
                if(firstran==0){thumb15.setIcon(icon2); checkgame++; }
           else     if(secran==0){thumb15.setIcon(icon3); }
            else    if(thirdran==0){thumb15.setIcon(icon3); }
            else    if(fourthran==0){thumb15.setIcon(icon3); }
                }
                
                if(current==17){thumb12.setIcon(mainicon0);  
                 if(secran==0){thumb16.setIcon(icon2); checkgame++; }    
               else if(firstran==0){thumb16.setIcon(icon3); }
          
              else  if(thirdran==0){thumb16.setIcon(icon3); }
              else  if(fourthran==0){thumb16.setIcon(icon3); }
                }
                
                if(current==18){thumb13.setIcon(mainicon0);
                if(thirdran==0){thumb17.setIcon(icon2); checkgame++; }      
                else if(firstran==0){thumb17.setIcon(icon3); }
              else  if(secran==0){thumb17.setIcon(icon3); }
             
              else  if(fourthran==0){thumb17.setIcon(icon3); }
                }
                
                if(current==19){thumb14.setIcon(mainicon0);
                if(fourthran==0){thumb18.setIcon(icon2);checkgame++;  }      
               else if(firstran==0){thumb18.setIcon(icon3); }
              else  if(secran==0){thumb18.setIcon(icon3); }
              else  if(thirdran==0){thumb18.setIcon(icon3); }
              
                }

                if(checkgame==4)
                {
                    System.out.println("You Won");
thumb91.setEnabled(false);
thumb92.setEnabled(false);
thumb93.setEnabled(false);
thumb94.setEnabled(false);
thumb95.setEnabled(false);
thumb96.setEnabled(false);
thumb97.setEnabled(false);

checkgame=0;
                }
                if(current==20){thumb01.setIcon(mainicon0);
                    checkgame=0;      
                    if(firstran==0){thumb05.setIcon(icon2); checkgame++; }
              else      if(secran==0){thumb05.setIcon(icon3); }
              else      if(thirdran==0){thumb05.setIcon(icon3); }
              else      if(fourthran==0){thumb05.setIcon(icon3); }
                    }
                    
                    if(current==21){thumb02.setIcon(mainicon0); 
                        if(secran==0){thumb06.setIcon(icon2); checkgame++; }     
                  else  if(firstran==0){thumb06.setIcon(icon3); }
                   
                else    if(thirdran==0){thumb06.setIcon(icon3); }
                else    if(fourthran==0){thumb06.setIcon(icon3); }
                    }
                    
                    if(current==22){thumb03.setIcon(mainicon0); 
                   if(thirdran==0){thumb07.setIcon(icon2); checkgame++; }     
                   else if(firstran==0){thumb07.setIcon(icon3); }
                else    if(secran==0){thumb07.setIcon(icon3); }
                
                else    if(fourthran==0){thumb07.setIcon(icon3); }
                    }
                    
                    if(current==23){thumb04.setIcon(mainicon0); 
                   if(fourthran==0){thumb08.setIcon(icon2);checkgame++;  }     
                  else  if(firstran==0){thumb08.setIcon(icon3); }
                else    if(secran==0){thumb08.setIcon(icon3); }
                else    if(thirdran==0){thumb08.setIcon(icon3); }
                
                    }
                    if(checkgame==4)
                    {
                        System.out.println("You Won");
thumb91.setEnabled(false);
thumb92.setEnabled(false);
thumb93.setEnabled(false);
thumb94.setEnabled(false);
thumb95.setEnabled(false);
thumb96.setEnabled(false);
thumb97.setEnabled(false);

checkgame=0;
                    }
                    

current++;}

        
     });
    

   
     thumb92.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        
            if(current==0){thumb51.setIcon(mainicon01); 
                checkgame=0;     
            if(firstran==1){thumb55.setIcon(icon2); checkgame++;}
            else if(secran==1){thumb55.setIcon(icon3); }
            else if(thirdran==1){thumb55.setIcon(icon3); }
            else if(fourthran==1){thumb55.setIcon(icon3); }
            }
            
            if(current==1){thumb52.setIcon(mainicon01); 
            if(secran==1){thumb56.setIcon(icon2);  checkgame++; }    
             else if(firstran==1){thumb56.setIcon(icon3); }
             else if(thirdran==1){thumb56.setIcon(icon3); }
            else if(fourthran==1){thumb56.setIcon(icon3); }
            }
            
            if(current==2){thumb53.setIcon(mainicon01);  
            if(thirdran==1){thumb57.setIcon(icon2);  checkgame++; }    
            else if(firstran==1){thumb57.setIcon(icon3); }
            else if(secran==1){thumb57.setIcon(icon3); }
            else if(fourthran==1){thumb57.setIcon(icon3); }
            }
            
            if(current==3){thumb54.setIcon(mainicon01);     
            if(fourthran==1){thumb58.setIcon(icon2);  checkgame++; } 
            else if(firstran==1){thumb58.setIcon(icon3); }
            else if(secran==1){thumb58.setIcon(icon3); }
            else if(thirdran==1){thumb58.setIcon(icon3); }
            
            }
            if(checkgame==4){
            System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
            }
            
            
            if(current==4){thumb41.setIcon(mainicon01);  
                checkgame=0;    
                if(firstran==1){thumb45.setIcon(icon2); checkgame++; }
                else if(secran==1){thumb45.setIcon(icon3); }
                else if(thirdran==1){thumb45.setIcon(icon3); }
                 else if(fourthran==1){thumb45.setIcon(icon3); }
                }
                
                if(current==5){thumb42.setIcon(mainicon01);    
                if(secran==1){thumb46.setIcon(icon2); checkgame++;}  
                else if(firstran==1){thumb46.setIcon(icon3); }
                
                else if(thirdran==1){thumb46.setIcon(icon3); }
                else if(fourthran==1){thumb46.setIcon(icon3); }
                }
                
                if(current==6){thumb43.setIcon(mainicon01); 
                if(thirdran==1){thumb47.setIcon(icon2);checkgame++; }     
                else if(firstran==1){thumb47.setIcon(icon3); }
                else if(secran==1){thumb47.setIcon(icon3); }
                
                else if(fourthran==1){thumb47.setIcon(icon3); }
                }
                
                if(current==7){thumb44.setIcon(mainicon01); 
                if(fourthran==1){thumb48.setIcon(icon2);checkgame++; }     
                else if(firstran==1){thumb48.setIcon(icon3); }
                else if(secran==1){thumb48.setIcon(icon3); }
                else if(thirdran==1){thumb48.setIcon(icon3); }
            
                }
            
                if(checkgame==4)
            {
                System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
            }
            
                if(current==8){thumb31.setIcon(mainicon01);  
                    checkgame=0;    
                    if(firstran==1){thumb35.setIcon(icon2);checkgame++;  }
                    else if(secran==1){thumb35.setIcon(icon3); }
                    else if(thirdran==1){thumb35.setIcon(icon3); }
                    else if(fourthran==1){thumb35.setIcon(icon3); }
                    }
                    
                    if(current==9){thumb32.setIcon(mainicon01); 
                    if(secran==1){thumb36.setIcon(icon2); checkgame++; }     
                    else if(firstran==1){thumb36.setIcon(icon3); }
                  
                   else if(thirdran==1){thumb36.setIcon(icon3); }
                   else if(fourthran==1){thumb36.setIcon(icon3); }
                    }
                    
                    if(current==10){thumb33.setIcon(mainicon01);
                    if(thirdran==1){thumb37.setIcon(icon2); checkgame++; }      
                    else if(firstran==1){thumb37.setIcon(icon3); }
                    else if(secran==1){thumb37.setIcon(icon3); }
                    
                    else if(fourthran==1){thumb37.setIcon(icon3); }
                    }
                    
                    if(current==11){thumb34.setIcon(mainicon01);
                    if(fourthran==1){thumb38.setIcon(icon2); checkgame++; }      
                    else if(firstran==1){thumb38.setIcon(icon3); }
                    else if(secran==1){thumb38.setIcon(icon3); }
                    else if(thirdran==1){thumb38.setIcon(icon3); }
                  
                    }
            
            
                    if(checkgame==4)
                    {
                        System.out.println("You Won");
                        thumb91.setEnabled(false);
                        thumb92.setEnabled(false);
                        thumb93.setEnabled(false);
                        thumb94.setEnabled(false);
                        thumb95.setEnabled(false);
                        thumb96.setEnabled(false);
                        thumb97.setEnabled(false);
                        
                        checkgame=0;
                    }
            
                    if(current==12){thumb21.setIcon(mainicon01);
                        checkgame=0;      
                        if(firstran==1){thumb25.setIcon(icon2); checkgame++; }
                        else if(secran==1){thumb25.setIcon(icon3); }
                       else if(thirdran==1){thumb25.setIcon(icon3); }
                        else if(fourthran==1){thumb25.setIcon(icon3); }
                        }
                        
                        if(current==13){thumb22.setIcon(mainicon01);
                        if(secran==1){thumb26.setIcon(icon2); checkgame++; }      
                        else if(firstran==1){thumb26.setIcon(icon3); }
                        else if(thirdran==1){thumb26.setIcon(icon3); }
                        else if(fourthran==1){thumb26.setIcon(icon3); }
                        }
                        
                        if(current==14){thumb23.setIcon(mainicon01); 
                        if(thirdran==1){thumb27.setIcon(icon2); checkgame++; }     
                        else if(firstran==1){thumb27.setIcon(icon3); }
                       else if(secran==1){thumb27.setIcon(icon3); }
                     
                       else if(fourthran==1){thumb27.setIcon(icon3); }
                        }
                        
                        if(current==15){thumb24.setIcon(mainicon01);   
                       if(fourthran==1){thumb28.setIcon(icon2); checkgame++; }   
                       else if(firstran==1){thumb28.setIcon(icon3); }
                       else if(secran==1){thumb28.setIcon(icon3); }
                       else if(thirdran==1){thumb28.setIcon(icon3); }
                       
                        }
                        if(checkgame==4)
                        {
                            System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                        }
            
                        if(current==16){thumb11.setIcon(mainicon01);
                            checkgame=0;      
                            if(firstran==1){thumb15.setIcon(icon2); checkgame++; }
                       else     if(secran==1){thumb15.setIcon(icon3); }
                        else    if(thirdran==1){thumb15.setIcon(icon3); }
                        else    if(fourthran==1){thumb15.setIcon(icon3); }
                            }
                            
                            if(current==17){thumb12.setIcon(mainicon01);  
                             if(secran==1){thumb16.setIcon(icon2); checkgame++; }    
                           else if(firstran==1){thumb16.setIcon(icon3); }
                      
                          else  if(thirdran==1){thumb16.setIcon(icon3); }
                          else  if(fourthran==1){thumb16.setIcon(icon3); }
                            }
                            
                            if(current==18){thumb13.setIcon(mainicon01);
                            if(thirdran==1){thumb17.setIcon(icon2); checkgame++; }      
                            else if(firstran==1){thumb17.setIcon(icon3); }
                          else  if(secran==1){thumb17.setIcon(icon3); }
                         
                          else  if(fourthran==1){thumb17.setIcon(icon3); }
                            }
                            
                            if(current==19){thumb14.setIcon(mainicon01);
                            if(fourthran==1){thumb18.setIcon(icon2);checkgame++;  }      
                           else if(firstran==1){thumb18.setIcon(icon3); }
                          else  if(secran==1){thumb18.setIcon(icon3); }
                          else  if(thirdran==1){thumb18.setIcon(icon3); }
                          
                            }
            
                            if(checkgame==4)
                            {
                                System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                            }
                            if(current==20){thumb01.setIcon(mainicon01);
                                checkgame=0;      
                                if(firstran==1){thumb05.setIcon(icon2); checkgame++; }
                          else      if(secran==1){thumb05.setIcon(icon3); }
                          else      if(thirdran==1){thumb05.setIcon(icon3); }
                          else      if(fourthran==1){thumb05.setIcon(icon3); }
                                }
                                
                                if(current==21){thumb02.setIcon(mainicon01); 
                                    if(secran==1){thumb06.setIcon(icon2); checkgame++; }     
                              else  if(firstran==1){thumb06.setIcon(icon3); }
                               
                            else    if(thirdran==1){thumb06.setIcon(icon3); }
                            else    if(fourthran==1){thumb06.setIcon(icon3); }
                                }
                                
                                if(current==22){thumb03.setIcon(mainicon01); 
                               if(thirdran==1){thumb07.setIcon(icon2); checkgame++; }     
                               else if(firstran==1){thumb07.setIcon(icon3); }
                            else    if(secran==1){thumb07.setIcon(icon3); }
                            
                            else    if(fourthran==1){thumb07.setIcon(icon3); }
                                }
                                
                                if(current==23){thumb04.setIcon(mainicon01); 
                               if(fourthran==1){thumb08.setIcon(icon2);checkgame++;  }     
                              else  if(firstran==1){thumb08.setIcon(icon3); }
                            else    if(secran==1){thumb08.setIcon(icon3); }
                            else    if(thirdran==1){thumb08.setIcon(icon3); }
                            
                                }
                                if(checkgame==4)
                                {
                                    System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                                }
           
        
        current++;}
        
                
             });   


   
     thumb93.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        
            if(current==0){thumb51.setIcon(mainicon02); 
                checkgame=0;     
            if(firstran==2){thumb55.setIcon(icon2); checkgame++;}
            else if(secran==2){thumb55.setIcon(icon3); }
            else if(thirdran==2){thumb55.setIcon(icon3); }
            else if(fourthran==2){thumb55.setIcon(icon3); }
            }
            
            if(current==1){thumb52.setIcon(mainicon02); 
            if(secran==2){thumb56.setIcon(icon2);  checkgame++; }    
             else if(firstran==2){thumb56.setIcon(icon3); }
             else if(thirdran==2){thumb56.setIcon(icon3); }
            else if(fourthran==2){thumb56.setIcon(icon3); }
            }
            
            if(current==2){thumb53.setIcon(mainicon02);  
            if(thirdran==2){thumb57.setIcon(icon2);  checkgame++; }    
            else if(firstran==2){thumb57.setIcon(icon3); }
            else if(secran==2){thumb57.setIcon(icon3); }
            else if(fourthran==2){thumb57.setIcon(icon3); }
            }
            
            if(current==3){thumb54.setIcon(mainicon02);     
            if(fourthran==2){thumb58.setIcon(icon2);  checkgame++; } 
            else if(firstran==2){thumb58.setIcon(icon3); }
            else if(secran==2){thumb58.setIcon(icon3); }
            else if(thirdran==2){thumb58.setIcon(icon3); }
            
            }
            if(checkgame==4){
            System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
            }
            
            
            if(current==4){thumb41.setIcon(mainicon02);  
                checkgame=0;    
                if(firstran==2){thumb45.setIcon(icon2); checkgame++; }
                else if(secran==2){thumb45.setIcon(icon3); }
                else if(thirdran==2){thumb45.setIcon(icon3); }
                 else if(fourthran==2){thumb45.setIcon(icon3); }
                }
                
                if(current==5){thumb42.setIcon(mainicon02);    
                if(secran==2){thumb46.setIcon(icon2); checkgame++;}  
                else if(firstran==2){thumb46.setIcon(icon3); }
                
                else if(thirdran==2){thumb46.setIcon(icon3); }
                else if(fourthran==2){thumb46.setIcon(icon3); }
                }
                
                if(current==6){thumb43.setIcon(mainicon02); 
                if(thirdran==2){thumb47.setIcon(icon2);checkgame++; }     
                else if(firstran==2){thumb47.setIcon(icon3); }
                else if(secran==2){thumb47.setIcon(icon3); }
                
                else if(fourthran==2){thumb47.setIcon(icon3); }
                }
                
                if(current==7){thumb44.setIcon(mainicon02); 
                if(fourthran==2){thumb48.setIcon(icon2);checkgame++; }     
                else if(firstran==2){thumb48.setIcon(icon3); }
                else if(secran==2){thumb48.setIcon(icon3); }
                else if(thirdran==2){thumb48.setIcon(icon3); }
            
                }
            
                if(checkgame==4)
            {
                System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
            }
            
                if(current==8){thumb31.setIcon(mainicon02);  
                    checkgame=0;    
                    if(firstran==2){thumb35.setIcon(icon2);checkgame++;  }
                    else if(secran==2){thumb35.setIcon(icon3); }
                    else if(thirdran==2){thumb35.setIcon(icon3); }
                    else if(fourthran==2){thumb35.setIcon(icon3); }
                    }
                    
                    if(current==9){thumb32.setIcon(mainicon02); 
                    if(secran==2){thumb36.setIcon(icon2); checkgame++; }     
                    else if(firstran==2){thumb36.setIcon(icon3); }
                  
                   else if(thirdran==2){thumb36.setIcon(icon3); }
                   else if(fourthran==2){thumb36.setIcon(icon3); }
                    }
                    
                    if(current==10){thumb33.setIcon(mainicon02);
                    if(thirdran==2){thumb37.setIcon(icon2); checkgame++; }      
                    else if(firstran==2){thumb37.setIcon(icon3); }
                    else if(secran==2){thumb37.setIcon(icon3); }
                    
                    else if(fourthran==2){thumb37.setIcon(icon3); }
                    }
                    
                    if(current==11){thumb34.setIcon(mainicon02);
                    if(fourthran==2){thumb38.setIcon(icon2); checkgame++; }      
                    else if(firstran==2){thumb38.setIcon(icon3); }
                    else if(secran==2){thumb38.setIcon(icon3); }
                    else if(thirdran==2){thumb38.setIcon(icon3); }
                  
                    }
            
            
                    if(checkgame==4)
                    {
                        System.out.println("You Won");
                        thumb91.setEnabled(false);
                        thumb92.setEnabled(false);
                        thumb93.setEnabled(false);
                        thumb94.setEnabled(false);
                        thumb95.setEnabled(false);
                        thumb96.setEnabled(false);
                        thumb97.setEnabled(false);
                        
                        checkgame=0;
                    }
            
                    if(current==12){thumb21.setIcon(mainicon02);
                        checkgame=0;      
                        if(firstran==2){thumb25.setIcon(icon2); checkgame++; }
                        else if(secran==2){thumb25.setIcon(icon3); }
                       else if(thirdran==2){thumb25.setIcon(icon3); }
                        else if(fourthran==2){thumb25.setIcon(icon3); }
                        }
                        
                        if(current==13){thumb22.setIcon(mainicon02);
                        if(secran==2){thumb26.setIcon(icon2); checkgame++; }      
                        else if(firstran==2){thumb26.setIcon(icon3); }
                        else if(thirdran==2){thumb26.setIcon(icon3); }
                        else if(fourthran==2){thumb26.setIcon(icon3); }
                        }
                        
                        if(current==14){thumb23.setIcon(mainicon02); 
                        if(thirdran==2){thumb27.setIcon(icon2); checkgame++; }     
                        else if(firstran==2){thumb27.setIcon(icon3); }
                       else if(secran==2){thumb27.setIcon(icon3); }
                     
                       else if(fourthran==2){thumb27.setIcon(icon3); }
                        }
                        
                        if(current==15){thumb24.setIcon(mainicon02);   
                       if(fourthran==2){thumb28.setIcon(icon2); checkgame++; }   
                       else if(firstran==2){thumb28.setIcon(icon3); }
                       else if(secran==2){thumb28.setIcon(icon3); }
                       else if(thirdran==2){thumb28.setIcon(icon3); }
                       
                        }
                        if(checkgame==4)
                        {
                            System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                        }
            
                        if(current==16){thumb11.setIcon(mainicon02);
                            checkgame=0;      
                            if(firstran==2){thumb15.setIcon(icon2); checkgame++; }
                       else     if(secran==2){thumb15.setIcon(icon3); }
                        else    if(thirdran==2){thumb15.setIcon(icon3); }
                        else    if(fourthran==2){thumb15.setIcon(icon3); }
                            }
                            
                            if(current==17){thumb12.setIcon(mainicon02);  
                             if(secran==2){thumb16.setIcon(icon2); checkgame++; }    
                           else if(firstran==2){thumb16.setIcon(icon3); }
                      
                          else  if(thirdran==2){thumb16.setIcon(icon3); }
                          else  if(fourthran==2){thumb16.setIcon(icon3); }
                            }
                            
                            if(current==18){thumb13.setIcon(mainicon02);
                            if(thirdran==2){thumb17.setIcon(icon2); checkgame++; }      
                            else if(firstran==2){thumb17.setIcon(icon3); }
                          else  if(secran==2){thumb17.setIcon(icon3); }
                         
                          else  if(fourthran==2){thumb17.setIcon(icon3); }
                            }
                            
                            if(current==19){thumb14.setIcon(mainicon02);
                            if(fourthran==2){thumb18.setIcon(icon2);checkgame++;  }      
                           else if(firstran==2){thumb18.setIcon(icon3); }
                          else  if(secran==2){thumb18.setIcon(icon3); }
                          else  if(thirdran==2){thumb18.setIcon(icon3); }
                          
                            }
            
                            if(checkgame==4)
                            {
                                System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                            }
                            if(current==20){thumb01.setIcon(mainicon02);
                                checkgame=0;      
                                if(firstran==2){thumb05.setIcon(icon2); checkgame++; }
                          else      if(secran==2){thumb05.setIcon(icon3); }
                          else      if(thirdran==2){thumb05.setIcon(icon3); }
                          else      if(fourthran==2){thumb05.setIcon(icon3); }
                                }
                                
                                if(current==21){thumb02.setIcon(mainicon02); 
                                    if(secran==2){thumb06.setIcon(icon2); checkgame++; }     
                              else  if(firstran==2){thumb06.setIcon(icon3); }
                               
                            else    if(thirdran==2){thumb06.setIcon(icon3); }
                            else    if(fourthran==2){thumb06.setIcon(icon3); }
                                }
                                
                                if(current==22){thumb03.setIcon(mainicon02); 
                               if(thirdran==2){thumb07.setIcon(icon2); checkgame++; }     
                               else if(firstran==2){thumb07.setIcon(icon3); }
                            else    if(secran==2){thumb07.setIcon(icon3); }
                            
                            else    if(fourthran==2){thumb07.setIcon(icon3); }
                                }
                                
                                if(current==23){thumb04.setIcon(mainicon02); 
                               if(fourthran==2){thumb08.setIcon(icon2);checkgame++;  }     
                              else  if(firstran==2){thumb08.setIcon(icon3); }
                            else    if(secran==2){thumb08.setIcon(icon3); }
                            else    if(thirdran==2){thumb08.setIcon(icon3); }
                            
                                }
                                if(checkgame==4)
                                {
                                    System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                                }
        
        current++;}
        
                
             });  

     
     thumb94.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        
            if(current==0){thumb51.setIcon(mainicon03); 
                checkgame=0;     
            if(firstran==3){thumb55.setIcon(icon2); checkgame++;}
            else if(secran==3){thumb55.setIcon(icon3); }
            else if(thirdran==3){thumb55.setIcon(icon3); }
            else if(fourthran==3){thumb55.setIcon(icon3); }
            }
            
            if(current==1){thumb52.setIcon(mainicon03); 
            if(secran==3){thumb56.setIcon(icon2);  checkgame++; }    
             else if(firstran==3){thumb56.setIcon(icon3); }
             else if(thirdran==3){thumb56.setIcon(icon3); }
            else if(fourthran==3){thumb56.setIcon(icon3); }
            }
            
            if(current==2){thumb53.setIcon(mainicon03);  
            if(thirdran==3){thumb57.setIcon(icon2);  checkgame++; }    
            else if(firstran==3){thumb57.setIcon(icon3); }
            else if(secran==3){thumb57.setIcon(icon3); }
            else if(fourthran==3){thumb57.setIcon(icon3); }
            }
            
            if(current==3){thumb54.setIcon(mainicon03);     
            if(fourthran==3){thumb58.setIcon(icon2);  checkgame++; } 
            else if(firstran==3){thumb58.setIcon(icon3); }
            else if(secran==3){thumb58.setIcon(icon3); }
            else if(thirdran==3){thumb58.setIcon(icon3); }
            
            }
            if(checkgame==4){
            System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
            }
            
            
            if(current==4){thumb41.setIcon(mainicon03);  
                checkgame=0;    
                if(firstran==3){thumb45.setIcon(icon2); checkgame++; }
                else if(secran==3){thumb45.setIcon(icon3); }
                else if(thirdran==3){thumb45.setIcon(icon3); }
                 else if(fourthran==3){thumb45.setIcon(icon3); }
                }
                
                if(current==5){thumb42.setIcon(mainicon03);    
                if(secran==3){thumb46.setIcon(icon2); checkgame++;}  
                else if(firstran==3){thumb46.setIcon(icon3); }
                
                else if(thirdran==3){thumb46.setIcon(icon3); }
                else if(fourthran==3){thumb46.setIcon(icon3); }
                }
                
                if(current==6){thumb43.setIcon(mainicon03); 
                if(thirdran==3){thumb47.setIcon(icon2);checkgame++; }     
                else if(firstran==3){thumb47.setIcon(icon3); }
                else if(secran==3){thumb47.setIcon(icon3); }
                
                else if(fourthran==3){thumb47.setIcon(icon3); }
                }
                
                if(current==7){thumb44.setIcon(mainicon03); 
                if(fourthran==3){thumb48.setIcon(icon2);checkgame++; }     
                else if(firstran==3){thumb48.setIcon(icon3); }
                else if(secran==3){thumb48.setIcon(icon3); }
                else if(thirdran==3){thumb48.setIcon(icon3); }
            
                }
            
                if(checkgame==4)
            {
                System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
            }
            
                if(current==8){thumb31.setIcon(mainicon03);  
                    checkgame=0;    
                    if(firstran==3){thumb35.setIcon(icon2);checkgame++;  }
                    else if(secran==3){thumb35.setIcon(icon3); }
                    else if(thirdran==3){thumb35.setIcon(icon3); }
                    else if(fourthran==3){thumb35.setIcon(icon3); }
                    }
                    
                    if(current==9){thumb32.setIcon(mainicon03); 
                    if(secran==3){thumb36.setIcon(icon2); checkgame++; }     
                    else if(firstran==3){thumb36.setIcon(icon3); }
                  
                   else if(thirdran==3){thumb36.setIcon(icon3); }
                   else if(fourthran==3){thumb36.setIcon(icon3); }
                    }
                    
                    if(current==10){thumb33.setIcon(mainicon03);
                    if(thirdran==3){thumb37.setIcon(icon2); checkgame++; }      
                    else if(firstran==3){thumb37.setIcon(icon3); }
                    else if(secran==3){thumb37.setIcon(icon3); }
                    
                    else if(fourthran==3){thumb37.setIcon(icon3); }
                    }
                    
                    if(current==11){thumb34.setIcon(mainicon03);
                    if(fourthran==3){thumb38.setIcon(icon2); checkgame++; }      
                    else if(firstran==3){thumb38.setIcon(icon3); }
                    else if(secran==3){thumb38.setIcon(icon3); }
                    else if(thirdran==3){thumb38.setIcon(icon3); }
                  
                    }
            
            
                    if(checkgame==4)
                    {
                        System.out.println("You Won");
                        thumb91.setEnabled(false);
                        thumb92.setEnabled(false);
                        thumb93.setEnabled(false);
                        thumb94.setEnabled(false);
                        thumb95.setEnabled(false);
                        thumb96.setEnabled(false);
                        thumb97.setEnabled(false);
                        
                        checkgame=0;
                    }
            
                    if(current==12){thumb21.setIcon(mainicon03);
                        checkgame=0;      
                        if(firstran==3){thumb25.setIcon(icon2); checkgame++; }
                        else if(secran==3){thumb25.setIcon(icon3); }
                       else if(thirdran==3){thumb25.setIcon(icon3); }
                        else if(fourthran==3){thumb25.setIcon(icon3); }
                        }
                        
                        if(current==13){thumb22.setIcon(mainicon03);
                        if(secran==3){thumb26.setIcon(icon2); checkgame++; }      
                        else if(firstran==3){thumb26.setIcon(icon3); }
                        else if(thirdran==3){thumb26.setIcon(icon3); }
                        else if(fourthran==3){thumb26.setIcon(icon3); }
                        }
                        
                        if(current==14){thumb23.setIcon(mainicon03); 
                        if(thirdran==3){thumb27.setIcon(icon2); checkgame++; }     
                        else if(firstran==3){thumb27.setIcon(icon3); }
                       else if(secran==3){thumb27.setIcon(icon3); }
                     
                       else if(fourthran==3){thumb27.setIcon(icon3); }
                        }
                        
                        if(current==15){thumb24.setIcon(mainicon03);   
                       if(fourthran==3){thumb28.setIcon(icon2); checkgame++; }   
                       else if(firstran==3){thumb28.setIcon(icon3); }
                       else if(secran==3){thumb28.setIcon(icon3); }
                       else if(thirdran==3){thumb28.setIcon(icon3); }
                       
                        }
                        if(checkgame==4)
                        {
                            System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                        }
            
                        if(current==16){thumb11.setIcon(mainicon03);
                            checkgame=0;      
                            if(firstran==3){thumb15.setIcon(icon2); checkgame++; }
                       else     if(secran==3){thumb15.setIcon(icon3); }
                        else    if(thirdran==3){thumb15.setIcon(icon3); }
                        else    if(fourthran==3){thumb15.setIcon(icon3); }
                            }
                            
                            if(current==17){thumb12.setIcon(mainicon03);  
                             if(secran==3){thumb16.setIcon(icon2); checkgame++; }    
                           else if(firstran==3){thumb16.setIcon(icon3); }
                      
                          else  if(thirdran==3){thumb16.setIcon(icon3); }
                          else  if(fourthran==3){thumb16.setIcon(icon3); }
                            }
                            
                            if(current==18){thumb13.setIcon(mainicon03);
                            if(thirdran==3){thumb17.setIcon(icon2); checkgame++; }      
                            else if(firstran==3){thumb17.setIcon(icon3); }
                          else  if(secran==3){thumb17.setIcon(icon3); }
                         
                          else  if(fourthran==3){thumb17.setIcon(icon3); }
                            }
                            
                            if(current==19){thumb14.setIcon(mainicon03);
                            if(fourthran==3){thumb18.setIcon(icon2);checkgame++;  }      
                           else if(firstran==3){thumb18.setIcon(icon3); }
                          else  if(secran==3){thumb18.setIcon(icon3); }
                          else  if(thirdran==3){thumb18.setIcon(icon3); }
                          
                            }
            
                            if(checkgame==4)
                            {
                                System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                            }
                            if(current==20){thumb01.setIcon(mainicon03);
                                checkgame=0;      
                                if(firstran==3){thumb05.setIcon(icon2); checkgame++; }
                          else      if(secran==3){thumb05.setIcon(icon3); }
                          else      if(thirdran==3){thumb05.setIcon(icon3); }
                          else      if(fourthran==3){thumb05.setIcon(icon3); }
                                }
                                
                                if(current==21){thumb02.setIcon(mainicon03); 
                                    if(secran==3){thumb06.setIcon(icon2); checkgame++; }     
                              else  if(firstran==3){thumb06.setIcon(icon3); }
                               
                            else    if(thirdran==3){thumb06.setIcon(icon3); }
                            else    if(fourthran==3){thumb06.setIcon(icon3); }
                                }
                                
                                if(current==22){thumb03.setIcon(mainicon03); 
                               if(thirdran==3){thumb07.setIcon(icon2); checkgame++; }     
                               else if(firstran==3){thumb07.setIcon(icon3); }
                            else    if(secran==3){thumb07.setIcon(icon3); }
                            
                            else    if(fourthran==3){thumb07.setIcon(icon3); }
                                }
                                
                                if(current==23){thumb04.setIcon(mainicon03); 
                               if(fourthran==3){thumb08.setIcon(icon2);checkgame++;  }     
                              else  if(firstran==3){thumb08.setIcon(icon3); }
                            else    if(secran==3){thumb08.setIcon(icon3); }
                            else    if(thirdran==3){thumb08.setIcon(icon3); }
                            
                                }
                                if(checkgame==4)
                                {
                                    System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                                }
        
        current++;}
        
                
             });  

     
     thumb95.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if(current==0){thumb51.setIcon(mainicon04); 
                checkgame=0;     
            if(firstran==4){thumb55.setIcon(icon2); checkgame++;}
            else if(secran==4){thumb55.setIcon(icon3); }
            else if(thirdran==4){thumb55.setIcon(icon3); }
            else if(fourthran==4){thumb55.setIcon(icon3); }
            }
            
            if(current==1){thumb52.setIcon(mainicon04); 
            if(secran==4){thumb56.setIcon(icon2);  checkgame++; }    
             else if(firstran==4){thumb56.setIcon(icon3); }
             else if(thirdran==4){thumb56.setIcon(icon3); }
            else if(fourthran==4){thumb56.setIcon(icon3); }
            }
            
            if(current==2){thumb53.setIcon(mainicon04);  
            if(thirdran==4){thumb57.setIcon(icon2);  checkgame++; }    
            else if(firstran==4){thumb57.setIcon(icon3); }
            else if(secran==4){thumb57.setIcon(icon3); }
            else if(fourthran==4){thumb57.setIcon(icon3); }
            }
            
            if(current==3){thumb54.setIcon(mainicon04);     
            if(fourthran==4){thumb58.setIcon(icon2);  checkgame++; } 
            else if(firstran==4){thumb58.setIcon(icon3); }
            else if(secran==4){thumb58.setIcon(icon3); }
            else if(thirdran==4){thumb58.setIcon(icon3); }
            
            }
            if(checkgame==4){
            System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
            }
            
            
            if(current==4){thumb41.setIcon(mainicon04);  
                checkgame=0;    
                if(firstran==4){thumb45.setIcon(icon2); checkgame++; }
                else if(secran==4){thumb45.setIcon(icon3); }
                else if(thirdran==4){thumb45.setIcon(icon3); }
                 else if(fourthran==4){thumb45.setIcon(icon3); }
                }
                
                if(current==5){thumb42.setIcon(mainicon04);    
                if(secran==4){thumb46.setIcon(icon2); checkgame++;}  
                else if(firstran==4){thumb46.setIcon(icon3); }
                
                else if(thirdran==4){thumb46.setIcon(icon3); }
                else if(fourthran==4){thumb46.setIcon(icon3); }
                }
                
                if(current==6){thumb43.setIcon(mainicon04); 
                if(thirdran==4){thumb47.setIcon(icon2);checkgame++; }     
                else if(firstran==4){thumb47.setIcon(icon3); }
                else if(secran==4){thumb47.setIcon(icon3); }
                
                else if(fourthran==4){thumb47.setIcon(icon3); }
                }
                
                if(current==7){thumb44.setIcon(mainicon04); 
                if(fourthran==4){thumb48.setIcon(icon2);checkgame++; }     
                else if(firstran==4){thumb48.setIcon(icon3); }
                else if(secran==4){thumb48.setIcon(icon3); }
                else if(thirdran==4){thumb48.setIcon(icon3); }
            
                }
            
                if(checkgame==4)
            {
                System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
            }
            
                if(current==8){thumb31.setIcon(mainicon04);  
                    checkgame=0;    
                    if(firstran==4){thumb35.setIcon(icon2);checkgame++;  }
                    else if(secran==4){thumb35.setIcon(icon3); }
                    else if(thirdran==4){thumb35.setIcon(icon3); }
                    else if(fourthran==4){thumb35.setIcon(icon3); }
                    }
                    
                    if(current==9){thumb32.setIcon(mainicon04); 
                    if(secran==4){thumb36.setIcon(icon2); checkgame++; }     
                    else if(firstran==4){thumb36.setIcon(icon3); }
                  
                   else if(thirdran==4){thumb36.setIcon(icon3); }
                   else if(fourthran==4){thumb36.setIcon(icon3); }
                    }
                    
                    if(current==10){thumb33.setIcon(mainicon04);
                    if(thirdran==4){thumb37.setIcon(icon2); checkgame++; }      
                    else if(firstran==4){thumb37.setIcon(icon3); }
                    else if(secran==4){thumb37.setIcon(icon3); }
                    
                    else if(fourthran==4){thumb37.setIcon(icon3); }
                    }
                    
                    if(current==11){thumb34.setIcon(mainicon04);
                    if(fourthran==4){thumb38.setIcon(icon2); checkgame++; }      
                    else if(firstran==4){thumb38.setIcon(icon3); }
                    else if(secran==4){thumb38.setIcon(icon3); }
                    else if(thirdran==4){thumb38.setIcon(icon3); }
                  
                    }
            
            
                    if(checkgame==4)
                    {
                        System.out.println("You Won");
                        thumb91.setEnabled(false);
                        thumb92.setEnabled(false);
                        thumb93.setEnabled(false);
                        thumb94.setEnabled(false);
                        thumb95.setEnabled(false);
                        thumb96.setEnabled(false);
                        thumb97.setEnabled(false);
                        
                        checkgame=0;
                    }
            
                    if(current==12){thumb21.setIcon(mainicon04);
                        checkgame=0;      
                        if(firstran==4){thumb25.setIcon(icon2); checkgame++; }
                        else if(secran==4){thumb25.setIcon(icon3); }
                       else if(thirdran==4){thumb25.setIcon(icon3); }
                        else if(fourthran==4){thumb25.setIcon(icon3); }
                        }
                        
                        if(current==13){thumb22.setIcon(mainicon04);
                        if(secran==4){thumb26.setIcon(icon2); checkgame++; }      
                        else if(firstran==4){thumb26.setIcon(icon3); }
                        else if(thirdran==4){thumb26.setIcon(icon3); }
                        else if(fourthran==4){thumb26.setIcon(icon3); }
                        }
                        
                        if(current==14){thumb23.setIcon(mainicon04); 
                        if(thirdran==4){thumb27.setIcon(icon2); checkgame++; }     
                        else if(firstran==4){thumb27.setIcon(icon3); }
                       else if(secran==4){thumb27.setIcon(icon3); }
                     
                       else if(fourthran==4){thumb27.setIcon(icon3); }
                        }
                        
                        if(current==15){thumb24.setIcon(mainicon04);   
                       if(fourthran==4){thumb28.setIcon(icon2); checkgame++; }   
                       else if(firstran==4){thumb28.setIcon(icon3); }
                       else if(secran==4){thumb28.setIcon(icon3); }
                       else if(thirdran==4){thumb28.setIcon(icon3); }
                       
                        }
                        if(checkgame==4)
                        {
                            System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                        }
            
                        if(current==16){thumb11.setIcon(mainicon04);
                            checkgame=0;      
                            if(firstran==4){thumb15.setIcon(icon2); checkgame++; }
                       else     if(secran==4){thumb15.setIcon(icon3); }
                        else    if(thirdran==4){thumb15.setIcon(icon3); }
                        else    if(fourthran==4){thumb15.setIcon(icon3); }
                            }
                            
                            if(current==17){thumb12.setIcon(mainicon04);  
                             if(secran==4){thumb16.setIcon(icon2); checkgame++; }    
                           else if(firstran==4){thumb16.setIcon(icon3); }
                      
                          else  if(thirdran==4){thumb16.setIcon(icon3); }
                          else  if(fourthran==4){thumb16.setIcon(icon3); }
                            }
                            
                            if(current==18){thumb13.setIcon(mainicon04);
                            if(thirdran==4){thumb17.setIcon(icon2); checkgame++; }      
                            else if(firstran==4){thumb17.setIcon(icon3); }
                          else  if(secran==4){thumb17.setIcon(icon3); }
                         
                          else  if(fourthran==4){thumb17.setIcon(icon3); }
                            }
                            
                            if(current==19){thumb14.setIcon(mainicon04);
                            if(fourthran==4){thumb18.setIcon(icon2);checkgame++;  }      
                           else if(firstran==4){thumb18.setIcon(icon3); }
                          else  if(secran==4){thumb18.setIcon(icon3); }
                          else  if(thirdran==4){thumb18.setIcon(icon3); }
                          
                            }
            
                            if(checkgame==4)
                            {
                                System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                            }
                            if(current==20){thumb01.setIcon(mainicon04);
                                checkgame=0;      
                                if(firstran==4){thumb05.setIcon(icon2); checkgame++; }
                          else      if(secran==4){thumb05.setIcon(icon3); }
                          else      if(thirdran==4){thumb05.setIcon(icon3); }
                          else      if(fourthran==4){thumb05.setIcon(icon3); }
                                }
                                
                                if(current==21){thumb02.setIcon(mainicon04); 
                                    if(secran==4){thumb06.setIcon(icon2); checkgame++; }     
                              else  if(firstran==4){thumb06.setIcon(icon3); }
                               
                            else    if(thirdran==4){thumb06.setIcon(icon3); }
                            else    if(fourthran==4){thumb06.setIcon(icon3); }
                                }
                                
                                if(current==22){thumb03.setIcon(mainicon04); 
                               if(thirdran==4){thumb07.setIcon(icon2); checkgame++; }     
                               else if(firstran==4){thumb07.setIcon(icon3); }
                            else    if(secran==4){thumb07.setIcon(icon3); }
                            
                            else    if(fourthran==4){thumb07.setIcon(icon3); }
                                }
                                
                                if(current==23){thumb04.setIcon(mainicon04); 
                               if(fourthran==4){thumb08.setIcon(icon2);checkgame++;  }     
                              else  if(firstran==4){thumb08.setIcon(icon3); }
                            else    if(secran==4){thumb08.setIcon(icon3); }
                            else    if(thirdran==4){thumb08.setIcon(icon3); }
                            
                                }
                                if(checkgame==4)
                                {
                                    System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                                }
         
        
        current++;}
        
                
             });  

    
     thumb96.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if(current==0){thumb51.setIcon(mainicon05); 
                checkgame=0;     
            if(firstran==5){thumb55.setIcon(icon2); checkgame++;}
            else if(secran==5){thumb55.setIcon(icon3); }
            else if(thirdran==5){thumb55.setIcon(icon3); }
            else if(fourthran==5){thumb55.setIcon(icon3); }
            }
            
            if(current==1){thumb52.setIcon(mainicon05); 
            if(secran==5){thumb56.setIcon(icon2);  checkgame++; }    
             else if(firstran==5){thumb56.setIcon(icon3); }
             else if(thirdran==5){thumb56.setIcon(icon3); }
            else if(fourthran==5){thumb56.setIcon(icon3); }
            }
            
            if(current==2){thumb53.setIcon(mainicon05);  
            if(thirdran==5){thumb57.setIcon(icon2);  checkgame++; }    
            else if(firstran==5){thumb57.setIcon(icon3); }
            else if(secran==5){thumb57.setIcon(icon3); }
            else if(fourthran==5){thumb57.setIcon(icon3); }
            }
            
            if(current==3){thumb54.setIcon(mainicon05);     
            if(fourthran==5){thumb58.setIcon(icon2);  checkgame++; } 
            else if(firstran==5){thumb58.setIcon(icon3); }
            else if(secran==5){thumb58.setIcon(icon3); }
            else if(thirdran==5){thumb58.setIcon(icon3); }
            
            }
            if(checkgame==4){
            System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
            }
            
            
            if(current==4){thumb41.setIcon(mainicon05);  
                checkgame=0;    
                if(firstran==5){thumb45.setIcon(icon2); checkgame++; }
                else if(secran==5){thumb45.setIcon(icon3); }
                else if(thirdran==5){thumb45.setIcon(icon3); }
                 else if(fourthran==5){thumb45.setIcon(icon3); }
                }
                
                if(current==5){thumb42.setIcon(mainicon05);    
                if(secran==5){thumb46.setIcon(icon2); checkgame++;}  
                else if(firstran==5){thumb46.setIcon(icon3); }
                
                else if(thirdran==5){thumb46.setIcon(icon3); }
                else if(fourthran==5){thumb46.setIcon(icon3); }
                }
                
                if(current==6){thumb43.setIcon(mainicon05); 
                if(thirdran==5){thumb47.setIcon(icon2);checkgame++; }     
                else if(firstran==5){thumb47.setIcon(icon3); }
                else if(secran==5){thumb47.setIcon(icon3); }
                
                else if(fourthran==5){thumb47.setIcon(icon3); }
                }
                
                if(current==7){thumb44.setIcon(mainicon05); 
                if(fourthran==5){thumb48.setIcon(icon2);checkgame++; }     
                else if(firstran==5){thumb48.setIcon(icon3); }
                else if(secran==5){thumb48.setIcon(icon3); }
                else if(thirdran==5){thumb48.setIcon(icon3); }
            
                }
            
                if(checkgame==4)
            {
                System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
            }
            
                if(current==8){thumb31.setIcon(mainicon05);  
                    checkgame=0;    
                    if(firstran==5){thumb35.setIcon(icon2);checkgame++;  }
                    else if(secran==5){thumb35.setIcon(icon3); }
                    else if(thirdran==5){thumb35.setIcon(icon3); }
                    else if(fourthran==5){thumb35.setIcon(icon3); }
                    }
                    
                    if(current==9){thumb32.setIcon(mainicon05); 
                    if(secran==5){thumb36.setIcon(icon2); checkgame++; }     
                    else if(firstran==5){thumb36.setIcon(icon3); }
                  
                   else if(thirdran==5){thumb36.setIcon(icon3); }
                   else if(fourthran==5){thumb36.setIcon(icon3); }
                    }
                    
                    if(current==10){thumb33.setIcon(mainicon05);
                    if(thirdran==5){thumb37.setIcon(icon2); checkgame++; }      
                    else if(firstran==5){thumb37.setIcon(icon3); }
                    else if(secran==5){thumb37.setIcon(icon3); }
                    
                    else if(fourthran==5){thumb37.setIcon(icon3); }
                    }
                    
                    if(current==11){thumb34.setIcon(mainicon05);
                    if(fourthran==5){thumb38.setIcon(icon2); checkgame++; }      
                    else if(firstran==5){thumb38.setIcon(icon3); }
                    else if(secran==5){thumb38.setIcon(icon3); }
                    else if(thirdran==5){thumb38.setIcon(icon3); }
                  
                    }
            
            
                    if(checkgame==4)
                    {
                        System.out.println("You Won");
                        thumb91.setEnabled(false);
                        thumb92.setEnabled(false);
                        thumb93.setEnabled(false);
                        thumb94.setEnabled(false);
                        thumb95.setEnabled(false);
                        thumb96.setEnabled(false);
                        thumb97.setEnabled(false);
                        
                        checkgame=0;
                    }
            
                    if(current==12){thumb21.setIcon(mainicon05);
                        checkgame=0;      
                        if(firstran==5){thumb25.setIcon(icon2); checkgame++; }
                        else if(secran==5){thumb25.setIcon(icon3); }
                       else if(thirdran==5){thumb25.setIcon(icon3); }
                        else if(fourthran==5){thumb25.setIcon(icon3); }
                        }
                        
                        if(current==13){thumb22.setIcon(mainicon05);
                        if(secran==5){thumb26.setIcon(icon2); checkgame++; }      
                        else if(firstran==5){thumb26.setIcon(icon3); }
                        else if(thirdran==5){thumb26.setIcon(icon3); }
                        else if(fourthran==5){thumb26.setIcon(icon3); }
                        }
                        
                        if(current==14){thumb23.setIcon(mainicon05); 
                        if(thirdran==5){thumb27.setIcon(icon2); checkgame++; }     
                        else if(firstran==5){thumb27.setIcon(icon3); }
                       else if(secran==5){thumb27.setIcon(icon3); }
                     
                       else if(fourthran==5){thumb27.setIcon(icon3); }
                        }
                        
                        if(current==15){thumb24.setIcon(mainicon05);   
                       if(fourthran==5){thumb28.setIcon(icon2); checkgame++; }   
                       else if(firstran==5){thumb28.setIcon(icon3); }
                       else if(secran==5){thumb28.setIcon(icon3); }
                       else if(thirdran==5){thumb28.setIcon(icon3); }
                       
                        }
                        if(checkgame==4)
                        {
                            System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                        }
            
                        if(current==16){thumb11.setIcon(mainicon05);
                            checkgame=0;      
                            if(firstran==5){thumb15.setIcon(icon2); checkgame++; }
                       else     if(secran==5){thumb15.setIcon(icon3); }
                        else    if(thirdran==5){thumb15.setIcon(icon3); }
                        else    if(fourthran==5){thumb15.setIcon(icon3); }
                            }
                            
                            if(current==17){thumb12.setIcon(mainicon05);  
                             if(secran==5){thumb16.setIcon(icon2); checkgame++; }    
                           else if(firstran==5){thumb16.setIcon(icon3); }
                      
                          else  if(thirdran==5){thumb16.setIcon(icon3); }
                          else  if(fourthran==5){thumb16.setIcon(icon3); }
                            }
                            
                            if(current==18){thumb13.setIcon(mainicon05);
                            if(thirdran==5){thumb17.setIcon(icon2); checkgame++; }      
                            else if(firstran==5){thumb17.setIcon(icon3); }
                          else  if(secran==5){thumb17.setIcon(icon3); }
                         
                          else  if(fourthran==5){thumb17.setIcon(icon3); }
                            }
                            
                            if(current==19){thumb14.setIcon(mainicon05);
                            if(fourthran==5){thumb18.setIcon(icon2);checkgame++;  }      
                           else if(firstran==5){thumb18.setIcon(icon3); }
                          else  if(secran==5){thumb18.setIcon(icon3); }
                          else  if(thirdran==5){thumb18.setIcon(icon3); }
                          
                            }
            
                            if(checkgame==4)
                            {
                                System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                            }
                            if(current==20){thumb01.setIcon(mainicon05);
                                checkgame=0;      
                                if(firstran==5){thumb05.setIcon(icon2); checkgame++; }
                          else      if(secran==5){thumb05.setIcon(icon3); }
                          else      if(thirdran==5){thumb05.setIcon(icon3); }
                          else      if(fourthran==5){thumb05.setIcon(icon3); }
                                }
                                
                                if(current==21){thumb02.setIcon(mainicon05); 
                                    if(secran==5){thumb06.setIcon(icon2); checkgame++; }     
                              else  if(firstran==5){thumb06.setIcon(icon3); }
                               
                            else    if(thirdran==5){thumb06.setIcon(icon3); }
                            else    if(fourthran==5){thumb06.setIcon(icon3); }
                                }
                                
                                if(current==22){thumb03.setIcon(mainicon05); 
                               if(thirdran==5){thumb07.setIcon(icon2); checkgame++; }     
                               else if(firstran==5){thumb07.setIcon(icon3); }
                            else    if(secran==5){thumb07.setIcon(icon3); }
                            
                            else    if(fourthran==5){thumb07.setIcon(icon3); }
                                }
                                
                                if(current==23){thumb04.setIcon(mainicon05); 
                               if(fourthran==5){thumb08.setIcon(icon2);checkgame++;  }     
                              else  if(firstran==5){thumb08.setIcon(icon3); }
                            else    if(secran==5){thumb08.setIcon(icon3); }
                            else    if(thirdran==5){thumb08.setIcon(icon3); }
                            
                                }
                                if(checkgame==4)
                                {
                                    System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                                }
         
        
        current++;}
        
                
             });  
 
     thumb97.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        
            if(current==0){thumb51.setIcon(mainicon06); 
                checkgame=0;     
            if(firstran==6){thumb55.setIcon(icon2); checkgame++;}
            else if(secran==6){thumb55.setIcon(icon3); }
            else if(thirdran==6){thumb55.setIcon(icon3); }
            else if(fourthran==6){thumb55.setIcon(icon3); }
            }
            
            if(current==1){thumb52.setIcon(mainicon06); 
            if(secran==6){thumb56.setIcon(icon2);  checkgame++; }    
             else if(firstran==6){thumb56.setIcon(icon3); }
             else if(thirdran==6){thumb56.setIcon(icon3); }
            else if(fourthran==6){thumb56.setIcon(icon3); }
            }
            
            if(current==2){thumb53.setIcon(mainicon06);  
            if(thirdran==6){thumb57.setIcon(icon2);  checkgame++; }    
            else if(firstran==6){thumb57.setIcon(icon3); }
            else if(secran==6){thumb57.setIcon(icon3); }
            else if(fourthran==6){thumb57.setIcon(icon3); }
            }
            
            if(current==3){thumb54.setIcon(mainicon06);     
            if(fourthran==6){thumb58.setIcon(icon2);  checkgame++; } 
            else if(firstran==6){thumb58.setIcon(icon3); }
            else if(secran==6){thumb58.setIcon(icon3); }
            else if(thirdran==6){thumb58.setIcon(icon3); }
            
            }
            if(checkgame==4){
            System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
            }
            
            
            if(current==4){thumb41.setIcon(mainicon06);  
                checkgame=0;    
                if(firstran==6){thumb45.setIcon(icon2); checkgame++; }
                else if(secran==6){thumb45.setIcon(icon3); }
                else if(thirdran==6){thumb45.setIcon(icon3); }
                 else if(fourthran==6){thumb45.setIcon(icon3); }
                }
                
                if(current==5){thumb42.setIcon(mainicon06);    
                if(secran==6){thumb46.setIcon(icon2); checkgame++;}  
                else if(firstran==6){thumb46.setIcon(icon3); }
                
                else if(thirdran==6){thumb46.setIcon(icon3); }
                else if(fourthran==6){thumb46.setIcon(icon3); }
                }
                
                if(current==6){thumb43.setIcon(mainicon06); 
                if(thirdran==6){thumb47.setIcon(icon2);checkgame++; }     
                else if(firstran==6){thumb47.setIcon(icon3); }
                else if(secran==6){thumb47.setIcon(icon3); }
                
                else if(fourthran==6){thumb47.setIcon(icon3); }
                }
                
                if(current==7){thumb44.setIcon(mainicon06); 
                if(fourthran==6){thumb48.setIcon(icon2);checkgame++; }     
                else if(firstran==6){thumb48.setIcon(icon3); }
                else if(secran==6){thumb48.setIcon(icon3); }
                else if(thirdran==6){thumb48.setIcon(icon3); }
            
                }
            
                if(checkgame==4)
            {
                System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
            }
            
                if(current==8){thumb31.setIcon(mainicon06);  
                    checkgame=0;    
                    if(firstran==6){thumb35.setIcon(icon2);checkgame++;  }
                    else if(secran==6){thumb35.setIcon(icon3); }
                    else if(thirdran==6){thumb35.setIcon(icon3); }
                    else if(fourthran==6){thumb35.setIcon(icon3); }
                    }
                    
                    if(current==9){thumb32.setIcon(mainicon06); 
                    if(secran==6){thumb36.setIcon(icon2); checkgame++; }     
                    else if(firstran==6){thumb36.setIcon(icon3); }
                  
                   else if(thirdran==6){thumb36.setIcon(icon3); }
                   else if(fourthran==6){thumb36.setIcon(icon3); }
                    }
                    
                    if(current==10){thumb33.setIcon(mainicon06);
                    if(thirdran==6){thumb37.setIcon(icon2); checkgame++; }      
                    else if(firstran==6){thumb37.setIcon(icon3); }
                    else if(secran==6){thumb37.setIcon(icon3); }
                    
                    else if(fourthran==6){thumb37.setIcon(icon3); }
                    }
                    
                    if(current==11){thumb34.setIcon(mainicon06);
                    if(fourthran==6){thumb38.setIcon(icon2); checkgame++; }      
                    else if(firstran==6){thumb38.setIcon(icon3); }
                    else if(secran==6){thumb38.setIcon(icon3); }
                    else if(thirdran==6){thumb38.setIcon(icon3); }
                  
                    }
            
            
                    if(checkgame==4)
                    {
                        System.out.println("You Won");
                        thumb91.setEnabled(false);
                        thumb92.setEnabled(false);
                        thumb93.setEnabled(false);
                        thumb94.setEnabled(false);
                        thumb95.setEnabled(false);
                        thumb96.setEnabled(false);
                        thumb97.setEnabled(false);
                        
                        checkgame=0;
                    }
            
                    if(current==12){thumb21.setIcon(mainicon06);
                        checkgame=0;      
                        if(firstran==6){thumb25.setIcon(icon2); checkgame++; }
                        else if(secran==6){thumb25.setIcon(icon3); }
                       else if(thirdran==6){thumb25.setIcon(icon3); }
                        else if(fourthran==6){thumb25.setIcon(icon3); }
                        }
                        
                        if(current==13){thumb22.setIcon(mainicon06);
                        if(secran==6){thumb26.setIcon(icon2); checkgame++; }      
                        else if(firstran==6){thumb26.setIcon(icon3); }
                        else if(thirdran==6){thumb26.setIcon(icon3); }
                        else if(fourthran==6){thumb26.setIcon(icon3); }
                        }
                        
                        if(current==14){thumb23.setIcon(mainicon06); 
                        if(thirdran==6){thumb27.setIcon(icon2); checkgame++; }     
                        else if(firstran==6){thumb27.setIcon(icon3); }
                       else if(secran==6){thumb27.setIcon(icon3); }
                     
                       else if(fourthran==6){thumb27.setIcon(icon3); }
                        }
                        
                        if(current==15){thumb24.setIcon(mainicon06);   
                       if(fourthran==6){thumb28.setIcon(icon2); checkgame++; }   
                       else if(firstran==6){thumb28.setIcon(icon3); }
                       else if(secran==6){thumb28.setIcon(icon3); }
                       else if(thirdran==6){thumb28.setIcon(icon3); }
                       
                        }
                        if(checkgame==4)
                        {
                            System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                        }
            
                        if(current==16){thumb11.setIcon(mainicon06);
                            checkgame=0;      
                            if(firstran==6){thumb15.setIcon(icon2); checkgame++; }
                       else     if(secran==6){thumb15.setIcon(icon3); }
                        else    if(thirdran==6){thumb15.setIcon(icon3); }
                        else    if(fourthran==6){thumb15.setIcon(icon3); }
                            }
                            
                            if(current==17){thumb12.setIcon(mainicon06);  
                             if(secran==6){thumb16.setIcon(icon2); checkgame++; }    
                           else if(firstran==6){thumb16.setIcon(icon3); }
                      
                          else  if(thirdran==6){thumb16.setIcon(icon3); }
                          else  if(fourthran==6){thumb16.setIcon(icon3); }
                            }
                            
                            if(current==18){thumb13.setIcon(mainicon06);
                            if(thirdran==6){thumb17.setIcon(icon2); checkgame++; }      
                            else if(firstran==6){thumb17.setIcon(icon3); }
                          else  if(secran==6){thumb17.setIcon(icon3); }
                         
                          else  if(fourthran==6){thumb17.setIcon(icon3); }
                            }
                            
                            if(current==19){thumb14.setIcon(mainicon06);
                            if(fourthran==6){thumb18.setIcon(icon2);checkgame++;  }      
                           else if(firstran==6){thumb18.setIcon(icon3); }
                          else  if(secran==6){thumb18.setIcon(icon3); }
                          else  if(thirdran==6){thumb18.setIcon(icon3); }
                          
                            }
            
                            if(checkgame==4)
                            {
                                System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                            }
                            if(current==20){thumb01.setIcon(mainicon06);
                                checkgame=0;      
                                if(firstran==6){thumb05.setIcon(icon2); checkgame++; }
                          else      if(secran==6){thumb05.setIcon(icon3); }
                          else      if(thirdran==6){thumb05.setIcon(icon3); }
                          else      if(fourthran==6){thumb05.setIcon(icon3); }
                                }
                                
                                if(current==21){thumb02.setIcon(mainicon06); 
                                    if(secran==6){thumb06.setIcon(icon2); checkgame++; }     
                              else  if(firstran==6){thumb06.setIcon(icon3); }
                               
                            else    if(thirdran==6){thumb06.setIcon(icon3); }
                            else    if(fourthran==6){thumb06.setIcon(icon3); }
                                }
                                
                                if(current==22){thumb03.setIcon(mainicon06); 
                               if(thirdran==6){thumb07.setIcon(icon2); checkgame++; }     
                               else if(firstran==6){thumb07.setIcon(icon3); }
                            else    if(secran==6){thumb07.setIcon(icon3); }
                            
                            else    if(fourthran==6){thumb07.setIcon(icon3); }
                                }
                                
                                if(current==23){thumb04.setIcon(mainicon06); 
                               if(fourthran==6){thumb08.setIcon(icon2);checkgame++;  }     
                              else  if(firstran==6){thumb08.setIcon(icon3); }
                            else    if(secran==6){thumb08.setIcon(icon3); }
                            else    if(thirdran==6){thumb08.setIcon(icon3); }
                            
                                }
                                if(checkgame==4)
                                {
                                    System.out.println("You Won");
            thumb91.setEnabled(false);
            thumb92.setEnabled(false);
            thumb93.setEnabled(false);
            thumb94.setEnabled(false);
            thumb95.setEnabled(false);
            thumb96.setEnabled(false);
            thumb97.setEnabled(false);
            
            checkgame=0;
                                }
        
        current++;}
        
                
             });  
     leftpanel9.add(thumb91);
     leftpanel9.add(thumb92);
     leftpanel9.add(thumb93);
     leftpanel9.add(thumb94);
     leftpanel9.add(thumb95);
     leftpanel9.add(thumb96);
     leftpanel9.add(thumb97);









//mainpanel.add(leftpanel9);



mainpanel.add(leftpanel9);
add(mainpanel);
setTitle("Welcome");
setSize(100,500);
setBackground(Color.RED);
setMinimumSize(new Dimension(305,500));
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
setVisible(true);
    }
    public static void main(String[] args) throws Exception {
       


        Random rand = new Random(); //instance of random class
        firstran=rand.nextInt(7); 
       secran=rand.nextInt(7); 
       
        thirdran=rand.nextInt(7); 
       fourthran=rand.nextInt(7); 

//firstran=6;
//secran=6;
//thirdran=6;
//fourthran=6;

//System.out.print(firstran);
//System.out.print(secran);
//System.out.print(thirdran);
//System.out.print(fourthran);

        Startt on=new Startt();
        on.initialize();
     
       // System.out.println("Hello, World!");
    //   System.out.println(array[0]);
       
    }

}
