import java.util.*;
public class SamplClass {
    public void result(Scanner sc,int a,int b){
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your reg.no:");
        long reg=sc.nextLong();
        System.out.println("Enter no.of subject:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter subject marks:");
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        double totalAvg=sum/n;
        System.out.println("Student Name:"+name);
        System.out.println("Student Reg.no:"+reg);
        passorfail(arr);
        char avgGrade=findGrade(arr,totalAvg);
        System.out.println("Average Grade:" +avgGrade);
    }
    public char findGrade(int arr[],double totalAvg){
        char grade[]=new char[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=80){
                grade[i]='A';
            }
            else if(arr[i]>=50 && arr[i]<80){
                 grade[i]='B';
            }
            else{
                 grade[i]='F';
            }         
        }
        System.out.println(Arrays.toString(grade));
            char totalAvgResult=0;
            if(totalAvg>80){
                totalAvgResult='A';
            }
            else if(totalAvg>=50 && totalAvg<80){
                totalAvgResult='B';
            }
            else{
                totalAvgResult='f';
            }
            return totalAvgResult;
    }
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //SamplClass obj=new SamplClass();
       //obj.result(sc,5,10);
       //butterfly();
       //greatestOfFour(sc);
       //currentBill(sc);
       //strongPassword(sc);
       //ATM(sc);
       //wPattern();
       //cNumber();
       //countDuplicates(sc);
       //twopointer();
       //subArray();
       //array2d();
       //transpose();
       //spiral();
       //diagonalSnake();
       //zeroMatrix();
       //nonRepeating();
       //countWords(sc);
       //anagram();
       //stringAdd();
       //caseChanging();

    }

    static void butterfly(){
        int n=5;
        for(int i=1;i<n;i++,System.out.println()){
            for(int j=1;j<=i;j++,System.out.print(" ")){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++,System.out.print(" ")){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++,System.out.print(" ")){
                System.out.print("*");
            }
        }
        for(int i=n;i>0;i--,System.out.println()){
            for(int j=1;j<=i;j++,System.out.print(" ")){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++,System.out.print(" ")){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++,System.out.print(" ")){
                System.out.print("*");
            }
        }
}  
    static void greatestOfFour(Scanner sc){
        System.out.println("Enter Four Numbers:");
        int one=sc.nextInt();
        int two=sc.nextInt();
        int three=sc.nextInt();
        int four=sc.nextInt();
      if(one==two&&two==three&&three==four){
         System.out.println("All are equal");
      }
      else if(one==two&&two==three||one==three&&three==four||two==three&&three==four){
             if(one==two&&two==three){
             System.out.println(one+" "+two+" "+three+" are equal");
            }
             else if(one==three&&three==four){
             System.out.println(three+" "+one+" "+four+" are equal");}
             else{
             System.out.println(two+" "+three+" "+four+" are equal");
            }

      }
      else if(one==two||two==three||three==four||four==one){
             if(one==two){
             System.out.println(one+" "+two+" are equal");
            }
             else if(three==two){
             System.out.println(three+" "+two+" are equal");
            }
            else if(three==four){
             System.out.println(three + " " + four+" are equal");
            } 
             else{
             System.out.println(one+" "+four+" are equal");
            }

      }
      else{
        if(one>two&&one>three&&one>four){
            System.out.println("Greatest:"+one);
        }
        else if(two>three&&two>one&&two>four){
            System.out.println("Greatest:"+two);
        }
        else if(two<three&&three>one&&three>four){
            System.out.println("Greatest:"+three);
        }
        else{ System.out.println("Greatest:"+four);}
    }}
    static void currentBill(Scanner sc){
        System.out.println("Enter type of connection(normal/commercial):");
        String currentType=sc.nextLine();
        System.out.println("Enter no. on units:");
        double units=sc.nextDouble();
        switch(currentType){
            case "normal":
            normalCurrent(units);
            break;
            case "commercial":
            commercialCurrent(units);
            break;
        }
    }
    static void normalCurrent(Double units){
        double cost=0.0;
        if(units<=100){
            System.out.println("cost:"+cost);
        }
        else if(units>100&&units<=200){
            cost=(units-100)*5;
             System.out.println("cost:"+cost);
        }
         else if(units>200&&units<=300){
            cost=(units-100)*10;
             System.out.println("cost:"+cost);
        }
         else if(units>300&&units<=400){
            cost=(units-100)*15;
             System.out.println("cost:"+cost);
        }
         else if(units>400&&units<=500){
            cost=(units-100)*20;
             System.out.println("cost:"+cost);
        }
        else{
            cost=(units-100)*25;
             System.out.println("cost:"+cost);
        }
    }
    static void commercialCurrent(Double units){
        double cost=0.0;
        if(units<=100){
            cost=units*10.0;
            System.out.println("cost:"+cost);
        }
        else if(units>100&&units<=200){
            cost=(units)*20.0;
             System.out.println("cost:"+cost);
        }
         else if(units>200&&units<=300){
            cost=(units)*30.0;
             System.out.println("cost:"+cost);
        }
         else if(units>300&&units<=400){
            cost=(units)*40.0;
             System.out.println("cost:"+cost);
        }
         else if(units>400&&units<=500){
            cost=(units)*50.0;
             System.out.println("cost:"+cost);
        }
        else{
            cost=(units)*60.0;
             System.out.println("cost:"+cost);
        }
    }
    static void strongPassword(Scanner sc){
        System.out.println("Eneter the password:");
        String s=sc.nextLine();
        char arr[]=s.toCharArray();
        if((s.length()-1)<=8){
            System.out.println("Not Strong(Must have minimum 8 digits).");
            strongPassword(sc);
            return;
        }
        int count=0;
        boolean uCase=false;
        boolean specialChar=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='0'&&arr[i]<='9'){
                count++;
            }
            if(arr[i]>='A'&&arr[i]<='Z'){
                uCase=true;
            }
            if(arr[i] == '!' || arr[i] == '@' || arr[i] == '#' || arr[i] == '$' || arr[i] == '%' || arr[i] == '^' || arr[i] == '&' || arr[i] == '*'){
                specialChar=true;
            }
        }
        if(count<2){
          System.out.println("Not Strong(Must have 2 numbers.)");
          strongPassword(sc);
          return;
        }
        if((uCase==false)&&(specialChar==false)){
            System.out.println("Not Strong(Must have atleast a UPPERCASE and a special character.)");
            strongPassword(sc);
          return;
        }
        else{
        if(uCase==false){
          System.out.println("Not Strong(Must have atleast a UPPERCASE.)");
          strongPassword(sc);
          return;
        }
        if(specialChar==false){
           System.out.println("Not Strong(Must have a special character.)");
          strongPassword(sc);
          return;  
        }}
        System.out.println("Great! It's a Strong Password.");    
    }
    static void ATM(Scanner sc){
        int pin=4816;
        double balance=5000.0;
        int pinCount=0;
        System.out.println("Welcome! Insert your card.");
        System.out.println("Enter your pin:");
        int Epin=sc.nextInt();
       if(pinCount<4){
        if(pin==Epin){
        }
        else{
            System.out.println("Inalid pin. Try again.");
            pinCount++;
            ATM(sc);
        }
       }
       else{
        System.out.println("You have exceeded your limit.Try again after 1 hr.");
       }
    }
    static void wPattern(){
        int n=7;
        for(int i=0;i<n;i++,System.out.println()){
            for(int j=0;j<n;j++,System.out.print(" ")){
                if(j==0||j==n-1||(i>n/2-1&&j>n/2-1)&&(i==j)||(i>n/2-1)&&(i+j==n-1)){
                System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
        }
    }
    static void cNumber(){
     int n=45;
     int nSquare=n*n;
     int temp=nSquare;
     int count=0;
     while(temp>0){
         temp/=10;
        count++;
     }
     System.out.println(count);
    }
//print all duplicates ina string
    static void countDuplicates(Scanner sc){
        String s= sc.nextLine();
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+" " + count);
        }
    }
    static void twopointer(){
        int arr[]={1,-2,3,4,-5,-11,13};
        int start=0;
        int end=arr.length-1;
        int positive[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            
        }
    }
    static void subArray(){
        int arr[]={3,4,7,2,-3,1,4,2};
        int start=0;
        int count=0;
        int target=7;
        
        for(int i=0;i<arr.length;i++){
            start=arr[i];
            int sum=0;
            if(start==target){
                count++;
            }
            for(int j=i+1;j<arr.length;j++){

            }
        }
    }
    static void array2d(){
        int arr[]={4,8,9,4,6,7};
       
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};       
        int max=0;
        int index=0;
        for(int i=0;i<arr2.length;i++){
            int sum=0;
            for(int j=0;j<arr2[0].length;j++){
                sum+=arr2[i][j];
                if(sum>max){
                    max=sum;
                    index=i;
                }
            }
        }
       System.out.println(index);
    }
    static void transpose(){
       
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};  
        int transpose[][]= new int[arr.length][arr[0].length];
       for(int i =0 ; i<arr.length;i++,System.out.println()){
         
            for(int j=0;j<arr[0].length;j++,System.out.print(" ")){
               transpose[i][j]=arr[j][i];
               System.out.print(transpose[i][j]);
            }
        }
       // System.out.println(Arrays.toString(arr));
        
    }
    static void spiral(){
         int arr[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};  
         int top=0;
         int bottom=arr.length-1;
         int left=0;
         int right=arr[0].length-1;
         while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++){
                System.out.println(arr[top][i]);
            }top++;
            for(int i=top;i<=bottom;i++){
                System.out.println(arr[i][right]);
            }right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.println(arr[bottom][i]);
                }bottom--;}
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.println(arr[i][left]);
                }left++;
            }
            
         }
    }
    static void diagonalSnake(){

    }
    static void zeroMatrix(){
        int row=0;
        int col=0;
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    row=i;
                    col=j;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
            arr[i][col]=0;
            arr[row][j]=0;
            System.out.println(arr[i][j]);
        }
            
        }
         
    }
    static void nonRepeating(){
        String str="aabbcc";    
       for(char ch:str.toCharArray()){
        if(str.lastIndexOf(ch)==str.indexOf(ch)){
            System.out.println(ch);
            break;
        }
       }
        
        
    }
    static void countWords(Scanner sc){
        String input=sc.nextLine();
        int count=0;
        if(input.equals(" ")){System.out.println(0);}
        else{
        for(int i=1;i<input.length();i++){
                if(input.charAt(i)==' '&&input.charAt(i-1)!=' '){count++;}
              //   if(input.charAt(input.length()-1)!=' ')count++;
        }
        System.out.println(count);   }
    }
    static void anagram(){
        String str1="barath";
        String str2="htaraB";
        if(str1.length()!=str2.length()){
            System.out.println("Not an anagram.");
            return;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:str2.toCharArray()){
            if(!map.containsKey(ch)){
                System.out.println("Not an angram");
                return;
            }
            else{
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    map.remove(ch);
                }
            }
        }
        if(map.isEmpty()){
            System.out.println("It is an anagram");
        }
        else{
            System.out.println("Not an anagram");
        }

    }
    static void stringAdd(){
        String str="123";
        String str2="456";
        int num1=Integer.parseInt(str);
        int num2=Integer.parseInt(str2);
        System.out.println(num1+num2);
    }
    static void caseChanging(){
        String str="Hi";
        char arr[]=str.toCharArray();
        int i=0;
        for(char ch:arr){
            if(Character.isUpperCase(ch)){
                arr[i]=Character.toLowerCase(ch);
               System.out.print(arr[i]) ;
            }
            else{
                arr[i]=Character.toUpperCase(ch);
                 System.out.print(arr[i]) ;
            }
            i++;
        }
    }



}

