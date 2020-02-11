package Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("autoSave", "5");
		prop.setProperty("language", "korean");
		prop.setProperty("timeout", "10");
		System.out.println(prop);
//		{autoSave=5, timeout=10, language=korean}
		
		
		System.out.println(prop.getProperty("autoSave"));
		
//		5
		
		
		System.out.println(prop.getProperty("autoSave","0"));
//		5
//		autoSave��� Ű�� ������ 0����µǴ°�
		
		System.out.println(prop.getProperty("autoSave2","0"));
//		0
		
		System.out.println(prop.getProperty("autoSave2"));
//		null
		
		prop.list(System.out);
//		-- listing properties --
//		autoSave=5
//		timeout=10
//		language=korean
		
		
		try {
			prop.load(new FileInputStream("output.txt"));
			System.out.println(prop);
//			{autoSave=5, timeout=10, language=korean}
			
			prop.store(new FileOutputStream("output.txt"),"Properties Example");
			prop.storeToXML(new FileOutputStream("ouput.xml"), "Properties Example");
			
			
			//�ѱ��� �Է��ؾ� �Ѵٸ� xml ���·� ���� ����Ѵ�. ������ ����
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		hashmap�� �޸� ���Ͽ� �а� ���°��� ���ϱ� ������ properties�� ����Ѵ�.
	}

}





