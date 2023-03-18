package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 int lc;
		 Node node;
		 int temp, k;
		 lien_ket_doi lk = new lien_ket_doi();
		 do {
		     lc = luachon(scanner);
		     switch (lc) {
		         case 0:
		             break;
		         case 1:
		             System.out.print("Nhập vào số lượng Node : ");
		             int slData = scanner.nextInt();
		             for (int i=0; i < slData; i++) {
		                 System.out.print("- Nhập vào Data : ");
		                 temp = scanner.nextInt();
		                 lk.Add(temp);
		             }
		             break;
		         case 2:
		             lk.Print();
		             break;
		         case 3:
		             System.out.print("Nhập Data khoá k cần tìm : ");
		             temp = scanner.nextInt();
		             node = lk.Find(temp);
		             if (node == null) {
		                 System.out.println("Không tìm thấy Node có chứa khoá " + temp);
		             }else {
		                 System.out.println("Tìm thấy node có chứa khoá " + node.Data);
		             }
		             break;
		         case 4:
		             System.out.print("Nhập Data khoá k cần tìm : ");
		             temp = scanner.nextInt();
		             node = lk.Find(temp);
		             if (node == null) {
		                 System.out.println("Không tìm thấy Node có chứa khoá " + temp);
		             }else {
		                 System.out.print("Giá trị cần thay thế khoá " + node.Data + " : ");
		                 temp = scanner.nextInt();
		                 node.Data = temp;
		             }
		             break;
		         case 5:
		             System.out.println("Thêm vào đầu danh sách.");
		             System.out.print("Nhập vào Data : ");
		             temp = scanner.nextInt();
		             lk.AddFirst(temp);
		             break;
		         case 6:
		             System.out.println("Thêm node vào trước khoá k");
		             System.out.print("Nhập vào khoá k = ");
		             k = scanner.nextInt();
		             System.out.print("Nhập vào Data : ");
		             temp = scanner.nextInt();
		             lk.AddFirstk(k, temp);
		             break;
		         case 7:
		             System.out.println("Thêm node vào sau khoá k");
		             System.out.print("Nhập vào khoá k = ");
		             k = scanner.nextInt();
		             System.out.print("Nhập vào Data : ");
		             temp = scanner.nextInt();
		             lk.AddAfterk(k, temp);
		             break;
		         case 8:
		             System.out.println("Xoá phần tử có khoá k");
		             System.out.print("Nhập vào khoá k : ");
		             k = scanner.nextInt();
		             node = new Node(k);
		             lk.Deletek(node);
		             break;
		         case 9:
		             System.out.println("Xoá phần tử đầu.");
		             lk.DeleteFirst();
		             break;
		         case 10:
		             System.out.println("Xoá phần tử trước phần tử có khoá k.");
		             System.out.print("Nhập vào khoá k : ");
		             k = scanner.nextInt();
		             node = new Node(k);
		             lk.DeleteFirstk(node);
		             break;
		         case 11:
		             System.out.println("Xoá phần tử sau phần tử có khoá k.");
		             System.out.print("Nhập vào khoá k : ");
		             k = scanner.nextInt();
		             node = new Node(k);
		             lk.DeleteAfterk(node);
		             break;
		         case 12:
		             System.out.println("Xoá phần tử cuối danh sách.");
		             lk.DeleteAfter();
		             break;
		 }

		 }while(lc !=0);
		 }
		 public static int luachon(Scanner scanner) {
		     System.out.println("--- Danh sách chức năng --- \n");
		     System.out.println("1 : Thêm danh sách liên kết \n");
		     System.out.println("2 : In danh sách liên kết \n");
		     System.out.println("3 : Tìm kiếm k trong danh sách liên kết \n");
		     System.out.println("4 : Thêm danh sách liên kết \n");
		     System.out.println("5 : Thêm Node vào đầu danh sách liên kết \n");
		     System.out.println("6 : Thêm Node vào trước khóa k trong danh sách liên kết \n");
		     System.out.println("7 : Thêm Node vào sau khóa k trong danh sách liên kết \n");
		     System.out.println("8 : Xoá phần tử có khoá k \n");
		     System.out.println("9 : Xoá phần tử đầu danh sách \n");
		     System.out.println("10: Xoá phần tử trước phần tử có khoá k \n");
		     System.out.println("11: Xoá phần tử sau phần tử có khoá k \n");
		     System.out.println("12 : Xoá phần tử cuối danh sách \n");

		     System.out.print("Mời nhập lựa chọn : ");
		     int lc = scanner.nextInt();
		     return lc;
	}

}
