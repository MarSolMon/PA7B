public class Dog{
  //properties or attributes
  public String color;
  public String eyeColor;
  public Double height;
  public Double length;
  public Double weight;
  //Methods or behaviors
  public String sit(){
    return "Estoy sentado";
    //System.out.println("Estoy sentado");
  }
  public void bark(){
    System.out.println("wauff wauff wauff");
  }
  public void layDown(String name){
    System.out.println(name + " estoy recostado");
  }
  public void eat(){
    System.out.println("I am eating");
  }
  public void sleep(){
    System.out.println("zzzzzzzzzZZZZ");
  }
}
