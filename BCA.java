class Student{
int rollno;
int admissionno;
String name;
float fees;
}
class BCA {
public static void main(String[]args){
Student s1= new Student();
Student s2= new Student();
Student s3= new Student();
Student s4= new Student();
Student s5= new Student();
s1.rollno=10;
s1.admissionno=23145678;
s1.name="Aabha";
s1.fees=4000 ;
s2.rollno=11;
s2.admissionno=4648392;
s2.name="Madhura";
s2.fees=5000 ;
s3.rollno=12;
s3.admissionno=3476959;
s3.name="Ananya";
s3.fees=6000 ;
s4.rollno=13;
s4.admissionno=6759334;
s4.name="Nupoor";
s4.fees=7000 ;
s5.rollno=14;
s5.admissionno=5879634;
s5.name="Aarya";
s5.fees=8000 ;
System.out.println(s1.rollno+" "+s1.admissionno+" "+s1.name+" "+s1.fees);
System.out.println(s2.rollno+" "+s2.admissionno+" "+s2.name+" "+s2.fees);
System.out.println(s3.rollno+" "+s3.admissionno+" "+s3.name+" "+s3.fees);
System.out.println(s4.rollno+" "+s4.admissionno+" "+s4.name+" "+s4.fees);
System.out.println(s5.rollno+" "+s5.admissionno+" "+s5.name+" "+s5.fees);
}
}