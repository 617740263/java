package test;

public class Test20181108 {
	/* 需求：1
	 问题描述想象的场景。你现在11岁，在课程结束前的五分钟里，你的数学老师决定通过介绍一个“游戏”来让他的课更“有趣”。
	他解释说，他将依次指着每个学生，让他们说出从一个数字开始的下一个数字。
	有趣的是，如果数字能被3整除，你会说Fizz，
	如果能被5整除，你会说Buzz。
	所以现在你的数学老师依次指着你所有的同学，他们高兴地叫着“onel!”:“two!”“Fizz!”“four!”“Buzz!”…直到他故意指着你，
	用钢铁般的眼神盯着你时间静止不动，你的嘴干了，你的手掌变得越来越出汗，直到你终于能发出嘶哑的嘶嘶声。
	厄运得以避免，指指点点的手指继续移动。当然，为了避免在全班同学面前尴尬，你必须把完整的列表打印出来，这样你才能知道要说什么。
	你们班大约有33名学生，他可能会在课间铃响前绕三圈。
	下一节数学课是在星期四。得到编码!编写一个程序，打印从1到100的数字。
	但是对于3次打印的倍数“Fizz”而不是数字，对于5次打印的倍数“Buzz”。
	对于3和5的倍数的数字打印“FizzBuzz”
	**/
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			if(i%3==0 && i%5==0){
				System.out.println("FizzBuzz");
			}else if(i%3==0){
				System.out.println("Fizz");
			}else if(i%5==0){
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
		System.out.println("分界线————————————————————————————————");
		
		/*需求：2
		 * 新的需求如果一个数字能被3整除或者里面有一个3，它就是Fizz。
	     	如果一个数能被5整除或者里面有一个5那么它就是Buzz。
	     	这个数就是FizzBuzz如果它同时满足2个条件的话*/
		for(int i=1;i<=100;i++){
			String a = String.valueOf(i);
			if((i%3==0 || a.contains("3")) && (i%5==0 || a.contains("5"))){
				System.out.println("FizzBuzz");
			}else if(i%3==0 || a.contains("3")){
				System.out.println("Fizz");
			}else if(i%5==0 || a.contains("5")){
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
	}
	
	
	
}
