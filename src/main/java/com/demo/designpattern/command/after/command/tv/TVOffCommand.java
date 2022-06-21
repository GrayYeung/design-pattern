package com.demo.designpattern.command.after.command.tv;

import com.demo.designpattern.command.after.command.Command;
import com.demo.designpattern.command.common.vendor.TV;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TVOffCommand implements Command {
	private final TV tv;

	public void execute() {
		tv.off();
	}

	public void undo() {
		tv.on();
	}
}
