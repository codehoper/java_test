
public class Stringrev {

	private StringBuffer reverse_sentence(String str){
		int len = str.length() ;
		int end = 0;
		int start = 0;
		StringBuffer tst = new StringBuffer();
		for (int i=0;i<len;i++) {
			if(str.charAt(i) == ' ') {
				end = i;
				tst.append(rev_word(new StringBuffer(str.substring(start, end))));
				tst.append(' ');
				start = end;		
			}
		}
		tst.append(rev_word(new StringBuffer(str.substring(start+1, len))));
		StringBuffer stra = new StringBuffer();
		System.out.println(tst + " length ="+tst.length());
		stra.append(rev_word(tst));
		return stra;
	}
	
	private StringBuffer rev_word(StringBuffer str) {
		int high = str.length() - 1;
		int low = 0;
		while(high > low) {
			char temp = str.charAt(high);
			str.setCharAt(high, str.charAt(low));
			str.setCharAt(low, temp);
			high--;
			low++;
		}
		return str;
	}
	
	//with extra space
	private String rev_sequence(String str) {
		String extraString = "";
		int len = str.length() -1;
		int end = len;
		for(int i = len;i>=0;i--) {
			if(str.charAt(i) == ' ') {
				extraString += str.substring(i+1,end+1) +" ";
				end = i-1;
			}
		}
		extraString += str.substring(0,end+1);
		return extraString;
	}
	
	public static void main(String args[]) {
		Stringrev rev = new Stringrev();
//		StringBuffer str = rev.rev_word( new StringBuffer("Hi I am Boy"));
		StringBuffer str = rev.reverse_sentence( "Hi I am karma");
		System.out.println(str);
		String st = rev.rev_sequence("Hi I am Dharma");
		System.out.println(st);
	}
}
