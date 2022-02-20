class Person {
 private String name;
 private int ID;
 private int age;
 
 public Person(String name,int ID,int age) {
  this.name = name;
  this.ID = ID;
  this.age = age;
 }
 
 @Override
 public String toString() {
  return "Person [name=" + name + ", ID=" + ID + ", age=" + age + "]";
 }
 
}

class Professor extends Person{

 public Professor(String name, int ID, int age) {
  super(name, ID, age);
  // TODO Auto-generated constructor stub
 }
 
 public String giveQuiz() {
  return super.toString();
 }
 
}
