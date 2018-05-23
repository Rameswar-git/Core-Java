package FileDirectoryAndProcessRelated;

import java.io.File;

public class FindFile {

	public void findFile(String name,File file)
    {
        File[] list = file.listFiles();
        if(list!=null)
        for (File fil : list)
        {
            if (fil.isDirectory())
            {
            	System.out.println(fil.getName());
                findFile(name,fil);
            }
            else if (name.equalsIgnoreCase(fil.getName()))
            {
                System.out.println("**********"+fil.getParentFile());
            }
        }
    }
    public static void main(String[] args) 
    {
        FindFile ff = new FindFile();
//        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file to be searched.. " );
        String name ="FindFile.java";
        System.out.println("Enter the directory where to search ");
        String directory = System.getProperty("user.dir");;
        ff.findFile(name,new File(directory));
    }

}
