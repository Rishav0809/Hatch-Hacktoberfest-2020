
import java.util.*;            
class SchoolProject
{
  public static double Year(int n,double user)
 {
  double amt;
  if(2018-n<=1)
  {
    amt=1.6/100*user;
  }
 else 
   {
    amt=(1.6/100*user)+(((2018-n)-1)*0.6/100*user);
   }
   return amt;
 }
 public static double kmd(double dis,double user)
 {
 double amt;                                                                                     
 if(dis<=10)
  { 
   amt=0.0;
  }
 else if(dis>=11 && dis<=100)
  {
  amt=(1.5/100)*user;
  }
 else if(dis>=101 && dis<=1000)
  { 
  amt=(5/100)*user;
  } 
 else if(dis>=1001 && dis<=3000)
  {
  amt=(10/100)*user;
  }
 else if(dis>=3001 && dis<=5000)
 {
  amt=(15/100)*user;                                                                                 
 }                                                                        
 else if(dis>=5001 && dis<=10000)
 { 
  amt=(20/100)*user;
 }
 else
 {
  amt=(30/100)*user;
 }
 return amt;
 }
 public static double condition(String con,double user)
 {
 double amt=0.0;
 if(con.equalsIgnoreCase("Excellent")==true)
 {
  amt=0.0;
 }
 else if(con.equalsIgnoreCase("Very Good")==true)
 {
  amt=(2/100)*user;
 }
 else if(con.equalsIgnoreCase("Good")==true)
 {
  amt=(4/100)*user;
 }
 else if(con.equalsIgnoreCase("Fair")==true)
 { 
  amt=(8/100)*user;
 }
 return amt;
 }  
 public static void main()
 {
 Scanner in=new Scanner(System.in);
 System.out.println("Used Vehicle Pricing Calculator Welcomes you");
 System.out.println("Please Enter 1 if your category is Bikes/Motorcycles");
 System.out.println("Please Enter 2 if your category is Cars");
 short choice=in.nextShort();
 switch(choice)
 { 
   case 1: System.out.println("We include 2nd hand value only of these listed brands-");
  System.out.println("Bajaj,Honda,TVS,Yamaha and KTM");
  System.out.println("Please Enter '1'if the company is Bajaj ,'2' if the company is Honda,'3' if the company is TVS,");
  System.out.println("'4' if the company is Yamaha and '5' if the company is KTM");
  short jbl=in.nextShort();
  switch(jbl)
  { 
  case 1: 
  System.out.println("Enter the name of your Bajaj bike");
  String motor=in.next();double dis;String con;
  int year;
  System.out.println("Enter the year when your bought the bike");
  year=in.nextInt();System.out.println("Enter the total distance your have travelled using this bike");dis=in.nextDouble();
  System.out.println("Enter the condition of your bike as'EXCELLENT','GOOD','VERY GOOD'and 'FAIR'"); con=in.next(); 
  if(motor.equalsIgnoreCase("Avenger")==true)
  { 
   System.out.println("Enter how much cc engine it is having");
   int trim=in.nextInt();
   if(trim==180)
   {
    double amt1=Year(year,83475);
    double amt2=kmd(dis,83475);
    double amt3=condition(con,83475);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Avenger 180   ");
    System.out.println("      Second hand value of your bike is="+(int)(83475-total)); 
    }
   else if(trim==150)
   {
    double amt1=Year(year,80435);
    double amt2=kmd(dis,80435);
    double amt3=condition(con,80435);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Avenger 150   ");
    System.out.println("       Second hand value of your bike is="+(int)(80435-total)); 
    }          
   else if(trim==220)
   {
    double amt1=Year(year,104000);
    double amt2=kmd(dis,104000);
    double amt3=condition(con,104000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Avenger 220   ");
    System.out.println("      Second hand value of your bike is="+(int)(104000-total)); 
    } 
 }        
  else if(motor.equalsIgnoreCase("Discover")==true)
 { 
   System.out.println("Enter how much cc engine it is having");
   int trim=in.nextInt();
   if(trim==125)
   {
    double amt1=Year(year,64927);
    double amt2=kmd(dis,64927);
    double amt3=condition(con,64927);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Discover 125   ");
    System.out.println("      Second hand value of your bike is="+(int)(64927-total)); 
    }
   else if(trim==150)
   {
    double amt1=Year(year,59913);
    double amt2=kmd(dis,59913);
    double amt3=condition(con,59913);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Discover 150   ");
    System.out.println("       Second hand value of your bike is="+(int)(59913-total)); 
    }          
    else if(trim==110)
   {
    double amt1=Year(year,52710);
    double amt2=kmd(dis,52710);
    double amt3=condition(con,52710);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Discover 110   " );
    System.out.println("      Second hand value of your bike is="+(int)(52710-total)); 
    } 
 }        
                    
 else if(motor.equalsIgnoreCase("Dominar")==true)
 { 
   System.out.println("Enter how much cc engine it is having");
   int trim=in.nextInt();
   if(trim==200)
   {
    double amt1=Year(year,125000);
    double amt2=kmd(dis,125000);
    double amt3=condition(con,125000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Dominar 200   ");
    System.out.println("      Second hand value of your bike is="+(int)(110000-total)); 
    }
   else if(trim==400)
   {
    double amt1=Year(year,142000);
    double amt2=kmd(dis,142000);
    double amt3=condition(con,142000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Dominar 400   ");
    System.out.println("       Second hand value of your bike is="+(int)(142000-total)); 
    }          
 }        
 else if(motor.equalsIgnoreCase("PulsarAS")==true)
 { 
   System.out.println("Enter how much cc engine it is having");
   int trim=in.nextInt();
   if(trim==150)
   {
    double amt1=Year(year,80821);
    double amt2=kmd(dis,80821);
    double amt3=condition(con,80821);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Pulsar AS 150   ");
    System.out.println("       Second hand value of your bike is="+(int)(80821-total)); 
    }          
    else if(trim==200)
   {
    double amt1=Year(year,92074);
    double amt2=kmd(dis,92074);
    double amt3=condition(con,92074);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Pulsar AS 200   " );
    System.out.println("      Second hand value of your bike is="+(int)(92074-total)); 
    } 
 } 
 else if(motor.equalsIgnoreCase("PulsarNS")==true)
 { 
   System.out.println("Enter how much cc engine it is having");
   int trim=in.nextInt();
   if(trim==160)
   {
    double amt1=Year(year,91696);
    double amt2=kmd(dis,91696);
    double amt3=condition(con,91696);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Pulsar NS 160   ");
    System.out.println("       Second hand value of your bike is="+(int)(91696-total)); 
    }          
    else if(trim==200)
   {
    double amt1=Year(year,100000);
    double amt2=kmd(dis,100000);
    double amt3=condition(con,100000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Pulsar NS 200   " );
    System.out.println("      Second hand value of your bike is="+(int)(100000-total)); 
    } 
 }        
   else if(motor.equalsIgnoreCase("PulsarRS")==true)
 { 
   System.out.println("Enter how much cc engine it is having");
   int trim=in.nextInt();
   if(trim==400)
   {
    double amt1=Year(year,145000);
    double amt2=kmd(dis,145000);
    double amt3=condition(con,145000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Pulsar RS 400   ");
    System.out.println("       Second hand value of your bike is="+(int)(145000-total)); 
    }          
    else if(trim==200)
   {
    double amt1=Year(year,126000);
    double amt2=kmd(dis,126000);
    double amt3=condition(con,126000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Pulsar RS 200   " );
    System.out.println("      Second hand value of your bike is="+(int)(126000-total)); 
    } 
 }  
else  if(motor.equalsIgnoreCase("Pulsar")==true)
 { 
   System.out.println("Enter how much cc engine it is having");
   int trim=in.nextInt();
   if(trim==180)
   {
    double amt1=Year(year,83731);
    double amt2=kmd(dis,83731);
    double amt3=condition(con,83731);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Pulsar 180   ");
    System.out.println("       Second hand value of your bike is="+(int)(83731-total)); 
    }          
    else if(trim==150)
   {
    double amt1=Year(year,78618);
    double amt2=kmd(dis,78618);
    double amt3=condition(con,78618);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Pulsar 150   " );
    System.out.println("      Second hand value of your bike is="+(int)(78618-total)); 
    } 
 }
 else if(motor.equalsIgnoreCase("Boxer")==true)
 { 
    double amt1=Year(year,42000);
    double amt2=kmd(dis,42000);
    double amt3=condition(con,42000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Boxer   ");
    System.out.println("       Second hand value of your bike is="+(int)(42000-total)); 
    } 
  else if(motor.equalsIgnoreCase("CT100")==true)
  { 
    double amt1=Year(year,44557);
    double amt2=kmd(dis,44557);
    double amt3=condition(con,44557);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - CT100    ");
    System.out.println("       Second hand value of your bike is="+(int)(44557-total)); 
    }  
  else if(motor.equalsIgnoreCase("Platina")==true)
  { 
    double amt1=Year(year,47789);
    double amt2=kmd(dis,47789);
    double amt3=condition(con,47789);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - Platina    ");
    System.out.println("       Second hand value of your bike is="+(int)(47789-total)); 
    } 
 else if(motor.equalsIgnoreCase("V12")==true)
  { 
    double amt1=Year(year,64495);
    double amt2=kmd(dis,64495);
    double amt3=condition(con,64495);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - V12    ");
    System.out.println("       Second hand value of your bike is="+(int)(64495-total)); 
    } 
  else if(motor.equalsIgnoreCase("V15")==true)
  { 
    double amt1=Year(year,75000);
    double amt2=kmd(dis,75000);
    double amt3=condition(con,75000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - V15    ");
    System.out.println("       Second hand value of your bike is="+(int)(75000-total)); 
    } 
 else if(motor.equalsIgnoreCase("XcD135")==true)
  { 
    double amt1=Year(year,50500);
    double amt2=kmd(dis,50500);
    double amt3=condition(con,50500);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Bajaj");System.out.println("    Bike name - XcD 135    ");
    System.out.println("       Second hand value of your bike is="+(int)(50500-total)); 
    }

break;
case 2:System.out.println("Enter the name of your Honda bike");double disc;String cond;
  String mot=in.next();int yr;System.out.println("Enter the year when your bought the bike");
  yr=in.nextInt();System.out.println("Enter the total distance your have travelled using this bike");disc=in.nextDouble();
  System.out.println("Enter the condition of your bike as'EXCELLENT','GOOD','VERY GOOD'and 'FAIR'"); cond=in.next();
  if(mot.equalsIgnoreCase("AfricaTwin")==true)
  { 
    double amt1=Year(yr,1290000);
    double amt2=kmd(disc,1290000);
    double amt3=condition(cond,1290000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Africa Twin    ");
    System.out.println("       Second hand value of your bike is="+(int)(1290000-total)); 
    }
  else if(mot.equalsIgnoreCase("Cb1000r")==true)
  { 
    double amt1=Year(yr,1442425);
    double amt2=kmd(disc,1442425);
    double amt3=condition(cond,1442425);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Cb 1000r    ");
    System.out.println("       Second hand value of your bike is="+(int)(1442425-total)); 
    }                                                                                                                                                                    
    else if(mot.equalsIgnoreCase("CbHornet160r")==true)
  { 
    double amt1=Year(yr,93943);
    double amt2=kmd(disc,93943);
    double amt3=condition(cond,93943);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Cb Hornet 160r    ");
    System.out.println("       Second hand value of your bike is="+(int)(93943-total)); 
    } 
  else if(mot.equalsIgnoreCase("CbShine")==true)
  { 
    double amt1=Year(yr,60100);
    double amt2=kmd(disc,60100);
    double amt3=condition(cond,60100);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Cb Shine    ");
    System.out.println("       Second hand value of your bike is="+(int)(60100-total)); 
    } 
  else if(mot.equalsIgnoreCase("CbShineSP")==true)
  { 
    double amt1=Year(yr,71838);
    double amt2=kmd(disc,71838);
    double amt3=condition(cond,71838);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Cb ShineSP    ");
    System.out.println("       Second hand value of your bike is="+(int)(71838-total)); 
    }
  else if(mot.equalsIgnoreCase("CbTrigger")==true)
  { 
    double amt1=Year(yr,83437);
    double amt2=kmd(disc,83437);
    double amt3=condition(cond,83437);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Cb Trigger    ");
    System.out.println("       Second hand value of your bike is="+(int)(83437-total)); 
    }
  else if(mot.equalsIgnoreCase("CbTwister")==true)
  { 
    double amt1=Year(yr,49150);
    double amt2=kmd(disc,49150);
    double amt3=condition(cond,49150);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Cb Twister    ");
    System.out.println("       Second hand value of your bike is="+(int)(49150-total)); 
    } 
  else if(mot.equalsIgnoreCase("CbUnicorn")==true)
  { 
    double amt1=Year(yr,73438);
    double amt2=kmd(disc,73438);
    double amt3=condition(cond,73438);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Cb Unicorn    ");
    System.out.println("       Second hand value of your bike is="+(int)(73438-total)); 
    } 
  else if(mot.equalsIgnoreCase("CbUnicorn160")==true)
  { 
    double amt1=Year(yr,77775);
    double amt2=kmd(disc,77775);
    double amt3=condition(cond,77775);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Cb Unicorn160    ");
    System.out.println("       Second hand value of your bike is="+(int)(77775-total)); 
    } 
  else if(mot.equalsIgnoreCase("CbfStunner")==true)
  { 
    double amt1=Year(yr,62993);
    double amt2=kmd(disc,62993);
    double amt3=condition(cond,62993);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Cbf Stunner    ");
    System.out.println("       Second hand value of your bike is="+(int)(62993-total)); 
    } 
   else if(mot.equalsIgnoreCase("Cbr1000rr")==true)
  { 
    double amt1=Year(yr,1778000);
    double amt2=kmd(disc,1778000);
    double amt3=condition(cond,1778000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Cbr 1000rr    ");
    System.out.println("       Second hand value of your bike is="+(int)(1778000-total)); 
    }    
  else if(mot.equalsIgnoreCase("Cbr150r")==true)
  { 
    double amt1=Year(yr,130000);
    double amt2=kmd(disc,130000);
    double amt3=condition(cond,130000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Cbr 150r    ");
    System.out.println("       Second hand value of your bike is="+(int)(130000-total)); 
    } 
  else if(mot.equalsIgnoreCase("Cbr250r")==true)
  { 
    double amt1=Year(yr,169000);
    double amt2=kmd(disc,169000);
    double amt3=condition(cond,169000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Cbr 250r    ");
    System.out.println("       Second hand value of your bike is="+(int)(169000-total)); 
    }  
  else if(mot.equalsIgnoreCase("Cbr400r")==true)
  { 
    double amt1=Year(yr,469000);
    double amt2=kmd(disc,469000);
    double amt3=condition(cond,469000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Cbr 400r    ");
    System.out.println("       Second hand value of your bike is="+(int)(469000-total)); 
    }
  else if(mot.equalsIgnoreCase("Cbr600rr")==true)
  { 
    double amt1=Year(yr,1179000);
    double amt2=kmd(disc,1179000);
    double amt3=condition(cond,1179000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Cbr 600rr    ");
    System.out.println("       Second hand value of your bike is="+(int)(1179000-total)); 
    } 
  else if(mot.equalsIgnoreCase("Cbr650f")==true)
  { 
    double amt1=Year(yr,740000);
    double amt2=kmd(disc,740000);
    double amt3=condition(cond,740000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Cbr 650f    ");
    System.out.println("       Second hand value of your bike is="+(int)(740000-total)); 
    }        
  else if(mot.equalsIgnoreCase("Cd110Dream")==true)
  { 
    double amt1=Year(yr,50641);
    double amt2=kmd(disc,50641);
    double amt3=condition(cond,50641);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Cd 110 Dream     ");
    System.out.println("       Second hand value of your bike is="+(int)(50641-total)); 
    }  
  else if(mot.equalsIgnoreCase("DreamNeo")==true)
  { 
    double amt1=Year(yr,52351);
    double amt2=kmd(disc,52351);
    double amt3=condition(cond,52351);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Dream Neo     ");
    System.out.println("       Second hand value of your bike is="+(int)(52351-total)); 
    }
  else if(mot.equalsIgnoreCase("DreamYuga")==true)
  { 
    double amt1=Year(yr,54009);
    double amt2=kmd(disc,54009);
    double amt3=condition(cond,54009);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Dream Yuga     ");
    System.out.println("       Second hand value of your bike is="+(int)(54009-total)); 
    }
  else if(mot.equalsIgnoreCase("GoldWingGL1800")==true)
  { 
    double amt1=Year(yr,2850000);
    double amt2=kmd(disc,2850000);
    double amt3=condition(cond,2850000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Gold Wing GL 1800    ");
    System.out.println("       Second hand value of your bike is="+(int)(2850000-total)); 
    } 
  else if(mot.equalsIgnoreCase("Livo")==true)
  { 
    double amt1=Year(yr,56980);
    double amt2=kmd(disc,56980);
    double amt3=condition(cond,56980);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - Livo    ");
    System.out.println("       Second hand value of your bike is="+(int)(56980-total)); 
    } 
  else if(mot.equalsIgnoreCase("VFR1200F")==true)
  { 
    double amt1=Year(yr,1762000);
    double amt2=kmd(disc,1762000);
    double amt3=condition(cond,1762000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - VFR 1200F    ");
    System.out.println("       Second hand value of your bike is="+(int)(1762000-total)); 
    }  
  else if(mot.equalsIgnoreCase("VT1300CX")==true)
  { 
    double amt1=Year(yr,1506976);
    double amt2=kmd(disc,1506976);
    double amt3=condition(cond,1506976);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - VT1300CX    ");
    System.out.println("       Second hand value of your bike is="+(int)(1506976-total)); 
    }
  else if(mot.equalsIgnoreCase("X-Blade")==true)
  { 
    double amt1=Year(yr,79768);
    double amt2=kmd(disc,79768);
    double amt3=condition(cond,79768);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Bike name - X-Blade    ");
    System.out.println("       Second hand value of your bike is="+(int)(79768-total)); 
    }

  break;
case 3:System.out.println("Enter the name of your TVS bike");double disco;String cow;
  String moto=in.next();int yer;System.out.println("Enter the year when your bought the bike");
  yer=in.nextInt();System.out.println("Enter the total distance your have travelled using this bike");disco=in.nextDouble();
  System.out.println("Enter the condition of your bike as'EXCELLENT','GOOD','VERY GOOD'and 'FAIR'"); cow=in.next();
  if(moto.equalsIgnoreCase("Apache")==true)
  { 
    double amt1=Year(yer,69000);
    double amt2=kmd(disco,69000);
    double amt3=condition(cow,69000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TVS");System.out.println("    Bike name - Apache    ");
    System.out.println("       Second hand value of your bike is="+(int)(69000-total)); 
    }
  else if(moto.equalsIgnoreCase("ApacheRr")==true)
  { 
    double amt1=Year(yer,210000);
    double amt2=kmd(disco,210000);
    double amt3=condition(cow,210000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TVS");System.out.println("    Bike name - Apache Rr 310   ");
    System.out.println("       Second hand value of your bike is="+(int)(210000-total)); 
    } 
  else if(moto.equalsIgnoreCase("ApacheRtr")==true)
  { 
   System.out.println("Enter how much cc engine it is having");
   int trim=in.nextInt();
   if(trim==180)
  { 
    double amt1=Year(yer,94817);
    double amt2=kmd(disco,94817);
    double amt3=condition(cow,94817);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TVS");System.out.println("    Bike name - Apache Rtr 180    ");
    System.out.println("       Second hand value of your bike is="+(int)(94817-total)); 
    }
  else if(trim==160)
  { 
    double amt1=Year(yer,82876);
    double amt2=kmd(disco,82876);
    double amt3=condition(cow,82876);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TVS");System.out.println("    Bike name - Apache Rtr 160    ");
    System.out.println("       Second hand value of your bike is="+(int)(82876-total)); 
    } 
  else if(trim==200)
  { 
    double amt1=Year(yer,106415);
    double amt2=kmd(disco,106415);
    double amt3=condition(cow,106415);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TVS");System.out.println("    Bike name - Apache Rtr 200    ");
    System.out.println("       Second hand value of your bike is="+(int)(106415-total)); 
    } 
} 
  else if(moto.equalsIgnoreCase("Flame")==true)
  { 
    double amt1=Year(yer,57080);
    double amt2=kmd(disco,57080);
    double amt3=condition(cow,57080);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TVS");System.out.println("    Bike name - Flame   ");
    System.out.println("       Second hand value of your bike is="+(int)(57080-total)); 
    }
  else if(moto.equalsIgnoreCase("Jive")==true)
  { 
    double amt1=Year(yer,48857);
    double amt2=kmd(disco,48857);
    double amt3=condition(cow,48857);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TVS");System.out.println("    Bike name - Jive   ");
    System.out.println("       Second hand value of your bike is="+(int)(48857-total)); 
    }  
  else if(moto.equalsIgnoreCase("Max4r")==true)
  { 
    double amt1=Year(yer,43114);
    double amt2=kmd(disco,43114);
    double amt3=condition(cow,43114);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TVS");System.out.println("    Bike name - Max 4r   ");
    System.out.println("       Second hand value of your bike is="+(int)(43114-total)); 
    } 
  else if(moto.equalsIgnoreCase("Phoenix")==true)
  { 
    double amt1=Year(yer,58180);
    double amt2=kmd(disco,58180);
    double amt3=condition(cow,58180);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TVS");System.out.println("    Bike name - Phoenix   ");
    System.out.println("       Second hand value of your bike is="+(int)(58180-total)); 
    } 
  else if(moto.equalsIgnoreCase("Sport")==true)
  { 
    double amt1=Year(yer,47000);
    double amt2=kmd(disco,47000);
    double amt3=condition(cow,47000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TVS");System.out.println("    Bike name - Sport   ");
    System.out.println("       Second hand value of your bike is="+(int)(47000-total)); 
    } 
  else if(moto.equalsIgnoreCase("StarCityPlus")==true)
  { 
    double amt1=Year(yer,56232);
    double amt2=kmd(disco,56232);
    double amt3=condition(cow,56232);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TVS");System.out.println("    Bike name - Star City Plus   ");
    System.out.println("       Second hand value of your bike is="+(int)(56232-total)); 
    }
   else if(moto.equalsIgnoreCase("StarDeluxe")==true)
  { 
    double amt1=Year(yer,39200);
    double amt2=kmd(disco,39200);
    double amt3=condition(cow,39200);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TVS");System.out.println("    Bike name - Star Deluxe   ");
    System.out.println("       Second hand value of your bike is="+(int)(39200-total)); 
    }
   else if(moto.equalsIgnoreCase("StarSport")==true)
  { 
    double amt1=Year(yer,41649);
    double amt2=kmd(disco,41649);
    double amt3=condition(cow,41649);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TVS");System.out.println("    Bike name - Star Sport  ");
    System.out.println("       Second hand value of your bike is="+(int)(41649-total)); 
    }
   else if(moto.equalsIgnoreCase("Victor")==true)
  { 
    double amt1=Year(yer,64526);
    double amt2=kmd(disco,64526);
    double amt3=condition(cow,64526);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TVS");System.out.println("    Bike name - Victor  ");
    System.out.println("       Second hand value of your bike is="+(int)(64526-total)); 
    }
  else if(moto.equalsIgnoreCase("VictorGlx")==true)
  { 
    double amt1=Year(yer,48900);
    double amt2=kmd(disco,48900);
    double amt3=condition(cow,48900);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TVS");System.out.println("    Bike name - VictorGlx  ");
    System.out.println("       Second hand value of your bike is="+(int)(48900-total)); 
    }
  break;
 case 4: System.out.println("Enter the name of your Yamaha bike");double d;String c;int y;
  String m=in.next();System.out.println("Enter the year when your bought the bike");y=in.nextInt();
  System.out.println("Enter the total distance your have travelled using this bike");d=in.nextDouble();
  System.out.println("Enter the condition of your bike as'EXCELLENT','GOOD','VERY GOOD'and 'FAIR'"); c=in.next();
  if(m.equalsIgnoreCase("Alba")==true)
  { 
    double amt1=Year(y,39000);
    double amt2=kmd(d,39000);
    double amt3=condition(c,39000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Alba  ");
    System.out.println("       Second hand value of your bike is="+(int)(39000-total)); 
    }
  if(m.equalsIgnoreCase("Crux")==true)
  { 
    double amt1=Year(y,41613);
    double amt2=kmd(d,41613);
    double amt3=condition(c,41613);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Crux  ");
    System.out.println("       Second hand value of your bike is="+(int)(41613-total)); 
    }
 else if(m.equalsIgnoreCase("Enticer")==true)
  { 
    double amt1=Year(y,48000);
    double amt2=kmd(d,48000);
    double amt3=condition(c,48000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Enticer  ");
    System.out.println("       Second hand value of your bike is="+(int)(48000-total)); 
    }
  else if(m.equalsIgnoreCase("Fazer25")==true)
  { 
    double amt1=Year(y,131000);
    double amt2=kmd(d,131000);
    double amt3=condition(c,131000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Fazer25  ");
    System.out.println("       Second hand value of your bike is="+(int)(131000-total)); 
    }
 else if(m.equalsIgnoreCase("Fz16")==true)
  { 
    double amt1=Year(y,78712);
    double amt2=kmd(d,78712);
    double amt3=condition(c,78712);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Fz16  ");
    System.out.println("       Second hand value of your bike is="+(int)(78712-total)); 
    }
  if(m.equalsIgnoreCase("Fz25")==true)
  { 
    double amt1=Year(y,120000);
    double amt2=kmd(d,120000);
    double amt3=condition(c,120000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Fz25  ");
    System.out.println("       Second hand value of your bike is="+(int)(120000-total)); 
    }
  else if(m.equalsIgnoreCase("Fzs")==true)
  { 
    double amt1=Year(y,87547);
    double amt2=kmd(d,87547);
    double amt3=condition(c,87547);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Fzs  ");
    System.out.println("       Second hand value of your bike is="+(int)(87547-total)); 
    }
  else if(m.equalsIgnoreCase("Gladiator")==true)
  { 
    double amt1=Year(y,53113);
    double amt2=kmd(d,53113);
    double amt3=condition(c,53113);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Gladiator  ");
    System.out.println("       Second hand value of your bike is="+(int)(53113-total)); 
    }
  else if(m.equalsIgnoreCase("Gladiator")==true)
  { 
    double amt1=Year(y,53113);
    double amt2=kmd(d,53113);
    double amt3=condition(c,53113);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Gladiator  ");
    System.out.println("       Second hand value of your bike is="+(int)(53113-total)); 
    }
 else if(m.equalsIgnoreCase("Libero G5")==true)
  { 
    double amt1=Year(y,40000);
    double amt2=kmd(d,40000);
    double amt3=condition(c,40000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Libero G5  ");
    System.out.println("       Second hand value of your bike is="+(int)(40000-total)); 
    }
 else if(m.equalsIgnoreCase("MT-09")==true)
  { 
    double amt1=Year(y,1089000);
    double amt2=kmd(d,1089000);
    double amt3=condition(c,1089000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - MT09  ");
    System.out.println("       Second hand value of your bike is="+(int)(1089000-total)); 
    }
  else if(m.equalsIgnoreCase("Rx135")==true)
  { 
    double amt1=Year(y,36200);
    double amt2=kmd(d,36200);
    double amt3=condition(c,36200);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Rx135  ");
    System.out.println("       Second hand value of your bike is="+(int)(36200-total)); 
    }
  else if(m.equalsIgnoreCase("Rx100")==true)
  { 
    double amt1=Year(y,18000);
    double amt2=kmd(d,18000);
    double amt3=condition(c,18000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Rx100  ");
    System.out.println("       Second hand value of your bike is="+(int)(18000-total)); 
    }
  if(m.equalsIgnoreCase("Saluto")==true)
  { 
    double amt1=Year(y,60700);
    double amt2=kmd(d,60700);
    double amt3=condition(c,60700);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Saluto  ");
    System.out.println("       Second hand value of your bike is="+(int)(60700-total)); 
    }
 else if(m.equalsIgnoreCase("SS125")==true)
  { 
    double amt1=Year(y,57522);
    double amt2=kmd(d,57522);
    double amt3=condition(c,57522);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - SS125  ");
    System.out.println("       Second hand value of your bike is="+(int)(57522-total)); 
    }
  else if(m.equalsIgnoreCase("Szrr")==true)
  { 
    double amt1=Year(y,70308);
    double amt2=kmd(d,70308);
    double amt3=condition(c,70308);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Sz rr  ");
    System.out.println("       Second hand value of your bike is="+(int)(70308-total)); 
    }
  else if(m.equalsIgnoreCase("Szs")==true)
  { 
    double amt1=Year(y,72532);
    double amt2=kmd(d,72532);
    double amt3=condition(c,72532);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Sz s  ");
    System.out.println("       Second hand value of your bike is="+(int)(72532-total)); 
    }
  else if(m.equalsIgnoreCase("Szx")==true)
  { 
    double amt1=Year(y,65800);
    double amt2=kmd(d,65800);
    double amt3=condition(c,65800);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Sz x  ");
    System.out.println("       Second hand value of your bike is="+(int)(65800-total)); 
    }
 else if(m.equalsIgnoreCase("Vmax")==true)
  { 
    double amt1=Year(y,2835200);
    double amt2=kmd(d,2835200);
    double amt3=condition(c,2835200);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - Vmax  ");
    System.out.println("       Second hand value of your bike is="+(int)(2835200-total)); 
    }
  else if(m.equalsIgnoreCase("YBR")==true)
 {System.out.println("Enter how much cc engine it is having");
   int trim=in.nextInt();
   if(trim==125) 
  {
    double amt1=Year(y,54593);
    double amt2=kmd(d,54593);
    double amt3=condition(c,54593);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - VBR 125  ");
    System.out.println("       Second hand value of your bike is="+(int)(54593-total)); 
    }
  else if(trim==110)
  { 
    double amt1=Year(y,48218);
    double amt2=kmd(d,48218);
    double amt3=condition(c,48218);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - VBR 110  ");
    System.out.println("       Second hand value of your bike is="+(int)(48218-total));
  }
 }
 
  else if(m.equalsIgnoreCase("YZFR6")==true)
  { 
    double amt1=Year(y,1300000);
    double amt2=kmd(d,1300000);
    double amt3=condition(c,1300000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - YZF R6  ");
    System.out.println("       Second hand value of your bike is="+(int)(1300000-total)); 
    }
  else if(m.equalsIgnoreCase("YZFR1")==true)
  { 
    double amt1=Year(y,1816192);
    double amt2=kmd(d,1816192);
    double amt3=condition(c,1816192);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - YZF R1  ");
    System.out.println("       Second hand value of your bike is="+(int)(1816192-total)); 
    }
  else if(m.equalsIgnoreCase("YZFR15")==true)
  { 
    double amt1=Year(y,120343);
    double amt2=kmd(d,120343);
    double amt3=condition(c,120343);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - YZF R15  ");
    System.out.println("       Second hand value of your bike is="+(int)(120343-total)); 
    }
  else if(m.equalsIgnoreCase("YZFR152.0")==true)
  { 
    double amt1=Year(y,126000);
    double amt2=kmd(d,126000);
    double amt3=condition(c,126000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - YZF R15 2.0  ");
    System.out.println("       Second hand value of your bike is="+(int)(126000-total)); 
    }
  else if(m.equalsIgnoreCase("YZF R15 S")==true)
  { 
    double amt1=Year(y,117251);
    double amt2=kmd(d,117251);
    double amt3=condition(c,117251);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - YZF R15 S  ");
    System.out.println("       Second hand value of your bike is="+(int)(117251-total)); 
    }
  else if(m.equalsIgnoreCase("YZFR15v3")==true)
  { 
    double amt1=Year(y,128000);
    double amt2=kmd(d,128000);
    double amt3=condition(c,128000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - YZF R15 v3  ");
    System.out.println("       Second hand value of your bike is="+(int)(128000-total)); 
    }
  else if(m.equalsIgnoreCase("YZFR1M")==true)
  { 
    double amt1=Year(y,2861712);
    double amt2=kmd(d,2861712);
    double amt3=condition(c,2861712);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - YZF R1M  ");
    System.out.println("       Second hand value of your bike is="+(int)(2861712-total)); 
    }
   else if(m.equalsIgnoreCase("YZFR3")==true)
  { 
    double amt1=Year(y,349505);
    double amt2=kmd(d,349505);
    double amt3=condition(c,349505);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Yamaha");System.out.println("    Bike name - YZF R3  ");
    System.out.println("       Second hand value of your bike is="+(int)(349505-total)); 
    }
  break;
  case 5:
  System.out.println("Enter the name of your KTM bike");double dam;String cat;
  String m1=in.next();int y1;System.out.println("Enter the year when your bought the bike");
  y1=in.nextInt();System.out.println("Enter the total distance your have travelled using this bike");dam=in.nextDouble();
  System.out.println("Enter the condition of your bike as'EXCELLENT','GOOD','VERY GOOD'and 'FAIR'"); cat=in.next();
    if(m1.equalsIgnoreCase("Duke")==true)
 { 
   System.out.println("Enter how much cc engine it is having");
   int trim=in.nextInt();
   if(trim==200)
  {
    double amt1=Year(y1,153000);
    double amt2=kmd(dam,153000);
    double amt3=condition(cat,153000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-KTM");System.out.println("    Bike name - Duke 200 ");
    System.out.println("       Second hand value of your bike is="+(int)(153000-total)); 
    }
 else if(trim==250)
  {
    double amt1=Year(y1,174000);
    double amt2=kmd(dam,174000);
    double amt3=condition(cat,174000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-KTM");System.out.println("    Bike name - Duke 250 ");
    System.out.println("       Second hand value of your bike is="+(int)(174000-total)); 
    }
  else if(trim==390)
  {
    double amt1=Year(y1,226000);
    double amt2=kmd(dam,226000);
    double amt3=condition(cat,226000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-KTM");System.out.println("    Bike name - Duke 390 ");
    System.out.println("       Second hand value of your bike is="+(int)(226000-total)); 
    }
  }
   else if(m1.equalsIgnoreCase("Rc")==true)
  { 
   System.out.println("Enter how much cc engine it is having");
   int trim=in.nextInt();
  if(trim==200)
  {
    double amt1=Year(y1,171000);
    double amt2=kmd(dam,171000);
    double amt3=condition(cat,171000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-KTM");System.out.println("    Bike name - Rc 200 ");
    System.out.println("       Second hand value of your bike is="+(int)(171000-total)); 
    }
  else if(trim==390)
  {
    double amt1=Year(y1,227000);
    double amt2=kmd(dam,227000);
    double amt3=condition(cat,227000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-KTM");System.out.println("    Bike name - Rc 390 ");
    System.out.println("       Second hand value of your bike is="+(int)(227000-total)); 
    }
 }
 else if(m1.equalsIgnoreCase("Rc8R")==true)
  { 
    double amt1=Year(y1,2000000);
    double amt2=kmd(dam,2000000);
    double amt3=condition(cat,2000000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-KTM");System.out.println("    Bike name - Rc8 R ");
    System.out.println("       Second hand value of your bike is="+(int)(2000000-total)); 
    }
 break;
 
  default : System.out.println("Syntax Erro!!!!!!");
 }   
  break;
 case 2: System.out.println("We include 2nd hand value only of these listed brands-");
 System.out.println("Hyundai,Tata,Honda,Toyota and Mahindra");
 System.out.println("Please Enter '1'if the company is Honda ,'2' if the company is Tata,'3' if the company is Hyundai,");
 System.out.println("'4' if the company is Toyota and '5' if the company is Mahindra");
 short jb=in.nextShort();
  switch(jb)
   {
  case 1:System.out.println("Enter the name of your Honda car");double dam;String cat;
  String mo=in.next();int yo;System.out.println("Enter the year when your bought the car");
  yo=in.nextInt();System.out.println("Enter the total distance your have travelled using this car");dam=in.nextDouble();
  System.out.println("Enter the condition of your car as'EXCELLENT','GOOD','VERY GOOD'and 'FAIR'"); cat=in.next();
  if(mo.equalsIgnoreCase("Accord")==true)
  { 
    double amt1=Year(yo,3700000);
    double amt2=kmd(dam,3700000);
    double amt3=condition(cat,3700000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Car name - Accord ");
    System.out.println("       Second hand value of your car is="+(int)(3700000-total)); 
    }
  else if(mo.equalsIgnoreCase("Amaze")==true)
  { 
    double amt1=Year(yo,650000);
    double amt2=kmd(dam,650000);
    double amt3=condition(cat,650000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Car name - Amaze ");
    System.out.println("       Second hand value of your car is="+(int)(650000-total)); 
    }
  else if(mo.equalsIgnoreCase("Br-v")==true)
  { 
    double amt1=Year(yo,1050000);
    double amt2=kmd(dam,1050000);
    double amt3=condition(cat,1050000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Car name - Br-v ");
    System.out.println("       Second hand value of your car is="+(int)(1050000-total)); 
    }
  else if(mo.equalsIgnoreCase("Brio")==true)
  { 
    double amt1=Year(yo,587000);
    double amt2=kmd(dam,587000);
    double amt3=condition(cat,587000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Car name - Brio ");
    System.out.println("       Second hand value of your car is="+(int)(587000-total)); 
    }
  else if(mo.equalsIgnoreCase("City")==true)
  { 
    double amt1=Year(yo,1240000);
    double amt2=kmd(dam,1240000);
    double amt3=condition(cat,1240000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Car name - City ");
    System.out.println("       Second hand value of your car is="+(int)(1240000-total)); 
    }
  else if(mo.equalsIgnoreCase("Cityzx")==true)
  { 
    double amt1=Year(yo,1376000);
    double amt2=kmd(dam,1376000);
    double amt3=condition(cat,1376000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Car name - City zx");
    System.out.println("       Second hand value of your car is="+(int)(1376000-total)); 
    }
  else if(mo.equalsIgnoreCase("Civic")==true)
  { 
    double amt1=Year(yo,1405000);
    double amt2=kmd(dam,1405000);
    double amt3=condition(cat,1405000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Car name - Civic");
    System.out.println("       Second hand value of your car is="+(int)(1405000-total)); 
    }
  else if(mo.equalsIgnoreCase("CivicHybrid")==true)
  { 
    double amt1=Year(yo,1500000);
    double amt2=kmd(dam,1500000);
    double amt3=condition(cat,1500000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Car name - Civic Hybrid");
    System.out.println("       Second hand value of your car is="+(int)(1500000-total)); 
    }
  else if(mo.equalsIgnoreCase("Cr-V")==true)
  { 
    double amt1=Year(yo,3275000);
    double amt2=kmd(dam,3275000);
    double amt3=condition(cat,3275000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Car name - Cr-V");
    System.out.println("       Second hand value of your car is="+(int)(3275000-total)); 
    }
  else if(mo.equalsIgnoreCase("Jazz")==true)
  { 
    double amt1=Year(yo,850000);
    double amt2=kmd(dam,850000);
    double amt3=condition(cat,850000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Car name - Jazz");
    System.out.println("       Second hand value of your car is="+(int)(850000-total)); 
    }
  else if(mo.equalsIgnoreCase("Wr-V")==true)
  { 
    double amt1=Year(yo,1000000);
    double amt2=kmd(dam,1000000);
    double amt3=condition(cat,1000000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Honda");System.out.println("    Car name - Wr-V");
    System.out.println("       Second hand value of your car is="+(int)(1000000-total)); 
    }
 break; 	
case 2:System.out.println("Enter the name of your TATA car");double dan;String cam;
  String mg=in.next();int yp;System.out.println("Enter the year when your bought the car");
  yp=in.nextInt();System.out.println("Enter the total distance your have travelled using this car");dan=in.nextDouble();
  System.out.println("Enter the condition of your car as'EXCELLENT','GOOD','VERY GOOD'and 'FAIR'"); cam=in.next();
 if(mg.equalsIgnoreCase("45x")==true)
  { 
    double amt1=Year(yp,700000);
    double amt2=kmd(dan,700000);
    double amt3=condition(cam,700000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - 45x ");
    System.out.println("       Second hand value of your car is="+(int)(700000-total)); 
    }
  else if(mg.equalsIgnoreCase("Ace")==true)
  { 
    double amt1=Year(yp,403000);
    double amt2=kmd(dan,403000);
    double amt3=condition(cam,403000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Ace");
    System.out.println("       Second hand value of your car is="+(int)(403000-total)); 
    }
  else if(mg.equalsIgnoreCase("Aria")==true)
  { 
    double amt1=Year(yp,1626000);
    double amt2=kmd(dan,1626000);
    double amt3=condition(cam,1626000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Aria");
    System.out.println("       Second hand value of your car is="+(int)(1626000-total)); 
    }
  else if(mg.equalsIgnoreCase("Bolt")==true)
  { 
    double amt1=Year(yp,700000);
    double amt2=kmd(dan,700000);
    double amt3=condition(cam,700000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Bolt");
    System.out.println("       Second hand value of your car is="+(int)(700000-total)); 
    }
  else if(mg.equalsIgnoreCase("Estate")==true)
  { 
    double amt1=Year(yp,708000);
    double amt2=kmd(dan,708000);
    double amt3=condition(cam,708000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Estate");
    System.out.println("       Second hand value of your car is="+(int)(708000-total)); 
    }
  else if(mg.equalsIgnoreCase("Harrier")==true)
  { 
    double amt1=Year(yp,913000);
    double amt2=kmd(dan,913000);
    double amt3=condition(cam,913000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Harrier");
    System.out.println("       Second hand value of your car is="+(int)(913000-total)); 
    }
  else if(mg.equalsIgnoreCase("H5X")==true)
  { 
    double amt1=Year(yp,1500000);
    double amt2=kmd(dan,1500000);
    double amt3=condition(cam,1500000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - H5X");
    System.out.println("       Second hand value of your car is="+(int)(1500000-total)); 
    }
  else if(mg.equalsIgnoreCase("Hexa")==true)
  { 
    double amt1=Year(yp,1797000);
    double amt2=kmd(dan,1797000);
    double amt3=condition(cam,1797000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Hexa");
    System.out.println("       Second hand value of your car is="+(int)(1797000-total)); 
    }
  else if(mg.equalsIgnoreCase("Indica")==true)
  { 
    double amt1=Year(yp,580000);
    double amt2=kmd(dan,580000);
    double amt3=condition(cam,580000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Indica");
    System.out.println("       Second hand value of your car is="+(int)(580000-total)); 
    }
  else if(mg.equalsIgnoreCase("Indica V2 Turbo")==true)
  { 
    double amt1=Year(yp,580000);
    double amt2=kmd(dan,580000);
    double amt3=condition(cam,580000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Indica V2 Turbo");
    System.out.println("       Second hand value of your car is="+(int)(580000-total)); 
    }
  else if(mg.equalsIgnoreCase("Indica Vista")==true)
  { 
    double amt1=Year(yp,491000);
    double amt2=kmd(dan,491000);
    double amt3=condition(cam,491000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Indica Vista");
    System.out.println("       Second hand value of your car is="+(int)(491000-total)); 
    }
  else if(mg.equalsIgnoreCase("Indigo")==true)
  { 
    double amt1=Year(yp,628000);
    double amt2=kmd(dan,628000);
    double amt3=condition(cam,628000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Indigo");
    System.out.println("       Second hand value of your car is="+(int)(628000-total)); 
    }
   else if(mg.equalsIgnoreCase("Indigo Marina")==true)
  { 
    double amt1=Year(yp,533000);
    double amt2=kmd(dan,533000);
    double amt3=condition(cam,533000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Indigo Marina");
    System.out.println("       Second hand value of your car is="+(int)(533000-total)); 
    }
   else if(mg.equalsIgnoreCase("Magic")==true)
  { 
    double amt1=Year(yp,450000);
    double amt2=kmd(dan,450000);
    double amt3=condition(cam,450000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Magic");
    System.out.println("       Second hand value of your car is="+(int)(450000-total)); 
    }
  else if(mg.equalsIgnoreCase("Manza")==true)
  { 
    double amt1=Year(yp,701000);
    double amt2=kmd(dan,701000);
    double amt3=condition(cam,701000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Manza");
    System.out.println("       Second hand value of your car is="+(int)(701000-total)); 
    }
   else if(mg.equalsIgnoreCase("Movus")==true)
  { 
    double amt1=Year(yp,805000);
    double amt2=kmd(dan,805000);
    double amt3=condition(cam,805000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Movus");
    System.out.println("       Second hand value of your car is="+(int)(805000-total)); 
    }
  else if(mg.equalsIgnoreCase("Nano")==true)
  { 
    double amt1=Year(yp,293000);
    double amt2=kmd(dan,293000);
    double amt3=condition(cam,293000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Nano");
    System.out.println("       Second hand value of your car is="+(int)(293000-total)); 
    }
  else if(mg.equalsIgnoreCase("Safari")==true)
  { 
    double amt1=Year(yp,1367000);
    double amt2=kmd(dan,1367000);
    double amt3=condition(cam,1367000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Safari");
    System.out.println("       Second hand value of your car is="+(int)(1367000-total)); 
    }
  else if(mg.equalsIgnoreCase("SafariDicor")==true)
  { 
    double amt1=Year(yp,1491000);
    double amt2=kmd(dan,1491000);
    double amt3=condition(cam,1491000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Safari Dicor");
    System.out.println("       Second hand value of your car is="+(int)(1491000-total)); 
    }
   else if(mg.equalsIgnoreCase("SafariStorme")==true)
  { 
    double amt1=Year(yp,1563000);
    double amt2=kmd(dan,1563000);
    double amt3=condition(cam,1563000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Safari Storme");
    System.out.println("       Second hand value of your car is="+(int)(1563000-total)); 
    }
  else if(mg.equalsIgnoreCase("Sierra")==true)
  { 
    double amt1=Year(yp,563000);
    double amt2=kmd(dan,563000);
    double amt3=condition(cam,563000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Sierra");
    System.out.println("       Second hand value of your car is="+(int)(563000-total)); 
    }
  else if(mg.equalsIgnoreCase("Sumo")==true)
  { 
    double amt1=Year(yp,570000);
    double amt2=kmd(dan,570000);
    double amt3=condition(cam,570000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Sumo");
    System.out.println("       Second hand value of your car is="+(int)(570000-total)); 
    }
  else if(mg.equalsIgnoreCase("SumoGold")==true)
  { 
    double amt1=Year(yp,750000);
    double amt2=kmd(dan,750000);
    double amt3=condition(cam,750000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Sumo Gold");
    System.out.println("       Second hand value of your car is="+(int)(750000-total)); 
    }
  else if(mg.equalsIgnoreCase("SumoGrande")==true)
  { 
    double amt1=Year(yp,913000);
    double amt2=kmd(dan,913000);
    double amt3=condition(cam,913000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Sumo Grande");
    System.out.println("       Second hand value of your car is="+(int)(913000-total)); 
    }
  else if(mg.equalsIgnoreCase("Tiago")==true)
  { 
    double amt1=Year(yp,605000);
    double amt2=kmd(dan,605000);
    double amt3=condition(cam,605000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Tiago");
    System.out.println("       Second hand value of your car is="+(int)(605000-total)); 
    }
  else if(mg.equalsIgnoreCase("Tigor")==true)
  { 
    double amt1=Year(yp,738000);
    double amt2=kmd(dan,738000);
    double amt3=condition(cam,738000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Tigor");
    System.out.println("       Second hand value of your car is="+(int)(738000-total)); 
    }
  else if(mg.equalsIgnoreCase("Tl")==true)
  { 
    double amt1=Year(yp,650000);
    double amt2=kmd(dan,650000);
    double amt3=condition(cam,650000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Tl");
    System.out.println("       Second hand value of your car is="+(int)(650000-total)); 
    }
  else if(mg.equalsIgnoreCase("Venture")==true)
  { 
    double amt1=Year(yp,554000);
    double amt2=kmd(dan,554000);
    double amt3=condition(cam,554000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Venture");
    System.out.println("       Second hand value of your car is="+(int)(554000-total)); 
    }
  else if(mg.equalsIgnoreCase("Winger")==true)
  { 
    double amt1=Year(yp,756000);
    double amt2=kmd(dan,756000);
    double amt3=condition(cam,756000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Winger");
    System.out.println("       Second hand value of your car is="+(int)(756000-total)); 
    }
  else if(mg.equalsIgnoreCase("XenonXT")==true)
  { 
    double amt1=Year(yp,1100000);
    double amt2=kmd(dan,1100000);
    double amt3=condition(cam,1100000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Xenon XT");
    System.out.println("       Second hand value of your car is="+(int)(1100000-total)); 
    }
  else if(mg.equalsIgnoreCase("Zest")==true)
  { 
    double amt1=Year(yp,897000);
    double amt2=kmd(dan,897000);
    double amt3=condition(cam,897000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-TATA");System.out.println("    Car name - Zest");
    System.out.println("       Second hand value of your bike is="+(int)(897000-total)); 
    }
 break;
 case 3:System.out.println("Enter the name of your Hyundai car");double dad;String cab;
  String meg=in.next();int yup;System.out.println("Enter the year when your bought the car");
  yup=in.nextInt();System.out.println("Enter the total distance your have travelled using this car");dad=in.nextDouble();
  System.out.println("Enter the condition of your car as'EXCELLENT','GOOD','VERY GOOD'and 'FAIR'"); cab=in.next();
  if(meg.equalsIgnoreCase("Accent")==true)
  { 
    double amt1=Year(yup,598000);
    double amt2=kmd(dad,598000);
    double amt3=condition(cab,598000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Accent");
    System.out.println("       Second hand value of your car is="+(int)(598000-total)); 
    }
  else if(meg.equalsIgnoreCase("Creta")==true)
  { 
    double amt1=Year(yup,1200000);
    double amt2=kmd(dad,1200000);
    double amt3=condition(cab,1200000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Creta");
    System.out.println("       Second hand value of your car is="+(int)(1200000-total)); 
    }
  else if(meg.equalsIgnoreCase("Elantra")==true)
  { 
    double amt1=Year(yup,1400000);
    double amt2=kmd(dad,1400000);
    double amt3=condition(cab,1400000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Elantra");
    System.out.println("       Second hand value of your car is="+(int)(1400000-total)); 
    }
  else if(meg.equalsIgnoreCase("Elite120")==true)
  { 
    double amt1=Year(yup,791000);
    double amt2=kmd(dad,791000);
    double amt3=condition(cab,791000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Elite 120");
    System.out.println("       Second hand value of your car is="+(int)(791000-total)); 
    }
  else if(meg.equalsIgnoreCase("Eon")==true)
  { 
    double amt1=Year(yup,473000);
    double amt2=kmd(dad,473000);
    double amt3=condition(cab,473000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Eon");
    System.out.println("       Second hand value of your car is="+(int)(473000-total)); 
    }
  else if(meg.equalsIgnoreCase("Getz")==true)
  { 
    double amt1=Year(yup,459000);
    double amt2=kmd(dad,459000);
    double amt3=condition(cab,459000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Getz");
    System.out.println("       Second hand value of your car is="+(int)(459000-total)); 
    }
  else if(meg.equalsIgnoreCase("i10")==true)
  { 
    double amt1=Year(yup,488000);
    double amt2=kmd(dad,488000);
    double amt3=condition(cab,488000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - i10");
    System.out.println("       Second hand value of your car is="+(int)(488000-total)); 
    }
  else if(meg.equalsIgnoreCase("Grandei10")==true)
  { 
    double amt1=Year(yup,694000);
    double amt2=kmd(dad,694000);
    double amt3=condition(cab,694000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Grande i10");
    System.out.println("       Second hand value of your car is="+(int)(694000-total)); 
    }
  else if(meg.equalsIgnoreCase("i20")==true)
  { 
    double amt1=Year(yup,840000);
    double amt2=kmd(dad,840000);
    double amt3=condition(cab,840000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - i20");
    System.out.println("       Second hand value of your car is="+(int)(840000-total)); 
    }
  else if(meg.equalsIgnoreCase("i20Active")==true)
  { 
    double amt1=Year(yup,889000);
    double amt2=kmd(dad,889000);
    double amt3=condition(cab,889000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - i20 Active");
    System.out.println("       Second hand value of your car is="+(int)(889000-total)); 
    }
  else if(meg.equalsIgnoreCase("SanatFe")==true)
  { 
    double amt1=Year(yup,3174000);
    double amt2=kmd(dad,3174000);
    double amt3=condition(cab,3174000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Santa Fe");
    System.out.println("       Second hand value of your car is="+(int)(3174000-total)); 
    }
  else if(meg.equalsIgnoreCase("Santro")==true)
  { 
    double amt1=Year(yup,390000);
    double amt2=kmd(dad,390000);
    double amt3=condition(cab,390000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Santro");
    System.out.println("       Second hand value of your car is="+(int)(390000-total)); 
    }
  else if(meg.equalsIgnoreCase("SantroXing")==true)
  { 
    double amt1=Year(yup,369000);
    double amt2=kmd(dad,369000);
    double amt3=condition(cab,369000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Santro Xing");
    System.out.println("       Second hand value of your car is="+(int)(369000-total)); 
    }
  else if(meg.equalsIgnoreCase("Sonata")==true)
  { 
    double amt1=Year(yup,2077000);
    double amt2=kmd(dad,2077000);
    double amt3=condition(cab,2077000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Sonata");
    System.out.println("       Second hand value of your car is="+(int)(2077000-total)); 
    }
  else if(meg.equalsIgnoreCase("SonataEmbera")==true)
  { 
    double amt1=Year(yup,1377000);
    double amt2=kmd(dad,1377000);
    double amt3=condition(cab,1377000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Sonata Embera");
    System.out.println("       Second hand value of your car is="+(int)(1377000-total)); 
    }
  else if(meg.equalsIgnoreCase("SonatTransform")==true)
  { 
    double amt1=Year(yup,1623000);
    double amt2=kmd(dad,1623000);
    double amt3=condition(cab,1623000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Sonato Transform");
    System.out.println("       Second hand value of your car is="+(int)(1623000-total)); 
    }
  else if(meg.equalsIgnoreCase("Terracan")==true)
  { 
    double amt1=Year(yup,2500000);
    double amt2=kmd(dad,2500000);
    double amt3=condition(cab,2500000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Terracan");
    System.out.println("       Second hand value of your car is="+(int)(2500000-total)); 
    }
  else if(meg.equalsIgnoreCase("Tuscon")==true)
  { 
    double amt1=Year(yup,2574000);
    double amt2=kmd(dad,2574000);
    double amt3=condition(cab,2574000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Tuscon");
    System.out.println("       Second hand value of your car is="+(int)(2574000-total)); 
    }
  else if(meg.equalsIgnoreCase("Verna")==true)
  { 
    double amt1=Year(yup,1305000);
    double amt2=kmd(dad,1305000);
    double amt3=condition(cab,1305000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Verna");
    System.out.println("       Second hand value of your car is="+(int)(1305000-total)); 
    }
  else if(meg.equalsIgnoreCase("Xcent")==true)
  { 
    double amt1=Year(yup,858000);
    double amt2=kmd(dad,858000);
    double amt3=condition(cab,858000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Hyundai");System.out.println("    Car name - Xcent");
    System.out.println("       Second hand value of your car is="+(int)(858000-total)); 
    }
 break;
 case 4:System.out.println("Enter the name of your Toyota car");double das;String cas;
  String mag=in.next();int yop;System.out.println("Enter the year when your bought the car");
  yop=in.nextInt();System.out.println("Enter the total distance your have travelled using this car");das=in.nextDouble();
  System.out.println("Enter the condition of your car as'EXCELLENT','GOOD','VERY GOOD'and 'FAIR'"); cas=in.next();
  if(mag.equalsIgnoreCase("Alphard")==true)
  { 
    double amt1=Year(yop,4500000);
    double amt2=kmd(das,4500000);
    double amt3=condition(cas,4500000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Alphard");
    System.out.println("       Second hand value of your car is="+(int)(4500000-total)); 
    }
  else if(mag.equalsIgnoreCase("Camry")==true)
  {
    double amt1=Year(yop,3789000);
    double amt2=kmd(das,3789000);
    double amt3=condition(cas,3789000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Alphard");
    System.out.println("       Second hand value of your car is="+(int)(3789000-total)); 
    }
  else if(mag.equalsIgnoreCase("CorollaAltis")==true)
  {
    double amt1=Year(yop,2000000);
    double amt2=kmd(das,2000000);
    double amt3=condition(cas,2000000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Corrola Altis");
    System.out.println("       Second hand value of your car is="+(int)(2000000-total)); 
    }
  else if(mag.equalsIgnoreCase("Corona")==true)
  {
    double amt1=Year(yop,525000);
    double amt2=kmd(das,525000);
    double amt3=condition(cas,525000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Corona");
    System.out.println("       Second hand value of your car is="+(int)(525000-total)); 
    }
  else if(mag.equalsIgnoreCase("Crown")==true)
  {
    double amt1=Year(yop,1014000);
    double amt2=kmd(das,1014000);
    double amt3=condition(cas,1014000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Crown");
    System.out.println("       Second hand value of your car is="+(int)(1014000-total)); 
    }
  else if(mag.equalsIgnoreCase("Etios")==true)
  {
    double amt1=Year(yop,894000);
    double amt2=kmd(das,894000);
    double amt3=condition(cas,894000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Etios");
    System.out.println("       Second hand value of your car is="+(int)(894000-total)); 
    }
  else if(mag.equalsIgnoreCase("EtiosCross")==true)
  {
    double amt1=Year(yop,899000);
    double amt2=kmd(das,899000);
    double amt3=condition(cas,899000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Etios Cross");
    System.out.println("       Second hand value of your car is="+(int)(899000-total)); 
    }
  else if(mag.equalsIgnoreCase("EtiosLiva")==true)
  {
    double amt1=Year(yop,691000);
    double amt2=kmd(das,691000);
    double amt3=condition(cas,691000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Etios Liva");
    System.out.println("       Second hand value of your car is="+(int)(691000-total)); 
    }
  else if(mag.equalsIgnoreCase("Fortuner")==true)
  {
    double amt1=Year(yop,3297000);
    double amt2=kmd(das,3297000);
    double amt3=condition(cas,3297000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Fortuner");
    System.out.println("       Second hand value of your car is="+(int)(3297000-total)); 
    }
  else if(mag.equalsIgnoreCase("Hiace")==true)
  {
    double amt1=Year(yop,4000000);
    double amt2=kmd(das,4000000);
    double amt3=condition(cas,4000000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Hiace");
    System.out.println("       Second hand value of your car is="+(int)(4000000-total)); 
    }
  else if(mag.equalsIgnoreCase("Innova")==true)
  {
    double amt1=Year(yop,1384000);
    double amt2=kmd(das,1384000);
    double amt3=condition(cas,1384000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Innova");
    System.out.println("       Second hand value of your car is="+(int)(1384000-total)); 
    }
  else if(mag.equalsIgnoreCase("InnovaCrysta")==true)
  {
    double amt1=Year(yop,2306000);
    double amt2=kmd(das,2306000);
    double amt3=condition(cas,2306000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Innova Crysta");
    System.out.println("       Second hand value of your car is="+(int)(2306000-total)); 
    }
  else if(mag.equalsIgnoreCase("LandCruiser")==true)
  {
    double amt1=Year(yop,14100000);
    double amt2=kmd(das,14100000);
    double amt3=condition(cas,14100000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Land Cruiser");
    System.out.println("       Second hand value of your car is="+(int)(14100000-total)); 
    }
  else if(mag.equalsIgnoreCase("LandCruiser200")==true)
  {
    double amt1=Year(yop,12900000);
    double amt2=kmd(das,12900000);
    double amt3=condition(cas,12900000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Land Cruiser 200");
    System.out.println("       Second hand value of your car is="+(int)(12900000-total)); 
    }
  else if(mag.equalsIgnoreCase("LandCruiserPrado")==true)
  {
    double amt1=Year(yop,9260000);
    double amt2=kmd(das,9260000);
    double amt3=condition(cas,9260000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Land Cruiser Prado");
    System.out.println("       Second hand value of your car is="+(int)(9260000-total)); 
    }
  else if(mag.equalsIgnoreCase("PlatinumEtios")==true)
  {
    double amt1=Year(yop,894000);
    double amt2=kmd(das,894000);
    double amt3=condition(cas,894000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Platinum Etios");
    System.out.println("       Second hand value of your car is="+(int)(894000-total)); 
    }
  else if(mag.equalsIgnoreCase("Prius")==true)
  {
    double amt1=Year(yop,4451000);
    double amt2=kmd(das,4451000);
    double amt3=condition(cas,4451000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Prius");
    System.out.println("       Second hand value of your car is="+(int)(4451000-total)); 
    }
  else if(mag.equalsIgnoreCase("Qualis")==true)
  {
    double amt1=Year(yop,719000);
    double amt2=kmd(das,719000);
    double amt3=condition(cas,719000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Qualis");
    System.out.println("       Second hand value of your car is="+(int)(719000-total)); 
    }
  else if(mag.equalsIgnoreCase("Yaris")==true)
  {
    double amt1=Year(yop,1407000);
    double amt2=kmd(das,1407000);
    double amt3=condition(cas,1407000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Toyota");System.out.println("    Car name - Yaris");
    System.out.println("       Second hand value of your car is="+(int)(1407000-total)); 
    }
 break;
 case 5:System.out.println("Enter the name of your Mahindra car");double dj;String cj;
  String ma=in.next();int yep;System.out.println("Enter the year when your bought the car");
  yep=in.nextInt();System.out.println("Enter the total distance your have travelled using this car");dj=in.nextDouble();
  System.out.println("Enter the condition of your car as'EXCELLENT','GOOD','VERY GOOD'and 'FAIR'"); cj=in.next();
  if(ma.equalsIgnoreCase("Bolero")==true)
  {
    double amt1=Year(yep,912000);
    double amt2=kmd(dj,912000);
    double amt3=condition(cj,912000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - Bolero");
    System.out.println("       Second hand value of your car is="+(int)(912000-total)); 
    }
  else if(ma.equalsIgnoreCase("EVerito")==true)
  {
    double amt1=Year(yep,1000000);
    double amt2=kmd(dj,1000000);
    double amt3=condition(cj,1000000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - E Verito");
    System.out.println("       Second hand value of your car is="+(int)(1000000-total)); 
    }
  else if(ma.equalsIgnoreCase("E20")==true)
  {
    double amt1=Year(yep,571000);
    double amt2=kmd(dj,571000);
    double amt3=condition(cj,571000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - E20");
    System.out.println("       Second hand value of your car is="+(int)(571000-total)); 
    }
  else if(ma.equalsIgnoreCase("Jeep")==true)
  {
    double amt1=Year(yep,651000);
    double amt2=kmd(dj,651000);
    double amt3=condition(cj,651000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - Jeep");
    System.out.println("       Second hand value of your car is="+(int)(651000-total)); 
    }
  else if(ma.equalsIgnoreCase("KUV100")==true)
  {
    double amt1=Year(yep,769000);
    double amt2=kmd(dj,769000);
    double amt3=condition(cj,769000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - KUV 100");
    System.out.println("       Second hand value of your car is="+(int)(769000-total)); 
    }
  else if(ma.equalsIgnoreCase("Marazzo")==true)
  {
    double amt1=Year(yep,1390000);
    double amt2=kmd(dj,1390000);
    double amt3=condition(cj,1390000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - Marazzo");
    System.out.println("       Second hand value of your car is="+(int)(1390000-total)); 
    }
  else if(ma.equalsIgnoreCase("Marshal")==true)
  {
    double amt1=Year(yep,620000);
    double amt2=kmd(dj,620000);
    double amt3=condition(cj,620000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - Marshal");
    System.out.println("       Second hand value of your car is="+(int)(620000-total)); 
    }
  else if(ma.equalsIgnoreCase("NuvoSport")==true)
  {
    double amt1=Year(yep,1026000);
    double amt2=kmd(dj,1026000);
    double amt3=condition(cj,1026000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - NuvoSport");
    System.out.println("       Second hand value of your car is="+(int)(1026000-total)); 
    }
  else if(ma.equalsIgnoreCase("Quanto")==true)
  {
    double amt1=Year(yep,856000);
    double amt2=kmd(dj,856000);
    double amt3=condition(cj,856000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - NuvoSport");
    System.out.println("       Second hand value of your car  is="+(int)(856000-total)); 
    }
  else if(ma.equalsIgnoreCase("Reva")==true)
  {
    double amt1=Year(yep,571000);
    double amt2=kmd(dj,571000);
    double amt3=condition(cj,571000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - Reva");
    System.out.println("       Second hand value of your car is="+(int)(571000-total)); 
    }
  else if(ma.equalsIgnoreCase("Scorpio")==true)
  {
    double amt1=Year(yep,1639000);
    double amt2=kmd(dj,1639000);
    double amt3=condition(cj,1639000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - Scorpio");
    System.out.println("       Second hand value of your car is="+(int)(1639000-total)); 
    }
  else if(ma.equalsIgnoreCase("ScorpioGetaway")==true)
  {
    double amt1=Year(yep,1639000);
    double amt2=kmd(dj,1639000);
    double amt3=condition(cj,1639000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - Scorpio Getaway");
    System.out.println("       Second hand value of your car is="+(int)(1639000-total)); 
    }
  else if(ma.equalsIgnoreCase("ScorpioTurbo")==true)
  {
    double amt1=Year(yep,1196000);
    double amt2=kmd(dj,1196000);
    double amt3=condition(cj,1196000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - Scorpio Turbo");
    System.out.println("       Second hand value of your car is="+(int)(1196000-total)); 
    }
   else if(ma.equalsIgnoreCase("Thar")==true)
  {
    double amt1=Year(yep,910000);
    double amt2=kmd(dj,910000);
    double amt3=condition(cj,910000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - Thar");
    System.out.println("       Second hand value of your car is="+(int)(910000-total)); 
    }
  else if(ma.equalsIgnoreCase("TUV300")==true)
  {
    double amt1=Year(yep,1096000);
    double amt2=kmd(dj,1096000);
    double amt3=condition(cj,1096000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - TUV 300");
    System.out.println("       Second hand value of your car is="+(int)(1096000-total)); 
    }
  else if(ma.equalsIgnoreCase("Verito")==true)
  {
    double amt1=Year(yep,845000);
    double amt2=kmd(dj,845000);
    double amt3=condition(cj,845000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - Verito");
    System.out.println("       Second hand value of your car is="+(int)(845000-total)); 
    }
  else if(ma.equalsIgnoreCase("VeritoVibeCs")==true)
  {
    double amt1=Year(yep,747000);
    double amt2=kmd(dj,747000);
    double amt3=condition(cj,747000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - Verito Vibe Cs");
    System.out.println("       Second hand value of your car is="+(int)(747000-total)); 
    }
  else if(ma.equalsIgnoreCase("XUV500")==true)
  {
    double amt1=Year(yep,1926000);
    double amt2=kmd(dj,1926000);
    double amt3=condition(cj,1926000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("Car name - XUV500");
    System.out.println("       Second hand value of your car is="+(int)(1926000-total)); 
    }
  else if(ma.equalsIgnoreCase("Xylo")==true)
  {
    double amt1=Year(yep,1200000);
    double amt2=kmd(dj,1200000);
    double amt3=condition(cj,1200000);
    double total=amt1+amt2+amt3;
    System.out.println("          ");
    System.out.println("Company-Mahindra");System.out.println("    Car name - Xylo");
    System.out.println("       Second hand value of your car is="+(int)(1200000-total)); 
    }
 break;
 default:System.out.println("Sorry,We can't search for that");
}
break;
default:System.out.println("Wrong Input");
}
}
}
