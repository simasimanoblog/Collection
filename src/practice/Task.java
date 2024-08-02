package practice;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class Task {

	public DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年M月d日");
	public void main(Map<LocalDate, String> task) throws ParseException {

		// 文字列からDateインスタンスを生成
		LocalDate d;
		
		String[] taskday = {"2021年10月21日", "2021年9月15日", "2021年12月4日","2021年8月10日", "2021年11月9日"};
		String[] taskinfo = {"牛乳を買う。", "○○社面談。", "手帳を買う。","散髪に行く。", "スクールの課題を解く。"};
		for (int i = 0; i < taskday.length; i++) {
			d = LocalDate.parse(taskday[i], f);
			task.put(d, taskinfo[i]);
		}

	}

}
