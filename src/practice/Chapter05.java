package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter05 {

	public static void main(String[] args) {
		
		// インスタンス生成 
		List<Task> tasks = new ArrayList<>();
		tasks.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う"));
		tasks.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接"));
		tasks.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う"));
        tasks.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く"));
        tasks.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く"));
        
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
