public class P implements PubliclyCloneable {
 String name;
 int age;
  public P(String n,int a){
	  name=n;
	  age=a;
  }
 public Object clone() throws CloneNotSupportedException{
	 return super.clone();
 }
 public Object deepclone() throws CloneNotSupportedException{
	 return super.clone();
 }
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age = age;
}
public int getAge() {
	return age;
}

@Override
public String toString() {
	return "P [name=" + name + ", age=" + age + "]";
}
 

  
}
