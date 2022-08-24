import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		{
//      問① 下記の配列はString型しか格納できないように修正してください。
//		   現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
	       List<Object> array = new ArrayList<>();
//	    <以下記述>
	       List<String> str = new ArrayList<>();

//      問② 前から二つ目の要素を"bar"にしましょう。
//	　<以下記述>
	       str.add("anko");
	       str.add("bar");
	       str.add("foo");
	       str.add("ice");
	       str.add("five");
//      問③ fooが格納されているインデックスを出力してください。
//	　<以下記述>
	       int fooSearch = str.indexOf("foo");
	       System.out.println("fooのインデックス : " + fooSearch);
		}

		{
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
		Map<String, Object> map = new HashMap<>();
//	　<以下記述>
		map.put("address","@catDog");
		map.put("name","yuka");
		map.put("age","25");


//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
//	    <以下記述>
		for (String key : map.keySet()) {
            System.out.println("key : " + key);
		}

//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
//	    <以下記述>
		for (Map.Entry<String, Object> value : map.entrySet()) {
            System.out.println("value : " + value.getValue());
		}

//      問⑦ 配列arrayDateに今の年・月・日を入れてください。
           Calendar cal = Calendar.getInstance();
//	    <以下記述>
           String arrayDate[] = {"2022", "8", "24"};

//      問⑧ 配列arrayDateをList型に変更しましょう。
//	    <以下記述>
           List<String> arrayDate1 = Arrays.asList(arrayDate);

//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//	    <以下記述>
           for (String lis : arrayDate1) {
        	   System.out.println(lis);
           }

		}
	}

}