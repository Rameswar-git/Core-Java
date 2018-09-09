package Usefulprograms;

import java.io.File;
import java.io.IOException;

public class ReadAllFiles {

	public static void main(String[] args) throws IOException {
		
		File f=new File("E:\\test");
		File[] listFiles = f.listFiles();
		
		for (int i = 0; i < listFiles.length; i++) {
			if(!listFiles[i].isDirectory() && listFiles[i].getName().endsWith(".mp4")) {//listFiles[i]
				StringBuilder build=new StringBuilder(listFiles[i].getName().replaceAll(".mp4", ""));
				String old=build.toString();
				String startletter=build.delete(build.indexOf(" "), build.length()).toString();
				for (int j = 0; j < listFiles.length; j++) {
					if(listFiles[j].getName().startsWith(startletter+"1") &&  listFiles[j].getName().endsWith(".pdf")) {
						System.out.println("Starting rename "+listFiles[j].getAbsolutePath());
						String newname=listFiles[i].getParent()+"\\"+old+".pdf";
						System.out.println(newname);
						boolean renameTo = listFiles[j].renameTo(new File(listFiles[i].getParent()+"\\"+old+".pdf"));
						if(renameTo) {
							System.out.println(" Rename Successfully to "+listFiles[j].getAbsolutePath());
						}
					}
				}
			}
		}

	}

}
