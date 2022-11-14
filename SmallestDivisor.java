public class SmallestDivisor{

public static void main(String[] args){

int no1 = 100;
int div = 2;
int gcd = 0;


while(div<=no1/2)
{
if(no1%div==0){
gcd=div;
System.out.println(gcd);
break;
}
div = div+1;
}

}
}
