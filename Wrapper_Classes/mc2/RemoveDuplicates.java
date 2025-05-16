/*4. Remove Duplicate Characters from String Using StringBuffer

Problem:
Write a program to remove duplicate characters from a string using StringBuffer.
Example:
Input: "programming"
Output: "progamin"*/
class RemoveDuplicates{
	public static void main(String [] args){
		String s = "vaibhav ashok dewdhe";

		StringBuffer sb = new StringBuffer(s);
		
		for(int i=0; i<sb.length(); i++){
			for(int j=i+1; j<sb.length(); j++){
				if(sb.charAt(i)==sb.charAt(j))
					sb.deleteCharAt(j);
			}
		}
		
		System.out.println(sb);
	}
}