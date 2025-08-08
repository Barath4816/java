public class Spacepattern{
public static void main(String args[]){
//triangle(5);
//inverse(5);
//spacetriangle(5);
//inversespace(5);
//inversespace1(5);
//busticket();
//monkey();
//commision();
//shopmenu();
//clinic();
//series(15);
//series2(8);
//vowelconsonant();
fuelConsumption(20,150);
}
static void triangle(int n){
for(int i=0;i<n;i++,System.out.println()){
for(int j=0;j<=i;j++,System.out.print(" ")){
System.out.print("*");}}}

static void inverse(int n){
for(int i=1;i<n;i++,System.out.println()){
for(int j=i;j<=n;j++,System.out.print(" ")){
System.out.print("*");}}}

static void spacetriangle(int n){
for(int i=0;i<n;i++,System.out.println()){
for(int k=i;k<n;k++,System.out.print(" ")){
System.out.print(" ");}
for(int j=0;j<=i;j++,System.out.print(" ")){
System.out.print("*");}
}}

static void inversespace(int n){
for(int i=n;i>0;i--,System.out.println()){
for(int k=0;k<n-i;k++,System.out.print(" ")){
System.out.print(" ");}
for(int j=0;j<i;j++,System.out.print(" ")){
System.out.print("*");}}
}

static void inversespace1(int n){
for(int i=n;i>0;i--,System.out.println()){
for(int k=0;k<n-i;k++,System.out.print("")){
System.out.print(" ");}
for(int j=0;j<i;j++,System.out.print("")){
System.out.print("* ");}}
}

static void busticket(){
String []busstops = { "TH", "GA", "IC", "HA","TE", "LU", "NI","CA" };
int []path = {800, 600, 750, 900, 1400, 1200, 1100, 1500};
String from="ni";
String to1="ha";
int start1=0,end1=0,sum=0;
for(int i=0;i<busstops.length;i++){
if((from.toUpperCase()).equals(busstops[i])){start1=i;}
if((to1.toUpperCase()).equals(busstops[i])){end1=i;}
}
for(int j=start1+1;;j++){
sum+=path[j];
if(j==(busstops.length-1)){j=0;}
if(end1+1==j){break;}
}
System.out.println("ticket cost:"+Math.round(sum*0.005));
}

static void monkey(){
int n=20,k=2,j=3,m=12,p=12;
int total=(m/k)+(p/j);
int remain=n-total;
System.out.println(remain);
}

static void commision(){
String []parent={"amit"};
String []child={"rajesh","virat"};
int total=parent.length+child.length;
int scheme=5000;
int parVal=scheme/10*child.length;
int childVal=scheme/100*5;
System.out.println("TOTAL MEMBERS:"+total);
System.out.println("COMISSION DETAILS");
for(int i=0;i<parent.length;i++){
System.out.println(parent[i]+":"+parVal);
}
for(int i=0;i<child.length;i++){
System.out.println(child[i]+":"+childVal);
}
}

static void shopmenu(){
String Coffee[]={"Espresso Coffee","Cappuccino Coffee","Latte Coffee"};
String Tea[]={"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};
String Soups[]={"Hot and Sour Soup","Veg Corn Soup","Tomato Soup",
"Spicy Tomato Soup"};
String Beverages[]={"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};
char input1='b';
int input2=9;
System.out.println("Welcome to CCD!");
if(input1=='c'){
for(int i=0;i<Coffee.length;i++){
if(i==input2-1)System.out.println("enjoy your "+Coffee[i]+"!");}}
if(input1=='t'){
for(int i=0;i<Tea.length;i++){
if(i==input2-1)System.out.println("enjoy your "+Tea[i]+"!");}}
if(input1=='b'){
for(int i=0;i<Beverages.length;i++){
if(i==input2-1)System.out.println("enjoy your "+Beverages[i]+"!");}}
if(input1=='s'){
for(int i=0;i<Soups.length;i++){
if(i==input2-1)System.out.println("enjoy your "+Soups[i]+"!");
else System.out.println("Invalid Input");
}}}

static void clinic(){
int n=7;
int sum=0;
if(n<20){
//get using scanner class and for loop
int age[]={20,30,40,50,2,3,14};
for(int i=0;i<age.length;i++){
if(age[i]>120||age[i]<1){
System.out.println("invalid input");}
else if(age[i]<17) {sum+=200;}
else if(age[i]>=17&&age[i]<40){ sum+=400;}
else if(age[i]>=40&&age[i]<120){ sum+=300;}}
System.out.println(sum);
}
}

static void series(int n){
int temp[]=new int[n+1];
for(int i=0;i<temp.length;i++){
if(i%2==0){
temp[i]=i/2*7;}
else{
temp[i]=i/2*6;}}
System.out.println(temp[n-1]);
}

static void series2(int n){
int temp[]=new int[n+1];
for(int i=0;i<temp.length;i++){
if(i%2==0){
temp[i]=i/2*2;
}
else{
temp[i]=temp[i-1]/2;
}}
System.out.println(temp[n]);
}

static void vowelconsonant(){
String str1="how";
String str2="are";
String str3="you";
String str4="";
for(int i=0;i<str1.length();i++){
char val=str1.charAt(i);
if(val=='a'||val=='e'||val=='i'||val=='o'||val=='u'){
str4+='%';}
else{
str4+=str1.charAt(i);}
}
for(int i=0;i<str2.length();i++){
char val=str2.charAt(i);
if(val!='a'&&val!='e'&&val!='i'&&val!='o'&&val!='u'){
str4+='#';}
else{
str4+=str2.charAt(i);}
}
str4+=str3.toUpperCase();
System.out.println(str4);
}

static void fuelConsumption(int fuel,int distence);
int
}

