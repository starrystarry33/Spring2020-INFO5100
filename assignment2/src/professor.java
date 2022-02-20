class Professor extends Person{

 public Professor(String name, int ID, int age) {
  super(name, ID, age);
  
 }
 
 public String giveQuiz() {
  return super.toString();
 }
 
}

