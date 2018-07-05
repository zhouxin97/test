
import java.*;
import org.apache.commons.lang3.StringUtils;

public class isEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="123";
		isEmptyMain(str);
		
	}
	public static void isEmptyMain(String str){	
		if(!str.isEmpty()) {
			System.out.print(str);
		}else {
			System.out.print("false");
			
		}
		
	}

}
