import java.awt.datatransfer.*;
import java.awt.*;
public class checkCopiedWord {
	public static void main(String[] args) {
		Clipboard c=Toolkit.getDefaultToolkit().getSystemClipboard();
		try {
			System.out.println(c.getData(DataFlavor.stringFlavor));
		}
		catch(Exception e) {
			System.out.println("Something went wrong.");
		}
	}
}