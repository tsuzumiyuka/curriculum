/**
 * バブルソート
 * チェックテスト-Java３章
 *
 */
public class Main{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */
        int[] data = {3,1,2,7,5};

        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();

        // 配列要素分を回すfor文（本当は5回だが、1番最後は並び替えが終了しているので「data.length -1 」）
        for (int i = 0; i < data.length -1; i++) {
            //バブルソートを行うfor文
            for (int j = data.length - 1; j > i; j--) {
                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */
                if(data[j - 1] > data[j]){
                  int box = data[j];
                  data[j] = data[j - 1];
                  data[j - 1] = box;
                }
            }
            //終了後、最初のfor文に戻る
        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}