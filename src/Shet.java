
public class Shet {
    float one;
    float two;
    String d;
    void setOne(float oneN){
        one=oneN;
    }
    void setTwo(float twoN){
        two=twoN;
    }
    void setD(String dN){
        d=dN;
    }
    float otvet(){
    float otvet=0;
    if(d=="s")
      otvet=one+two;
    else 
    if(d=="y")
        otvet=one*two;
    else
    if(d=="d")
        otvet=one/two;
    else 
    if(d=="m")
        otvet=one%two;
    else 
    if(d=="v")
        otvet=one-two;
    
    return otvet;
    }
}
