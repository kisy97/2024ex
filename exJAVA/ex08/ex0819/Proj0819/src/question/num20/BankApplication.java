package question.num20;

import java.util.Objects;
import java.util.Scanner;

public class BankApplication {
	private Account[] accounts = new Account[100];
	private int memberSize = 0;

	private void create() {
		if (this.memberSize < 100) {
			Scanner scanner = new Scanner(System.in);
			accounts[this.memberSize] = new Account();
			System.out.print("계좌변호: ");
			accounts[this.memberSize].setId(scanner.next());
			System.out.println("계좌주: ");
			accounts[this.memberSize].setName(scanner.next());
			System.out.println("초기입금액: ");
			accounts[this.memberSize].setMoney(scanner.nextInt());
		}
		if (!Objects.isNull(accounts[this.memberSize])) {
			System.out.println("결과: 계좌가 생성되었습니다.");
		}
		this.memberSize++;
	}

	private void list() {
		if (this.memberSize > 0) {
			for (int i = 0; i < this.memberSize; i++) {
				System.out.println(accounts[i].getId() + "\t" + accounts[i].getName() + "\t" + accounts[i].getMoney());
			}
		} else {
			System.out.println("계좌정보가 없습니다.");
		}
	}

	private int searchId(String id) {
		for (int idx = 0; idx < this.memberSize; idx++) {
			if (accounts[idx].getId().equals(id)) {
				return idx;
			}
		}
		return -1;
	}

	private void deposit() {
		Scanner scanner = new Scanner(System.in);
		String id;
		int money;

		System.out.println("계좌번호: ");
		id = scanner.next();

		int idx = searchId(id);

		if (idx >= 0) {
			System.out.println("입금할 금액: ");
			money = scanner.nextInt();

			accounts[idx].setMoney(accounts[idx].getMoney() + money);
		} else {
			System.out.println("해당 계좌번호가 없습니다.");
		}
	}

	private void withdraw() {
		Scanner scanner = new Scanner(System.in);
		String id;
		int money;

		System.out.println("계좌번호: ");
		id = scanner.next();

		int idx = searchId(id);

		if (idx >= 0) {
			System.out.println("출금할 금액: ");
			money = scanner.nextInt();
			if (accounts[idx].getMoney() >= money) {
				accounts[idx].setMoney(accounts[idx].getMoney() - money);
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else {
			System.out.println("해당 계좌번호가 없습니다.");
		}
	}

	public void run() {
		int option = 5; // 종료를 기본값으로
		boolean play = true;
		Scanner scanner = new Scanner(System.in);
		while (play) {
			System.out.println("----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------------------------");
			System.out.println("선택> ");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				System.out.println("-------------------------------");
				System.out.println("계좌생성");
				System.out.println("-------------------------------");
				create();
				break;
			case 2:
				System.out.println("-------------------------------");
				System.out.println("계좌목록");
				System.out.println("-------------------------------");
				list();
				break;
			case 3:
				System.out.println("-------------------------------");
				System.out.println("입금");
				System.out.println("-------------------------------");
				deposit();
				break;
			case 4:
				System.out.println("-------------------------------");
				System.out.println("출금");
				System.out.println("-------------------------------");
				withdraw();
				break;
			case 5:
				System.out.println("프로그램 종료");
				play = false;
				break;
			default:
				System.out.println("올바른 값을 입력해주세요.");
				break;
			}
		}

		scanner.close();
	}
}
