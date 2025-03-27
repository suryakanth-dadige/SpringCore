package loosecoupling;

public class Dependency 
{
  myclass1 mc1;
  myclass2 mc2;
  myclass3 mc3;
   Dependency()
   {
	   mc1=new myclass1();
	   mc1.m1();
	   mc2=new myclass2();
	   mc2.m2();
	   mc3=new myclass3();
	   mc3.m3();
   }
  
}
