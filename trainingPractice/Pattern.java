public class Pattern{
public static void main (String args[]){
	//squareOutline(5);
	//cross(4);
	//z(5);
	//triangle1(5);
	//factorial(6);
	//uniqueChar();
	//chocolate(8);
	//nonrepeating();
	//guestpresent(5);
	//checkcase();
	//candyJar(2);
	//trainer();
	caesar(1);
}
static void squareOutline(int n){
for(int i=1;i<=n;i++,System.out.println()){
for(int j=1;j<=n;j++,System.out.print(" ")){
if(i==1||j==1||i==n||j==n)
System.out.print("*");
else
System.out.print(" ");
}}
}

static void cross(int n){
for(int i=0;i<=n;i++,System.out.println()){
for(int j=0;j<=n;j++,System.out.print(" ")){
if(j==i||j==n-i)
System.out.print("*");
else
System.out.print(" ");
}}
}

static void z(int n){
for(int i=0;i<=n;i++,System.out.println()){
for(int j=0;j<=n;j++,System.out.print(" ")){
if(i==0||i==n||j==n-i)
System.out.print("*");
else
System.out.print(" ");
}}
}

static void triangle1(int n){
for(int i=0;i<n;i++,System.out.println()){
for(int j=0;j<i;j++,System.out.print(" ")){
System.out.print("*");
}}
}

static void factorial(int n){
int fact=1;
for(int i=2;i<=n;i++){
int num=0;
for(int j=0;j<i;j++){
num=num+fact;
}
fact=num;
}
System.out.println(fact);
}

static void uniqueChar(){
String s="abcabcabca";
String s2="aba";
String temp="";
for(int i=0;i<s2.length();i++){
int count=0;
for(int j=i+1;j<s2.length();j++){
if(s2.charAt(i)==s2.charAt(j)){
count++;}
}
if(count==0){
temp+=s2.charAt(i);}
}
System.out.println(temp);
int total=0;
for(int k=0;k<temp.length();k++){
for(int j=0;j<s.length();j++){
if(temp.charAt(k)==s.charAt(j)){
total++;}
}
}
System.out.println(total);
}

static void chocolate(int n){
int []a = {4,5,0,1,9,0,5,0};
int temp[]=new int[n];
int j=0;
for(int i=0;i<n;i++){
if(a[i]!=0){
temp[j]=a[i];
j++;}
else{
continue;}
}
for(int k=0;k<n;k++){
System.out.print(temp[k]);
}
}

static void nonrepeating(){
int a []={-1,2,-1,3,0};
Boolean val;
for(int k=0;k<a.length;k++){
val=false;;
for(int i=k+1;i<a.length;i++){
if(a[k]==a[i]){
val=true;
break;
}
}
if(!val){
System.out.print(a[k]);
break;}
}

}

static void guestpresent(int t){
int e[]={7,0,5,1,3};
int l[]={1,2,1,3,4};
int high=0;
int rem=0;
for(int i=0;i<t;i++){
rem=e[i]-l[i]+rem;
if(rem>high){
high=rem;}}
System.out.print(high);
}

static void checkcase(){
char b[]={'r','g','g','b','b'};
for(int i=0;i<b.length;i++){
int count=1;
for(int j=0;j<b.length;j++){
if(i!=j&&b[i]==b[j]){
count++;}
}
if(count%2!=0){
System.out.print(b[i]);}
}
}

static void candyJar(int candy){
int n=10,k=5,temp=n;
if(candy<=n){
n=n-candy;
if(n<k){
n=temp;
System.out.println("If refilled value of N:"+n);
}
System.out.println("sold:"+candy);
System.out.println("Remaining:"+n);}
else{
System.out.println("Invalid Input");}
}
/*
static void trainer(){
int arr[] [] ={{95,92,95},{92,90,92},{90,92,90}};
int j=0;
int result=0;
int max=0;
for(int i=0;i<arr.length;i++){
int sum+=arr[j][i];
if(sum>max){
max=sum;
result;
}
else if(sum==max){
System.out.println(j);}
j++;
}
System.out.println(result);
}*/

static void caesar(int key){
String inp="All the best";
String opt="";
int n=inp.length();
for(int i=0;i<n;i++){
int newval;
char val=inp.charAt(i);
if(val!=' '){
int asciiVal=(int)val;
newval= asciiVal+key;}
else{
int asciiVal=(int)val;
newval= asciiVal;}
opt=opt+(char)newval;
}
System.out.print(opt);
}


}


















