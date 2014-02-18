import java.io.*;

class test {
	public static void main(String[] args) {
			BufferReader inBuffer =
				new BufferReader(new InputStreamReader (System.in));
			String str = input.readLine();

			System.out.println("入力された文章は" + str + "です。");
	}
}
add 変更をインデックスに登録する