package com.myspace.magunies.service;

public class HomeDTO {

	private int bbsId;
	private String content;
	private String writer;
	private String bbsDate;
	private String likecount;
	private String dislikecount;
	private int bbsAvailable;
	private int replyCount;
	
	private int bbsrId;
	private String userId;
	private String reply;
	private String bbsrDate;
	
	
	public int getBbsrId() {
		return bbsrId;
	}
	public void setBbsrId(int bbsrId) {
		this.bbsrId = bbsrId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public String getBbsrDate() {
		return bbsrDate;
	}
	public void setBbsrDate(String bbsrDate) {
		this.bbsrDate = bbsrDate;
	}
	public String getLikedMember() {
		return likedMember;
	}
	public void setLikedMember(String likedMember) {
		this.likedMember = likedMember;
	}
	public String getDislikedMember() {
		return dislikedMember;
	}
	public void setDislikedMember(String dislikedMember) {
		this.dislikedMember = dislikedMember;
	}
	public int getBbsrAvailable() {
		return bbsrAvailable;
	}
	public void setBbsrAvailable(int bbsrAvailable) {
		this.bbsrAvailable = bbsrAvailable;
	}
	private String likedMember;
	private String dislikedMember;
	private int bbsrAvailable;
	
	
	
	public int getBbsId() {
		return bbsId;
	}
	public void setBbsId(int bbsId) {
		this.bbsId = bbsId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getBbsDate() {
		return bbsDate;
	}
	public void setBbsDate(String bbsDate) {
		this.bbsDate = bbsDate;
	}
	public String getLikecount() {
		return likecount;
	}
	public void setLikecount(String likecount) {
		this.likecount = likecount;
	}
	public String getDislikecount() {
		return dislikecount;
	}
	public void setDislikecount(String dislikecount) {
		this.dislikecount = dislikecount;
	}
	public int getBbsAvailable() {
		return bbsAvailable;
	}
	public void setBbsAvailable(int bbsAvailable) {
		this.bbsAvailable = bbsAvailable;
	}
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	
}
