/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
         Stack<Integer> temp = new Stack<>();
        
        while (!s.isEmpty()) {
            int curr = s.pop();
            
            while (!temp.isEmpty() && temp.peek() > curr) {
                s.push(temp.pop());
            }
            
            temp.push(curr);
        }
        
        return temp;
    }
}