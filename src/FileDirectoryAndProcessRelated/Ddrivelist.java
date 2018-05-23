package FileDirectoryAndProcessRelated;

import java.io.File;

public class Ddrivelist {

	public static void main(String[] args) {
		
//		System.out.println(System.getProperty("user.dir"));
//		System.out.println(System.getProperty("cur.dir"));
		
		String path=System.getProperty("user.dir");
		File file=new File(path);
		 File[] list = file.listFiles();
		 
		 for (File filexv : list) {
			    if (filexv.isDirectory()) {
                    String ha=filexv.getAbsolutePath();
            		File file2=new File(ha);
           		 File[] list2 = file2.listFiles();
			    }
			    System.out.println(filexv.getName());
			}

	}

}
