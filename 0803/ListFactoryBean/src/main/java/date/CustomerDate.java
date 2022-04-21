package date;

import java.sql.Date;

public class CustomerDate {

		Date date;

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		@Override
		public String toString() {
			return "CustomerDate [date=" + date + "]";
		}
		
		
}
