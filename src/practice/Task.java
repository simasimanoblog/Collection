package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
	private LocalDate date;
	private String task;
	DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年M月d日");
	
	// コンストラクタ
    public Task(LocalDate date, String description) {
        this.date = date;
        this.task = description;
    }
    
    public LocalDate getDate() {
        return date;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
    	// 出力時に日付形式を元に戻す
        return f.format(date) + ":" + task;
    }
     
}
