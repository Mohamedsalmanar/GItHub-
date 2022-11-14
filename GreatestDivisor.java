public class GreatestDivisor{

public static void main(String[] args){

int no1 = 121;
int div = 2;
int gcd = 0;


while(div<=no1/2)
{
if(no1%div==0){
gcd=div;
}
div = div+1;
}
System.out.println(gcd);
}
}
