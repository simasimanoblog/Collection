package practice;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class Chapter05 {

	public static void main(String[] args) {
		// インスタンス生成 
		Task clsTask = new Task();
		// タスク初期化
		Map<LocalDate, String> task = new TreeMap<LocalDate, String>();
		try {
            // タスク取得
			clsTask.main(task);
            // タスクをソートして表示
			for (Map.Entry<LocalDate, String> taskitem : task.entrySet()) {
				System.out.println(clsTask.f.format(taskitem.getKey()) + " " + taskitem.getValue());
			}
			
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}

}
