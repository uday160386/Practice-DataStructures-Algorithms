package practice;

public class StringFromTree {

	 public String tree2str(TreeNode t) {
		 
		 if(t==null) return "";
		 
		 String s="";
		 String left=tree2str(t.left);
		 String right  = tree2str(t.right);
		 
		 if(left==null && right ==null) return s;
		 else if(left!=null && right ==null)return s+"()"+"("+right+")";
		 else if(right  !=null && left ==null)return s+"("+left+")";
		 else if(left!=null && right  !=null)return s+"("+left+")"+"("+right+")";
		 
		return s;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringFromTree st= new StringFromTree();
		//st.tree2str(t);
	}

}
