package day20;

interface printable{  
void print();  
}  
class InterfaceExample implements printable{  
public void print(){System.out.println("Hello");}  
  
public static void main(String args[]){  
InterfaceExample obj = new InterfaceExample();  
obj.print();  
 }  
}  