package jp.trans_it.hanoi;

import jp.trans_it.hanoi.exception.HanoiException;
import jp.trans_it.hanoi.model.Disk;
import jp.trans_it.hanoi.model.Tower;
import jp.trans_it.hanoi.view.Logger;

/**
 * ハノイの塔を実行する。
 */
public class Solution {
	/**
	 * ハノイの塔を移動する。
	 * @param left 左側の塔。(最初はここに全ての円盤が積んである。)
	 * @param middle 真ん中の塔 (初期状態では空)
	 * @param right 右側の塔 (初期状態では空)
	 * @param logger ログ表示用オブジェクト(途中経過などを表示)
	 */
	public void solve(Tower left, Tower middle, Tower right, Logger logger) throws HanoiException {

		int height = left.getHeight();
		moveHanoi(left, right, middle, height);


		// 以下の処理を全て削除してから、solve メソッドを実装してみてください。
//		logger.info("このプログラムは演習用教材です。");
//		logger.info("jp.trans_it.hanoi.Solution クラスの solve メソッドを実装して、ハノイの塔を動かしてみて下さい。");
//		logger.info("一度に動かせる円盤は一枚だけです。");
//		logger.info("大きな円盤を小さな円盤の上に乗せることはできません。");
//		logger.info("以上のルールを守って、左の塔を他の場所へ移動させてください。");

		// Tower オブジェクトの getHeight() メソッドで塔の高さを取得することができます。
//		int height = left.getHeight();

		// Tower オブジェクトの getDisk() メソッドで円盤情報を取得することができます。(0)が一番上
//		for(int i = 0; i < height; i++) {
//			Disk disk = left.getDisk(i);
//		}

		// Tower オブジェクトの getName() メソッドで塔の名前を取得することができます。
//		String name = left.getName();

		// Tower オブジェクトの pop() メソッドで一番上の円盤を取得します。
//		Disk disk = left.pop();

		// Tower オブジェクトの push() メソッドで持っている円盤を一番上に置きます。
//		right.push(disk);

		// Disk オブジェクトの getSize() メソッドで円盤のサイズを取得することができます。
//		int size = disk.getSize();

//		logger.info("それでは、Let's Challenge!!!");

	}

	public void moveHanoi(Tower start, Tower goal, Tower another, int height) throws HanoiException {

		if(height == 1) {

			Disk disk = start.pop();
			goal.push(disk);

		} else {

//			(n-1)番目の円盤(height - 1)
			moveHanoi(start, another, goal, height - 1);
//			  例)2段 (左, 中(goal), 右(another), 2-1) = 左(start)の円盤を中(goal)に持ってくる

//			1番大きい円盤
			Disk disk = start.pop();
			goal.push(disk);
//			 例)2段 左(start)の円盤を右(goal)に持ってくる

//			(n-1)番目の円盤(height - 1)
			moveHanoi(another, goal, start, height - 1);
//			 例)2段 (中(start), 右(goal), 左(another), 2-1) = 中(start)の円盤を右(goal)に持ってくる


		}

	}
}
