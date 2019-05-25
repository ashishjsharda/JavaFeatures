
import java.io.FileInputStream;

/**
 * Using Try with Resources 
 * @author asharda
 *
 */
public class TryWithResource {

	
	public static void main(String[] args) {

		try(FileInputStream f=new FileInputStream("C:\\Users\\asharda\\Solution.java") )
		{
		
			int content;
			while((content=f.read())!=-1)
			{
				
				System.out.print((char)content);
			}
			System.out.println("In Main");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
