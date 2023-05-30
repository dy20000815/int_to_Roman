
public class twelve {
	public static String intToRoman(int num) {
		StringBuilder sb=new StringBuilder();
		int[] value= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] roman= {"M", "CM" ,"D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		for(int i=0;i<value.length;i++) {
			while(num>=value[i]) {
				sb.append(roman[i]);
				num-=value[i];
			}
		}String r=sb.toString();
		return r;
    }
	
	
	public static void main(String[] args) {
		int i = 123;
		System.out.println(intToRoman(i));
	}
}


