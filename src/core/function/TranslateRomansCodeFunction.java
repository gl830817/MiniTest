package core.function;

import core.constantCode.ConstantCode;

/**
 * 
 * @author Sunny.GuLin
 * this class function is  translate number to Roman code
 *
 */

public class TranslateRomansCodeFunction {
	
	/*
	 * 数字转化成罗马字符
	 */
	public  String getRomansCode(Integer num){
		   String result = "";

	        // 每除一次就示处理后一个数位（从小到大）
	        // i记录当前处理的是第几个数位
	        for (int i = 0; num != 0; num /= 10, i++) {
	            // 如果不为0，说明这个数位上有值，要进行相加操作
	            if (num % 10 != 0) {
	                // 拼接结果
	                result = ConstantCode.base[i][num % 10 - 1] + result;
	            }
	        }

	        return result;
	}

	

}
