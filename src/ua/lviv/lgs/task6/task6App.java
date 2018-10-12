package ua.lviv.lgs.task6;

import java.util.Scanner;

public class task6App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("Write text ");
		
		//String str = "qwe wer ert qwe qwe qwe rty wer dfgh vc vv ff v        fd dd";
		String str="Lorem Ipsum is simply dummy.. text. of the. Printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy "
				+ "text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type. Specimen book. It has "
				+ "survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised"
				+ " in the 1960s with the release of. Letraset sheets  sheets  sheets  sheets  sheets  sheets  sheets  sheets  sheets  sheets containing Lorem Ipsum passages, and more recently with desktop publishing software"
				+ " like Aldus PageMaker including. Versions of Lorem Ipsum.";
		//String str = sc.nextLine();
		

		String[] words = str.split(" ", countWord(str));
		
		
//		for (String word : words)
//			System.out.println(word);
		int ind=0;
		int c=0;
		int wrc=1;
		for(int i=0;i<words.length;i++)		
		{
			for(int j=i+1;j<words.length;j++)	
			{
				
			if(words[i].equals(words[j]))	
				{
					wrc++;				
					words[j]="0";			//Replace repeated words by zero
				}
			}
			if(words[i]!="0") {
			if (wrc>c) {
				c=wrc;
				ind=i;
			};	
			//System.out.println(words[i]+"--"+wrc);	
			}
			wrc=1;
			
	     } 
		System.out.println("most often word is: "+words[ind]);
	
	}
	public static int countWord(String str) {
		int count = 0;
		str=" ".concat(str);
		for (int i = 0; i < str.length(); i++) {

			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}

		}
		return count;
	}

}