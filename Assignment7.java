// Taking Input at Runtime


import java.util.Scanner;
class CompoundInterest{
    float p, i;
    int t;
    CompoundInterest(float x, float y, int z){
        p=x;
        i=y;
        t=z;
    }
    void compile(){
        float a=1+i/100;
        float b=Power(a,t);
        float c=b*p;
        System.out.println("Interest: "+(c-p));
        System.out.println("Total amount: "+c);
    }
    float Power(float p, float q){
        float r=1;
        for(int i=1;i<=q;i++){
            r*=p;
            
        }
        return r;
    }
}
class Assignment7{
    public static void main(String[] args) {
        float x,y;
        int z;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter principal: ");
            x=sc.nextFloat();
            System.out.println("Enter interest: ");
            y=sc.nextFloat();
            System.out.println("Enter No of years: ");
            z=sc.nextInt();
        }
        CompoundInterest comp=new CompoundInterest(x,y,z);
        comp.compile();

    }
}