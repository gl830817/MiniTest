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
	 * ����ת���������ַ�
	 */
	public  String getRomansCode(Integer num){
		   String result = "";

	        // ÿ��һ�ξ�ʾ�����һ����λ����С����
	        // i��¼��ǰ������ǵڼ�����λ
	        for (int i = 0; num != 0; num /= 10, i++) {
	            // �����Ϊ0��˵�������λ����ֵ��Ҫ������Ӳ���
	            if (num % 10 != 0) {
	                // ƴ�ӽ��
	                result = ConstantCode.base[i][num % 10 - 1] + result;
	            }
	        }

	        return result;
	}

	

}
