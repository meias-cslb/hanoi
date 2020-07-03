package jp.trans_it.hanoi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jp.trans_it.hanoi.view.MainFrame;

/**
 * メインクラス
 */
public class HanoiApplication extends Application {
	/**
	 * メインメソッド
	 * @param args 引数
	 * @throws Exception 例外
	 */
	public static void main(String[] args) throws Exception {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(MainFrame.class.getResource("MainFrame.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("ハノイの塔");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
