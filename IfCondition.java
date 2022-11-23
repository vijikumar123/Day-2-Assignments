package ifstatement;

public class IfCondition {
		  
	    static void convert_to_words(char[] num)
	    {
	    
	        int len = num.length;
	        String[] single_digits = new String[] {
	            "zero", "one", "two",   "three", "four",
	            "five", "six", "seven", "eight", "nine"
	        };

	 
	        System.out.print(String.valueOf(num) + ": ");

	        if (len == 1) {
	            System.out.println(single_digits[num[0] - '0']);
	            return;
	        }
	        }

	    public static void main(String[] args)
	    {
	        convert_to_words("1".toCharArray());
	        convert_to_words("9".toCharArray());
	    }
	}
