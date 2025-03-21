using System;
namespace FactoryMethodPattern
 {    
public interface IAnimal   
 {        
void Speak();        
void Action();   
 }
 public class Dog : IAnimal   
 {       
 public void Speak()     
   {            
Console.WriteLine("Dog says: Bow-Wow.");     
   }        
public void Action()     
   {          
  Console.WriteLine("Dogs prefer barking...\n");        
}   
 }   
 public class Tiger : IAnimal   
 {        
public void Speak()      
  {            
Console.WriteLine("Tiger says: Halum.");      
  }       
 public void Action()      
  {        
    Console.WriteLine("Tigers prefer hunting...\n");    
    } 
   }   
 public abstract class IAnimalFactory   
 {
public abstract IAnimal CreateAnimal();   
 }  
  public class DogFactory : IAnimalFactory
    {       
 public override IAnimal CreateAnimal()       
 {
 return new Dog();                  
  }   
 }   
 public class TigerFactory : IAnimalFactory  
  {       
 public override IAnimal CreateAnimal()        
{       
     //Creating a Tiger            
return new Tiger();        
}  
  }    
class Client  
  {      
  static void Main(string[] args)     
   {         
   Console.WriteLine("***Factory Pattern Demo***\n");            // Creating a Tiger Factory           
 IAnimalFactory tigerFactory =new TigerFactory();            // Creating a tiger using the Factory Method        
    IAnimal aTiger = tigerFactory.CreateAnimal();           
 aTiger.Speak();            
aTiger.Action();            // Creating a DogFactory           
 IAnimalFactory dogFactory = new DogFactory();            // Creating a dog using the Factory Method            
IAnimal aDog = dogFactory.CreateAnimal();            
aDog.Speak();         
aDog.Action();
Console.ReadKey();     
   }
    }
 }
