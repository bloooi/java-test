import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;


public class IO2 {

	public static void main(String []args){
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte [] outSrc = null;
		
		byte [] temp = new byte[4];
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		try{
			while(input.available()>0){
				int len = input.read(temp);
				output.write(temp, 0,len);
			}
		}catch(IOException e){
		}
		outSrc = output.toByteArray();
		
		System.out.println(Arrays.toString(inSrc));
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(outSrc));
	}
}
