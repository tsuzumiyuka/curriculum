package check;

import constants.Constants;

public class Main {
	//フィールド変数宣言
	private String firstName = "皷";
	private String lastName = "侑香";

	private void printName(){
		//thisをつけないとローカル変数、つければフィールド変数をみる
		System.out.println("printNameメソッド→" + this.firstName + this.lastName);
	}

	public static void main(String[] args) {
		//継承やインターフェースされていても、privateだった場合はインスタンス化しても同じクラスじゃないと使用できない
		//同じクラスか違うクラスかだけの違いで、同じクラスだった場合、インスタンス化もしくはstatic参照が必須
		//staticだとthisが使えなくなる
		Main main = new Main();
		main.printName();

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		robotpet.introduce();
	}
}
