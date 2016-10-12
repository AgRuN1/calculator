import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.math.*;
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Calc().go();
    }
    JFrame frame=new JFrame();
    int control=1;
    int number=1;
    int controlO=1;
    int controlTwo=0;
    String chislo="";
    String chisloSave="";
    boolean sqrt=false;
    
    //Кнопки
    JButton but1=new JButton("1");
    JButton but2=new JButton("2");
    JButton but3=new JButton("3");
    JButton but4=new JButton("4");
    JButton but5=new JButton("5");
    JButton but6=new JButton("6");
    JButton but7=new JButton("7");
    JButton but8=new JButton("8");
    JButton but9=new JButton("9");
    JButton but0=new JButton("0");
    JButton butS=new JButton("+");
    JButton butV=new JButton("-");
    JButton butD=new JButton("/");
    JButton butY=new JButton("*");
    JButton butM=new JButton("mod");
    JButton butE=new JButton("=");
    JButton butF=new JButton(".");
    JButton butSqrt=new JButton("sqrt");
    JButton butO=new JButton("-/+");
    JButton resetB=new JButton("reset");
    JButton butDel=new JButton("delete end char");
    
    Shet shet=new Shet();
    JLabel label1=new JLabel("0");
    JLabel label2=new JLabel("0");
    JLabel label3=new JLabel("0");
    void go(){
       addListener();
       frame.setResizable(false);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setTitle("Калькулятор");
       frame.setLocationRelativeTo(null);
       Box chisla=Box.createHorizontalBox();
       chisla.add(label1);
       chisla.add(label2);
       chisla.add(label3);
       
       Box buttons=Box.createVerticalBox();
       Box one=Box.createHorizontalBox();
       Box two=Box.createHorizontalBox();
       Box three=Box.createHorizontalBox();
       Box fo=Box.createHorizontalBox();
       Box fife=Box.createHorizontalBox();
       Box six=Box.createHorizontalBox();
       Box equal=Box.createHorizontalBox();
       Box reset=Box.createHorizontalBox();
       equal.add(butE);
       reset.add(resetB);
       reset.add(butDel);
       one.add(but1);
       one.add(but2);
       one.add(but3);
       
       two.add(but4);
       two.add(but5);
       two.add(but6);
       
       three.add(but7);
       three.add(but8);
       three.add(but9);
       
       fo.add(butM);
       fo.add(but0);
       fo.add(butV);
       
       fife.add(butD);
       fife.add(butY);
       fife.add(butS);
       
       six.add(butF);
       six.add(butO);
       six.add(butSqrt);
       
       buttons.add(chisla);
       buttons.add(equal);
       buttons.add(one);
       buttons.add(two);
       buttons.add(three);
       buttons.add(fo);
       buttons.add(fife);
       buttons.add(six);
       buttons.add(reset);
       frame.getContentPane().add(buttons);
       
       frame.setSize(200,300);
       frame.setVisible(true);
    }
    void addListener(){
       but1.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(control==1){
                if(label1.getText()=="0")
                    label1.setText("");
                if(sqrt==true){
                    if(number==1){
                   chislo+="1";
                   chisloSave=chislo;
                    }else{
                    chisloSave+="1";
                    }
                   label1.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="1";
                label1.setText(chislo);
                }
                number=2;
                label2.setText("");
                label3.setText("");
             }else if(control==3){
             if(sqrt){
               if(number==3){
                  chislo+="1"; 
                  chisloSave=chislo;
               }else{
                   chisloSave+="1";
               }
               label3.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="1";
                label3.setText(chislo);
                }
                number=4;
             }
         } 
       });
       but2.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(control==1){
                if(label1.getText()=="0")
                    label1.setText("");
                if(sqrt==true){
                    if(number==1){
                   chislo+="2";
                   chisloSave=chislo;
                    }else{
                    chisloSave+="2";
                    }
                   label1.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="2";
                label1.setText(chislo);
                }
                number=2;
                label2.setText("");
                label3.setText("");
             }else if(control==3){
             if(sqrt){
               if(number==3){
                  chislo+="2"; 
                  chisloSave=chislo;
               }else{
                   chisloSave+="2";
               }
               label3.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="2";
                label3.setText(chislo);
                }
                number=4;
             }
         } 
       });
       but3.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(control==1){
                if(label1.getText()=="0")
                    label1.setText("");
                if(sqrt==true){
                    if(number==1){
                   chislo+="3";
                   chisloSave=chislo;
                    }else{
                    chisloSave+="3";
                    }
                   label1.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="3";
                label1.setText(chislo);
                }
                number=2;
                label2.setText("");
                label3.setText("");
             }else if(control==3){
             if(sqrt){
               if(number==3){
                  chislo+="3"; 
                  chisloSave=chislo;
               }else{
                   chisloSave+="3";
               }
               label3.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="3";
                label3.setText(chislo);
                }
                number=4;
             }
         } 
       });
       but4.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(control==1){
                if(label1.getText()=="0")
                    label1.setText("");
                if(sqrt==true){
                    if(number==1){
                   chislo+="4";
                   chisloSave=chislo;
                    }else{
                    chisloSave+="4";
                    }
                   label1.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="4";
                label1.setText(chislo);
                }
                number=2;
                label2.setText("");
                label3.setText("");
             }else if(control==3){
             if(sqrt){
               if(number==3){
                  chislo+="4"; 
                  chisloSave=chislo;
               }else{
                   chisloSave+="4";
               }
               label3.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="4";
                label3.setText(chislo);
                }
                number=4;
             }
         } 
       });
       but5.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(control==1){
                if(label1.getText()=="0")
                    label1.setText("");
                if(sqrt==true){
                    if(number==1){
                   chislo+="5";
                   chisloSave=chislo;
                    }else{
                    chisloSave+="5";
                    }
                   label1.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="5";
                label1.setText(chislo);
                }
                number=2;
                label2.setText("");
                label3.setText("");
             }else if(control==3){
             if(sqrt){
               if(number==3){
                  chislo+="5"; 
                  chisloSave=chislo;
               }else{
                   chisloSave+="5";
               }
               label3.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="5";
                label3.setText(chislo);
                }
                number=4;
             }
         }
       });
       but6.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(control==1){
                if(label1.getText()=="0")
                    label1.setText("");
                if(sqrt==true){
                    if(number==1){
                   chislo+="6";
                   chisloSave=chislo;
                    }else{
                    chisloSave+="6";
                    }
                   label1.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="6";
                label1.setText(chislo);
                }
                number=2;
                label2.setText("");
                label3.setText("");
             }else if(control==3){
             if(sqrt){
               if(number==3){
                  chislo+="6"; 
                  chisloSave=chislo;
               }else{
                   chisloSave+="6";
               }
               label3.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="6";
                label3.setText(chislo);
                }
                number=4;
             }
         } 
       });
       but7.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(control==1){
                if(label1.getText()=="0")
                    label1.setText("");
                if(sqrt==true){
                    if(number==1){
                   chislo+="7";
                   chisloSave=chislo;
                    }else{
                    chisloSave+="7";
                    }
                   label1.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="7";
                label1.setText(chislo);
                }
                number=2;
                label2.setText("");
                label3.setText("");
             }else if(control==3){
             if(sqrt){
               if(number==3){
                  chislo+="7"; 
                  chisloSave=chislo;
               }else{
                   chisloSave+="7";
               }
               label3.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="7";
                label3.setText(chislo);
                }
                number=4;
             }
         } 
       });
       but8.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(control==1){
                if(label1.getText()=="0")
                    label1.setText("");
                if(sqrt==true){
                    if(number==1){
                   chislo+="8";
                   chisloSave=chislo;
                    }else{
                    chisloSave+="8";
                    }
                   label1.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="8";
                label1.setText(chislo);
                }
                number=2;
                label2.setText("");
                label3.setText("");
             }else if(control==3){
             if(sqrt){
               if(number==3){
                  chislo+="8"; 
                  chisloSave=chislo;
               }else{
                   chisloSave+="8";
               }
               label3.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="8";
                label3.setText(chislo);
                }
                number=4;
             }
         } 
       });
       but9.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(control==1){
                if(label1.getText()=="0")
                    label1.setText("");
                if(sqrt==true){
                    if(number==1){
                   chislo+="9";
                   chisloSave=chislo;
                    }else{
                    chisloSave+="9";
                    }
                   label1.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="9";
                label1.setText(chislo);
                }
                number=2;
                label2.setText("");
                label3.setText("");
             }else if(control==3){
             if(sqrt){
               if(number==3){
                  chislo+="9"; 
                  chisloSave=chislo;
               }else{
                   chisloSave+="9";
               }
               label3.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="9";
                label3.setText(chislo);
                }
                number=4;
             }
         } 
       });
       but0.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(control==1){
                if(label1.getText()=="0")
                    label1.setText("");
                if(sqrt==true){
                    if(number==1){
                   chislo+="0";
                   chisloSave=chislo;
                    }else{
                    chisloSave+="0";
                    }
                   label1.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="0";
                label1.setText(chislo);
                }
                number=2;
                label2.setText("");
                label3.setText("");
             }else if(control==3){
             if(sqrt){
               if(number==3){
                  chislo+="0"; 
                  chisloSave=chislo;
               }else{
                   chisloSave+="0";
               }
               label3.setText("sqrt("+chisloSave+")");
                   chislo=String.valueOf(Math.sqrt(Float.parseFloat(chisloSave)));
                   
                 }else{
                chislo+="0";
                label3.setText(chislo);
                }
                number=4;
             }
         } 
       });
       butF.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(control==1&&number==2){
                chislo+=".";
                label1.setText(chislo);
             }else if(control==3&&number==4){
               chislo+=".";
               label3.setText(chislo);
             }
         } 
       });
        butO.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(control==1&&number!=2&&sqrt==false){
                if(controlO==2){
                    chislo="+";
                    controlO=1;
                }else{
                    chislo="-";
                    controlO=2;
                }
                label1.setText(chislo);
                label2.setText("");
                label3.setText("");
             }else if(control==3&&number!=4){
               chislo="-";
               label3.setText(chislo);
             }
         } 
       });
       butS.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(number==2){
                if(sqrt)
                    controlTwo=1;
            shet.setOne(Float.parseFloat(chislo));
            chislo="";
            label2.setText("+");
            shet.setD("s");
            control=3;
            number=3;
            sqrt=false;
            }
         } 
       });
       butSqrt.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(control==1&&sqrt==false&&number==1){
            label1.setText("sqrt");
            sqrt=true;
            if(control==1){
            label2.setText("");
            label3.setText("");
            }
         }else if(control==3&&sqrt==false){
            label3.setText("sqrt");
            sqrt=true;
            }
         } 
       });
       butV.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(number==2){
                if(sqrt)
                    controlTwo=1;
            shet.setOne(Float.parseFloat(chislo));
            chislo="";
            label2.setText("-");
            shet.setD("v");
            control=3;
            number=3;
            sqrt=false;
            }
         } 
       });
       butY.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(number==2){
                if(sqrt)
                    controlTwo=1;
            shet.setOne(Float.parseFloat(chislo));
            chislo="";
            label2.setText("*");
            shet.setD("y");
            control=3;
            number=3;
            sqrt=false;
            }
         } 
       });
       butD.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(number==2){
                if(sqrt)
                    controlTwo=1;
            shet.setOne(Float.parseFloat(chislo));   
            chislo="";
            label2.setText("/");
            shet.setD("d");
            control=3;
            number=3;
            sqrt=false;
            }
         } 
       });
       butM.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(number==2){
                if(sqrt)
                    controlTwo=1;
            shet.setOne(Float.parseFloat(chislo));   
            chislo="";
            label2.setText("mod");
            shet.setD("m");
            control=3;
            number=3;
            sqrt=false;
            }
         } 
       });
       butE.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(sqrt==true&&number==2){
            float otvet=Float.parseFloat(chislo);
            reset("");
            if(otvet%1==0){
            int otveti=(int)otvet;
            label1.setText(String.valueOf(otveti));
            }else{
            label1.setText(String.valueOf(otvet));
            }
            }
            if(number==4){
            shet.setTwo(Float.parseFloat(chislo));
            float otvet=shet.otvet();
            reset("");
            if(otvet%1==0){
            int otveti=(int)otvet;
            label1.setText(String.valueOf(otveti));
            shet.setOne(otveti);
            chislo=String.valueOf(otveti);
            }else{
            label1.setText(String.valueOf(otvet));
            shet.setOne(otvet);
            chislo=String.valueOf(otvet);
            }
            number=2;
            }
         } 
       });
       resetB.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            reset("0");
         } 
       });
       butDel.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            if(label1.getText()!="0"&&label2.getText()!="0"&&label3.getText()!="0"){
                if(label3.getText().length()==0&&label2.getText().length()==0){
                    String str=label1.getText();
                     if(sqrt){
                        if(str.length()==6){
                       reset("0");
                       number=1;
                     }else{
                     StringBuilder strB=new StringBuilder(str);
                     strB.replace(strB.length()-2,strB.length()-1,"");
                     String strS=new String(strB);
                     StringBuilder strBT=new StringBuilder(chisloSave);
                     strBT.replace(strBT.length()-1,strBT.length(),"");
                     String strST=new String(strBT);
                     if(strST.length()==0){
                       number=3;
                       chislo="";
                       chisloSave="";
                     }else{
                     chisloSave=strST;
                     chislo=String.valueOf(Math.sqrt(Integer.parseInt(strST)));
                     }
                     label1.setText(strS);
                     }
                   }else{
                    StringBuilder strB=new StringBuilder(str);
                    strB.replace(strB.length()-1,strB.length(),"");
                    String strS=new String(strB);
                    label1.setText(strS);
                    chislo=strS;
                    if(strS.length()==0){
                       reset("0");
                       number=1;
                    }
                    }
                }else
                if(label2.getText().length()!=0&&label3.getText().length()==0){
                    label2.setText("");
                    if(controlTwo==1)
                        sqrt=true;
                    control=1;
                }else{
                  if(sqrt){
                      String str=label3.getText();
                      if(str.length()==6){
                       reset("0");
                       number=3;
                     }else{
                     StringBuilder strB=new StringBuilder(str);
                     strB.replace(strB.length()-2,strB.length()-1,"");
                     String strS=new String(strB);
                     label3.setText(strS);
                     StringBuilder strBT=new StringBuilder(chisloSave);
                     strBT.replace(strBT.length()-1,strBT.length(),"");
                     String strST=new String(strBT);
                     if(strST.length()==0){
                       number=3;
                       chislo="";
                       chisloSave="";
                     }else{
                     chisloSave=strST;
                     chislo=String.valueOf(Math.sqrt(Integer.parseInt(strST)));
                     }
                     label3.setText(strS);
                     }
                   }else{
                    String str=label3.getText();
                    StringBuilder strB=new StringBuilder(str);
                    strB.replace(strB.length()-1,strB.length(),"");
                    String strS=new String(strB);
                    label3.setText(strS);
                    chislo=strS;
                    if(strS.length()==0){
                       reset("0");
                       number=1;
                    }
                    }
                }
            }
         } 
       });
   }
    private void reset(String x){
    label1.setText(x);
    label2.setText(x);
    label3.setText(x);
    control=1;
    number=1;
    chislo="";
    controlO=1;
    sqrt=false;
    controlTwo=0;
    }
}
