import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;


public class IO {

	public static void main(String [] args){
		byte[] insrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = new ByteArrayInputStream(insrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = input.read())!= -1){
			output.write(data);
		}
		
		outSrc = output.toByteArray();
		
		System.out.println("input Stream : " + Arrays.toString(insrc));
		System.out.println("Ouput Source : " + Arrays.toString(outSrc));
	}
}
