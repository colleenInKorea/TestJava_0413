package test01;

public class ManagementProduction {
	String productionName ;
	int price ;
//	int[] expirationDate = new int [3];
	String expirationDate; 
	
	int countPrice(int count) {
		int countPrice = count * price;
		return countPrice;
	}
	
	//������� üũ
	//2021 -05-11
	boolean availableSale(String date) {
		String[] limitDates = expirationDate.split("-");
		String[]todayDates = date.split("-");
		
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

	//���� Ǭ ��� 
	
//	void checkUpExpractionDate() {
//		if(expirationDate[0] > 2021) {
//			System.out.println("�Ǹ� ���� ��ǰ");
//		}else if (expirationDate[0] == 2021) {
//			if(expirationDate[1] > 5) {
//				System.out.println("�Ǹ� ���� ��ǰ");
//			}else if(expirationDate[1] == 5) {
//				if(expirationDate[2] > 11) {
//					System.out.println("�Ǹ� ���� ��ǰ");
//				}else if(expirationDate[2] == 11){
//					System.out.println("");
//				}else if(expirationDate[2] < 11) {
//					System.out.println("�Ǹ� �Ұ� ��ǰ");
//				}
//			}else if(expirationDate[1] <5) {
//				System.out.println("�Ǹ� �Ұ� ��ǰ");
//			}
//		}else if(expirationDate[0] < 2021) {
//			System.out.println("�Ǹ� �Ұ� ��ǰ");
//		}
//	}
}
