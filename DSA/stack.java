package DSA;

public class stack{
    private int size;
    int top=-1;
    int [] stack;
stack(int size){
    this.size=size;
    stack=new int[size];
}

public boolean isEmpty(){
    return top==-1;
}public boolean isFull(){
    return size-1==top;
}
void display(){
    for(int i=top;i>=0;i--){
        System.out.print(stack[i]+" ");
    }
}
void push(int num){
    if(isFull()){
            System.out.println("Stack is full"); 
            return;
    }
    else{
        ++top;
        stack[top]=num;
    }
}
int pop(){
    if(isEmpty()){
        System.out.println("Stack is underflow");
        return-1;
    }
    else{
       return stack[ top--];
    }
}
public static void main(String[]args){

    stack s=new stack(5);
    stack s1=new stack(5);
    stack output=new stack(10);
     stack tempoutput=new stack(10);
    System.out.println("Stack 1:");
    s.push(1);
    s.push(3);
    s.push(5);
    s.push(7);
    s.push(2);
    s.display();

     System.out.println("\nStack 2:");
     s1.push(2);
      s1.push(4);
       s1.push(6);
       s1.push(8);
       s1.push(10);
         s1.display();


   while (!s.isEmpty() || !s1.isEmpty()) {
    int val1=s.pop();
    int val=s1.pop();
       if((val+val1)%2==0){
           output.push(val);
           output.push(val1);}
           else{
               output.push(val1);
            output.push(val);
           }

}
 while (!output.isEmpty()){
    tempoutput.push(output.pop());
 }



System.out.println();
tempoutput.display();
}
}