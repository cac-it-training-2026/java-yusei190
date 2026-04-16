package basic.question01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第4章 変数
 */

public class Question01_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("名前を入力してください。");
		String name = reader.readLine();

		System.out.println("好きなスポーツを入力してください。");
		String sport = reader.readLine();

		System.out.println("私の名前は" + name + "です。");
		System.out.println("好きなスポーツは" + sport + "です。");

	}

}
