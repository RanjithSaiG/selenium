package ISuiteListener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ListenersTest implements ISuiteListener {

		public void onStart(ISuite suite) {
			System.out.println("Iam from Onstart suite" +suite.getName());
		}

		public void onFinish(ISuite suite) {
			System.out.println("Iam from OnFinish suite" +suite.getName());
				
		}


	
}


