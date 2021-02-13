//Marc Encarnacion
//2/12/21
//CW 7.1
class Main
{
  public static void main(String[] args) 
  {
    System.out.println("Marc Encarnacion, CW 7.1");
    Thought thinking = new Thought();
    Advice speaking = new Advice();

    thinking.message();

    speaking.message();//Overriden method
  }//end main method
}//end class Main