package com.example.adapterpattern.object;

import com.example.adapterpattern.Banner;

public class PrintBanner extends Print{

	private Banner banner;
	
	public PrintBanner(String string) {
		banner = new Banner(string);
	}

	@Override
	public String printWeak() {
		return banner.showWithParen();
	}

	@Override
	public String printStrong() {
		return banner.showWithAster();
	}

}
