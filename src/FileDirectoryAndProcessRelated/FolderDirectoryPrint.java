package FileDirectoryAndProcessRelated;

import java.io.File;

public class FolderDirectoryPrint {

	public static void main(String[] args) {
		FileAssert assert1=new FileAssert();
		
		String path=System.getProperty("user.dir");
		
		File file=new File(path);
		
		String Tree=assert1.printDirectoryTree(file);
		
		System.out.println(Tree);

	}

}
