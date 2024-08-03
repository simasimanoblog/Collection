package practice;

import java.time.LocalDate;

public class Task {
	private LocalDate date;
	private String task;
	
	// コンストラクタ
    public Task(LocalDate date, String description) {
        this.date = date;
        this.task = description;
    }
    
    public LocalDate getDate() {
        return this.date;
    }

    public String getTask() {
        return this.task;
    }

    @Override
    public String toString() {
    	// 出力時に日付形式を元に戻す
        return this.date + ":" + this.task;
    }
     
}
