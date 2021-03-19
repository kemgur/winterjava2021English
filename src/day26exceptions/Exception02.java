package day26exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Exception02 {
    //When you use multiple catch blocks, make the child one first
	//Birden çok yakalama bloğu kullandığınızda, çocuğu önce bir yapın
    public static void main(String[] args) {
        
        FileInputStream fis = null;
        try {
             fis = new FileInputStream("src\\day26exceptions\\Exception");
            
            int k;
            while((k = fis.read())!=-1) {
                System.out.print( (char) k);
            }
            
        } catch (FileNotFoundException e) {
        
            System.out.println("The path is wrong or file deleted");
        
        } catch (IOException e) {
            
            System.out.println("The file could not be read");
        }
        
        try {
            fis.close();
        } catch (IOException e) {
            System.out.println("The file could not be closed");
        }
    }
}