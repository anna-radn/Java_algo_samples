package differentTasks;

public class CountLettersFromSentence {

	public static void main(String[] args) {
		
	checkSentence("I am on the Bahamas", 'a');
	
	}
	public static void checkSentence(String sentence, char letter) {
		
	char[] group=sentence.toCharArray();
	int count=0;
	for(char a:group) {
		if(a==letter) {
			count ++;
		}
	}System.out.println(count);
		
	}
	
}
