package actions;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

public class OnesiesBean extends ActionSupport {
	private String fullname, note, sleptfrom, sleepto;
	private Date date;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSleptfrom() {
		return sleptfrom;
	}

	public void setSleptfrom(String sleptfrom) {
		this.sleptfrom = sleptfrom;
	}

	public String getSleepto() {
		return sleepto;
	}

	public void setSleepto(String sleepto) {
		this.sleepto = sleepto;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String execute() {
		System.out.println(fullname);
		return "success";
	}

}
