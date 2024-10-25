abstract class Debuggable{ 
abstract void dump() 
{ 
System.out.println("debuggable error: no dump() defined for the class"); 
} 
} 
class X extends debuggable{ 
private int a,b,c; 
  int aa=0,bb=0,cc=0;
{ 
a = aa; 
b = bb; 
c = cc;
} 
void dump(){ 
System.out.println( "a = " + a +"b=" +b+ "c=" +c); 
} 
} 
class Y extends debuggable{ 
private int i,j,k; 
 int ii=0,jj=0,kk=0;
{ 
i = ii; 
j = jj; 
k = kk; 
} 
void dump(){ 
System.out.println( "i = " + i +"j=" +j+ "k=" +k); 
} 
} 
class Z extends debuggable{ 
private int p,q,r; 
 int pp=0,qq=0,rr=0;
{ 
p = pp; 
q = qq; 
r = rr; 
} 
void dump(){ 
System.out.println( "p = " + p +"q=" +q+ "r=" +r); 
} 
} 
class Abstdemo{ 
public static void main(String args[]){ 
int x,y,z;
x(1,2,3); 
 y(2,4,5); 
 z(5,6,7); 
x = new X();
y = new Y(); 
z = new Z(); 
x.dump(); 
y.dump(); 
z.dump(); 
}
}