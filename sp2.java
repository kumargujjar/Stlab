
import java.awt.Desktop;
import java.io.*;
import java.util.Scanner;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import java.io.IOException;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
public class aaaaa
{
   public static void main(String[] args) throws BiffException, IOException, WriteException
   {
      WritableWorkbook wworkbook;
      wworkbook = Workbook.createWorkbook(new File("output.xls"));
      WritableSheet wsheet = wworkbook.createSheet("Student", 0);
      Label label0 = new Label(0,0,"Serial No.");
      Label label = new Label(1,0,"Name");
      Label label1 = new Label(2,0,"sem");
      Label label2 = new Label(3,0,"usn");
      wsheet.addCell(label0);
      wsheet.addCell(label);
      wsheet.addCell(label1);
      wsheet.addCell(label2);
      String s1;
	  String s2;

      Scanner k = new Scanner(System.in);
      System.out.println("Enter the no. of student record : ");
      int v = k.nextInt();
      System.out.println("Enter "+ v +" student record : ");
      for(int i=0;i<v;i++)
      {
    	  Label l1;
    	  Number number = new Number(0,(i+1),(i+1));
    	  wsheet.addCell(number);
    	  System.out.println("enter the "+(i+1)+" name");
    	  s1=k.next();
    	  l1=new Label(1,(i+1),s1);
    	  wsheet.addCell(l1);
    	  System.out.println("enter the "+(i+1)+" usn");
	      s2=k.next();
	      l1=new Label(3,(i+1),s2);
	      wsheet.addCell(l1);
	      System.out.println("enter the "+(i+1)+" sem");
	      number = new Number(2,(i+1),k.nextInt());
	      wsheet.addCell(number);
      }
      
      wworkbook.write();
      wworkbook.close();

      Desktop dt = Desktop.getDesktop();
      
      try{
    	  dt.open(new File("/home/ise/softwareTesting/Utill/output.xls"));
      }
      catch(Exception e){}
   }
}