package DSA;

public class stringinQueue {
	private String [] stack ;
	private int top ;
	private int max_size;
		stringinQueue(int max_size) {
			this.max_size=max_size;
			stack=new String[max_size];
			top=-1;
		}
		public int length() {
		    return top + 1;
		}

		public void push(String data) {
			if(isFull()) {
				System.out.println("stack overflow");
				return;
			}
            
			stack[++top]=data;
            
		}
		public String pop() {
			if(isEmpty())
			{
				System.out.println("stack overflow");
				}
			return stack[top--];
		}
		public String peak() {
			if(isEmpty()) {
				System.out.println("stack empty");
				return null;
			}
			return stack[top];
		}
		public void display() {
			if (isEmpty()) {
				System.out.println("stack empty");
				return;
			}	
			for(int i =top;i>=0;i--) {
				System.out.print(stack[i]+" ");
			}
		}
		public boolean isFull() {
			return top==max_size-1;
		}
		public boolean isEmpty() {
			return top==-1;
		}
		public int size(){
			return top+1;
		}
        public void rev(String input){
        String in =" ";
    for(char c:input.toCharArray()){
        in = c + in;

    }
    
    
    }
public static void main(String[] args) {
    stringinQueue stack = new stringinQueue(3);
    stringinQueue op = new stringinQueue(10);
        
        stack.push("java");
        String c=stack.peak();
        int count = c.length();
        for(int i=0;i<count;i++){
            op.push(String.valueOf(c.charAt(i)));
        }
        String cp ="";
        while(!op.isEmpty()){
            cp+=op.pop();
        }

        System.out.println(cp);
}

}

