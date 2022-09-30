/**
 * 10章チェックテスト
 */

/*問1:isEven関数を実行して、以下の配列から偶数だけが出力されるように実装してください。
 */
//let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
function isEven() {
	let numbers = [2, 5, 12, 13, 15, 18, 22];
	for (let i= 0; i< numbers.length; i++) {
		if(numbers[i] % 2 === 0) {
			console.log(numbers[i] + 'は偶数です');
		}
	}
}

//関数呼び出し
isEven();


///*問2:以下の要件を満たすように実装してください。
//【要件】
//・インスタンス化した時にガソリンとナンバーがセットされるようなCarクラスを作成する
//・「ガソリンは〇〇です。ナンバーは△△です」と出力される「getNumGas」という関数を作成する
// */
class car {
	constructor(gass,number){
		this.gass = gass;
		this.number = number;
	}
	//出力メソッドの作成
	getNumGas(){
		console.log(`ガソリンは${this.gass}です。ナンバーは${this.number}です`);
	}
}
//インスタンス化し、carクラスのgetNumGas()を呼び出す
let carinfo = new car('ハイオク', '0120');
carinfo.getNumGas();