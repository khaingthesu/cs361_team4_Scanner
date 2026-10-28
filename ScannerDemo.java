
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {


	public static void main(String args[]) {
		String file1 = args.length > 0 ? args[0] : "prog1.jay";
		int counter = 1;
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);
		while (!ts.isEndofFile()) {
			Token tk = ts.nextToken();
			if (ts.isEndofFile() && tk.getValue().isEmpty()) {
				break;
			}
			System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
		}
	}
}
