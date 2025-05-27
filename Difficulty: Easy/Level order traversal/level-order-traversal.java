/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        
        int currLevel=0;
        
        q.offer(root);
        while(!q.isEmpty()){
            
            int len=q.size();
            res.add(new ArrayList<>());
            
            for(int i=0;i<len;i++){
                Node node=q.poll();
                res.get(currLevel).add(node.data);
                
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            currLevel++;
        }
        return res;
        
    }
}