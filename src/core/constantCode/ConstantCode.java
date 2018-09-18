package core.constantCode;

public class ConstantCode {
	 /**
	  * 罗马字符定义
	  */
	 public static final  String[][] base = new String[][]{
           {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}, // 个位的表示
           {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}, // 十位的表示
           {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}, // 百倍的表示
           {"M", "MM", "MMM", "", "", "", "", "", ""}}; // 千位的表示

}
