package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第5章 入出力
 */

public class Question02_2 {

	public static void main(String[] args) throws IOException {

		System.out.println("商品の名前と値段を入力してください。");

		System.out.print("商品の名前>");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String itemName = reader.readLine();

		System.out.print("値段　　　>");
		String str = reader.readLine();
		int itemPrice = Integer.parseInt(str);

		System.out.println("商品の名前は" + itemName + "です。");
		System.out.println("商品の値段は" + itemPrice + "円です。");

	}
}
