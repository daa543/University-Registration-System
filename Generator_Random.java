

package project_university;
import java.util.Random;
public class Generator_Random{  
 
  public String random_email(){   // is function to generat email
      int I = (new Random()).nextInt(3);
      if(I==1){
          return "Gmail.com";
      }else{
          return "Yahoo.com";
      }
  }
   public String random_gendar(){  // is function to generat gendar
       int I = (new Random()).nextInt(3);
      if(I==1){
          return "male";
      }else{
          return "female ";
      }
   }
   public String generat_name(int num){ // is function to generat names
        String[]array={"Amal","Arwa","Aya","Dalila","Dana","Dania","Farida","Fairouz","Farah","Habiba","Hawa","Heba","Ibtisam","Iman","Khadija","Khalida","Khawla","Lana","Lina","Loulia","Maha","Malak","Malika","Fadel","Fahd","Faheem","Fahmi","Fahri","Faisal","Faiz","Faizan","omar","Abbad","Abbas" ,"Abd al-Uzza","Abdus Salam ","Abd Manaf","Abd Rabbo","Abdel Fattah","Abdel Nour","Abdi"};
       if(array.length<=num){
           return "pooo" ;
       }
       return array[num] ;
      
   }
   public String generat_City(int num){ // is function to generat City
       String[]array={"Cairo","Alexandria","Giza","Shubra el-Khema","Port Said","Suez","El Mahalla el Kubra","El Mansoura","Tanta","Asyut","Fayoum","Zagazig","Ismailia","Khusus","Aswan","Damanhur","El-Minya","Damietta","Luxor","Qena","Beni Suef","Sohag","Shibin el-Kom","Hurghada","Banha","Kafr al-Sheikh","Mallawi","El Arish","Belbeis"};
   return array[num];
   }
   public String generat_Street(int num){ // is function to generat Street
       String array[]={" Abu Dawood El Zahaery St"," B.Tech Emtaded Rasmses St", "Behind Olympic Group St", " mahmoud azmi.ramel station", "Carrefour EG Ring Road Meerag  St "," el sakhawy St", " Ahram St"," El-Sakhawy Heliopolis St", " MOUSTAFA DARWESH NASR "," Musaddak St" , "  EL Nasr Road"};

return array[num];
}
    public String generat_Area(int num){ // is function to generat Area
        String array[]={  "Baccos – Victoria ","Al Seyouf","Sidi Beshr","El Saraya","Laurent Louran","San Stefano","Gianaklis","Schutz","Abou Shabana (Baccos) ","Sidi Gaber Al-Sheikh","Cleopatra Hammamat (Cleopatra Baths) ","Cleopatra El Soghra"};
   return array[num];
    }
    public String generat_nationality(int num){ // is function to generat nationality
        String array[]={"Egyptian", "American", "German", "Saudi", "Emirati", "Sudanese", "Turkish","Chinese","British", "Russian"};
    return array[num];
    }
    
     public String generat_department(int num){ // is function to generat department
       
       String array[]=  {"General(01)","AI(02)","Business(03)","Health care(04)"};
       return array[num];
     }
     public String generat_Payments(int num){ // is function to generat Payments
         if(num==0){
             return "self-funded" ;
         }else{
             return "grant-funded" ;
         }
     }
      public String Contains_number(String sample){ // is function to take number of String
       
      char[] chars = sample.toCharArray();
      StringBuilder sb = new StringBuilder();
      for(char c : chars){
         if(Character.isDigit(c)){
            sb.append(c);
         }
      }
      return sb.toString();
   }
      public String generat_Banks(int num){ // is function to generat Banks
       
       String array[]=  {"Bank Misr","Cairo Bank","CIB Bank","National Bank of Egypt","Bank of Alexandria"};
       return array[num];
     }
      public String phone_number (int num ){ // is function to generat phone_number
          StringBuffer s = new StringBuffer();
          for(int i=1;i<=8-num;i++){
              s.append(String.valueOf((new Random()).nextInt(10))) ;
          }
          return s.toString();
      }
      public String generat_courses_name(int num){ // is function to generat courses_name
       
       String array[]=  {"probability1","Advanced calculase","discrete","Data Structure","programming","Database","AI" ,"linear algebra","Data Scince"+"intro in computer Scince","critical thinking","Mobile application","Human rights"};
       return array[num];
     }
      
}
