package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter05 {

	public static void main(String[] args) {
		
		// インスタンス生成 
		List<Task> tasks = new ArrayList<>();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年M月d日");
		
		// ローカル変数定義
        LocalDate d;
        // タスクに設定する内容を配列で定義
		String[] taskday = {"2021年10月21日", "2021年9月15日", "2021年12月4日","2021年8月10日", "2021年11月9日"};
		String[] taskinfo = {"牛乳を買う。", "○○社面談。", "手帳を買う。","散髪に行く。", "スクールの課題を解く。"};
		for (int i = 0; i < taskday.length; i++) {
			// LocalDate に変換
			d = LocalDate.parse(taskday[i], f);
			// タスクをリストに追加する
			tasks.add(new Task(d, taskinfo[i]));
		}
        
        // 日付順に並び替え
        Collections.sort(tasks, new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return t1.getDate().compareTo(t2.getDate());
            }
        });

        // 並び替え後のタスクを表示
        for (Task task : tasks) {
            System.out.println(task);
        }
		
	}

}
