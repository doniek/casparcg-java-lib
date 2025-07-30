package com.redbluetechnologies.casparcg;

public record Result(int status, String response, long requestTime) {

	public int getStatus() {
		return status;
	}

	public String getResponse() {
		return response;
	}

	public long getRequestTime() {
		return requestTime;
	}
}
