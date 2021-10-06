package test03;

public class ManagementProduction {
//	��ǰ ���� Class�� ���� �ϼ���.
//	�п����� �л� ������ ���� �л� Class �� �����ϼ���.
//	�����ڿ� ���������ڸ� �̿��ؼ� ĸ��ȭ ö�п� �°� ���� �ϼ���.
//	��ǰ ���� Class �� ���ؼ� �Ʒ� ������ ��� �ϼ���.
//	��������� �� ������ �ʾ��� ��� "�Ǹ� ���ɻ�ǰ", ��������� ������ ��� "�Ǹ� �Ұ� ��ǰ"
	
	private String name;
	private int price;
	private String expirationDate;
	
	public ManagementProduction(String name, int price, String expirationDate) {
		this.name = name;
		this.price = price;
		this.expirationDate =expirationDate;
	}
	
	public int getPrice(int count) {
		int getPrice = count * this.price;
		return getPrice;
	}
	
		//������� üũ
		//2021-05-11
	boolean availableSale(String date) {
		String[] limitDates = this.expirationDate.split("-");
		String[] todayDates = date.split("-");
		
		int limitYear = Integer.parseInt(limitDates[0]);
		int limitMonth = Integer.parseInt(limitDates[1]);
		int limitDay = Integer.parseInt(limitDates[2]);
		
		int todayYear = Integer.parseInt(todayDates[0]);
		int todayMonth = Integer.parseInt(todayDates[1]);
		int todayDay = Integer.parseInt(todayDates[2]);
		
		if(limitYear > todayYear) {
			return true;
		}else if (limitYear == todayYear) {
			if(limitMonth > todayMonth) {
				return true;
			}else if (limitMonth == todayMonth) {
				if(limitDay > todayDay) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public String getExpirationDate() {
		return this.expirationDate;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	


	
}
