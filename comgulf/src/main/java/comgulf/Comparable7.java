package comgulf;

public class Comparable7 implements Comparable<Comparable7> {
	int rollno;  
	String name;  
	int age;  
	Comparable7(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	  
	public int compareTo(Comparable7 st){  
	if(age==st.age)  
	return 0;  
	else if(age>st.age)  
	return 1;  
	else  
	return -1;  
	}  
}
