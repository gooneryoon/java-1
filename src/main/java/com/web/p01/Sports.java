package com.web.p01;

public class Sports {

	private String type;
	private int memberCnt;
	private String gym;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMemberCnt() {
		return memberCnt;
	}

	public void setMemberCnt(int memberCnt) {
		this.memberCnt = memberCnt;
	}

	public String getGym() {
		return gym;
	}

	public void setGym(String gym) {
		this.gym = gym;
	}

	@Override
	public String toString() {
		return "Sports [type=" + type + ", memberCnt=" + memberCnt + ", gym=" + gym + "]";
	}

}
