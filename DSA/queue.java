package DSA;
import java.util.*;
public class queue {
   /*
 private char queue[];
    private int front, rear, maxSize;
    queue(int size){
        maxSize=size;
        queue=new char[maxSize];
        front=-1;
        rear=-1;
    }
public boolean isFull(){
    return rear==maxSize-1;
}
public boolean isEmpty(){
    return((front==-1&&rear==-1)||front>rear);
}
public void enQueue(char num){
    if(isFull()){
        System.out.println("Queue is full");
        return;
    }
    if(front==-1){
        front+=1;
    }
    queue[++rear]=num;
}
public char deQueue(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
    }
    char value=queue[front];
    if(front==rear){
        front=-1;
        rear=-1;
    }
    else{front++;}
    return value;

}
public void display(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return;
    }
    for(int i=front;i<=rear;i++){
        System.out.print(queue[i]+" ");
    }
}
public char pole(){

   return deQueue();
}
public char element(){
     if(isEmpty()){
        System.out.println("Queue is Empty");
    }
    return queue[front];
}*/

private int queue[];
    private int front, rear, maxSize;
    queue(int size){
        maxSize=size;
        queue=new int[maxSize];
        front=-1;
        rear=-1;
    }
public boolean isFull(){
    return rear==maxSize-1;
}
public boolean isEmpty(){
    return((front==-1&&rear==-1)||front>rear);
}
public void enQueue(int num){
    if(isFull()){
        System.out.println("Queue is full");
        return;
    }
    if(front==-1){
        front+=1;
    }
    queue[++rear]=num;
}
public int deQueue(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return -1;
    }
    int value=queue[front];
    if(front==rear){
        front=-1;
        rear=-1;
    }
    else{front++;}
    return value;

}
public void display(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return;
    }
    for(int i=front;i<=rear;i++){
        System.out.print(queue[i]+" ");
    }
}
public int pole(){

   return deQueue();
}
public int element(){
     if(isEmpty()){
        System.out.println("Queue is Empty");
        return -1;
    }
    return queue[front];
}

public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    firstProblem(sc);
    //secondProblem(sc);
    //thirdProblem(sc);
  
}
static void thirdProblem(Scanner sc){ 
  System.out.println("Queue sizes");
    int n1=sc.nextInt();
queue q0=new queue(n1);
queue output=new queue(n1);
 System.out.println("Queue1 values");
   for(int i=0;i<n1;i++){
    int val=sc.nextInt();  
    q0.enQueue(val);
   }

   queue temp1=new queue(n1/2);
   queue temp2=new queue(n1/2);
   for(int i=1;i<=n1/2;i++){
    temp1.enQueue(q0.deQueue());
   }
    for(int i=1;i<=n1/2;i++){
    temp2.enQueue(q0.deQueue());
   }
    for(int i=1;i<=n1;i++){
        if(i%2==0){
    output.enQueue(temp2.deQueue());}
    else{
        output.enQueue(temp1.deQueue());
    }
   }
   output.display();
}
static  void secondProblem(Scanner sc){
 System.out.println("Queue sizes");
    int n1=sc.nextInt();
 queue q0=new queue(n1);
queue output=new queue(n1);
System.out.println("Enter the value of K:");
int k=sc.nextInt();
if(k>n1){
    return;
}
stack temp=new stack(k);
System.out.println("Queue1 values");
   for(int i=1;i<=n1;i++){
    int val=sc.nextInt();  
    q0.enQueue(val);
    if(i<=k){
        temp.push(val);
    }
   }
 
   for(int i=1;i<=n1;i++){
    if(i<=k){
        output.enQueue(temp.pop());
        q0.deQueue();
    }
    else{
        output.enQueue(q0.pole());
    }
   }
   output.display();
}
static void firstProblem(Scanner sc){
System.out.println("Queue sizes");
    int n1=sc.nextInt();
    int n2=sc.nextInt();
   queue q0=new queue(n1);
   queue q1=new queue(n2);
queue output=new queue(Math.max(n1,n2));
 System.out.println("Queue1 values");
   for(int i=0;i<n1;i++){
    int val=sc.nextInt();  
    q0.enQueue(val);
   }
   System.out.println("Queue2 values");
    for(int i=0;i<n2;i++){
    int val=sc.nextInt();
    q1.enQueue(val);
   }
   System.out.println("Enter your Target value");
   int k=sc.nextInt();
while(!q0.isEmpty()&&!q1.isEmpty()){
    if((q0.element()+q1.element())==k){
        output.enQueue(q0.pole());
         output.enQueue(q1.pole());
    }else{
        q0.deQueue();
        q1.deQueue();
    }
}
output.display();}
}


