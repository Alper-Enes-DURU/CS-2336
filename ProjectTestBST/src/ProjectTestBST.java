import java.io.*;
public class ProjectTestBST {
	BufferedReader fileReader;
	BST<String> bst;
	
	public static void main(String [] args){
		ProjectTestBST Test = new ProjectTestBST("datafile.txt");
		Test.bst.inorder();
		Test.bst.search("database");
		Test.bst.search("java");		
	}
	
	public ProjectTestBST(String fileName) {
		try {
			bst = new BST<String>();
			fileReader = new BufferedReader(new FileReader(fileName));
			while (readNextRecord()) { }
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean readNextRecord() {
		if (fileReader == null) {
			System.out.println("Error: you must open the file first");
			return false;
		}
		else {
			try {
				String data = fileReader.readLine();
				if (data == null)
					return false;
				
				int titleId = Integer.parseInt(data);
				String title = fileReader.readLine();
				String author = fileReader.readLine();
				int numKeys = Integer.parseInt(fileReader.readLine());
				Article article = new Article(titleId, title, author);
				
				String keyword;
				for (int i = 0; i < numKeys; i++) {
					keyword = fileReader.readLine();
					bst.insert(keyword, article);
				}
				
				fileReader.readLine();
				
				
			}
			catch (NumberFormatException e) {
				System.out.println("Error: Number expected!");
				return false;
			}
			catch (Exception e) {
				System.out.println("Fatal Error " + e);
				return false;
			}
		}
		return true;
	}
}
