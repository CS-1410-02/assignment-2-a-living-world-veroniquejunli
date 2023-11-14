package example.com.project;

public class Feed{
  protected void setHealth(int h){
    health = h;
  }
  protected void setEnergy(int e){
    energy = e;
  }
    
  public void feedMe(){
    health++;
    energy++;
  }
  
}
