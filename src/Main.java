//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		// TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the
		// highlighted text
		// to see how IntelliJ IDEA suggests fixing it.

		System.out.printf("Hello and welcome!");
		MainArray.main(null);
		MainClass.main(null);
		MainCondition.main(null);
		MainDataType.main(null);
		MainInheritence.main(null);
		MainLoop.main(null);
		MainString.main(null);
		MainExample.main(null);
		MainStatics.main(null);
		MainPackage.main(null);
		ArrayListExample.main(null);
		HashMaps.main(null);
		MainException.main(null);
		MainFile.main(null);
		MainThreads.main(null);
		try {
			MainJdbc.main(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}