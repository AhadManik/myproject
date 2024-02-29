package practice;

public class callingtwo {

	
		String name;
		int age;
		int mobileNumber;
		double balance;

		static boolean result;
		static int amount;

		public static void main(String[] args) {

			callingtwo assignment = new callingtwo();
			assignment.name = "JPMorganChase";
			assignment.age = 2;
			assignment.mobileNumber = 987654321;
			assignment.balance = 2400.32;
			assignment.applyForMobileBanking();
			assignment.doNeftTransfer();
			assignment.applyForMobileBanking();

		}


		public static void openCheckingAccount() {
			System.out.println("This is static method to open a Checking Acc.");
		}

		public static void applyForCreditCard() {
			System.out.println("This is static method to apply for a Credit Card");
		}

		public void withDrawCashFromATM() {
			System.out.println("ATM Cash withdraw");
		}

		public void doNeftTransfer() {
			System.out.println("Neft Wire Transfer");
		}

		public void applyForMobileBanking() {
			System.out.println("Mobile App with face recognition");
		}

	}

	


